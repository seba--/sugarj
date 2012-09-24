#!/usr/bin/ruby

# cai 19.09.12
# script to copy classes out of a built sugarj project repository
# the script cli-script/u/classpath builds a classpath that contains
# the bin directories of known SugarJ projects.

$this_dir  = File.expand_path(File.dirname(__FILE__))
$cliscript = File.dirname($this_dir)
$classpath = `#{$this_dir}/classpath`
$classes   = "#{$cliscript}/classes"
$native    = "#{$cliscript}/native"

$nat_nat   = "#{$native}/native"

def cpdir(path)
  # we copy $native/org into class folder
  # return if(path == $native)

  path = "#{path}/org"
  if File.exist?(path)
    # copy everything into classes
    $stderr.puts(cmd = "cp -nvr #{path} #{$classes}")
    cp_out = `#{cmd}`
    $stderr.puts cp_out if $? != 0
  else
    # path/org does not exist
    $stderr.puts "FATAL ERROR: #{path}/org does not exist."
    exit 1
  end
end

def cpjar(path)
  # extract jar-file into classes
  # cai 23.08.12
  # 1. is there a way to issue warning on overwrite?
  # A: Maybe, but we don't want it. See #2.
  #
  # 2. will un-jarring only */org cause problems?
  # A: YES! In the form of
  #      permissivegrammars: Could not find imported
  #                          term file Comments.pp.af
  #    So it seems we have to tolerate overwritting
  #    common files, say META-INF/Manifest, over and over.
  $stderr.puts(cmd = "cd #{$classes} && jar xf #{path}")
  `#{cmd}`
end

def cpall(path)
  # recursive expansion of paths
  if File.directory?(path)
    cpdir(path)
  elsif File.extname(path) == ".jar"
    cpjar(path)
  elsif path[-1, 1] == "*"
    Dir.glob(path) do |file|
      cpall(file)
    end
  else
    $stderr.puts "FATAL ERROR: #{path} is not recognised."
  end
end

# clean the classes dir. could be dangerous.
`rm -rf #{$classes}/*`

# copy native into classes
`cp -r #{$native}/* #{$classes}`

$classpath.split(':').each do |path|
  path.strip!
  cpall(path)
end

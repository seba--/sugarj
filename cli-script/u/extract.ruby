#!/usr/bin/ruby

# cai 20.08.12
# script to copy classes out of a built sugarj project repository

$this_dir  = File.expand_path(File.dirname(__FILE__))
$cliscript = File.dirname($this_dir)
$classpath = `#{$this_dir}/classpath`
$classes   = "#{$cliscript}/classes"
$native    = "#{$cliscript}/native"

# clean the classes dir. could be dangerous.
`rm -rf #{$classes}/*`

def cpdir(path)
  # we don't want to do anything with native folder
  return if(path == $native)

  path = "#{path}/org"
  if File.exist?(path)
    # copy everything into classes
    puts(cmd = "cp -nvr #{path} #{$classes}")
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
  # cai 17.08.12
  # 1. is there a way to issue warning on overwrite?
  # 2. will un-jarring only */org cause problems?
  puts(cmd = "cd #{$classes} && jar xf #{path} org")
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

$classpath.split(':').each do |path|
  path.strip!
  cpall(path)
end

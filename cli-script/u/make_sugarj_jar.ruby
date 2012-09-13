#!/usr/bin/ruby
# cai 13.09.12
# creates sugarj.jar at $script/sugarj.jar
# which contains classes compiled from sugarj projects
#
# cai 13.09.12
# WARNING: Putting language libraries in a jar
# makes STRJ unable to find them. In other words,
# it is not possible to invoke sugarj from a jar.

$this_dir  = File.expand_path(File.dirname(__FILE__))
$script = File.dirname($this_dir)
$sugarj = File.dirname(File.dirname($this_dir))
$langroot="#{$sugarj}/language-libraries"
$jarenv = "#{$script}/jar-env"

$sugj_bins = [
  "#{$sugarj}/common/bin",
  "#{$sugarj}/compiler/bin",
  "#{$sugarj}/stdlib/bin",
  "#{$sugarj}/layout-parsing/jsglr-layout/bin",
  "#{$langroot}/base/bin",
  "#{$langroot}/haskell/bin",
  "#{$langroot}/java/bin",
  "#{$langroot}/prolog/bin"
]

def cpdir(path)
  path = "#{path}/org"
  if File.exist?(path)
    # copy everything into classes
    puts(cmd = "cp -nvr #{path} #{$jarenv}")
    cp_out = `#{cmd}`
    $stderr.puts cp_out if $? != 0
  else
    # path/org does not exist
    $stderr.puts "FATAL ERROR: #{path}/org does not exist."
    exit 1
  end
end

def shell_try(command)
  puts command
  `#{command}`
  if $?.exitstatus != 0
    $stderr.puts "FAILED: #{command}"
    exit 1
  end
end

# Step 1: clean jar-env, the workspace.
shell_try "rm -rf #{$jarenv}/*"

# Step 2: copy classes from sugarj projects into jar-env
$sugj_bins.each {|bin| cpdir(bin)}

shell_try %{
cd    "#{$jarenv}" &&       \\
jar -cfe                    \\
../sugarj.jar               \\
org.sugarj.driver.cli.Main  \\
org
}

#!/usr/bin/ruby
# cai 01.10.12
# creates sugarj.zip at ARGV[0]/sugarj.jar
# which contains classes compiled from sugarj projects

# cai 24.09.12
# ALWAYS PRINT STUFF THROUGH $stderr
# Rationale:
# In IO.popen() or `cmd`, $stdout is directed into a buffer
# or a string while $stderr is printed directly to the screen.
# We want immediate feedback in these scripts.
# Therefore, $stderr always.
# The situation will become more comfortable in Ruby 1.9
# where the option :err of IO.popen enables a more
# structured approach.

if ARGV.length != 1
  $stderr.puts("Usage: #{__FILE__} <destination directory>")
  exit 255
else
  $destination = ARGV.first
end

$this_dir  = File.expand_path(File.dirname(__FILE__))
$script = File.dirname($this_dir)

def shell_try(command)
  $stderr.puts(command)
  $v = `#{command}`
  if $?.exitstatus != 0
    $stderr.puts "FAILED: #{command}"
    exit 1
  end
  return $v
end

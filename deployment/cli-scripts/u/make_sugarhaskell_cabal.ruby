#!/usr/bin/ruby
# seba 01.10.12
# creates sugarj.zip at ARGV[0]/sugarj.jar
# which contains classes compiled from sugarj projects

$this_dir  = File.expand_path(File.dirname(__FILE__))
$script = File.dirname($this_dir)

load "#{$this_dir}/make_util.ruby"

$stdout.puts "Really overwrite '#{$destination}'? (y/n)"
$stdout.flush
if STDIN.gets.chomp == "y"
  load "#{$this_dir}/extract.ruby"

  shell_try "rm -rf '#{$destination}'"

  shell_try "cd '#{$script}' && cp -r sugarj '#{$destination}'"
  shell_try "cd '#{$script}' && cp -r cabal/* '#{$destination}'"

  shell_try "cd '#{$destination}' && cabal sdist"
end

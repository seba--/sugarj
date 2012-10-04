#!/usr/bin/ruby
# seba 01.10.12
# 1. nuke the location in ARGV[0]
# 2. rebuild it for cabal package deployment

$this_dir  = File.expand_path(File.dirname(__FILE__))
$script = File.dirname($this_dir)

load "#{$this_dir}/make_util.ruby"

$stdout.print "Really overwrite '#{$destination}'?\n(y/n) "
$stdout.flush
if STDIN.gets.chomp == "y"
  load "#{$this_dir}/extract.ruby"

  shell_try "rm -rf '#{$destination}'"

  # we do `cp -r` instead of symlink because we do `rm -r`
  # beforehand and we don't want to have to repolupate
  # cli-scripts/classes every time (although in essense, we do.)
  shell_try "cd '#{$script}' && cp -r sugarj '#{$destination}'"
  shell_try "cd '#{$script}' && cp -r cabal/* '#{$destination}'"
  shell_try "cd '#{$script}' && rm -rf '#{$destination}'/bin"

  shell_try "cd '#{$destination}' && ghc -o Setup Setup.hs"
  shell_try "cd '#{$destination}' && ./Setup configure"
  shell_try "cd '#{$destination}' && ./Setup sdist"
end

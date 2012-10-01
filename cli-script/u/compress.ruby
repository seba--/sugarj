#!/usr/bin/ruby

# cai 21.08.12
# script to create sugarj.jar

# duplicate code from extract.ruby
# re-calculate paths
$this_dir  = File.expand_path(File.dirname(__FILE__))
$cliscript = File.dirname($this_dir)
$org_dir   = "#{$cliscript}/classes/org"
$nat_nat   = "#{$cliscript}/native/native"

# cai 21.08.12
# we wanted to jar strategoxt.jar, too.
# alas, resource inside the jar cannot be referred to from outside
# not even by native utilities bundled in the jar themselves

# create a comfortable directory to build the jar in
$jarenv = "#{$cliscript}/jar-env"

cmd = %{
cd    "#{$jarenv}" && \\
rm -f * && \\
ln -s "#{$nat_nat}" native && \\
ln -s "#{$org_dir}" org && \\
jar -cfe                   \\
../sugarj.jar               \\
org.sugarj.driver.cli.Main  \\
org
}

puts cmd
puts "Executing. It will take a while. Please be patient."
exec cmd

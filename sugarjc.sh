#!/bin/sh

java -Xss64M -Xmx1024M -cp compiler/bin:compiler/bin/strategoxt.jar:compiler/bin/commons-cli-1.2.jar org.sugarj.driver.Driver --cache cache $@

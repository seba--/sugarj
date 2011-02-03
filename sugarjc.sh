#!/bin/sh

java -Xss64M -Xmx1024M -cp bin:bin/strategoxt.jar:bin/commons-cli-1.2.jar org.sugarj.driver.Driver --cache cache $@

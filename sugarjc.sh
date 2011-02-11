#!/bin/sh

StandardCP=$StandardCP:compiler/bin
StandardCP=$StandardCP:compiler/bin/commons-cli-1.2.jar

SpoofaxCP=$SpoofaxCP:/Users/seba/Library/Eclipse/plugins/org.spoofax.jsglr_0.3.0.201102091215.jar
SpoofaxCP=$SpoofaxCP:/Users/seba/Library/Eclipse/plugins/org.strategoxt.strj_0.17.92.201102091215
SpoofaxCP=$SpoofaxCP:/Users/seba/Library/Eclipse/plugins/org.strategoxt.strj_0.17.92.201102091215/java/strategoxt.jar
SpoofaxCP=$SpoofaxCP:/Users/seba/Library/Eclipse/plugins/org.spoofax.interpreter.core_0.4.0.201102091215.jar
SpoofaxCP=$SpoofaxCP:/Users/seba/Library/Eclipse/plugins/org.spoofax.interpreter.library.jsglr_0.3.9.201102091215.jar
SpoofaxCP=$SpoofaxCP:/Users/seba/Library/Eclipse/plugins/org.spoofax.terms_1.0.0.201102091215.jar

java -Xss64M -Xmx1024M -cp $StandardCP:$SpoofaxCP org.sugarj.driver.Driver --cache cache --buildpath $SpoofaxCP $@

#!/bin/sh

StandardCP=$StandardCP:compiler/bin
StandardCP=$StandardCP:stdlib/bin
StandardCP=$StandardCP:compiler/bin/commons-cli-1.2.jar

SpoofaxCP=$SpoofaxCP:/Users/seba/svn-strategoxt/spoofax/trunk/spoofax/org.spoofax.jsglr
SpoofaxCP=$SpoofaxCP:/Users/seba/Library/Eclipse/plugins/org.strategoxt.strj_0.17.92.201102091215
SpoofaxCP=$SpoofaxCP:/Users/seba/Library/Eclipse/plugins/org.strategoxt.strj_0.17.92.201102091215/java/strategoxt.jar
SpoofaxCP=$SpoofaxCP:/Users/seba/Library/Eclipse/plugins/org.spoofax.interpreter.core_0.4.0.201102091215.jar
SpoofaxCP=$SpoofaxCP:/Users/seba/Library/Eclipse/plugins/org.spoofax.interpreter.library.jsglr_0.3.9.201102091215.jar
SpoofaxCP=$SpoofaxCP:/Users/seba/svn-strategoxt/spoofax/trunk/spoofax/org.spoofax.terms
SpoofaxCP=$SpoofaxCP:/Users/seba/Library/Eclipse/plugins/org.strategoxt.imp.runtime_0.1.1.201102091215.jar
SpoofaxCP=$SpoofaxCP:/Users/seba/Library/Eclipse/plugins/org.eclipse.core.runtime_3.5.0.v20090525.jar

java -Xss64M -Xmx1024M -cp $StandardCP:$SpoofaxCP org.sugarj.driver.Driver --cache cache --buildpath $SpoofaxCP $@

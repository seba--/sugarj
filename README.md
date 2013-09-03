SugarJ Eclipse plugin (recommended)
===================================

Visit the SugarJ web site http://sugarj.org

Installation
------------

1. Install Eclipse (follow instructions on eclipse.org).
2. Start Eclipse.
3. In Eclipse, select 'Install New Software' in the 'Help' menu.
4. In the 'work with' field, copy the SugarJ update site
   http://update.sugarj.org and hit enter.
5. Be sure to deselect the 'Group items by category' checkbox on the bottom of
   the window.
6. Select the latest instance of Sugarclipse and click continue. This will
   install the SugarJ compiler, Spoofax and the Sugarclipse plugin.


In addition, please ensure enough stack space (about 4-16 MB) is available for
the SDF parser. You can set the stack space of your Java runtime using the
-Xss16m command line argument when starting Eclipse or setting -Xss16m in your
eclipse.ini file.


Setting up a SugarJ project
---------------------------

1. Create a new Java project.
2. As for now, we need to register the SugarJ builder for this project by hand:
   Open your project's '.project' file in any text editor and replace the Java
   build command by the following code:
     <buildCommand>
       <name>org.sugarj.editor.SugarJBuilder</name>
       <arguments></arguments>
     </buildCommand> 
3. We're ready to go. Note: SugarJ source files must have the file extension
   ".sugj".



SugarJ standalone compiler
==========================

Precompiled Java binaries: [http://sugarj.org/binaries/](http://sugarj.org/binaries/)

Installing SugarJ
-----------------

The SugarJ compiler is self-contained and only requires an installation of a
Java runtime version 6 or higher. Download
[`sugarj.zip`](http://sugarj.org/binaries/) and extract it to a location of your
choice. The directory structure of the archive is as follows.

    sugarj/
      bin/              Scripts to invoke SugarJ
        sugarj          Compiler for *nix
        sugarj.bat      Compiler for Windows
        sugh            Alias of `sugarj -l haskell` for *nix
        sugh.bat        Alias of `sugarj -l haskell` for Windows
        sugj            Alias of `sugarj -l java` for *nix
        sugj.bat        Alias of `sugarj -l java` for Windows
      case-studies/     Sample SugarJ projects
      lib/              The back end
      README.md         This file


Invoking SugarJ
---------------

If the current directory is your working directory containing the source files,
calling SugarJ is very easy:

    bin/sugarj -l java closures/Test.sugj

The `-l` flag is necessary to specify your host language of choice. Currently,
we support Haskell, Java, and Prolog.

If your source files are located in `case-studies/closure/src`, you can invoke
the compiler like this on *nix:

    bin/sugarj -l java                       \
      --sourcepath case-studies/closures/src \
      -d           case-studies/closures/bin \
      concretesyntax/Test.sugj               # file(s) to compile relative
                                             # to sourcepath

On Windows:

    bin\sugarj -l java                       ^
      --sourcepath case-studies/closures/src ^
      -d           case-studies/closures/bin ^
      concretesyntax\Test.sugj

The generated `Test.class` may be executed thus:

    java -cp case-studies/closures/bin concretesyntax.Test


Compiler options
----------------

    --atomic-imports         Parse all import statements simultaneously.
    --cache <arg>            Specifiy a directory for caching.
    --cache-info             Show where files are cached
    -cp,--buildpath <arg>    Specify where to find compiled files. Multiple
                               paths can be given separated by ':'.
    -d <arg>                 Specify where to place compiled files
    --full-command-line      Show all arguments to subprocesses
    --gen-files              Generate files?
    --help                   Print this synopsis of options
    -l,--language <arg>      Specify a language library to activate.
    --no-checking            Do not check resulting SDF and Stratego files.
    --read-only-cache        Specify the cache to be read-only.
    --silent-execution       Try to be silent
    --sourcepath <arg>       Specify where to find source files. Multiple
                               paths can be given separated by ':'.
    --sub-silent-execution   Do not display output of subprocesses
    -v,--verbose             Show verbose output
    --write-only-cache       Specify the cache to be write-only.

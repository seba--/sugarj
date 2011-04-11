SugarJ compiler
Released: April 11, 2011
Contact: seba {at} informatik uni-marburg de


Installing SugarJ
-----------------

SugarJ is mostly self-contained and only requires an installation of a Java 6
runtime.


Invoking SugarJ
---------------

We have included a shell script `sugarjc.sh` for calling the SugarJ
compiler. Its main duty is to include the numerous library dependencies in the
class path, and to set up a few reasonable compiler options.

> ./sugarjc.sh --sourcepath case-studies/ \
>    javaclosure/Closure.sugj \
>    javaclosure/concrete/Sugar.sugj \
>    javaclosure/concrete/Test.sugj



Compiler options
----------------

    --atomic-imports         Parse all import statements simultaneously.
    --buildpath <arg>        Specify where to find compiled files.
                             Multiple paths can be given separated by ':'.
    --cache <arg>            Specifiy a directory for caching.
    --cache-info             show where files are cached
    -d <arg>                 Specify where to place compiled files
    --full-command-line      show all arguments to subprocesses
    --gen-java               Generate the resulting Java file in the
                             source folder.
    --help                   Print this synopsis of options
    --imports-changed        Declare that the imported modules have
                             changed since last compilation.
    --no-checing             Do not check resulting SDF and Stratego
                             files.
    --read-only-cache        Specify the cache to be read-only.
    --silent-execution       try to be silent
    --sourcepath <arg>       Specify where to find source files. Multiple
                             paths can be given separated by ':'.
    --sub-silent-execution   do not display output of subprocesses
     -v,--verbose            show verbose output
    --write-only-cache       Specify the cache to be write-only.

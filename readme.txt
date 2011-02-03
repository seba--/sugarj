SugarJ compiler and case studies: standalone
Released: December 20, 2010
Contact: seba {at} informatik uni-marburg de


Installing SugarJ
-----------------

SugarJ requires working installations of the following software:

 * Java 6
 * ATerm (http://strategoxt.org/Stratego/StrategoDownload)
 * SDF (http://strategoxt.org/Stratego/StrategoDownload)
 * Stratego (http://strategoxt.org/Stratego/StrategoDownload)
 * Java-front (http://strategoxt.org/Stratego/JavaFront)

Please make sure that the commands installed by those tools are accesible via
your PATH environment variable.


Invoking SugarJ
---------------

To call the SugarJ compiler, issue the following command on your command line:

> java -jar sugarj.jar

The general format for compiling SugarJ is

> java -java sugarj.jar [options] source-files

Likely, you want use some standard options:

> java -Xss64M -Xmx1024M -jar sugarj.jar --cache cache --sourcepath example -d bin example/pair/Sugar.sugj

For convenience, you can equivalently call

> ./sugarjc.sh --sourcepath example -d bin example/pair/Sugar.sugj



Compiler options
----------------

    --buildpath <arg>        Specify where to find compiled files. Multiple paths can be given separated by ':'.
    --cache <arg>            Specifiy a directory for caching.
    --cache-info             show where files are cached
    -d <arg>                 Specify where to place compiled files
    --full-command-line      show all arguments to subprocesses
    --gen-java               Generate the resulting Java file in the source folder.
    --help                   Print this synopsis of options
    --imports-changed        Declare that the imported modules have changed since last compilation.
    --read-only-cache        Specify the cache to be read-only.
    --silent-execution       try to be silent
    --sourcepath <arg>       Specify where to find source files. Multiple paths can be given separated by ':'.
    --stdlibdir <arg>        Specifiy the directory containing the standard library.
    --sub-silent-execution   do not display output of subprocesses
    -v,--verbose             show verbose output
    --write-only-cache       Specify the cache to be write-only.

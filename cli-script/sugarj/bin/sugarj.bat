@ECHO OFF

SETLOCAL enabledelayedexpansion

set WORKDIR=%CD%


cd /d "%0%\.."

set SCRIPT=%CD%


cd %WORKDIR%


java -Xss64m -Xmx1024m -cp "%SCRIPT%\..\lib" org.sugarj.driver.cli.Main %*%
endlocal
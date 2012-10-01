@ECHO OFF

SETLOCAL enabledelayedexpansion

set WORKDIR=%CD%


cd /d "%0%\.."


set SCRIPT=%CD%


cd %WORKDIR%


"%SCRIPT%\sugarj.bat" -l java %*%
endlocal
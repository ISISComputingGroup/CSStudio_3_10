@echo off
set SRC_DIR=%CD%\CSStudio_P2_3_3_10\
set DEST_DIR=c:\Installers\CSStudio_P2_3_3_10\

REM override defaults
if NOT "%~1" == "" (
    set SRC_DIR=%~1
)
if NOT "%~2" == "" (
    set DEST_DIR=%~2
)

RMDIR /S /Q %DEST_DIR%\
mkdir %DEST_DIR%

xcopy /s /y %SRC_DIR%\*.* %DEST_DIR%
if %errorlevel% neq 0 exit /b %errorlevel%
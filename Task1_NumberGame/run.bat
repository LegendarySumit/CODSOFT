@echo off
REM ============================================================
REM Number Game Launcher Script for Windows
REM ============================================================

echo.
echo Compiling NumberGame.java...
javac NumberGame.java

if %errorlevel% neq 0 (
    echo.
    echo Error: Compilation failed. Please ensure Java is installed.
    echo Download Java from: https://www.oracle.com/java/technologies/downloads/
    pause
    exit /b 1
)

echo.
echo Starting Number Game...
echo.
java NumberGame

pause

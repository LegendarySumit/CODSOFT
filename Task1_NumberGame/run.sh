#!/bin/bash

# ============================================================
# Number Game Launcher Script for Linux/macOS
# ============================================================

echo ""
echo "Compiling NumberGame.java..."
javac NumberGame.java

if [ $? -ne 0 ]; then
    echo ""
    echo "Error: Compilation failed. Please ensure Java is installed."
    echo "Download Java from: https://www.oracle.com/java/technologies/downloads/"
    exit 1
fi

echo ""
echo "Starting Number Game..."
echo ""
java NumberGame

<div align="center">

# 🎮 Task 1: Number Game

**Interactive CLI-Based Number Guessing Game with Scoring System**

![Java](https://img.shields.io/badge/Java-11%2B-ED8B00?logo=java&logoColor=white)
![CLI](https://img.shields.io/badge/Interface-CLI-009688)
![License](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/Status-Active-brightgreen)

*Random Number Generation • Smart Feedback • Attempt Tracking • Score Calculation • Multiple Rounds*

[Features](#-features) • [Quick Start](#-quick-start) • [Tech Stack](#-tech-stack) • [Project Structure](#-project-structure) • [Gameplay](#-gameplay)

</div>

---

## 📖 About

**Task 1: Number Game** is a console-based Java application that implements an engaging number guessing game. Players are challenged to guess a randomly generated number within a specified range (1-100) while competing against an attempt limit. 

The game features smart feedback mechanisms, comprehensive scoring calculations, and support for multiple consecutive rounds. It's designed as a learning project for CODSOFT internship, demonstrating core Java concepts including random number generation, user input handling, conditional logic, and game loop mechanics.

---

## ✨ Features

- ✅ **Random Number Generation** — Generates numbers between 1-100 using Java's Random class
- ✅ **Smart Feedback System** — Real-time feedback indicating if guess is too high, too low, or correct
- ✅ **Attempt Limit** — Players have maximum 10 attempts per round to guess the number
- ✅ **Scoring System** — Score calculated as (MAX_ATTEMPTS - Attempts Used + 1)
- ✅ **Multiple Rounds** — Play unlimited rounds and accumulate total score
- ✅ **Statistics Tracking** — Display final statistics including total rounds, score, and averages
- ✅ **Input Validation** — Robust error handling for invalid inputs and out-of-range guesses
- ✅ **Colorful CLI UI** — Enhanced console output with emoji and formatted text for better UX
- ✅ **Cross-Platform** — Works on Windows, Linux, and macOS with provided launcher scripts
- ✅ **No External Dependencies** — Pure Java using only built-in libraries

---

## 🛠️ Tech Stack

### Core Technology
- **Java 11+** — High-performance object-oriented language
- **Standard Library** — `java.util.Scanner`, `java.util.Random`

### Build & Distribution
- **Native Compilation** — Direct javac compilation (no build tools required)
- **Batch/Shell Scripts** — Cross-platform launcher utilities

---

## 📁 Project Structure

```
Task1_NumberGame/
├── NumberGame.java          # Main application class (200+ lines)
├── run.bat                  # Windows launcher script
├── run.sh                   # Linux/macOS launcher script
├── README.md                # Project documentation
├── LICENSE                  # MIT License
├── .gitignore               # Git ignore configuration
└── NumberGame.class         # Compiled bytecode (auto-generated)
```

---

## 🚀 Quick Start

### Prerequisites
- **Java 11 or higher**
- **Command Line Interface (CLI)** — Terminal, Command Prompt, or PowerShell

### Installation

#### Option 1: Direct Compilation (Recommended)
```bash
# Navigate to project directory
cd Task1_NumberGame

# Compile the Java file
javac NumberGame.java

# Run the game
java NumberGame
```

#### Option 2: Windows Batch Script
```batch
cd Task1_NumberGame
run.bat
```

#### Option 3: Linux/macOS Shell Script
```bash
cd Task1_NumberGame
chmod +x run.sh
./run.sh
```

### Verify Installation

Test if Java is installed:
```bash
java -version
```

If not installed, download from: [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/)

---

## 🎮 Gameplay Guide

### Game Flow

1. **Welcome Screen** — Displays game title and instructions
2. **Round Start** — A new random number is generated (you don't see it!)
3. **Guessing Phase** — Enter your guess between 1 and 100
   - ✅ Correct guess → Advance to score display
   - 📈 Too low → Get feedback and try again
   - 📉 Too high → Get feedback and try again
   - ⚠️ Invalid input → Re-enter a valid number
4. **Attempt Tracking** — Track remaining attempts (max 10)
5. **Round Score** — Calculate points: `(10 - Attempts Used + 1)`
6. **Play Again** — Choose to continue with another round or exit
7. **Final Statistics** — View total score and performance metrics

### Example Gameplay

```
🎯 ROUND 1
-------

🤔 I'm thinking of a number between 1 and 100
You have 10 attempts. Good luck!

Attempt 1/10 → Enter your guess: 50
📈 Too low! Try a higher number.

Attempt 2/10 → Enter your guess: 75
📉 Too high! Try a lower number.

Attempt 3/10 → Enter your guess: 63
🎉 CORRECT! The number was 63
✨ You guessed it in 3 attempt(s)!
⭐ Round Score: 8 points

Would you like to play another round? (yes/no): no

============================================================
        📊 GAME STATISTICS 📊
============================================================
Total Rounds Played: 1
Total Score: 8 points
Average Score per Round: 8.00
============================================================
```

---

## 💻 Code Architecture

### Core Components

**NumberGame.java**
- `main()` — Entry point and game initialization
- `displayWelcome()` — Show welcome banner and instructions
- `playGame()` — Main game loop for multiple rounds
- `playSingleRound()` — Execute individual round logic
- `generateRandomNumber()` — Create random number (1-100)
- `getUserInput()` — Read and parse user input with error handling
- `displayCorrectAnswer()` — Handle correct guess feedback
- `displayGameOver()` — Handle failed attempt feedback
- `askPlayAgain()` — Prompt for next round or exit
- `displayFinalScore()` — Show final statistics

### Key Design Patterns

1. **Encapsulation** — Game state stored in instance variables
2. **Constants** — MIN_NUMBER, MAX_NUMBER, MAX_ATTEMPTS defined at class level
3. **Error Handling** — Try-catch for NumberFormatException
4. **Input Validation** — Range checking for user guesses
5. **Method Decomposition** — Single responsibility per method

---

## 🎯 Scoring System

```
Score Per Round = MAX_ATTEMPTS - Attempts Used + 1
                = 10 - Attempts Used + 1
```

| Attempts | Score |
|----------|-------|
| 1        | 10    |
| 2        | 9     |
| 3        | 8     |
| 4        | 7     |
| 5        | 6     |
| 6        | 5     |
| 7        | 4     |
| 8        | 3     |
| 9        | 2     |
| 10       | 1     |

**Total Score** = Sum of all round scores across multiple rounds

---

## 🔧 Customization

You can modify game parameters by editing constants in `NumberGame.java`:

```java
private static final int MIN_NUMBER = 1;      // Change minimum range
private static final int MAX_NUMBER = 100;    // Change maximum range
private static final int MAX_ATTEMPTS = 10;   // Change attempt limit
```

For example, for a harder game:
```java
private static final int MAX_NUMBER = 1000;   // Higher range
private static final int MAX_ATTEMPTS = 8;    // Fewer attempts
```

---

## 📦 Distribution

### Sharing Your Game

The game can be shared in multiple ways:

1. **Source Code** — Share the `.java` file with anyone who has Java installed
2. **Compiled Class** — Share `NumberGame.class` for direct execution
3. **Executable** — Convert to `.exe` using tools like **Launch4j** or **JExePack**
4. **JAR Package** — Create a JAR file for portable distribution

### Creating an Executable (Optional)

Using Launch4j:
```
1. Download Launch4j from: http://launch4j.sourceforge.net/
2. Create configuration pointing to NumberGame.jar
3. Generate .exe wrapper
4. Distribute the .exe file
```

---

## 🐛 Troubleshooting

### Issue: "javac: command not found"
**Solution:** Java JDK not installed. Download from [Oracle Java](https://www.oracle.com/java/technologies/downloads/)

### Issue: "Exception in thread 'main' java.util.InputMismatchException"
**Solution:** Enter a valid integer. Avoid letters or special characters.

### Issue: Number out of range error
**Solution:** Ensure your guess is between 1 and 100 (or your custom range).

### Issue: Script won't run (Linux/macOS)
**Solution:** Make script executable:
```bash
chmod +x run.sh
```

---

## 📚 Learning Objectives

This project demonstrates:

✓ **Object-Oriented Programming** — Class structure and encapsulation  
✓ **Control Flow** — Loops (while), conditionals (if-else)  
✓ **User Input Handling** — Scanner class and input validation  
✓ **Random Number Generation** — Random class and range generation  
✓ **Exception Handling** — Try-catch blocks and error management  
✓ **String Formatting** — Console output formatting with special characters  
✓ **Game Loop Design** — Single and nested loop structures  
✓ **Data Persistence** — Score tracking across multiple rounds  

---

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

You are free to use, modify, and distribute this software with proper attribution.

---

## 🤝 Contributing

Found a bug? Have an improvement idea?

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 📞 Support

For questions or issues, please:
- Open an issue on GitHub
- Check existing documentation and FAQs
- Review the code comments for technical details

---

## ✅ Checklist for Users

- [ ] Java 11+ installed
- [ ] Project folder extracted
- [ ] Launcher script executed or `java NumberGame` run
- [ ] Game instructions understood
- [ ] Ready to play!

---

<div align="center">

### Made with ❤️ by CODSOFT

*Empowering learners through practical projects*

⭐ If you found this helpful, please star the repository!

</div>

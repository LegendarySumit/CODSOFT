<div align="center">

# 📊 Task 2: Student Grade Calculator

**Calculate Total Marks, Average Percentage, and Assign Grades**

![Java](https://img.shields.io/badge/Java-11%2B-ED8B00?logo=java&logoColor=white)
![CLI](https://img.shields.io/badge/Interface-CLI-009688)
![License](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/Status-Active-brightgreen)

*Input Validation • Grade Calculation • Result Display • Multi-Subject Support*

</div>

---

## 📖 About

A console-based Java application that calculates student grades based on marks obtained in multiple subjects. The program computes total marks, average percentage, and assigns corresponding grades.

## 🏷️ GitHub Topics

Recommended GitHub About topics for this task:

- `codsoft`
- `java`
- `cli`
- `grade-calculator`
- `student-marks`
- `console-application`

## 📦 Releases & Source Code

This folder contains the complete source code and supporting files for the task. If you publish a GitHub Release, attach:

- the source code archive for `Task2_StudentGradeCalculator`
- a compiled `.jar` file if you want a runnable release

Release notes should summarize the grading rules, input format, and any validation changes.

---

## ✨ Features

- ✅ **Multiple Subjects** — Support for any number of subjects
- ✅ **Mark Input** — Validates marks between 0-100 for each subject
- ✅ **Total Calculation** — Sum of all subject marks
- ✅ **Average Percentage** — Calculates average percentage
- ✅ **Grade Assignment** — A (90+), B (80-89), C (70-79), D (60-69), F (<60)
- ✅ **Input Validation** — Ensures valid numeric input

---

## 🚀 Quick Start

### Prerequisites
- Java 11 or higher
- Command Line/Terminal

### Running the Program

**Windows:**
```bash
javac StudentGradeCalculator.java
java StudentGradeCalculator
```

**Linux/Mac:**
```bash
javac StudentGradeCalculator.java
java StudentGradeCalculator
```

Or use the provided scripts:
```bash
./run.sh       # Linux/Mac
run.bat        # Windows
```

---

## 💻 Usage Example

```
STUDENT GRADE CALCULATOR

Enter number of subjects: 5

Enter marks for each subject (out of 100):

Subject 1 marks: 85
Subject 2 marks: 92
Subject 3 marks: 78
Subject 4 marks: 88
Subject 5 marks: 95

RESULTS

Total Marks: 438
Average Percentage: 87.60%
Grade: B
```

---

## 📁 Project Structure

```
Task2_StudentGradeCalculator/
├── StudentGradeCalculator.java    (Main application)
├── README.md                       (Documentation)
├── run.sh                          (Linux/Mac launcher)
├── run.bat                         (Windows launcher)
└── .gitignore
```

---

## 🔧 Tech Stack

- **Language:** Java 11+
- **Interface:** CLI (Command Line)
- **Build:** Manual Compilation

## 📦 Release Packaging

- **Source Archive** — GitHub source code zip/tarball
- **JAR Release** — Optional compiled artifact for end users
- **Documentation** — Keep this README in every release

---

## 📝 How It Works

1. User enters the number of subjects
2. Program prompts for marks in each subject (0-100)
3. Calculates total marks and average percentage
4. Assigns grade based on percentage
5. Displays results

---

## 📄 License

MIT License - Feel free to use, modify, and distribute

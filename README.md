<div align="center">

# 🚀 CODSOFT

**Comprehensive Internship Project Collection**

![Java](https://img.shields.io/badge/Java-11%2B-ED8B00?logo=java&logoColor=white)
![CLI](https://img.shields.io/badge/Interface-CLI-009688)
![License](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/Status-Active-brightgreen)

*Interactive Games • Problem Solving • Real-World Applications • Production-Ready*

[Projects](#-projects) • [Quick Start](#-quick-start) • [Tech Stack](#-tech-stack) • [Releases](#-releases)

</div>

---

## 📖 About

**CODSOFT** is a collection of standalone Java internship tasks grouped under one parent repository. Each task folder is self-contained and keeps its own `README.md`, `LICENSE`, and `.gitignore` so the project can be run, shared, and maintained independently.

The repository currently includes CLI applications for a number game, a student grade calculator, and a currency converter. The root `.gitignore` exists to keep compiled Java classes, IDE metadata, and temporary files out of version control across all task folders.

---

## ✨ Highlights

- ✅ Multi-project internship repository with clear task-wise separation
- ✅ Java CLI applications with robust input handling and error management
- ✅ Real-world problem-solving focused on practical applications
- ✅ Release assets for end users (downloadable executables)
- ✅ Source-code archives per project for easy distribution
- ✅ Consistent professional documentation and organization
- ✅ Cross-platform compatibility (Windows, Linux, macOS)
- ✅ MIT Licensed - free to use, modify, and distribute

## 🏷️ GitHub Topics

Use these topics in the GitHub About section to make the repository easier to discover:

- `codsoft`
- `java`
- `cli`
- `console-application`
- `interview-project`
- `student-project`
- `currency-converter`
- `number-game`

## 📦 Releases

Each task folder contains the full source code, launcher scripts, license, and its own README. If you publish GitHub Releases for this repository, attach either:

- the source code archive for the task folder, or
- a compiled release artifact such as a `.jar` file for Java users.

Recommended release notes:

1. what changed in the task
2. how to run it from source
3. what file to download from Releases

---

## 📦 Projects

| Task | Project | Folder | Description | Status |
|------|---------|--------|-------------|--------|
| **Task 1** | **Number Game** | `Task1_NumberGame` | Interactive CLI number guessing game with scoring system | ✅ Active |
| **Task 2** | **Student Grade Calculator** | `Task2_StudentGradeCalculator` | Calculates total marks, average percentage, and grade | ✅ Active |
| **Task 4** | **Currency Converter** | `Task4_CurrencyConverter` | Converts amounts between supported currencies | ✅ Active |

---

## 🛠️ Tech Stack

### Core Framework
- **Java 11+** — High-performance, strongly-typed programming language
- **Command Line Interface** — Native console-based user interaction

### Build & Distribution
- **Native Compilation** — Direct javac compilation (no build tools required)
- **Batch/Shell Scripts** — Cross-platform launcher utilities
- **Launch4j** — Optional executable wrapper for Windows distribution

---

## 📁 Repository Structure

```text
CODSOFT/
├── Task1_NumberGame/
│   ├── NumberGame.java
│   ├── run.bat
│   ├── run.sh
│   ├── README.md
│   ├── LICENSE
│   └── .gitignore
├── Task2_StudentGradeCalculator/
│   ├── StudentGradeCalculator.java
│   ├── run.bat
│   ├── run.sh
│   ├── README.md
│   ├── LICENSE
│   └── .gitignore
├── Task4_CurrencyConverter/
│   ├── CurrencyConverter.java
│   ├── run.bat
│   ├── run.sh
│   ├── README.md
│   ├── LICENSE
│   └── .gitignore
├── README.md                         # Root project overview
├── LICENSE                           # MIT License
├── .gitignore                        # Git ignore rules
└── (task folders remain self-contained)
```

---

## 🚀 Quick Start

### Prerequisites
- **Java 11 or higher**
- **Git** (for cloning the repository)
- **Command Line Interface** (Terminal, Command Prompt, or PowerShell)

### 1) Clone Repository

```bash
git clone https://github.com/YOUR_USERNAME/CODSOFT.git
cd CODSOFT
```

### 2) Navigate to Project

```bash
cd Task1_NumberGame
```

### 3) Run Project

#### Windows
```batch
run.bat
```

#### Linux/macOS
```bash
chmod +x run.sh
./run.sh
```

#### Manual Compilation
```bash
javac NumberGame.java
java NumberGame
```

Use the same pattern inside `Task2_StudentGradeCalculator` or `Task4_CurrencyConverter` for the other tasks.

### Verify Java Installation

```bash
java -version
```

If not installed: [Download Java](https://www.oracle.com/java/technologies/downloads/)

---

## 📖 Project Documentation

Each project includes:

- **README.md** — Comprehensive project documentation
- **Quick Start Guide** — Setup and execution instructions
- **Code Architecture** — Design patterns and structure explanation
- **Gameplay/Usage Guide** — Step-by-step user instructions
- **Troubleshooting** — Common issues and solutions
- **Learning Objectives** — Educational concepts demonstrated

### Quick Links

- [Task 1: Number Game](Task1_NumberGame/README.md) — Interactive guessing game
- [Task 2: Student Grade Calculator](Task2_StudentGradeCalculator/README.md) — Marks, averages, and grades
- [Task 4: Currency Converter](Task4_CurrencyConverter/README.md) — Multi-currency conversion tool

---

## 💻 System Requirements

### Minimum Requirements
- **OS:** Windows 7+, macOS 10.9+, Linux (any modern distribution)
- **Java:** JDK 11 or higher
- **RAM:** 256 MB minimum
- **Disk:** 50 MB per project

### Recommended Requirements
- **Java:** JDK 17 LTS or higher
- **RAM:** 2 GB or more
- **Disk:** 500 MB for all projects

---

## 📦 Installation & Distribution

### For Users - Running Pre-Compiled

1. Download the `.exe` file from Releases (Windows)
2. Double-click to run (no Java installation needed for packaged versions)
3. Or use launcher scripts on Linux/macOS

### For Developers - Building from Source

1. Clone the repository
2. Ensure Java 11+ is installed
3. Navigate to project folder
4. Run: `javac SourceFile.java && java SourceFile`

### Creating Standalone Executables

Optional: Convert projects to `.exe` for Windows distribution:

```bash
# Using Launch4j
1. Download from: http://launch4j.sourceforge.net/
2. Configure with project JAR
3. Generate .exe wrapper
4. Distribute standalone executable
```

---

## 🔄 Workflow & Contribution

### Getting Started with Development

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Commit and push
5. Submit a Pull Request

### Commit Message Format

```
[TASK-X] Brief description

Detailed explanation if needed
- Bullet point for changes
- Another change

Fixes #issue_number
```

### Code Style Guidelines

- Follow Java naming conventions (camelCase for variables/methods, PascalCase for classes)
- Use meaningful variable and method names
- Add comments for complex logic
- Maintain consistent indentation (4 spaces)
- Keep methods focused and under 50 lines when possible

---

## 📊 Statistics

| Metric | Value |
|--------|-------|
| Total Projects | 3+ |
| Total Lines of Code | 500+ |
| Java Classes | 5+ |
| Documentation Files | 3+ |
| Test Coverage | Ongoing |

---

## 🔗 Important Links

- **GitHub Repository:** [CODSOFT](https://github.com/YOUR_USERNAME/CODSOFT)
- **Releases:** [Download Executables](https://github.com/YOUR_USERNAME/CODSOFT/releases)
- **Issues:** [Report Problems](https://github.com/YOUR_USERNAME/CODSOFT/issues)
- **Java Documentation:** [docs.oracle.com](https://docs.oracle.com/en/java/)

---

## 🐛 Troubleshooting

### Java Not Found
```bash
# Solution: Download and install Java
java -version
```

### Permission Denied (Linux/macOS)
```bash
# Solution: Make script executable
chmod +x run.sh
```

### Compilation Error
```bash
# Ensure you're in the correct directory
cd Task1_NumberGame
javac NumberGame.java
```

The same idea applies to the other task folders: run the compile command from inside the folder that contains the Java file.

---

## 📞 Support & Contact

- **Issues:** Open an issue on [GitHub Issues](https://github.com/YOUR_USERNAME/CODSOFT/issues)
- **Discussions:** Use [GitHub Discussions](https://github.com/YOUR_USERNAME/CODSOFT/discussions)
- **Email:** contact@codsoft.example.com (if applicable)

---

## 📄 License

This project is licensed under the **MIT License**.

You are free to:
- ✅ Use commercially
- ✅ Modify and create derivatives
- ✅ Distribute the software
- ✅ Use privately

Under the condition that:
- ⚠️ License and copyright notice must be included

See [LICENSE](LICENSE) file for full details.

---

## 🏆 Recognition

- **CODSOFT Internship Program** — For the learning opportunity
- **Java Community** — For excellent documentation and tools
- **Contributors** — For improvements and feedback

---

## 🎯 Roadmap

- [x] Task 1 - Number Game (v1.0.0)
- [x] Task 2 - Student Grade Calculator (v1.0.0)
- [x] Task 4 - Currency Converter (v1.0.0)
- [ ] Publish GitHub Releases for each task
- [ ] Add GitHub topics to the repository About section
- [ ] Automated Release Builds (CI/CD)
- [ ] Web-based versions
- [ ] Mobile adaptations
- [ ] Performance optimizations

---

<div align="center">

### Made with ❤️ by CODSOFT Interns

*Building practical solutions, one project at a time*

**[⬆ back to top](#-codsoft)**

---

**Last Updated:** 2026-06-06  
**Status:** 🟢 Active Development

</div>

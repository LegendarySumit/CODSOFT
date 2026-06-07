<div align="center">

# 💱 Task 4: Currency Converter

**Real-Time Currency Conversion with Multiple Currency Support**

![Java](https://img.shields.io/badge/Java-11%2B-ED8B00?logo=java&logoColor=white)
![CLI](https://img.shields.io/badge/Interface-CLI-009688)
![License](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/Status-Active-brightgreen)

*Currency Selection • Exchange Rates • Amount Conversion • Result Display • Multiple Rounds*

</div>

---

## 📖 About

A console-based Java application that performs currency conversion between multiple currencies. The program allows users to select base and target currencies, input conversion amounts, and displays the converted values using live exchange rates fetched from `open.er-api.com`.

## 🏷️ GitHub Topics

Recommended GitHub About topics for this task:

- `codsoft`
- `java`
- `cli`
- `currency-converter`
- `finance-tools`
- `console-application`

## 📦 Releases & Source Code

This folder contains the source code and task documentation. If you publish a GitHub Release, attach:

- the source code archive for `Task4_CurrencyConverter`
- a compiled `.jar` file or packaged executable if available

Release notes should mention supported currencies, exchange-rate assumptions, and how to run the app from source.

---

## ✨ Features

- ✅ **Currency Selection** — Choose from 10+ supported currencies
- ✅ **Exchange Rates** — Live rates fetched from the exchange-rate API
- ✅ **Amount Input** — Input and validate conversion amount
- ✅ **Conversion Logic** — Accurate currency conversion calculations
- ✅ **Result Display** — Clear display of converted amount and currency
- ✅ **Input Validation** — Validates currency codes and amounts
- ✅ **Multiple Conversions** — Perform unlimited conversions in one session

---

## 🚀 Quick Start

### Prerequisites
- Java 11 or higher
- Command Line/Terminal

### Running the Program

**Windows:**
```bash
javac CurrencyConverter.java
java CurrencyConverter
```

**Linux/Mac:**
```bash
javac CurrencyConverter.java
java CurrencyConverter
```

Or use the provided scripts:
```bash
./run.sh       # Linux/Mac
run.bat        # Windows
```

The app fetches the current rates at runtime, so the INR value can change over time instead of staying fixed.

---

## 💻 Usage Example

```
CURRENCY CONVERTER

Available Currencies:
USD EUR GBP INR JPY AUD CAD CHF CNY SGD

Enter base currency (e.g., USD): USD
Enter target currency (e.g., EUR): EUR

Enter amount to convert: 100

CONVERSION RESULT

100.00 USD = live converted amount EUR

Convert again? (yes/no): yes
```

---

## 📁 Project Structure

```
Task4_CurrencyConverter/
├── CurrencyConverter.java    (Main application)
├── README.md                 (Documentation)
├── run.sh                    (Linux/Mac launcher)
├── run.bat                   (Windows launcher)
└── .gitignore
```

---

## 💱 Supported Currencies

| Code | Currency |
|------|----------|
| USD  | US Dollar |
| EUR  | Euro |
| GBP  | British Pound |
| INR  | Indian Rupee |
| JPY  | Japanese Yen |
| AUD  | Australian Dollar |
| CAD  | Canadian Dollar |
| CHF  | Swiss Franc |
| CNY  | Chinese Yuan |
| SGD  | Singapore Dollar |

The actual exchange rate for each currency is fetched live from the API at runtime.

---

## 🔧 Tech Stack

- **Language:** Java 11+
- **Interface:** CLI (Command Line)
- **Build:** Manual Compilation

## 📦 Release Packaging

- **Source Archive** — GitHub source code zip/tarball
- **JAR Release** — Optional compiled artifact for direct execution
- **Documentation** — Keep this README alongside the release files

---

## 📝 How It Works

1. Displays available currencies
2. User selects base and target currencies
3. User enters amount to convert
4. Program calculates conversion using exchange rates
5. Displays converted amount
6. Offers option to perform another conversion

---

## 📄 License

MIT License - Feel free to use, modify, and distribute

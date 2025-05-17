# Scala-List-Ops
Scala program that performs string appending, leap year filtering, and integer summation from input commands in a file.

This Scala project reads commands from a text file, performs computations on lists, and writes the results to an output file. It supports:

- `append` – adds a string to the end of each word in a list
- `leapys` – filters a list of years and returns only leap years
- `sum` – sums up a list of integers

---

## 📁 Files

- `Homework7.scala` – Contains core functions: `append`, `leap_years`, `sum`, and `is_leap_year`
- `main.scala` – Main program that parses input and writes formatted output
- `.class`, `.tasty` – Scala compilation artifacts (can be ignored or added to `.gitignore`)
- `input.txt`, `output.txt` – Input and output files for running and testing the program

---

## 🚀 How It Works

Below is a full example with inputs, expected outputs, and compile/run instructions:

-- Example input.txt
append hello world!
leapys 1996 2000 1900 2024 2100
sum 1 2 3 4 5

-- Expected output.txt
appending world! to hello makes hello world!
Checking 1996, 2000, 1900, 2024, 2100 for years that are leap years 1996, 2000, 2024
Sum of 1, 2, 3, 4, 5 is 15

-- Compile (from terminal in project folder)
scalac Homework7.scala main.scala

-- Run the program
scala main input.txt output.txt


> Note: `append` adds the **last word** in the line to every earlier word. `leapys` identifies leap years using standard Gregorian rules.

---

## 🧑‍💻 Author Notes

This project was built as part of a CS class assignment using Scala. Input and output are handled via file I/O. All logic and helper methods were written by the student.

> You may ignore `.class` and `.tasty` files when committing — they’re generated during compilation.

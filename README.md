# HangMan — TDD with JUnit

This is a small Java project I built to learn and practice **Test‑Driven Development (TDD)** using **JUnit**. The idea was to implement the classic Hangman game incrementally: write a failing test, make it pass, then refactor.

## Why this project

- Practice writing small, focused unit tests with JUnit
- Learn the TDD workflow (red → green → refactor)
- Explore simple game logic and design in Java

## Getting started

- Open the project in **VS Code** (I recommend the Java and Test Runner extensions)
- Run the tests from the **Test Explorer** or with your preferred build tool (Maven/Gradle)

If you want to compile and run manually (assuming you have JUnit jars in `lib`):

```bash
javac -cp "lib/*:." -d bin src/*.java
java -cp "lib/*:bin" org.junit.runner.JUnitCore TestHangman
```

## Project structure

- `src/` — source files (`App.java`, `Hangman.java`, `TestHangman.java`)
- `lib/` — dependency jars (e.g., JUnit)
- `bin/` — compiled classes

## Notes

- This is my personal learning repo — feedback and small PRs are welcome.
- Author: Uzair


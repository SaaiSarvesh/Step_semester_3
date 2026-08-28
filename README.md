\# Step\_semester\_3 - Semester Progress Log



\## Date: 29-08-2026



\*\*Today's Work:\*\*

\- Completed all Week 2 / Session 2 Java string manipulation, validation, and parsing exercises on the `feature/session\_2` branch.

\- Implemented 5 Assignment Problems under `src/main/java/week\_2/assigment\_problems/`:

&#x20; 1. `AtmPinValidator`: Validated 4-to-6 digit numerical PIN input rules.

&#x20; 2. `WordReversalEncoder`: Reversed individual words while retaining sentence word order.

&#x20; 3. `ProductInventoryParser`: Split and validated 3-field CSV records (`ProductName`, `SKU`, `Quantity`).

&#x20; 4. `IsbnValidator`: Normalized and validated 13-character ISBN strings (`\[PUBCODE] YEAR | CATALOG`).

&#x20; 5. `StopWordFrequencyReport`: Filtered filler words ("the", "was", "and", "a", "is", "of", "in") and generated frequency counts sorted in descending order using `HashMap`.

\- Implemented 6 Class Problems under `src/main/java/week\_2/class\_problems/`:

&#x20; 1. `RockPaperScissorsGame`: Terminal arcade simulator tracking scoreboard stats and win percentage over 5 rounds.

&#x20; 2. `VowelConsonantCounter`: Evaluated text character-by-character using `charAt()` to count vowels and consonants.

&#x20; 3. `CsvStudentRecordParser`: Parsed 3-field student CSV records (`Name`, `Roll No`, `Dept`).

&#x20; 4. `FileExtensionValidator`: Extracted file extension via `lastIndexOf('.')` and validated against allowed extensions (`pdf`, `docx`, `zip`).

&#x20; 5. `MaskedPhoneNumberFormatter`: Validated 10-digit phone numbers and masked them into `XXXXXX-1234` format.

&#x20; 6. `BankTransactionValidator`: Normalized raw transaction codes and validated 14-character structural rules (`\[BANKCODE] DATE | SEQ`).



\*\*Next Session Plan:\*\*

\- Switch to the `develop` branch and create `feature/session\_3` for Week 3 / Session 3 OOP exercises.

\- Focus on object-oriented design concepts, encapsulation, constructors, and inheritance patterns.



\*\*Issues Faced:\*\*

\- Fixed a compilation error in `BankTransactionValidator.java` where `System.print` was incorrectly used instead of `System.out.print`.

\- Resolved a Git package path representation issue by ensuring both `assigment\_problems` and `class\_problems` sub-packages contained active Java source files.



\---



\## Date: 22-08-2026



\*\*Today's Work:\*\*

\- Set up the repository branching structure (`main` for documentation, `develop` for the project skeleton, and `feature/session\_1` for Session 1 work).

\- Solved and verified Week 1 class and assignment problems inside `src/main/java/week\_1/`.

\- Verified local Java environment compilation using Command Prompt (`javac` and `java -cp`).



\*\*Next Session Plan:\*\*

\- Create `feature/session\_2` branch from `develop` and start String manipulation and parsing problem sets.



\*\*Issues Faced:\*\*

\- None.



\---



\## Repository Workflow Summary



| Branch | Purpose | Allowed Content |

| :--- | :--- | :--- |

| \*\*`main`\*\* | Daily progress log and semester documentation | `README.md` only |

| \*\*`develop`\*\* | Empty project skeleton | Project structure only (no logic/code) |

| \*\*`feature/session\_n`\*\* | Daily coding work | Topic package containing `class\_problems` and `assigment\_problems` |


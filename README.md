# Step_semester_3 - Semester Progress Log

## Date: 11-09-2026
**Today's Work:**
- Completed Week 5 / Session 5 Java array manipulation, single-pass algorithms, and object-oriented ranking exercises on the `feature/session_5` branch.
- Implemented 5 Class Problems under `src/main/java/week_5/class_problems/`:
  1. `ScoreBooster`: In-place array element modification using index targeting.
  2. `DuplicateTeamFinder`: Identified duplicate entries using pairwise nested loop comparisons.
  3. `PodiumFinder`: Single-pass algorithm tracking top 3 highest scores ($O(N)$ time complexity) without sorting.
  4. `SeatingGridOptimizer`: Evaluated 2D array row averages using a private helper method `rowAverage()`.
  5. `PlacementDriveEngine`: Object-oriented ranking engine implementing `Comparable<Candidate>`, method overloading for eligibility checks, and `Arrays.sort()`.
- Implemented 5 Assignment Problems under `src/main/java/week_5/assignment_problems/`:
  1. `FantasyScoreMultiplier`: In-place double array element scaling for captain and vice-captain scores.
  2. `DuplicatePlayerChecker`: Pairwise nested-loop scanning to identify early duplicate player names.
  3. `TopPerformerTracker`: Single-pass tracking to determine minimum score, maximum score, and score spread.
  4. `MatchDayGridAnalyzer`: Processed 2D grid of match scores using helper methods to classify "Power Surge" overs.
  5. `FantasyDraftEngine`: Encapsulated player object filtering via overloaded `isDraftable()` methods and sorted draft lists using `Comparable<Player>` interface.

**Next Session Plan:**
- Merge `feature/session_5` updates and prepare for Week 6 / Session 6 problem sets.

**Issues Faced:**
- Resolved `javac` command path issues by ensuring file paths (`.java`) are used for compilation and package notation (`.`) is used for execution.
- Fixed directory naming typos in `assignment_problems` path structure.

---

## Date: 29-08-2026
**Today's Work:**
- Completed all Week 2 / Session 2 Java string manipulation, validation, and parsing exercises on the `feature/session_2` branch.
- Implemented 5 Assignment Problems under `src/main/java/week_2/assigment_problems/`:
  1. `AtmPinValidator`: Validated 4-to-6 digit numerical PIN input rules.
  2. `WordReversalEncoder`: Reversed individual words while retaining sentence word order.
  3. `ProductInventoryParser`: Split and validated 3-field CSV records (ProductName, SKU, Quantity).
  4. `IsbnValidator`: Normalized and validated 13-character ISBN strings (`[PUBCODE] YEAR | CATALOG`).
  5. `StopWordFrequencyReport`: Filtered filler words ("the", "was", "and", "a", "is", "of", "in") and generated frequency counts sorted in descending order using HashMap.
- Implemented 6 Class Problems under `src/main/java/week_2/class_problems/`:
  1. `RockPaperScissorsGame`: Terminal arcade simulator tracking scoreboard stats and win percentage over 5 rounds.
  2. `VowelConsonantCounter`: Evaluated text character-by-character using `charAt()` to count vowels and consonants.
  3. `CsvStudentRecordParser`: Parsed 3-field student CSV records (Name, Roll No, Dept).
  4. `FileExtensionValidator`: Extracted file extension via `lastIndexOf('.')` and validated against allowed extensions (pdf, docx, zip).
  5. `MaskedPhoneNumberFormatter`: Validated 10-digit phone numbers and masked them into `XXXXXX-1234` format.
  6. `BankTransactionValidator`: Normalized raw transaction codes and validated 14-character structural rules (`[BANKCODE] DATE | SEQ`).

**Next Session Plan:**
- Switch to the `develop` branch and create `feature/session_3` for Week 3 / Session 3 OOP exercises.
- Focus on object-oriented design concepts, encapsulation, constructors, and inheritance patterns.

**Issues Faced:**
- Fixed a compilation error in `BankTransactionValidator.java` where `System.print` was incorrectly used instead of `System.out.print`.
- Resolved a Git package path representation issue by ensuring both `assigment_problems` and `class_problems` sub-packages contained active Java source files.

---

## Date: 22-08-2026
**Today's Work:**
- Set up the repository branching structure (`main` for documentation, `develop` for the project skeleton, and `feature/session_1` for Session 1 work).
- Solved and verified Week 1 class and assignment problems inside `src/main/java/week_1/`.
- Verified local Java environment compilation using Command Prompt (`javac` and `java -cp`).

**Next Session Plan:**
- Create `feature/session_2` branch from `develop` and start String manipulation and parsing problem sets.

**Issues Faced:**
- None.

---

## Repository Workflow Summary
| Branch | Purpose | Allowed Content |
| :--- | :--- | :--- |
| **main** | Daily progress log and semester documentation | `README.md` only |
| **develop** | Empty project skeleton | Project structure only (no logic/code) |
| **feature/session_n** | Daily coding work | Topic package containing `class_problems` and `assignment_problems` |
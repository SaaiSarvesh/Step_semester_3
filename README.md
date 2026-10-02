# Step_semester_3 - Semester Progress Log

## Date: 02-10-2026
**Today's Work:**
- Completed Week 8 / Session 8 Object-Oriented Programming (Polymorphism, Abstract Classes, and Factory Design Pattern) exercises on the `feature/session_8` branch.
- Implemented 5 Class Problems under `src/main/java/week_8/class_problems/`:
  1. `PaymentSystem`: Abstract payment processing system calculating final transactional amounts for Card (2%), Wallet (1%), and Bank Transfer (0%) fees.
  2. `LibrarySystem`: Library item due date calculator using `java.time.LocalDate` and regex parsing for item types (`BOOK` 14 days, `DVD` 7 days, `MAGAZINE` 3 days).
  3. `DeliverySystem`: Multi-tiered delivery fee calculator handling distance and weight pricing rules across Standard, Express, and International options.
  4. `ExamSystem`: Examination grading engine processing MCQ, True/False, and Essay submission rules using regex pattern matching and custom scoring thresholds.
  5. `TransportSystem`: Fare engine evaluating base fare adjustments and surcharges for Flight, Train, and Bus transport bookings.
- Implemented 5 Category C Assignment Problems under `src/main/java/week_8/assignment_problems/`:
  1. `CanteenBilling`: Automated billing counter calculating discounted bills for Student (10% off), Staff (5% off), and Guest (full + ₹10 service charge) types.
  2. `ParkingCalculator`: Campus parking fee evaluator processing hourly rates for Bike, Car (tiered duration rate), and Truck (minimum ₹100 floor rate).
  3. `HostelElectricity`: Room bill parser supporting single-unit calculations, shared occupancy rate splits, and fixed AC maintenance surcharges.
  4. `FestivalBonus`: Company payroll bonus evaluator calculating monthly percentage payouts for Full-Time, Part-Time, and Intern staff.
  5. `StreamingPlan`: Video platform plan renewal calculator predicting expiry dates using `LocalDate.plusDays()` across Basic (30 days), Standard (90 days), and Premium (365 days) subscriptions.

**Next Session Plan:**
- Merge `feature/session_8` into `develop` and prepare for upcoming semester evaluation benchmarks.

**Issues Faced:**
- Fixed `InputMismatchException` in `ExamSystem` and `DeliverySystem` when processing line entries containing spaces and quotes by implementing `java.util.regex.Pattern` parsing.
- Resolved tracking issues where compiled `.class` binaries were accidentally pushed to the remote repository cache by untracking them using `git rm -r --cached`.

---

## Date: 25-09-2026
**Today's Work:**
- Completed Week 7 / Session 7 Java Object-Oriented Design exercises on the `feature/session_7` branch[cite: 2].
- Implemented Class Problems under `src/main/java/week_7/class_problems/`:
  1. `AttendanceSheet`: Class attendance manager tracking present/absent states and percentage calculations[cite: 2].
  2. `Locker`: Encapsulated security locker managing pin verification and state locks[cite: 2].
  3. `NameTag`: Formatter formatting name tags with clean text alignment rules[cite: 2].
  4. `PiggyBank`: Savings container managing coin additions, total balances, and withdrawal limits[cite: 2].
- Implemented Assignment Problems under `src/main/java/week_7/assignment_problems/`:
  1. `Cart`: E-commerce shopping cart managing item additions, item removals, and total calculations[cite: 2].
  2. `Character`: Game character state engine processing health, defense, and attack operations[cite: 2].
  3. `PasswordChecker`: String security validator enforcing complexity rules and length criteria[cite: 2].
  4. `Playlist`: Music playlist manager supporting song sequencing, skipping, and duration totals[cite: 2].
  5. `Scorecard`: Cricket/match scorecard tracker evaluating runs, overs, and run-rate metrics.
  6. `TrafficLight`: Signal simulator managing light transitions and timing cycles[cite: 2].

**Next Session Plan:**
- Merge `feature/session_7` updates into `develop` and transition to Week 8 Factory Design Pattern and Polymorphism problem sets.

**Issues Faced:**
- Resolved illegal access compiler warnings by ensuring explicit constructor calls and proper access modifier scoping (`private` / `public`) across encapsulated state fields.

---

## Date: 18-09-2026
**Today's Work:**
- Completed Week 6 / Session 6 Java Encapsulation, State Management, and Domain Modeling exercises on the `feature/session_6` branch[cite: 3].
- Implemented Class Problems under `src/main/java/week_6/class_problems/`:
  1. `Course`: Course enrollment container tracking student registrations, limits, and roster updates[cite: 3].
  2. `IdCard`: Identity card generator managing holder details, validity checks, and formatting rules[cite: 3].
  3. `MessWallet`: Campus mess balance tracker processing recharges, meal deductions, and balance alerts[cite: 3].
  4. `PlacementRecord`: Campus placement tracker managing student eligibility, interview rounds, and offers[cite: 3].
  5. `Student`: Encapsulated student profile managing academic credentials and GPA evaluation[cite: 3].
- Implemented Assignment Problems under `src/main/java/week_6/assignment_problems/`:
  1. `BookInventory`: Library inventory engine tracking availability status, reservations, and stock levels[cite: 3].
  2. `CompanyEmployee`: Corporate employee record system handling role designations and salary structures[cite: 3].
  3. `Employee`: Core employee model encapsulating personal data and department assignments[cite: 3].
  4. `HallTicket`: Examination hall ticket generator verifying course eligibility and seating details[cite: 3].
  5. `PayrollAccount`: Payroll calculator processing gross compensation, tax deductions, and net payouts[cite: 3].

**Next Session Plan:**
- Advance to Week 7 exercises on object interactions, modular components, and encapsulated domain models[cite: 2].

**Issues Faced:**
- Corrected state mutation bugs in `MessWallet` where balance checks were evaluated post-deduction instead of pre-deduction[cite: 3].

---

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
- Merge `feature/session_5` updates and prepare for Week 6 / Session 6 problem sets[cite: 3].

**Issues Faced:**
- Resolved `javac` command path issues by ensuring file paths (`.java`) are used for compilation and package notation (`.`) is used for execution.
- Fixed directory naming typos in `assignment_problems` path structure.

---

## Date: 04-09-2026
**Today's Work:**
- Completed Week 4 / Session 4 Java algorithm optimization and array manipulation exercises on the `feature/session_4` branch[cite: 4, 5].
- Implemented Class Problems under `src/main/java/week_4/class_problems/`:
  1. `Duplicate`: Array duplicate element identification using frequency scanning[cite: 5].
  2. `MaxProfit`: Stock trading single-pass algorithm evaluating maximum profit potential ($O(N)$ time complexity)[cite: 5].
  3. `TwoSum`: Two-sum index locator using complementary target lookup[cite: 5].
  4. `merge_Sorted_Arrays`: Two-pointer merge algorithm unifying sorted integer arrays[cite: 5].
  5. `rotate_Array`: In-place array rotation algorithm shifting elements by $k$ positions[cite: 5].
- Implemented Assignment Problems under `src/main/java/week_4/assignment_problems/`:
  1. `FindMinRotatedArray`: Binary search algorithm ($O(\log N)$) finding minimum element in rotated sorted array[cite: 4].
  2. `MaxSubarray`: Maximum subarray sum evaluation using Kadane's algorithm ($O(N)$ time complexity)[cite: 4].
  3. `Product_ExceptSelf`: Array product transformation excluding current element without division operations[cite: 4].
  4. `SubarraysSumEqualsK`: Prefix sum hashing technique counting contiguous subarrays matching target sum $K$[cite: 4].
  5. `ThreeSum`: Three-pointer search finding unique triplets summing to zero[cite: 4].

**Next Session Plan:**
- Advance to Week 5 array manipulation and ranking algorithm exercises.

**Issues Faced:**
- Untracked compiled `.class` binaries (`FindMinRotatedArray.class`, `MaxSubarray.class`, etc.) from git cache to maintain clean repository source tracking[cite: 4, 5].

---

## Date: 28-08-2026
**Today's Work:**
- Completed Week 3 / Session 3 control flow, condition evaluation, and pattern printing exercises on the `feature/session_3` branch[cite: 6].
- Implemented Assignment Problems under `src/main/java/week_3/assignment_problems/`:
  1. `P1._VotingEligibilityChecker`: Age and citizenship eligibility checker using conditional statements[cite: 6].
  2. `P1_NumberPyramidPatternPrinter`: Nested loop algorithm generating structured number pyramid patterns[cite: 6].
  3. `P2_ATMPINRetrySystem`: Loop-based PIN authorization guard tracking failed retry limits[cite: 6].
  4. `P5_DayNameFromNumber`: Conditional switch evaluator mapping numeric day inputs to day names[cite: 6].
  5. `P5_PrimeNumberChecker`: Primality checking algorithm utilizing $O(\sqrt{N})$ loop limits[cite: 6].

**Next Session Plan:**
- Create `feature/session_4` branch from `develop` and start array manipulation problem sets[cite: 4, 5].

**Issues Faced:**
- Fixed edge-case input handling in loop termination conditions for PIN retry attempts[cite: 6].

---

## Date: 22-08-2026
**Today's Work:**
- Set up the repository branching structure (`main` for documentation, `develop` for the project skeleton, and `feature/session_1` for Session 1 work)[cite: 4, 6].
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
| **main** | Daily progress log and semester documentation | `README.md` only[cite: 2, 4, 6] |
| **develop** | Empty project skeleton | Project structure only (no logic/code)[cite: 2, 4, 6] |
| **feature/session_n** | Daily coding work | Topic package containing `class_problems` and `assignment_problems`[cite: 2, 3, 4, 6] |
Step_semester_3 - Semester Progress Log

## Date: 16-10-2026
**Today's Work:**
- Completed Week 10 / Session 10 Java problem sets on the `feature/session_10` branch.
- Implemented Class Problems under `src/main/java/week_10/class_problems/`:
  1. `VowelConsonantCounter`: Case-insensitive character scanner counting vowels and consonants.
  2. `WordReverserAndPalindrome`: Mutable `StringBuilder` text reverser and palindrome validator.
  3. `EvenOddCounter`: Integer list parser evaluating even and odd numbers via modulo operations.
  4. `InPlaceArrayReversal`: Two-pointer in-place list element swapper.
  5. `DigitSumAndReversal`: Integer digit extractor computing digit sums and mathematical reversals.
  6. `PrimeNumberChecker`: Primality testing algorithm utilizing square root limit bounds.
  7. `FactorialCalculation`: Non-negative integer factorial generator with zero-case handling.
  8. `StudentGradeAssignment`: Conditional grade ladder evaluating marks out of 100.
  9. `LeapYearDetector`: Logical year evaluation checking divisibility by 4, 100, and 400.
  10. `StudentResultCardGenerator`: Encapsulated `Student` class calculating averages, letter grades, and uppercase name formatting.
- Implemented Assignment Problems under `src/main/java/week_10/`:
  1. `assignment_problem_01/BusiestBusRow`: 2D grid bus row total analyzer finding the busiest row with strict tie-breaking.
  2. `assignment_problem_02/ClassAttendanceTracker`: Single-pass attendance analyzer tracking present days and longest unbroken streaks.
  3. `assignment_problem_03/DutyRosterRotation`: Array rotation algorithm utilizing modulo arithmetic (`k % n`) to shift roster names efficiently in $O(N)$ time.
  4. `assignment_problem_04/ExamScoreBandCounter`: Binary search lower and upper bound algorithm counting scores within a band $[low, high]$ in $O(\log N)$ time.
  5. `assignment_problem_05/SecondBestScore`: Single-pass distinct second-highest score finder without array sorting.

**Next Session Plan:**
- Merge `feature/session_10` into `develop` and prepare for Week 11 problem sets.

**Issues Faced:**
- Resolved package scoping and classpath execution errors when running fully qualified class names from compiled target directories.

---

## Date: 09-10-2026
**Today's Work:**
- Completed Week 9 / Session 9 Object-Oriented Programming (Abstraction, Inheritance, Polymorphism, and Interface-based Modular Design) exercises on the `feature/session_9` branch.
- Implemented 5 Class Problems under `src/main/java/week_9/class_problems/`:
  1. `GardenPlotReport`: Abstract plot area generator evaluating circular ($\pi \times r^2$), rectangular, and triangular geometric plot calculations.
  2. `WeeklyStaffPay`: Payroll engine computing weekly remuneration for Full-Time staff (fixed salary), Hourly staff (standard + 1.5× overtime multiplier above 40 hrs), and Interns (fixed stipend).
  3. `LibraryFineCounter`: Late fee counter calculating overdue penalties across Books (₹2/day), DVDs (₹5/day capped at ₹50), and Magazines (₹1/day).
  4. `ElectricityBilling`: Tiered utility billing system evaluating Home connections (tiered rate for first 100 units), Shop connections (fixed surcharge), and Factory connections (minimum ₹1000 floor bill).
  5. `TravelBookingApp`: Fare calculation engine computing mode-specific fares (Bus, Train, Flight) while encapsulating a shared ₹50 booking fee in the abstract base class.
- Implemented 5 Category C Assignment Problems under `src/main/java/week_9/assignment_problems/`:
  1. `MovieTicketCounter`: Cinema billing system calculating total ticket amounts across Regular (₹150), Premium (₹250), and Recliner (₹400) seats with a uniform ₹20 convenience fee per ticket.
  2. `ParcelShippingDesk`: Courier shipping desk utilizing the `Insurable` interface to compute shipping charges and 2% declared-value insurance for Express and Fragile parcels while keeping Standard parcels uninsured.
  3. `CollegeFeeCounter`: College fee counter leveraging a `TransportUser` interface to automatically add ₹12,000 transport fees to Day Scholars and Scholarship students without type checking.
  4. `CityCabFareMeter`: Cab fare meter utilizing a `NightServiceable` marker interface to compute distance fares with a ₹100 minimum floor and 20% night surcharge for Sedans and SUVs while rejecting night requests for Minis.
  5. `HomeApplianceEnergyReport`: Appliance power monitor using a `SaverModeCapable` interface to evaluate energy consumption (kWh) and costs (₹8/kWh), applying a 25% energy reduction for supported appliances (AC, Washer) and rejecting unsupported saver mode requests (Fridge, TV).

**Next Session Plan:**
- Merge `feature/session_9` into `develop` and prepare for Week 10 Object-Oriented Design and Exception Handling problem sets.

**Issues Faced:**
- Fixed branch mismatch error during `git push` by renaming the local branch from `feature/branch_8` to `feature/session_9` using `git branch -m`.
- Resolved tracking issues with unwanted root `README.md` and compiled files on feature branches using `git rm --cached`.

---

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
- Completed Week 7 / Session 7 Java Object-Oriented Design exercises on the `feature/session_7` branch.
- Implemented Class Problems under `src/main/java/week_7/class_problems/`:
  1. `AttendanceSheet`: Class attendance manager tracking present/absent states and percentage calculations.
  2. `Locker`: Encapsulated security locker managing pin verification and state locks.
  3. `NameTag`: Formatter formatting name tags with clean text alignment rules.
  4. `PiggyBank`: Savings container managing coin additions, total balances, and withdrawal limits.
- Implemented Assignment Problems under `src/main/java/week_7/assignment_problems/`:
  1. `Cart`: E-commerce shopping cart managing item additions, item removals, and total calculations.
  2. `Character`: Game character state engine processing health, defense, and attack operations.
  3. `PasswordChecker`: String security validator enforcing complexity rules and length criteria.
  4. `Playlist`: Music playlist manager supporting song sequencing, skipping, and duration totals.
  5. `Scorecard`: Cricket/match scorecard tracker evaluating runs, overs, and run-rate metrics.
  6. `TrafficLight`: Signal simulator managing light transitions and timing cycles.

**Next Session Plan:**
- Merge `feature/session_7` updates into `develop` and transition to Week 8 Factory Design Pattern and Polymorphism problem sets.

**Issues Faced:**
- Resolved illegal access compiler warnings by ensuring explicit constructor calls and proper access modifier scoping (`private` / `public`) across encapsulated state fields.

---

## Date: 18-09-2026
**Today's Work:**
- Completed Week 6 / Session 6 Java Encapsulation, State Management, and Domain Modeling exercises on the `feature/session_6` branch.
- Implemented Class Problems under `src/main/java/week_6/class_problems/`:
  1. `Course`: Course enrollment container tracking student registrations, limits, and roster updates.
  2. `IdCard`: Identity card generator managing holder details, validity checks, and formatting rules.
  3. `MessWallet`: Campus mess balance tracker processing recharges, meal deductions, and balance alerts.
  4. `PlacementRecord`: Campus placement tracker managing student eligibility, interview rounds, and offers.
  5. `Student`: Encapsulated student profile managing academic credentials and GPA evaluation.
- Implemented Assignment Problems under `src/main/java/week_6/assignment_problems/`:
  1. `BookInventory`: Library inventory engine tracking availability status, reservations, and stock levels.
  2. `CompanyEmployee`: Corporate employee record system handling role designations and salary structures.
  3. `Employee`: Core employee model encapsulating personal data and department assignments.
  4. `HallTicket`: Examination hall ticket generator verifying course eligibility and seating details.
  5. `PayrollAccount`: Payroll calculator processing gross compensation, tax deductions, and net payouts.

**Next Session Plan:**
- Advance to Week 7 exercises on object interactions, modular components, and encapsulated domain models.

**Issues Faced:**
- Corrected state mutation bugs in `MessWallet` where balance checks were evaluated post-deduction instead of pre-deduction.

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
- Merge `feature/session_5` updates and prepare for Week 6 / Session 6 problem sets.

**Issues Faced:**
- Resolved `javac` command path issues by ensuring file paths (`.java`) are used for compilation and package notation (`.`) is used for execution.
- Fixed directory naming typos in `assignment_problems` path structure.

---

## Date: 04-09-2026
**Today's Work:**
- Completed Week 4 / Session 4 Java algorithm optimization and array manipulation exercises on the `feature/session_4` branch.
- Implemented Class Problems under `src/main/java/week_4/class_problems/`:
  1. `Duplicate`: Array duplicate element identification using frequency scanning.
  2. `MaxProfit`: Stock trading single-pass algorithm evaluating maximum profit potential ($O(N)$ time complexity).
  3. `TwoSum`: Two-sum index locator using complementary target lookup.
  4. `merge_Sorted_Arrays`: Two-pointer merge algorithm unifying sorted integer arrays.
  5. `rotate_Array`: In-place array rotation algorithm shifting elements by $k$ positions.
- Implemented Assignment Problems under `src/main/java/week_4/assignment_problems/`:
  1. `FindMinRotatedArray`: Binary search algorithm ($O(\log N)$) finding minimum element in rotated sorted array.
  2. `MaxSubarray`: Maximum subarray sum evaluation using Kadane's algorithm ($O(N)$ time complexity).
  3. `Product_ExceptSelf`: Array product transformation excluding current element without division operations.
  4. `SubarraysSumEqualsK`: Prefix sum hashing technique counting contiguous subarrays matching target sum $K$.
  5. `ThreeSum`: Three-pointer search finding unique triplets summing to zero.

**Next Session Plan:**
- Advance to Week 5 array manipulation and ranking algorithm exercises.

**Issues Faced:**
- Untracked compiled `.class` binaries (`FindMinRotatedArray.class`, `MaxSubarray.class`, etc.) from git cache to maintain clean repository source tracking.

---

## Date: 28-08-2026
**Today's Work:**
- Completed Week 3 / Session 3 control flow, condition evaluation, and pattern printing exercises on the `feature/session_3` branch.
- Implemented Assignment Problems under `src/main/java/week_3/assignment_problems/`:
  1. `P1._VotingEligibilityChecker`: Age and citizenship eligibility checker using conditional statements.
  2. `P1_NumberPyramidPatternPrinter`: Nested loop algorithm generating structured number pyramid patterns.
  3. `P2_ATMPINRetrySystem`: Loop-based PIN authorization guard tracking failed retry limits.
  4. `P5_DayNameFromNumber`: Conditional switch evaluator mapping numeric day inputs to day names.
  5. `P5_PrimeNumberChecker`: Primality checking algorithm utilizing $O(\sqrt{N})$ loop limits.

**Next Session Plan:**
- Create `feature/session_4` branch from `develop` and start array manipulation problem sets.

**Issues Faced:**
- Fixed edge-case input handling in loop termination conditions for PIN retry attempts.

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
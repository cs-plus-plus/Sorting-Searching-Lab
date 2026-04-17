# CS++ Sorting & Searching Lab

**Replaces:** College Board's retired *Elevens Lab*
**Curriculum days:** 61–63 (AP CSA — CS++ 90-day plan)
**CED topics:** 4.14 (sorting), 4.15 (binary search), 4.16 & 4.17 (recursion)

A 3-day lab where you implement the AP-tested sorts and searches from scratch. No `Arrays.sort()`, no `Collections.sort()` — the whole point is that you write the algorithms yourself and can trace them by hand on exam day.

---

## Day 1 — Selection Sort

**Objectives**
- Implement selection sort on an array.
- Trace selection sort iteration-by-iteration.
- Measure informal runtime.

**Procedure (90 min)**
1. Lab kickoff (10 min)
2. Live trace: selection sort on paper (15 min)
3. Build `selectionSort` (40 min)
4. Test + commit (15 min)
5. Reflection (10 min)

**Success criteria**
- `selectionSort` passes all Maven tests
- You can describe best-case / worst-case behavior out loud

**Exit ticket:** Write the loop invariant of selection sort in one sentence.

---

## Day 2 — Insertion Sort + Merge Sort

**Objectives**
- Implement insertion sort.
- Implement a **recursive** merge sort (uses `merge` as the combine step).
- Compare runtime informally between selection, insertion, and merge on a 10k-element array.

**Procedure (90 min)**
1. Stand-up (5 min)
2. `insertionSort` build (25 min)
3. `mergeSort` + `merge` build (40 min)
4. Informal benchmark (15 min)
5. Commit + reflection (5 min)

**Success criteria**
- Both `insertionSort` and `mergeSort` pass all tests
- `merge` works on uneven and empty inputs

**Exit ticket:** Which sort is fastest for already-sorted input? Why?

---

## Day 3 — Binary Search

**Objectives**
- Implement iterative and recursive binary search.
- Explain the **sorted-input precondition**.
- Submit the final lab.

**Procedure (90 min)**
1. Stand-up (5 min)
2. Binary search build — iterative + recursive (40 min)
3. Submit final lab (20 min)
4. Reflection & connection to AP exam (25 min)

**Success criteria**
- `binarySearchIterative` and `binarySearchRecursive` both pass tests
- You can state, without notes, why binary search requires sorted input

**Exit ticket:** Why is sorted input required for binary search?

End of the last lab — **you're ready for practice exams next week.** 🎉

---

## What to implement

Open `src/main/java/csplusplus/sorting/SortSearch.java`:

| Method | Signature | Notes |
|---|---|---|
| `selectionSort` | `(int[]) → void` | in place, ascending |
| `insertionSort` | `(int[]) → void` | in place, ascending |
| `mergeSort` | `(int[]) → void` | in place, **recursive** |
| `merge` | `(int[], int[]) → int[]` | combine step — new array |
| `binarySearchIterative` | `(int[], int) → int` | index or -1 |
| `binarySearchRecursive` | `(int[], int) → int` | index or -1; use a private helper |

**Do not use `java.util.Arrays.sort` or `Collections.sort`.** You write the algorithms.

## Workflow

```bash
mvn test                                                  # all tests
mvn -Dtest=SortSearchTest#mergeSort_basic test            # one test
mvn -Dtest=SortSearchTest#selectionSort_* test            # one section
```

Commit & push — the autograder runs `mvn -B -q test`.

## Requirements

- Java 17+
- Maven 3.8+

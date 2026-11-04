# JOBSHEET 8 - LOOPS 2

**Student Identity:**

-   **Name:** Muhamad Dzaky Ammar Naufal
-   **Student ID (NIM):** 264107020222
-   **Class / Attendance No.:** 1I / 21

------------------------------------------------------------------------

## 1: PRACTICAL OBJECTIVES

The objectives of this practical session are:

1.  Understand the concept and flow of nested loops in algorithms.
2.  Recognize the syntax and structure of nested loops.
3.  Understand how outer and inner loops work together.
4.  Apply nested loops to solve simple programming problems.

------------------------------------------------------------------------

## 2: EXPERIMENT RESULTS AND ANALYSIS

### 2.1 Experiment 1: Review of Loops 1 -- FOR Loop

This experiment reviews the `for` loop by printing the character `*`
several times horizontally. The number of stars depends on the positive
integer entered by the user.

#### 2.1.1 Java Program Code

The Java program uses a `Scanner` to read the value of `n`. A `for` loop
starts from `i = 1` and repeats while `i <= n`. The `print()` statement
displays each star on the same line.

// Masukkan kode program Java Anda di sini (StarStudentNo.java)

#### 2.1.2 Program Output / Screenshot

The program is tested using `n = 5`, `n = 3`, and `n = 7`.

// Tempatkan tangkapan layar di sini: kode Java di editor yang menampilkan program StarStudentNo.java.
// Tempatkan tangkapan layar di sini: output terminal untuk input n = 5 yang menampilkan *****.
// Tempatkan tangkapan layar di sini: output terminal untuk input n = 3 dan n = 7 yang menampilkan *** dan ******* secara berurutan.

-   For `n = 5`, the output contains 5 stars: `*****`
-   For `n = 3`, the output contains 3 stars: `***`
-   For `n = 7`, the output contains 7 stars: `*******`

#### 2.1.3 Answers to Questions / Reflection Questions

-   **Question 1:** If the initialization `i = 1` is changed to `i = 0`
    without changing the condition, how many `*` characters are printed
    when `n = 5`? Explain.
    -   **Answer:** The loop prints **6 stars**. The values of `i` are
        0, 1, 2, 3, 4, and 5. There are six values because the condition
        is `i <= 5`.
-   **Question 2:** If the condition `i <= n` is changed to `i < n`, how
    many times does the loop run when `n = 5`? Why is the result
    different?
    -   **Answer:** The loop runs **4 times** when `i` starts at 1. It
        stops when `i` becomes 5 because 5 is not less than 5. The
        result is different because the condition `i < n` does not
        include the value of `n`.
-   **Question 3:** Predict the output of the following code fragment
    when `n = 9`, then modify it so that it prints the odd positive
    numbers that do not exceed `n`.
    -   **Answer:** The original code prints the even numbers from 2 to
        8: `2 4 6 8`

        To print odd positive numbers, the loop can start from 1 and
        increase by 2. The output for `n = 9` is: `1 3 5 7 9`
-   **Question 4:** Explain why changing the increment `i++` to `i--`
    with the condition still `i <= n` makes the loop run endlessly for
    positive `n`.
    -   **Answer:** The value of `i` becomes smaller after every
        repetition. If `i` starts at 1, it will become 0, -1, -2, and so
        on. These values always satisfy `i <= n` when `n` is positive,
        so the condition never becomes false. Therefore, the loop does
        not stop.
-   **Question 5:** Commit and push the program code to GitHub.
    -   **Answer:** This is a practical instruction. After the program
        is completed and tested, save the changes with a Git commit and
        push them to the `daspro-jobsheet8` repository.

------------------------------------------------------------------------

### 2.2 Experiment 2: Rectangle Star Pattern -- Nested FOR

This experiment uses nested `for` loops to print a rectangle made of
stars. The outer loop controls the number of rows, while the inner loop
controls the number of columns.

#### 2.2.1 Java Program Code

The program reads two positive integers: `rows` and `columns`. The outer
`for` loop repeats for every row. Inside it, the inner `for` loop prints
the stars for each column. After each row, `println()` moves the output
to a new line.

// Masukkan kode program Java Anda di sini (RectangleStudentNo.java)

#### 2.2.2 Program Output / Screenshot

The program is tested with these inputs:

-   `rows = 3` and `columns = 6`: the output contains 3 rows, with 6
    stars in each row.
-   `rows = 4` and `columns = 2`: the output contains 4 rows, with 2
    stars in each row.
-   `rows = 1` and `columns = 5`: the output contains 1 row, with 5
    stars.

// Tempatkan tangkapan layar di sini: kode Java di editor yang menampilkan program RectangleStudentNo.java dengan nested FOR loop.
// Tempatkan tangkapan layar di sini: output terminal untuk rows = 3 dan columns = 6 (3 baris, 6 bintang per baris).
// Tempatkan tangkapan layar di sini: output terminal untuk rows = 4 dan columns = 2, serta rows = 1 dan columns = 5.

#### 2.2.3 Answers to Questions / Reflection Questions

-   **Question 1:** Explain the function of the variables `i` and `j` in
    the program.
    -   **Answer:** The variable `i` is the counter for the outer loop
        and controls the rows. The variable `j` is the counter for the
        inner loop and controls the columns.
-   **Question 2:** How many times are the outer loop, the inner loop,
    and the statement `print("*")` executed for `rows = 4` and
    `columns = 7`?
    -   **Answer:** The outer loop runs **4 times**. The inner loop runs
        **7 times for each row**, so it runs **28 times in total**. The
        statement `print("*")` is also executed **28 times**.
-   **Question 3:** What happens if the bounds of the outer and inner
    loops are swapped? Use `rows = 3` and `columns = 6` to explain.
    -   **Answer:** The program prints **6 rows with 3 stars in each
        row** instead of 3 rows with 6 stars. The total number of stars
        remains 18, but the rectangle changes its shape.
-   **Question 4:** Explain the effect of removing
    `System.out.println();` after the inner loop.
    -   **Answer:** All stars are printed on one line because the cursor
        does not move to a new line after each row. The rectangle shape
        will no longer be visible.
-   **Question 5:** Modify the program so that the printed character is
    `#`, then commit and push the changes to GitHub.
    -   **Answer:** Replace the printed character `*` with `#`. The
        program will then display a rectangle made of `#` characters.
        After testing it, commit and push the changes to GitHub.

------------------------------------------------------------------------

### 2.3 Experiment 3: Debugging a Star Triangle -- Nested WHILE

This experiment uses nested `while` loops to print a right triangle of
stars. The initial program contains errors in its loop structure and
output formatting. The task is to find and fix those errors without
changing the loops into `for` loops.

#### 2.3.1 Java Program Code

```java
import java.util.Scanner;
public class Triangle21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int i = 0;
        while (i <= n) {
            System.out.print("[i=" + i + "] ");
            int j = 0;
            while (j <i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        sc.close();
    }
}
```

#### 2.3.2 Program Output

For `n = 5`, the first triangle should contain 5 rows:

-   Row 1 contains 1 star.
-   Row 2 contains 2 stars.
-   Row 3 contains 3 stars.
-   Row 4 contains 4 stars.
-   Row 5 contains 5 stars.

After the first triangle, the inverted triangle should contain 5 stars
in the first row, decreasing to 1 star in the last row.

// Tempatkan tangkapan layar di sini: kode Java di editor yang menampilkan program TriangleStudentNo.java yang sudah diperbaiki dengan nested WHILE loop.
// Tempatkan tangkapan layar di sini: output terminal untuk n = 5 yang menampilkan segitiga siku-siku normal (1 hingga 5 bintang).
// Tempatkan tangkapan layar di sini: output terminal untuk n = 5 yang menampilkan segitiga terbalik (5 hingga 1 bintang).

#### 2.3.3 Answers to Questions / Reflection Questions

-   **Question 1:** Identify the mismatches in the initial output, and
    at least two fixes needed to produce a nested triangle pattern.
    -   **Answer:** The initial output has an empty first row because
        `i` starts at 0. It also prints all stars on one line because
        there is no line break after each row. Two fixes are needed:
        1.  Start `i` at 1 and make the outer loop run exactly `n`
            times.
        2.  Add `System.out.println();` after the inner loop to move to
            a new line.
-   **Question 2:** Explain the roles of the variables `i` and `j`. Why
    must the value of `j` be reset to 0 in every iteration of the outer
    loop? What happens if `j` is not reset?
    -   **Answer:** The variable `i` controls the number of rows, while
        `j` controls the number of stars in each row. The value of `j`
        must be reset to 0 so that every new row starts counting its
        stars from the beginning. If it is not reset, the inner loop may
        not run again because `j` may already be greater than or equal
        to `i`.
-   **Question 3:** Explain the changes to the initialization, the
    condition, and the update of the outer loop that are needed to form
    the inverted triangle.
    -   **Answer:** The outer loop must start from `i = n`, use the
        condition `i >= 1`, and decrease `i` by 1 after each row using
        `i--`. This makes the number of stars decrease from `n` to 1.
------------------------------------------------------------------------

### 2.4 Experiment 4: Case Study of Group Project Scores

This experiment uses three levels of loops to process group project
scores. Each group receives scores from the same number of graders. The
program calculates the average score of every group and finds the group
with the highest average.

#### 2.4.1 Java Program Code

The program asks the user to enter the number of groups and graders.
Both values must be greater than 0. The outer `while` loop processes
each group, the middle `for` loop reads the scores from the graders, and
the inner `do-while` loop repeats the input if a score is outside the
valid range of 0 to 100.

The program calculates each group's average and compares it with the
highest average found so far. It then displays the group with the
highest average.

// Masukkan kode program Java Anda di sini (GroupScoreStudentNo.java)

#### 2.4.2 Program Output

The program is tested with 3 groups and 2 graders. One invalid score,
such as 105, is entered to test the validation. The program should
reject that score and ask the user to enter it again.

Example valid scores:

-   Group 1: 80 and 90, average = 85.0
-   Group 2: 75 and 85, average = 80.0
-   Group 3: 90 and 96, average = 93.0

The result is Group 3 with the highest average of 93.0.

// Tempatkan tangkapan layar di sini: kode Java di editor yang menampilkan program GroupScoreStudentNo.java dengan tiga tingkat loop.
// Tempatkan tangkapan layar di sini: input terminal yang menampilkan 3 kelompok dan 2 penilai, termasuk nilai tidak valid seperti 105 yang ditolak.
// Tempatkan tangkapan layar di sini: output terminal akhir yang menampilkan rata-rata setiap kelompok dan Kelompok 3 sebagai rata-rata tertinggi (93.0).

#### 2.4.3 Answers to Questions / Reflection Questions

-   **Question 1:** Why must `totalScore` be reset inside the outer
    loop, but `highestAverage` must not be reset for each group?
    -   **Answer:** `totalScore` must be reset to 0 for every group
        because it only stores the scores of the current group.
        `highestAverage` must keep its value so the program can compare
        the average of the current group with the highest average from
        previous groups.
-   **Question 2:** For 3 groups and 2 graders, without any invalid
    input, how many times is the body of the FOR loop executed in total?
    -   **Answer:** The body of the `for` loop is executed **6 times**.
        Each of the 3 groups has 2 graders, so 3 × 2 = 6.
-   **Question 3:** What happens if `totalScore` is declared as `int`
    and the average is calculated using integer division? Give an
    example of values.
    -   **Answer:** Integer division removes the decimal part of the
        result. For example, if the total score is 161 and there are 2
        graders, the correct average is 80.5. With integer division, the
        result becomes 80, so the average is less accurate.
-   **Question 4:** Why is `highestAverage` given the initial value `-1`
    rather than `0`? Give an example of input that produces a wrong
    result if the initial value were 0.
    -   **Answer:** The initial value `-1` ensures that the first
        group's average will be recorded, even if all scores are 0. If
        the initial value were 0 and the first group received an average
        of 0, the condition `averageScore > highestAverage` would be
        false. The program would not record that group, and `bestGroup`
        could remain 0.
-   **Question 5:** This program has three levels of loops. Name each
    type of loop and its role.
    -   **Answer:**
        1.  **Outer `while` loop:** Processes the groups one by one.
        2.  **Middle `for` loop:** Reads and adds the scores from each
            grader.
        3.  **Inner `do-while` loop:** Repeats the score input when the
            entered score is invalid.

------------------------------------------------------------------------

## 3: INDEPENDENT ASSIGNMENTS

The following assignments apply nested loops and selection structures to
solve practical problems. Each assignment must be written in a separate
Java file and pushed to the `daspro-jobsheet8` GitHub repository.

### 3.1 Assignment 1: Nested Number Pattern

The program prints a number pattern from 1 up to the current row number.
The user enters an integer `n` of at least 1. After printing the
pattern, the program displays the total number of numbers printed.

For example, when `n = 5`, the rows contain:

-   Row 1: `1`
-   Row 2: `1 2`
-   Row 3: `1 2 3`
-   Row 4: `1 2 3 4`
-   Row 5: `1 2 3 4 5`

The total number of values printed is **15**.

**Required file name:** `Task1StudentNo.java`

#### 3.1.1 Java Program Code

The program uses nested loops. The outer loop controls the rows, while
the inner loop prints numbers from 1 up to the current row number. A
counter can be used to calculate the total number of values printed.

```java
import java.util.Scanner;
public class task1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int totalDigits = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totalDigits++;
            }
            System.out.println();
        }

        System.out.println("Total numbers printed: " + totalDigits);

        sc.close();
    }
}
```

#### 3.1.2 Program Output / Screenshot

The output should show the number pattern and the final message:

`Total numbers printed: 15`


------------------------------------------------------------------------

### 3.2 Assignment 2: Multiplication Table

The program displays an `n × n` multiplication table. The user enters an
integer `n` of at least 3. Each cell contains the product of its row
number and column number. After displaying the table, the program
calculates and displays the sum of all values in the table.

For example, when `n = 4`, the table contains the products from 1 × 1 up
to 4 × 4. The total sum of all values is **100**.

**Required file name:** `Task2StudentNo.java`

#### 3.2.1 Java Program Code

The program uses nested `for` or `while` loops. The outer loop controls
the rows, and the inner loop controls the columns. Each value is
calculated by multiplying the row number by the column number. An
accumulator variable stores the sum of all values.

// Masukkan kode program Java Anda di sini (Task2StudentNo.java)

#### 3.2.2 Program Output / Screenshot

The output should show a neat 4 × 4 multiplication table and the final
message:

`Total of all numbers: 100`

// Tempatkan tangkapan layar di sini: kode Java di editor yang menampilkan Task2StudentNo.java.
// Tempatkan tangkapan layar di sini: output terminal untuk n = 4 yang menampilkan tabel perkalian 4 x 4 dan Total of all numbers: 100.

------------------------------------------------------------------------

### 3.3 Assignment 3: Sales Recap for Several Stores

The program records sales information for several stores. The user
enters the number of stores, the number of customers at each store, and
the number of items purchased by each customer.

The program must display:

1.  The total number of customers for each store.
2.  The total number of items sold by each store.
3.  The total number of items sold across all stores.
4.  The store number with the highest number of items sold.

The number of stores must be at least 1. The number of customers and the
number of items purchased may be 0, but they cannot be negative. If
multiple stores have the same highest total, the program must choose the
store with the smallest store number.

**Required file name:** `Task3StudentNo.java`

#### 3.3.1 Java Program Code

The program uses nested loops to process stores, customers, and items.
Accumulator variables calculate the number of customers and items. The
program does not need to store every input separately.

```java
import java.util.Scanner;
public class Task3_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of stores: ");
        int numStores = sc.nextInt();

        if (numStores <= 0) {
            System.out.println("Number of stores must be at least 1.");
            sc.close();
            return;
        }

        int totalItemsAllStores = 0;
        int maxItems = -1;
        int bestStore = 0;

        for (int i = 1; i <= numStores; i++) {
            System.out.println("Store " + i);
            System.out.print("Enter the number of customers: ");
            int numCustomers = sc.nextInt();

            int totalItemsStore = 0;

            for (int j = 1; j <= numCustomers; j++) {
                System.out.print("Enter items bought by customer " + j + ": ");
                int items = sc.nextInt();
                totalItemsStore += items;
            }

            System.out.println("Store " + i + " customers: " + numCustomers + ", total items: " + totalItemsStore);

            totalItemsAllStores += totalItemsStore;

            if (totalItemsStore > maxItems) {
                maxItems = totalItemsStore;
                bestStore = i;
            }
        }

        System.out.println("----------------------------------------");
        System.out.println("Total items across all stores: " + totalItemsAllStores);
        System.out.println("Store with the most items: " + bestStore);

        sc.close();
    }
}
```

#### 3.3.2 Program Output / Screenshot

Example data:

-   Store 1 has 2 customers who buy 3 and 2 items. Its total is 5 items.
-   Store 2 has 3 customers who buy 1, 4, and 2 items. Its total is 7
    items.

The expected summary is:

-   Store 1 - customers: 2, total items: 5
-   Store 2 - customers: 3, total items: 7
-   Total items across all stores: 12
-   Store with the most items: 2

// Tempatkan tangkapan layar di sini: kode Java di editor yang menampilkan Task3StudentNo.java dengan nested loop untuk toko, pelanggan, dan item.
// Tempatkan tangkapan layar di sini: input terminal yang menampilkan data contoh untuk Toko 1 dan Toko 2.
// Tempatkan tangkapan layar di sini: output terminal akhir yang menampilkan jumlah pelanggan, total item per toko, 12 total item, dan Toko 2 sebagai toko dengan jumlah item terbanyak.

------------------------------------------------------------------------

## 4: CONCLUSION

Nested loops allow a Java program to execute repeated actions inside
other repeated actions. They are useful for patterns such as rectangles,
triangles, and multiplication tables, as well as for processing grouped
data. The experiments also demonstrate nested `for`, nested `while`, and
combinations of `for`, `while`, and `do-while` loops. Loop order and
iteration variables must be controlled correctly to produce the expected
output and prevent infinite loops.
# Task 4
:mortar_board: :mortar_board: Task 4 состоит из четырёх задач. Все заготовки задач находятся внутри проекта в пакете *org.example.rs.android_stage1_task4* в папке *src/main/java*. В каждой заготовке вам дан класс с открытым методом, в который нужно написать код для решения поставленной задачи.

<img alt="structure_of_tasks" src="/images/Exercises.png" />

Тесты находятся в соответствующем пакете в папке *src/test/java*. 

<img alt="unit_tests" src="/images/UnitTests.png" />

Тесты можно запускать различными способами. Например, выполнить таск Gradle: *Gradle -> Tasks -> verification -> test*. Тогда прогонятся все unit-тесты сразу:

<img alt="launch test via Gradle" src="/images/RunTests.PNG" />

Или открыть класс с тестом и нажать на зелёный треугольник рядом с объявлением класса. Если все тесты пройдены успешно :smiley_cat:, они отмечаются зеленым значком :heavy_check_mark:, иначе :scream_cat: - красным :heavy_exclamation_mark:

:point_up: У многих после клонирования Task 4 студия не показывала значок запуска теста перед именем класса с тестом. Есть два совета:
- Используйте стабильную версию Android Studio, на данный момент 3.6.1 
- Клонируйте проект через консоль и затем открывайте в студии.

В любом случае, запуск через пункт Gradle в студии или через консоль будет работать. 

Если вы пришли к выводу, что выполнили максимум того что могли сделать, то сделайте Submit задачи через 
https://app.rs.school/
</br></br>

## Условия задач

### 1) Array Calculator

Your task is to implement the method, which calculates a product of N integers in array.

Example:

If we have an array: [1,2,3,4,5,6,7,8,9,0] and N = 3, the result of the function should be equal 504 (7 * 8 * 9).

If we have an array: [-1, 2, -3, 4, -5, 6, -7] and N = 5, the result should be equal to 1680 (2 * 4 * -5 * 6 * -7).

• Positive, negative and zero integers are calculated.

• Non-integer values (string, etc.) should not be included in calculation.

• If N is higher than number of integers in array, include all available integers.

### 2) Square Decomposer

My younger sister came back home from school with the following task: given a squared sheet of paper she has to cut it in pieces which, when assembled, give squares the sides of which form an increasing sequence of numbers. At the beginning it was lot of fun but little by little we were tired of seeing the pile of torn paper. So we decided to write a program that could help us and protects trees.

Task

Given a positive integral number n, return a strictly increasing sequence (array) of numbers, so that the sum of the squares is equal to n².

If there are multiple solutions (and there will be), return as far as possible the result with the largest possible values:

Examples

decompose 11 must return [1, 2, 4, 10]. Note that there are actually two ways to decompose 11², 11² = 121 = 1 + 4 + 16 + 100 = 1² + 2² + 4² + 10² but don't return [2, 6, 9], since 9 is smaller than 10.

For decompose 50 don't return [1, 1, 4, 9, 49] but [1, 3, 5, 8, 49] since [1, 1, 4, 9, 49] doesn't form a strictly increasing sequence.

Note

Neither [n] nor [1, 1, 1, …, 1] are valid solutions. If no valid solution exists, return *null*.

The function "decompose" will take a positive *Number* n and return the decomposition of N = n² as [x1 ... xk]

If n is negative, return *null* as well.

Examples:

decompose 50 returns [1, 3, 5, 8, 49]

decompose 4 returns *null*

### 3) Telephone Finder

Started in 2008 and recently resurging in popularity, a game known as Number Neighbour or Text Door Neighbor has people sending a text message to phone numbers near their own.

Traditionally this was done for numbers ±1, so someone with the phone number 555-555-5555 has neighbors 555-555-5554 and 555- 555-5556.

We're going to take this a step further and think about neighbors based on a classic phone keypad.

First, let's take a look at the classic phone keypad:

<img alt="phone keypad" src="/images/PhoneKeypad.png" />

We can consider certain numbers adjacent if they appear directly next to or above/below each other. For example, 1 is adjacent to 2 and 4 (and nothing else), while 5 is adjacent to 2, 4, 6, and 8.

Let's look for phone numbers that are "neighbors" of a given phone number by having any one (and only one) of their digits be off-by-one as a number adjacent to the original.

By this definition, 555-555-5555 has both its original neighbors but also, e.g., 554-555-5555 and 555-555-5558.

Problem

Given a phone number of string from integers length N (1 ≤ N ≤ 10) as a number string (e.g. 555-555-5555 would be passed as "5555555555"), return an array of all phone numbers as number strings that would be considered neighbors of that phone number.

Examples

Given "1" returns ["2", "4"]

Given "8675309" returns ["5675309", "7675309", "9675309", "0675309", "8375309", "8575309", "8975309", "8645309", "8685309", "8672309", "8674309", "8676309", "8678309", "8675209", "8675609", "8675389", "8675306", "8675308"]

Notes

Do not wrap around a side of the keypad when finding adjacent
numbers. That is, do not consider 6 adjacent to 4 nor 0 adjacent
to 2.

Do not consider numbers that are diagonal to each other adjacent. In case input number is negative return *null*.

Do not worry about the order of number strings in the array being returned.

### 4) Full Binary Trees

A full binary tree is a binary tree where each node has exactly 0 or 2 children.

Return a list of all possible full binary trees with N nodes.

Each node of each tree in the answer must have its value set to 0.

You may return the final list of trees in any order.

Example:

Input: 7

Output:

[

[0,0,0,null,null,0,0,null,null,0,0],

[0,0,0,null,null,0,0,0,0],

[0,0,0,0,0,0,0],

[0,0,0,0,0,null,null,null,null,0,0],

[0,0,0,0,0,null,null,0,0]

]


For a visual explanation on the output have a look at the following example:

<img alt="example trees" src="/images/ExampleTrees.png" />

The order of images vs output lines is from left to right, from top to bottom.

Note: trailing null nodes are omitted from the output.


</br></br>
:ok_hand:

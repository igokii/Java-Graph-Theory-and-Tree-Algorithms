# Exercise 5: Recursive vs Iterative Complexity Analysis

This project analyzes the performance difference between **iterative** and **recursive** implementations of a custom mathematical function involving `log2(n)`. It also compares the use of `Double` (floating-point) versus `BigInteger` (arbitrary-precision) to handle large numbers.

## Algorithm Details
The function computes a sequence `r_n = 1 + r_{n-1} * log2(n-1)`.

## Data Files
* **`datos/ejercicio5ItDouble.txt` & `datos/ejercicio5RecDouble.txt`**: Performance benchmarks using `Double`.
* **`datos/ejercicio5ItBigInteger.txt` & `datos/ejercicio5RecBigInteger.txt`**: Benchmarks using `BigInteger` to avoid overflow in large numbers.
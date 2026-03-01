# Exercise 3: Dynamic Programming & Optimization

This project analyzes the performance differences between naive recursion, memoized recursion, and iterative approaches for a complex recursive function defined by three parameters `(a, b, c)`.

## Logic Overview
The algorithm solves a problem based on the following rules:

1.  **Base Case:** If `a < 3`, `b < 3`, or `c < 3`, the value is calculated as:
    $$V = a + b^2 + 2c$$
2.  **Recursive Case 1 (Modulo):** If `a > b` and `a % b == 0`:
    $$V = f(a-1, b/2, c/2) + f(a-3, b/3, c/3)$$
3.  **Recursive Case 2 (Default):** Otherwise:
    $$V = f(a/3, b-3, c-3) + f(a/2, b-2, c-2)$$

## Implementations
* **`recursivo_sin_memoria`**: Naive recursive approach. Has high time complexity ($O(2^n)$) due to redundant calculations.
* **`recursivo_con_memoria`**: Top-down dynamic programming using a `HashMap` for memoization. Significantly reduces time complexity to linear relative to the number of states.
* **`iterativo`**: Bottom-up dynamic programming using three nested loops to fill the `Map` table iteratively.

## Test Data

The project includes test cases to verify the correctness of the implementations.

### Inputs (`Ejercicio3DatosEntrada.txt`)
Parameters `(a, b, c)`:
* 10, 15, 12
* 99, 66, 99
* 66, 99, 66
* 15, 23, 41
* 140, 50, 130
* 280, 100, 250

### Expected Outputs (`Ejercicio3DatosSalida.txt`)
Results:
* 463
* 70247
* 128739
* 1841
* 47250
* 386322

## How to Run
1. Ensure you have Java installed.
2. Compile and run `Ejercicio3.java`.
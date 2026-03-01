# Exercise 4: Recursive Complexity Analysis & Graph Modeling

This project implements and analyzes a recursive mathematical function that involves `log2(n)`. It focuses on comparing **iterative** versus **recursive** approaches and demonstrates the use of `Double` (floating-point) versus `BigInteger` (arbitrary-precision) to handle potential numerical overflows.

Additionally, the project models the recursion structure using **Graph Theory** to visualize call dependencies and complexity states.

## Mathematical Model
The sequence is defined as:
$$r_n = 1 + r_{n-1} \cdot \log_2(n-1)$$

## Implementations (`Ejercicio4.java`)
The project provides four approaches to calculate the sequence value for a given integer `a`:

* **`funcRecDouble`**: Recursive approach using `Double`.
* **`funcRecBig`**: Recursive approach using `BigInteger` for high precision.
* **`funcItDouble`**: Iterative approach using `Double`.
* **`funcItBig`**: Iterative approach using `BigInteger`.

## Graph Modeling (`.gv` files)
The project includes several `Graphviz` (.gv) files representing the state-space and dependency graph of the algorithm.

* **`Ejercicio4A1.gv` & `Ejercicio4A2.gv`**: Visualize specific states and transitions within the algorithm. Bold edges indicate critical paths or high-frequency calls.
* **`Ejercicio4B.gv`**: Shows dependencies between different integer inputs (`int-1` through `int-9`).
* **`Ejercicio4CA.gv` & `Ejercicio4CB.gv`**: Highlight subsets of the graph (e.g., nodes in red) to analyze specific sub-problems or bottlenecks.


## How to Run
1. Ensure you have Java installed.
2. Compile and run `Ejercicio4.java`.
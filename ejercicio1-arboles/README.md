# Exercise 1: Functional Stream Processing

This exercise demonstrates proficiency in Java **Streams API** to transform and group data based on complex functional logic.

## Logic Overview
1.  **Iterate:** Generate a sequence of `EnteroCadena` objects based on a predicate (loop until a threshold is reached).
2.  **Map:** Transform data using string concatenation and substring operations based on modulo arithmetic.
3.  **Filter:** Retain only strings shorter than a given length.
4.  **Group:** Collect results into a `Map<Integer, List<String>>` grouped by string length.

## Data Files
* **Input (`datos/Ejercicio1DatosEntrada.txt`):** Contains sets of parameters `(varA, varB, varC, varD, varE)` for testing.
* **Output (`datos/Ejercicio1DatosSalida.txt`):** The expected resulting map structure after processing.
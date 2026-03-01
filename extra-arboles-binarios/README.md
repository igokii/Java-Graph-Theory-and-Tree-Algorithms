# Exercise IA: Recursive Tree Path Optimization

This exercise implements a recursive algorithm to find the minimum-sum path from the root to a valid leaf node in a binary tree (`BinaryTree<Integer>`).

## Constraints
A path is **valid** only if the label of each node is strictly greater than its depth level $i$ (root is level 0).

## Optimization Logic
* **Minimum Sum:** Prioritizes paths with the lowest total label sum.
* **Shortest Path:** If sums are equal, selects the path with fewer nodes.
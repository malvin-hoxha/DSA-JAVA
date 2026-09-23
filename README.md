# DSA in Java

A collection of classic data structures and algorithms implemented from scratch in Java, written while studying DSA fundamentals.

## Contents

All implementations currently live in `Algorithms.java`, each as its own class:

### Searching
- **Linear Search** — `LinearSearch`
- **Binary Search** (iterative) — `BinarySearch`
- **Binary Search** (recursive) — `BinarySearchRecursive`

### Sorting
- **Bubble Sort** — `BubbleSort`
- **Selection Sort** — `SelectionSort`
- **Insertion Sort** — `InsertionSort`
- **Quick Sort** — `QuickSort`
- **Merge Sort** — `MergeSort`

### Data Structures
- **Singly Linked List** — `LinkedList` (`Node`) — insert, insert at index, delete at index
- **Stack** (array-based) — `Stack` — push, pop, peek, isEmpty
- **Circular Queue** — `CyclicQueue` — enqueue, dequeue, isFull/isEmpty
- **Binary Search Tree** — `BinaryTree` (`TreeNode`) — insert, search, in-order traversal

## Running

Everything is compiled and run from a single entry point:

```bash
javac Algorithms.java
java Algorithms
```

`Algorithms.main` demonstrates a few of the structures above (binary search, circular queue, binary tree).

## Goals

This repo is for practicing and internalizing how these algorithms and structures work under the hood, without relying on Java's built-in implementations (`Collections.sort`, `java.util.LinkedList`, etc.).

## Roadmap / Ideas

- [ ] Split classes into separate files
- [ ] Add unit tests
- [ ] Add Big-O notes per algorithm
- [ ] Add more structures (heap, hash map, graph + BFS/DFS)

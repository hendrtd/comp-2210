
# Search Trees and Binary Heaps


---

# Search Trees

### Trees

All the ideas presented in this module are based on the concept of trees—data structures that organize elements into a hierarchy. We begin by learning about the basic idea of trees, and then refine and extend those ideas into various specialized forms.

### Binary Trees

Binary trees are those trees where the number of children per node is limited to at most two. Most of the trees that we will discuss in this module are binary.

### Binary Search Trees

This lecture material presents a type of binary tree in which we impose a total order on all the nodes - a binary search tree.

#### Introduction to BSTs

#### Searching for values in BSTs

#### Adding values to BSTs

#### Removing values from BSTs

#### Balance in BSTs


### AVL Trees

For a binary search tree to offer good performance it must be balanced. These lecture materials present one type of balanced binary search tree called an AVL tree.

#### Introduction to AVL trees

#### Rebalancing in AVL trees

#### Adding values to AVL trees

#### Removing values from AVL trees

#### AVL tree summary


### Red-Black Trees

These lecture materials present an alternative approach to balancing binary search trees - Red-Black trees. Red-Black trees are the data structures used by the Java Collections Framework to provide a balanced search tree (java.util.TreeMap, java.util.TreeSet).

#### Introduction to red-black trees

#### Adding values to red-black trees - example

#### Red-black tree summary


### Multiway Search Trees

These lecture materials present a non-binary version of a balanced search tree. We call these "multiway search trees" since each node can have more than two children.


---

# Binary Heaps

Binary heaps are tree structures that are used to support efficient access to the maximum or minimum element of a collection. Rather than imposing a total order on the nodes, a binary heap imposes a partial order. 

### Introduction

These lecture materials provide an overview of binary heaps, how they are organized, and how they are implemented.

### Adding and removing values

These lecture materials discuss how to add and remove values in a binary heap.

### Application: Sorting

A clever application of binary heaps is found in sorting. Heapsort is an optimal comparison sort that uses the idea of a max heap to achieve O(log N) time complexity.

### Application: Huffman's Algorithm

Huffman's algorithm uses a min heap to generate a variable length encoding for the characters found in a text file. This is the basis of one approach to text compression.



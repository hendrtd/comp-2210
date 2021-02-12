
# Search Trees and Binary Heaps


---

# Search Trees

### Trees

All the ideas presented in this module are based on the concept of trees: data
structures that organize elements into a hierarchy. We begin by learning about
the basic idea of trees, and then refine and extend those ideas into various
specialized forms.

> [*Video: Tree overview*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=f94449c9-729b-400f-92cd-ac5b012e4630)

### Binary Trees

Binary trees are those trees where the number of children per node is limited
to at most two. Most of the trees that we will discuss in this module are
binary.

> [*Video: Binary trees*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=c4dcf304-a700-4d7d-97b6-ac5b012e4695)

### Binary Search Trees

This lecture material presents a type of binary tree in which we impose a
total order on all the nodes - a binary search tree.

> [*Video: Introduction to BSTs*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=fbec3018-814a-4867-88e1-ac5b012e4664)

> [*Video: Searching for values in BSTs*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=7489fc61-da25-4d06-be1e-ac5b012e45ef)

> [*Video: Adding values to BSTs*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=14ef7d88-31c1-44e7-9d01-ac5b012e5b6c)

> [*Video: Removing values from BSTs*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=1e9ff1a4-b081-4ba4-b54c-ac5b012e5f1e)

> [*Video: Balance in BSTs*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=d1165b0e-84c4-4db3-96c6-ac5b012e63cd)


### AVL Trees

For a binary search tree to offer good performance it must be balanced. These
lecture materials present one type of balanced binary search tree called an
AVL tree.

> [*Video: Introduction to AVL trees*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=d0764d8d-7fa3-42a0-a3e2-ac5b012e756f)

> [*Video: Rebalancing in AVL trees*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=70fde6f7-2d9d-4d84-baf8-ac5b012e77f1)

> [*Video: Adding values to AVL trees*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=17106067-1950-4793-860a-ac5b012e7e0b)

> [*Video: Removing values from AVL trees*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=12e6adc9-0170-4c25-a669-ac5b012e8048)

> [*Video: AVL tree summary*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=6f98d22b-c221-493e-aeab-ac5b012e8beb)


### Red-Black Trees

These lecture materials present an alternative approach to balancing binary
search trees - Red-Black trees. Red-Black trees are the data structures used
by the Java Collections Framework to provide a balanced search tree
(`java.util.TreeMap`, `java.util.TreeSet`).

> [*Video: Introduction to red-black trees*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=46467852-cd9b-40a6-bd69-ac5b012e915a)

> [*Video: Adding values to red-black trees*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=80d35176-c478-41b4-ab1b-ac5b012e989d)

> [*Video: Red-black tree - adding example*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=90f89781-95ce-4369-a606-ac5b012e9d52)

> [*Video: Red-black tree summary*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=ea297e06-fe7a-4e62-a636-ac5b012e9ee0)


### Multiway Search Trees

These lecture materials present a non-binary version of a balanced search
tree. We call these "multiway search trees" since each node can have more than
two children.

> [*Video: Multiway search trees*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=dc4a648b-e8e0-4efb-b690-ac5b012ea5a7)


---

# Binary Heaps

Binary heaps are tree structures that are used to support efficient access to
the maximum or minimum element of a collection. Rather than imposing a total
order on the nodes, a binary heap imposes a partial order. 

### Introduction

These lecture materials provide an overview of binary heaps, how they are
organized, and how they are implemented.

> [*Video: Binary Heap Introduction*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=9da9ee92-71e7-4fef-85e8-ac5b012eaea4)

### Adding and removing values

These lecture materials discuss how to add and remove values in a binary heap.

> [*Video: Adding and removing*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=5ed46c5d-2750-4caf-9834-ac5b012eb277)

### Application: Sorting

A clever application of binary heaps is found in sorting. Heapsort is an
optimal comparison sort that uses the idea of a max heap to achieve O(log N)
time complexity.

> [*Video: Heapsort*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=5fa3c8d5-ba88-411b-a2eb-ac5b012eb38e)

### Application: Huffman's Algorithm

Huffman's algorithm uses a min heap to generate a variable length encoding for
the characters found in a text file. This is the basis of one approach to text
compression.

> [*Video: Huffman's Algorithm*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=0c0d2e22-1e6a-4874-bb4c-ac5b012ebee9)



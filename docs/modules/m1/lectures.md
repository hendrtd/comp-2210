# Problem-Solving, Patterns, and Search

The following video sets the stage for this module by introducing problem
solving and programming in the context of a broad and ubiquitous problem:
**search**. This video introduces the idea of **solution patterns**, and applies
a pattern we will call **“linear scan”** to create the solution to a simple
search problem.

> [*Video: Problem-Solving, Patterns, and Search*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=b5a2da35-7d70-4dd1-8dbf-acbc0052c762)


---

# Correctness and Testing

This set of lecture videos introduces **correctness** as a goal for our solutions
and **testing** as a method of approaching it. Correctness verification is one of
the most important activities that occur in a software development project, and
the testing skills introduced in this set of videos are vital to becoming a
software developer.


### Correctness Overview 

This video introduces the concept of correctness in the context of computer programs
and discusses approaches to promoting correctness in the code that we write.


> [*Video: Correctness Overview*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=8d444065-8d63-4244-abda-acbc0052c724)


### Correctness and the Influence of Aesthetics

This video discusses coding style, code structure, and the idea of clean, simple
code and the influence these ideas have on correctness.


> [*Video: Perspectives and Aesthetics*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=2b72303b-29e6-4864-8e41-acbc0052c74c)


### Test Case Design

Testing is only as useful as the test cases that you design. In this video you
will learn about different perspectives on testing, as well as the basics of
purposeful test case design.


> [*Video: Test Case Design*](https://auburn.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=cd4afebc-add1-457f-a230-acbc0052c7a9)

---

# Generality

We would like to write code that is more **general** and **abstract** rather
than tied to a concrete and specific context. The advantages of this include
greater reuse, increased robustness, and often times better efficiency. This set
of videos takes you through important concepts in writing general code in Java.

### Introduction

This video introduces generalized programming and sets the stage for the
remainder of the lecture.

> []()


### Generalizing type - Object

Our first attempt at making our code more general is to use the `Object` class
as the data type.

> []()


### Generalizing type - Comparable

This video explores the advantages and disadvantages of working with the
`Comparable` interface in an attempt to make our code more general.

> []()


### Type Safety

While making our code general we don't want to lose the **type safety** that
Java can offer at compile time. This video discusses what type safety is and how
we can tell if our code is type-safe.

> []()


### Generics

The **generics** feature of Java is the best way to generalize code with respect
to the data type being used. Generics allow us to write code that is
appropriately independent of the data type being used while maintaining type
safety.

> []()


### Generalizing behavior - Comparator

In addition to data types, we may often want to generalize some aspect of our
code's behavior. The `Comparator` interface allows us to generalize the way in
which data elements are compared to each other.

> []()


### Generalizing structure - Collections

The Java Collections Framework (JCF) provides abstract containers (collections)
that we can use to store related data and process that data in a controlled way.
This is a powerful tool in generalized programming.

> []()


### Generalizing behavior - Iterator

One of the most common behaviors that we will need is the ability to
systematically examine each data element stored in a collection. The `Iterator`
interface is the standard abstraction used in Java to support his behavior.

> []()


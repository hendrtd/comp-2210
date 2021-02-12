
# Hands-On: Binary Search Trees

This activity focuses on the fundamental mechanics of adding new values to a
binary search tree. You should study the 
[instructional resources](../../instructional-resources.md) 
on binary search trees before attempting this activity.

You will need the following source code files to complete this activity.

- [`BinarySearchTree.java`](src/BinarySearchTree.java)
- [`BstClient.java`](src/BstClient.java)

**Note:** This activity utilizes [jGRASP Viewers](https://jgrasp.org/tutorials187/10_Viewers.pdf), which are available in [jGRASP](https://jgrasp.org/), [IntelliJ](https://jgrasp.org/ij_plugin.html), and [Eclipse](https://jgrasp.org/eclipse_plugin.html).


## Adding values, self-check

1. Open `BstClient.java` in jGRASP and compile it.
1. Run this program, observe the output, and make sure you understand what it is doing.
1. Set a breakpoint on the statement `bst.add(value)` in the `main` method.
1. Start the debugger and wait until execution is paused at the breakpoint.
1. Raise a viewer on the `bst` object. Use the viewer settings menu to customize the viewer as you like. For example, you may prefer to have the nodes rendered as circles, and you will most likely prefer that the root be at the top with descendants below.
1. With pen and paper, add the current `value` to a binary search tree that you draw yourself.
1. Step over the call to `add` to confirm your answer.
1. Repeat this process for each element in the `values` array.
1. Make sure you understand how to build a binary search tree from a given sequence of values.


## Adding values, iterative `add` method

1. Open `BstClient.java` in jGRASP and compile it.
1. Run this program, observe the output, and make sure you understand what it is doing.
1. Set a breakpoint on the statement `bst.add(value)` in the `main` method.
1. Start the debugger and wait until execution is paused at the breakpoint.
1. Open a new Canvas window.
1. Add viewers for `values`, `value`, and `bst` to the canvas window.
1. Step in to the call to `add`.
1. Step over (single-step) the statements of the `add` method, observing their effect in the canvas window.
1. Repeat this process for each element in the `values` array.
1. Make sure you understand how the iterative `add` method works.

## Adding values, recursive `put` method

1. Open `BstClient.java` in jGRASP and compile it.
1. Run this program, observe the output, and make sure you understand what it is doing.
1. Modify the statement `bst.add(value)` in the `main` method so that it uses the `put` method instead.
1. Set a breakpoint on this statement.
1. Start the debugger and wait until execution is paused at the breakpoint.
1. Open a new Canvas window.
1. Add viewers for `values`, `value`, and `bst` to the canvas window.
1. Step in to the call to `put`.
1. Using step-over and step-in as needed, explore the execution of both `put` methods, observing their effect in the canvas window.
1. Repeat this process for each element in the `values` array.
1. Make sure you understand how the recursive `put` method works.


## Submission

The submission page for this activity asks you to apply your understanding of
binary search trees to a problem and then submit it for a grade.

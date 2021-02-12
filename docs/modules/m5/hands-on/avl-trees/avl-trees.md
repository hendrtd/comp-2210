
# Hands-On: AVL Trees

This activity focuses on the fundamental mechanics of adding new values to an
AVL tree. You should study the 
[instructional resources](../../instructional-resources.md) 
on AVL trees implementation before attempting this activity.

You will need the following source code files to complete this activity.

- [`AvlTree.java`](src/AvlTree.java)
- [`AvlTreeClient.java`](src/AvlTreeClient.java)

**Note:** This activity utilizes [jGRASP Viewers](https://jgrasp.org/tutorials187/10_Viewers.pdf), which are available in [jGRASP](https://jgrasp.org/), [IntelliJ](https://jgrasp.org/ij_plugin.html), and [Eclipse](https://jgrasp.org/eclipse_plugin.html).


## Adding values, self-check

1. Open `AvlTreeClient.java` in jGRASP and compile it.
1. Run this program, observe the output, and make sure you understand what it is doing.
1. Set a breakpoint on the statement `avl.add(value)` in the `main` method.
1. Start the debugger and wait until execution is paused at the breakpoint.
1. Raise a viewer on the `avl` object. Use the viewer settings menu to customize the viewer as you like. For example, you may prefer to have the nodes rendered as circles, and you will most likely prefer that the root be at the top with descendants below.
1. With pen and paper, add the current `value` to an AVL tree that you draw yourself.
1. Step over the call to `add` to confirm your answer.
1. Repeat this process for each element in the `values` array.
1. Make sure you understand how to build an AVL tree from a given sequence of values.


## Adding values

1. Open `AvlTreeClient.java` in jGRASP and compile it.
1. Run this program, observe the output, and make sure you understand what it is doing.
1. Set a breakpoint on the statement `avl.add(value)` in the `main` method.
1. Start the debugger and wait until execution is paused at the breakpoint.
1. Open a new Canvas window.
1. Add viewers for `values`, `value`, and `avl` to the canvas window.
1. Step in to the call to `add`.
1. Using step-over and step-in as needed, explore the execution of the `add` and `put` methods, observing their effect in the canvas window.
1. Repeat this process for each element in the `values` array.
1. Make sure you understand how the `add` and `put` methods work, especially the rebalancing operations that happen.


## Submission

The submission page for this activity asks you to apply your understanding of
stacks and queues to a problem and then submit it for a grade.

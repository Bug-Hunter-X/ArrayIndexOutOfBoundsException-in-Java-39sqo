# ArrayIndexOutOfBoundsException in Java

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`. The `Bug.java` file contains code that attempts to access an array element beyond its valid index range. This leads to the exception being thrown.  The `BugSolution.java` file provides a corrected version that addresses this issue by checking array bounds before access.

## How to Reproduce

1. Clone this repository.
2. Compile `Bug.java` using a Java compiler (e.g., `javac Bug.java`).
3. Run the compiled class (e.g., `java Bug`).

You will see that the program throws an `ArrayIndexOutOfBoundsException`. 

## Solution

The solution involves properly checking array boundaries to avoid accessing invalid indices. This is demonstrated in the `BugSolution.java` file.
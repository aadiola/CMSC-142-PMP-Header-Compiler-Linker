# CMSC-142-PMP-Header-Compiler-Linker

This is a preliminary machine problem (PMP) that deals with the insertion of referred header files to source codes.

## About the Machine Problem

The Machine Problem solved here is the how to insert header files directly in the source code in which they referenced. A side problem is how to address redundancy in header files insertion in case some other files are referred by other header files.

The solution is straightforward in that it creates a container that stores all the previously referenced and inserted header files to avoid duplication. Recursion is also used since header files may also refer to other header files. File and text manipulation techniques are also used. 

## About CMSC 142

CMSC 142, better known as **Design and Analysis of Algorithms**, is a theory and programming course offered for Computer Science students in the [University of the Philippines Cebu](upcebu.edu.ph) during their junior year. This course primarily deals with algorithms and is encompassed by the following topics:

- Algorithm Analysis Techqniues (e.g. Time Complexity, Space Complexity)
- Sorting Algorithms and their analysis
- Tree-based and Graphs structures algorithms and their analysis
- Algorithm Design Techniques (e.g. Dynamic Programming, divide-and-conquer)

# CSCI 1302 - Lists

This document contains the description for the Lists project
assigned to the students in the Fall 2017 CSCI 1302 classes
at the University of Georgia.

**Please read the entirety of this file before
beginning your project.** 

## Due Dates

todo

## Academic Honesty

You agree to the Academic Honesty policy as outlined in the course syllabus and
course website. In accordance with this notice, I must caution you to **not** 
fork this repository on GitHub if you have an account. Doing so will more than
likely make your copy of the project publicly visible. Please follow the 
instructions contained in the Resources section below in order to do your 
development on nike.

## Updates

Updates will be posted here. You will be informed about any changes 
through **Piazza** and **eLC** so please keep a lookout for them.

## Project Description

short description todo.
In addition to the Javadoc comments in 
<a href="src/main/java/cs1302/p3/List.java">```cs1302.p3.List```</a>,
the HTML documention for the <code>List</code> interface is available 
<a href="http://cobweb.cs.uga.edu/~mec/cs1302/lists-apidocs/cs1302/p3/List.html">here</a>.

### Learning Outcomes

* outcome 1
* outcome 2

### Functional Requirements

* **```ArrayList<T>```:** Create the ```cs1302.p3.ArrayList``` generic class
  with type parameter ```T``` such that it properly implements the 
  ```cs1302.p3.List<T>``` interface with the requirements listed below.

  * The generic type parameter is not bounded.

  * The ```add(T)``` method adds an element to the end of the list. The Javadoc
    documentation for this methods should clearly indicate this behavior.

* **```SortedArrayList<T extends Comparable<T>>```:** Create the 
  ```cs1302.p3.SortedArrayList``` generic class with bounded type parameter 
  ```T``` such that it properly implements the ```cs1302.p3.List<T>``` 
  interface with the requirements listed below. 

  * The generic type parameter is bounded by ```java.util.Comparable<T>```
    in order to enable comparisons between existing and or prospective 
    elements of the list.

  * The ```add(T)``` and ```add(int, T)``` methods are implemented such that 
    elements are added to the list in sorted order, regardless of the index 
    position specified. The Javadoc documentation for these methods should 
    clearly indicate this behavior.

  * todo

### Non-Functional Requirements

* **Storage:** Each list implementation should be backed by an array of type
  ```T[]```. Since it is not possible to directly instantiate a generic array in
  Java, a utility method called ```Utility.<T>array``` in
  <a href="src/main/java/cs1302/p3/Utility.java">```Utility.java```</a>
  is provided for the creation of new generic arrays. Here is an example of how 
  to use this method:

  ```java
  T[] array = Utility.<T>array(length);
  ```

* **UML Diagram:**
* **Javadoc Documentation:**
* **In-line Documentation:**

### Grading

This project will be graded using unit tests that will not be made available
before the project deadline. It is paramount that you do not modify the
<code>List</code> interface provided by the project's skeleton code in any
way. It is also very important that you follow the package and naming
conventions for the <code>ArrayList</code> and <code>SortedArrayList</code>
classes described in this project description. Modifying the provided 
interface and or not following the naming conventions outlined in this
project description will cause the unit tests to automatically fail. 

TL;DR - Do not modify the interface; Follow naming conventions. If not, then
your project will not be graded.

## Submission Instructions

You will be submitting your project via Nike before the deadline indicated
near the top of this document. Make sure your project files
are on <code>nike.cs.uga.edu</code>. Change into the parent directory of your
project directory. If you've followed the instructions provided in this document, 
then the name of your project directory is likely <code>cs1302-lists</code>. 
While in your project's parent directory, execute the following command: 

```
$ submit cs1302-lists cs1302a
```

It is also a good idea to email a copy to yourself. To do this, simply execute 
the following command, replacing the email address with your email address:

```
$ tar zcvf cs1302-lists.tar.gz cs1302-lists
$ mutt -s "[cs1302] cs1302-lists" -a cs1302-lists.tar.gz -- your@email.com < /dev/null
```

If you have any problems submitting your project then please send a private
post to your instructor via the course Piazza as soon as possible. However, 
creating a post about something like this the day or night the project is due 
is probably not the best idea.



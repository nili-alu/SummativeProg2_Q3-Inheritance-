
In Java, it is possible to inherit attributes and methods from one class to another
 We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.

In java it is not possible to inherit multiple classes
while Interface allows multiple interfaces.

The reason behind this is to prevent ambiguity in JAVA. 
Consider a case where class B extends class A and Class C and both class A and C have the same method display(). 
Now java compiler cannot decide, which display method it should inherit. To prevent such situations, 
multiple inheritances is not allowed in java.

** interface**
In interface  a class can implement any number of interfaces. 
In this case there is no ambiguity even though both the interfaces are having same method.
Why? Because methods in an interface are always abstract by default, 
which doesn’t let them give their implementation (or method definition ) in interface itself.

================================================

*Inheritance*
This project implements the use of inheritance by using animal classification type and class, 
where Lion class inherits animal class 

*Interface*
On interface project is a program that is design the food chain web where it specify how each animals
 hunt from the biggest one to smallest one
 
 

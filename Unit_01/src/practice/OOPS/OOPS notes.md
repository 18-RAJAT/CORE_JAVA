Q #1) Explain Is Java a pure Object Oriented language?

Answer: Java is not an entirely pure object-oriented programming language. The following are the reasons:

Java supports and uses primitive data types such as int, float, double, char, etc.
Primitive data types are stored as variables or on the stack instead of the heap.
In Java, static methods can access static variables without using an object, contrary to object-oriented concepts.

****************************************************

Q #2) Describe class and object in Java?

Answer: Class and object

Class is a prototype or a template that has state and behavior supported by an object and used in the creation of objects.
The object is an instance of the class, for example, Human is a class with the state as having a vertebral system, brain, color, and height and has behavior such as canThink(), ableToSpeak(), etc.

****************************************************

Q #3) How polymorphism works in Java, explain with real-life examples?

Answer: Polymorphism is an ability to have multiple forms or capability of the method to do different things. In real life, the same person performing different duties behaves differently. In-Office he is an employee, at home, he is a father, during or in after school tuitions he is a student, on weekends he plays cricket and is a player in the playground.

In Java, there are two types of polymorphism

Compile-time polymorphism: This is achieved by method overloading or operator overloading.
Runtime polymorphism: This is achieved by method overriding.

****************************************************

Q #4) How many types of inheritance are present?

USE of inheritance is ---- provide us code reusability

Answer: Various types of inheritance are listed below:

Single Inheritance: Single child class inherits characteristics of the single-parent class.
Multiple Inheritance: One class inherits features of more than one base class and is not supported in Java, but the class can implement more than one interface.
Multilevel Inheritance: A class can inherit from a derived class making it a base class for a new class, for example, a Child inherits behavior from his father, and the father has inherited characteristics from his father.
Hierarchical Inheritance: One class is inherited by multiple subclasses.
Hybrid Inheritance: This is a combination of single and multiple inheritances.

****************************************************

Q #5) What is the interface in Java?

An interface in Java is a blueprint of a class. It has static constants and abstract methods.

****************************************************

Q #6) What is abstraction in Java with example?

Abstraction is a process of hiding the implementation details and showing only functionality to the user.

****************************************************

Q #6) Extends in java?

The extends keyword in Java indicates that the child class inherits or acquires all the properties of the parent class.

Syntax:
class Child extends class Parent
****************************************************

Q #7) Implements in java?

The implements keyword is used to implement an interface

Syntax:
class Hybrid implements Rose
****************************************************

Q #8) What are different access modifiers in Java?

Access modifiers in Java controls access scope of class, constructor, variable, method, or data member. 

Default access modifier is ----- without any access specifier data members, class and methods, and are accessible within the same package.

Private access modifiers are ----- marked with the keyword private, and are accessible only within class, and not even accessible by class from the same package.

Protected access modifiers ----- can be accessible within the same package or subclasses from different packages.

Public access modifiers are ----- accessible from everywhere.

****************************************************

Q #9) Explain the difference between abstract class and method?

Abstract Class -> 

1.Object cannot be created from the abstract class.

2.Abstract class can contain abstract methods or non abstract methods.


Abstract Method ->

1.Abstract method has a signature but does not have a body.

2.Class containing abstract method should be made abstract class.

****************************************************

Q #10) What are the differences between method and constructor?

*Constructors

1.Constructors name should match with that of Class.
2.Constructor does not have return type.
3.Constructor cannot be inherited by the subclass.

*Methods

1.Methods should not have same name as Class name.

2.Methods can be inherited by a sub class.

3.Method has a return type.

****************************************************

Q #11) What is a constructor in Java?

Constructor is a method without a return type and has its name the same as the class name. When we create an object, a default constructor allocates memory for an object during the compilation of Java code.

****************************************************

Q #11) Why new keyword is used in Java?

When we create an instance of class, i.e. objects, we use the Java keyword new. It allocates memory in the heap area where JVM reserve space for an object. Internally, it invokes the default constructor as well.

Syntax:

Class_name obj = new Class_name();

****************************************************

Q #12) When do you use the super keyword?

Super is a Java keyword used to identify or refer parent (base) class.

1.Super can be used to make an explicit call to no-arg and parameterized constructors of the parent class.

2.Parent class method access can be done using super, when child class has method overridden.

****************************************************

Q #13) When do you use this keyword?

this keyword in Java refers to the current object in the constructor or in the method.

****************************************************

Q #14) What is the difference between Runtime and compile-time polymorphism?

1.complie_time -> Call is resolved by a compiler in compile-time polymorphism.

2. Runtime -> Call is not resolved by the compiler in runtime polymorphism.

****************************************************

Q #15) What is method overloading?

When two or more methods with the same name have either a different number of parameters or different types of parameters.

****************************************************

Q #16) What is method overriding?

When a method of sub class (derived, child class) has the same name, parameters (signature), and same return type as the method in its super class (base, parent class) then the method in the subclass is said to be overridden the method in the superclass. This feature is also known as runtime polymorphism.

****************************************************

Q #17) Explain constructor overloading.

Overloaded constructors have the same name (name of the class) but the different number of arguments. 

****************************************************

Q #18) Differentiate between static and dynamic binding?

*Static Binding-

1.Static binding gets resolved at compile time.
2.Method Overloading is an example of static binding.

*Dynamic Binding-

1.Dynamic binding gets resolved at run time.
2. Method overriding is an example of dynamic binding.

****************************************************



Q #19) Can you explain base class, subclass, and superclass?

Base class or parent class is a super class and is a class from which sub class or child class is derived.

Sub class is a class that inherits attributes (properties) and methods (behavior) from the base class.
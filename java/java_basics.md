# Day 1: Hour 1 - Introduction to Java & Setup

Welcome to Java programming! Don't worry if you feel a bit nervous, everyone starts somewhere. We'll take it step-by-step.

**What is Java?**

Imagine you want to give instructions to a computer to do something.  Java is like a language you can use to write those instructions.  It's very popular because it can be used to build all sorts of things, from websites and phone apps to big business systems!

**Why are we using Java?**

* It's powerful and versatile.
* Lots of companies use it, so it's a good skill to learn.
* It works on different computers (Windows, Mac, etc.).

**Let's get set up!**

1. **Install Java (JDK - Java Development Kit):**
   - You need to install the JDK to write and run Java programs.
   - **[Provide a link to a JDK download tutorial for her operating system - e.g., for Windows, for Mac]**
   - Follow the tutorial carefully to download and install the JDK.

2. **Install IntelliJ IDEA Community Edition (Programming Tool):**
   - IntelliJ IDEA is a helpful tool that makes writing Java code easier. It's like a smart text editor for programmers.
   - **[Provide a link to IntelliJ IDEA Community Edition download:  [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)  - choose Community Edition]**
   - Download and install IntelliJ IDEA Community Edition. It's free to use!

3. **Your First Java Program - "Hello World!"**
   - Open IntelliJ IDEA.
   - Create a new project: `File` -> `New` -> `Project...`
   - On the left, choose `Java`. Make sure the Project SDK is set to the Java version you installed.
   - Click `Next`.
   - Choose `Create project from template` and select `Command Line App`. Click `Next`.
   - Project name:  `HelloWorld` (or anything you like)
   - Project location: Choose a folder where you want to save your project.
   - Click `Finish`.

4. **Write the Code:**
   - In the Project window (usually on the left), go to: `src` -> `main` -> `java` -> `com.example.helloworld` -> `Main.java` (or something similar, depending on your project name).
   - You should see some code already there. Replace the existing code inside the `main` method with this:

   ```java
   public class Main {
       public static void main(String[] args) {
           System.out.println("Hello World!"); // This line will print "Hello World!"
       }
   }

# Day 1: Hour 2 - Java Fundamentals: Variables, Data Types, Operators
Now let's learn some basic building blocks of Java:

**Variables** -  Containers for Information

Imagine variables as boxes where you can store information. Each box has a name and can hold a specific type of information.

Declaration: You need to tell Java the name of the variable and what type of information it will hold.



```java
int age;       // Declare a variable named 'age' that will hold integer numbers
String name;    // Declare a variable named 'name' that will hold text (String)
boolean isAdult; // Declare a variable named 'isAdult' that will hold true or false values (boolean)
double price;   // Declare a variable named 'price' that will hold numbers with decimal points (double)
```

*Initialization of variables*

```java
age = 16;
name = "Alice";
isAdult = false;
price = 99.99;
```
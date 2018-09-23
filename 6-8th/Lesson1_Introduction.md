# INTRODUCTION TO COMPUTER SCIENCE

# OBJECTIVE

1. Why Learn Java?
2. Java Basics
3. Our First Program
4. Syntax Errors
5. [Vocabulary](https://github.com/ECS-CS/2018-2019/blob/master/6-8th/Vocabulary.md)

# WHY LEARN JAVA?

## Relatively Simple to Use

Java is a high level language, which means Java abstracts away (i.e. handles for you) most of the complex details of the machine (computer) such as memory management, etc. Thus, you can focus on programming instead of worrying about the little details many consider both tedious and difficult.

## Easier to Maintain

Java is a statically-typed language, which means your code will have to be checked for errors before it can be built into an app. This means errors will be easier to track down.

## Fast

As a statically typed language, Java is faster than dynamically typed languages because things are more clearly defined. Thus, when the app is running, your machine's resources will not be wasted on checking the definition of something in your code.

## Optimized Performance

Modern Java programs are now even more performant thanks to mature JIT (just in time) compilers and improved JVMs, as performance can be optimized in real time to help a Java program run faster. This is very helpful as your app grows larger or needs to handle more processes.

## Community

Community size is important because the larger a programming language community is, the more support you'd be likely to get. As you step into the programming world, you'll soon understand how vital support is, as the developer community is all about giving and receiving help.

# SYNTAX

1. **What is syntax?** If you look up the word syntax in a dictionary, you learn that it’s a set of rules on how to put words and phrases together in order to form good sentences. In other words, syntax means grammar.
2. **How does this relate to programming?** In a programing context, syntax refers to the spelling and grammar of a programming language. Computers are inflexible machines that understand what you type only if you type it in the exact form that the computer expects. The expected form is called the syntax.
3. **You’ll see this word a lot. It’s important to follow the syntax (how the code is written) exactly or your browser will not display your page properly.**

# JAVA BASICS

1. Java program files must begin with a capital letter
2. Must have a **.java** extension in order to compile the program
3. **Classes** in java have to begin with a capital letter
4. The compiler looks for a method called **main**, therefore every class must have a main method.

# OUR FIRST JAVA PROGRAM

1. Printing the phrase Hello World to the terminal
2. The **terminal** is represented as **System.out**
3. To compile our program we do **javac HelloWorld.java**
4. If no message is returned means the program compiled successfully.
5. Now we can run our program by running **java HelloWorld**
6. Now you should see **Hello, world!**

```java
public class HelloWorld
{
  public static void main(String[] args){
    System.out.println("Hello, world!");
  }
}
```

# SYNTAX ERRORS

1. Remove **semicolon** after `System.out.println("Hello, world!");`
2. Misspell println `System.out.println("Hello, world!")`
3. Getting used to these errors helps you **debug** faster in the future
4. With **experience** you'll be faster at finding and fixing errors
5. **Sometimes** the error messages are VERY helpful and descriptive and tell you exactly where the errors are, but sometimes the messages aren't helpeful and you have to investigate to fix them.
6. Notice the **compiler** finds all errors before we run our programs.

# HOMEWORK

1. Modify the HelloWorld.java program below to print "Hello" and "World" on 2 seperate lines.
2. Right now this program is printing `Hello, world!` on the same line.

```java
public class HelloWorld
{
  public static void main(String[] args){
    System.out.println("Hello, world!");
  }
}
```

# HOMEWORK SUBMISSION
## [How do I submit my assignment?](https://github.com/ECS-CS/2018-2019/blob/master/6-8th/HomeworkSubmission.md)

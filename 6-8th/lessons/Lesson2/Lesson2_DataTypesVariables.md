# INTRODUCTION TO COMPUTER SCIENCE

# DATATYPES AND VARIABLES

# OBJECTIVE

1. What are datatypes?
2. What are variables?
3. How do we name variables?
4. How do we declare variables?
5. How do we assign values to variables?
6. [Vocabulary](https://github.com/ECS-CS/2018-2019/blob/master/6-8th/Vocabulary.md)

# WHAT ARE DATATYPES?

1. Data types describes what type of data can be stored in an identifer or expression.
2. An **identifer** is a **variable**.
3. Data types define which types of operations can be performed on an identifer.

### EXAMPLE:

1. An example of a legal numeric expression is `12+2`.
2. An example of an illegal numeric expression is `12 + "Mr. Bostwick"`.

# DATATYPES

# NUMERIC DATATYPES

## INTEGRAL DATATYPES

1. **Examples:** 1000, etc.. **What are integers?**
   - **int** for Integer: stores numbers between -2147483648 to 2147483647
   - **long** for Long Integer: stores numbers between -9223372036854775808 to 9223372036854775808

## FLOATING POINT DATATYPES

2. **Examples:** numbers with fractional parts, such as `3.14159`, etc..
   - **float:** 127 digits after decimal
   - **double:** 1023 digits after decimal
     - The standard in JAVA is to use the `double` datatype instead of the `float` datatype.

# NONNUMERIC DATATYPES

1. **Strings:**
   - 0 or more characters surrounded by double quotes.
   - Any characters surrounded by quotes becomes a string.
   - if you put numbers inside double quotes, they become a `string`.
2. **Booleans:**
   - Either a `true` or `false` value.
   - Used in comparisons

# VARIABLES

# WHAT ARE VARIABLES?

1. Variables are used to store data in JAVA.
2. A variable always has a `type`, when we create variables we always associate them with a type to tell the compiler what type of data is stored in that variable.
3. Data stored in a variable is called its `value`.

# HOW DO WE NAME VARIABLES?

1. Variable names `must` start with a letter.
2. After the **initial letter** the variable name may contain letters, numbers, and the underscore character. (no symbols)
3. Variable names can't have a space
4. We use camelCase to name variables with more than one name.
5. Variable names should be short and meaningful.
6. Variables should begin with lowercase letters. (becase in JAVA class names begin with capital letters)

# HOW DO WE DECLARE VARIABLES?

We learned last week while creating our `HelloWorld` program that our programs have this basic structure. Modifying what we did last week, leads us here:

1. To declare a variable in JAVA, you provide the `datatype`, `name` and lastly end the statement with a `semicolon`.
2. If you want to declare multiple variables of the same type on one line, provide the `datatype` once, followed by each variable name seperated by commas.

```java
public class Variables
{
    public static void main(String[] args)
    {
        // 1. Declaring variables
        int age;
        double pi;
        String firstName;
        boolean flag;

        // 2. Declaring multiple variables of the same type on one line
        int day, year;
    }
}
```

# HOW DO WE ASSIGN VALUES TO VARIABLES?

1. Two ways
   1. Assign the value in the declaration (when you declare the variable)
   2. Using an assignment statement
2. Assignment Operator `=`
   1. The `variableName` on the left is assigned to the `expression` or `literal` on the right.

```java
public class Variables
{
    public static void main(String[] args)
    {
        // 1. Assign the value when you declare the variable
        int age = 10;
        int number = 100;

        // 2. Using an Assignment Statement

        // declare the variable
        int yearBorn;
        // use the assignment operator to assign a value to the variable
        yearBorn = 1990;
    }
}
```

# HOMEWORK

1. Declare a `String` named `firstName`.
2. Declare a `String` named `lastName`.
3. Declare an `int` named `age` and assign your age.
4. Declare an `int` named `yearBorn` and assign the year you were born.
5. Declare a `String` named `subject` and assign your favorite subject.
6. Declare a `String` named `color` and assign your favorite color.
7. Using the variable you created in Step 1, assign your first name to `firstName`.
8. Using the variable you created in Step 2, assign your last name to `lastName`.

```java
public class Homework2
{
    public static void main(String[] args)
    {
        // START


        // OUR STORY
        System.out.println("Hello, my name is " + firstName + " " + lastName + ". I am " + age + " years old. " + "I was born in " + yearBorn + ". My favorite subject is " + subject + ", and my favorite color is " + color + ".");
        // END
    }
}
```

# HOMEWORK SUBMISSION

## [How do I submit my homework assignment?](https://github.com/ECS-CS/2018-2019/blob/master/6-8th/HomeworkSubmission.md)

# INTRODUCTION TO COMPUTER SCIENCE

# METHODS

# OBJECTIVE
1. What are methods?
2. How do I define a method?
3. How do I use methods?
4. How do I pass a data to a method?
5. Parameters vs. Arguments
6. [Vocabulary](https://github.com/ECS-CS/2018-2019/blob/master/6-8th/Vocabulary.md)

# WHAT ARE METHODS?
1. A `method` is similar to a `function` in other programing languages.
2. A `method` is a set of programming instructions that performs a named operation, such as squaring a number to much more complex computations. 
3. A `method` takes data as input and returns data as output. The input data is transformed in some way then outputted by the method at the end of the methods operations. 

# HOW DO I DEFINE A METHOD?
1. Methods have to be defined **OUTSIDE** (either before or after) of `public static void main(String[] args){}`.
### EXAMPLE: 
```java
public class Example
{
  // BEFORE MAIN
  public static void main(String[] args)
  {

  }
  // OR AFTER MAIN
}
```
2. We start our method definition with the word `static`.
3. Following `static` we put the `return type` of the method. The return type of the data that will be returned by the method. **For example**, if your method adds numbers, you will have a return type of `int` for Integer.
4. After the `return type` we put the name of the method.
5. Then we provide data that we want the method to transform. This data is called our `parameters`.
6. The `parameters` have to be defined by its `datatype` and a `name`.
7. Lastly, after we define our `parameters` we are ready to begin the body or `definition` of the method. Whatever the method needs to do goes in the body. (Inside of the `{}`).
8. Methods return data (not all methods have to). To return data, inside of a method we use the `return` keyword.
### EXAMPLE: 
```java
public class Example
{

  public static void main(String[] args)
  {

  }

  static int square(int number)
  {
    // METHOD DEFINITION
    return number * number;
  }
}
```

# HOW DO I USE METHODS?

1. The `method` we created above will take in a number and output the square of that number.
2. One way to prove/test that our `method` works is to output the result from our method. Two weeks ago we learned to use `System.out.println()` to output information to our computer.

### EXAMPLE BELOW: 
3.  Inside the `main` method, I will declare a variable named `num` with a datatype of `int` and assign a value of `10`.
4. To use the method, we `call` the method, by using its `name`, lastly the data we want the `method` to work with. This data is called an `argument`.
5. Using `System.out.println()` I will output the data the `square` method returns.
```java
public class Example
{

  public static void main(String[] args)
  {
    int num = 10;
    System.out.println(num + " squared equals " + square(num));
  }

  // THE METHOD WE CREATED
  static int square(int number)
  {
    // METHOD DEFINITION
    return number * number;
  }
}
```

# HOW DO I PASS DATA TO A METHOD?

1. Wherever you `call` your `method`, you pass `data` known as `arguments` into the `method`.
2. For Example, we created a `method` named `square`. When we `called` the `square` method, we used its name like this: `square()`.
3. Inside the parenthesis `square(......)` we pass in our `arguments`, seperated by commas if there is more than one piece of data.

### EXAMPLE:
```java
int num = 10;
square(num);
```

# PARAMETERS VS. ARGUMENTS

1. In the method `call`, the data is known as an `argument`.
2. In the method `definition`, the data is known as a `parameter`.
3. `Parameters` and `Arguments` have to match in the `datatype` and the `number` (amount of them).

# HOMEWORK
1. Create a method that greets someone.
    1. Define a `method` named `hello`.
    2. This method, will return a `String`, set the return type of the method to `String`.
    3. Give the method a parameter named `firstName` with a datatype of `String`.
    4. Inside the body of the function `return "Hey, " + firstName + " how are you? I hope you are doing well."`.
2. Create a method that subtracts two numbers.
3. Create a method that adds two numbers.

# HOMEWORK SUBMISSION
## [How do I submit my homework assignment?](https://github.com/ECS-CS/2018-2019/blob/master/6-8th/HomeworkSubmission.md)
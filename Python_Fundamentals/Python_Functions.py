""" Python Functions
    Python Functions are a block of statements that does a specific task. The idea is to put some commonly or repeatedly done task 
    together and make a function so that instead of writing the same code again and again for different inputs, we can do the 
    function calls to reuse code contained in it over and over again. """

# Defining a Function
    # We can define a function in Python, using the def keyword. A function might take input in the form of parameters. 
def fun():
    print("Welcome to GFG")
fun() # Calling a Function

# Function Arguments
    # Arguments are the values passed inside the parenthesis of the function. 
    # A function can have any number of arguments separated by a comma.
def evenOdd(x):
    if (x % 2 == 0):
        return "Even"
    else:
        return "Odd"
print(evenOdd(16))
print(evenOdd(7))
# OUTPUT:
    # Even
    # Odd

"""Typess of Function Arguments
    Python supports various types of arguments that can be passed at the time of the function call. 
    In Python, we have the following function argument types in Python, Let's explore them one by one."""

# 1. Default Arguments
def myFun(x, y = 50):
    print("x: ", x)
    print("y: ", y)
myFun(10)
# OUTPUT:
    # x: 10
    # y: 50

# 2. Keyword Arguments
def student(fname, lname):
    print(fname, lname)
student(fname='Geeks', lname='Practice')
student(lname='Practice', fname='Geeks')
# OUTPUT:
    # Geeks Practice
    # Geeks Practice

# 3. Positional Arguments
def nameAge(name, age):
    print("Hi, I am", name)
    print("My age is ", age)

print ("Case-1:")
nameAge("Olivia", 27)

print("\nCase-2:")
nameAge(27, "Olivia")

# 4. Arbitrary Arguments
def myFun(*args, **kwargs):
    print("Non-Keyword Arguments (*args):")
    for arg in args:
        print(arg)

    print("\nKeyword Arguments (**kwargs):")
    for key, value in kwargs.items():
        print(f"{key} == {value}")

myFun('Hey', 'Welcome', first='Geeks', mid='for', last='Geeks')

# Function within Functions
    # A function defined inside another function is called an inner function (or nested function). 
    # It can access variables from the enclosing function’s scope and is often used to keep logic protected and organized.
def f1():
    s = 'I love Python!'
    def f2():
        print(s)
    f2()
f1()

# Anonymous Functions
    # In Python, an anonymous function means that a function is without a name. As we already know the def keyword is 
    # used to define the normal functions and the lambda keyword is used to create anonymous functions.
def c1(x): return x*x*x
c2 = lambda x : x*x*x

print(c1(7)) # 343
print(c2(7)) # 343

# Return Statement in Function
    # The return statement ends a function and sends a value back to the caller. It can return any data type, 
    # multiple values (packed into a tuple), or None if no value is given.
def sq_value(num):
    """This function returns the square value of the entered number."""
print(sq_value(2)) # 4
print(sq_value(-4)) # 16

# Pass by Reference and Pass by Value
    # In Python, variables are references to objects. When we pass them to a function, the behavior depends on 
    # whether the object is mutable (like lists, dictionaries) or immutable (like integers, strings, tuples).
def myFun(x):
    x[0] = 20
lst = [10, 11, 12, 13]
myFun(lst)
print(lst)

def myFun2(x):
    x = 20

a = 10
myFun2(a) # [20, 11, 12, 13]
print(a) # 10

# Recursive Functions
    # A recursive function is a function that calls itself to solve a problem. It is commonly used in 
    # mathematical and divide-and-conquer problems. Always include a base case to avoid infinite recursion. 
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)
print (factorial(4)) # 24




    
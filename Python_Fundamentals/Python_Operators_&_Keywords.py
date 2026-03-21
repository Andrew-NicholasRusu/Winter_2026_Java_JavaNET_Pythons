""" Python Operators
    # In Python programming, Operators in general are used to perform operations on values and variable.
    # Operators: Special symbols like -, + , * , /, etc.
    # Operands: Value on which the operator is applied."""

## Arithmetic Operators

# Variables 
a = 15
b = 4

# Addition
print("Addition: ", a + b)

# Subtraction 
print("Subtraction: ", a - b)

# Multiplication
print("Multiplication: ", a * b)

# Division
print("Division: ", a / b)

# Floor Division
print ("Floor Division: ", a % b)

# Exponentitation
print("Exponentiation: ", a ** b)
print() # space

## Comparison Operators
    # In Python, Comparison (or Relational) operators compares values. It either returns True or False according to the condition.

a = 13
b = 33

print(a > b)
print(a < b)
print(a == b)
print(a != b)
print(a >= b)
print(a <= b)
print() # space

# Logical Operators
    # Python Logical operators perform Logical AND, Logical OR and Logical NOT operations.
    # It is used to combine conditional statements

a = True
b = False
print (a and b) # False
print (a or b) # True
print (not a) # False

# Bitwise Operators
    # Python Bitwise operators act on bits and perform bit-by-bit operations. These
    # are used to operator on binary numbers

a = 10
b = 4

print(a & b) # 0
print(a | b) # 14
print(~a) # - 11
print(a ^ b) # 14
print(a >> 2) # 2
print(a << 2) # 40

# Assignment Operators

a = 10
b = a
print(b) # 10   
b += a
print(b) # 20
b -= a
print(b) # 10
b *= a
print(b) # 100
b <<= a
print(b) # 102400

# Membership Operators
    # In Python, in and not in are the membership operators that are used to test whether a value or variable is in a sequence.

x = 24
y = 20
list = [10, 20, 30, 40, 50]

if (x not in list):
    print ("x is NOT present in given list")
else:
    print("x is present in given list")

if (y in list):
    print("y is present in given list")
else:
    print ("y is NOT present in given list")

# Ternary Operator
    # In Python, Ternary operators also known as conditional expressions are operators that evaluate something based on a condition being true or false. 
    # It was added to Python in version 2.5. 
a, b = 10, 20
min = a if a < b else b
print (min) # 10

## Operator Precedence
    # This is used in an expression with more than one operator with different precedence to determine which operation to perform first.
expr = 10 + 20 * 30
print(expr)
name = "Alex"
age = 0

if name == "Alex" or name == "John" and age >= 2:
    print("Hello! Welcome.")
else:
    print("Good Bye!!")
    # OUTPUT:
        # 610
        # Hello! Welcome

# Operator Associativity
    # If an expression contains two or more operators with the same precedence then Operator Associativity is used to determine. 
    # It can either be Left to Right or from Right to Left.
print(100 / 10 * 10) # 100.0
print(5 - 2 + 3) # 6
print(5 - (2 + 3)) # 0
print(2 ** 3 ** 2) # 512

"""Python Keywords
    Keywords in Python are special reserved words that are part of the language itself. They define the rules and structure of Python 
    programs which means you cannot use them as names for your variables, functions, classes or any other identifiers."""

# Getting List of all Python keywords
import keyword
print("The list of keywords are :")
print (keyword.kwlist)



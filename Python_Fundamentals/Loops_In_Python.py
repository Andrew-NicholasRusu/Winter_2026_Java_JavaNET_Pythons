"""Loops in Python
    Loops in Python are used to repeat actions efficiently. The main types are For loops (counting through items) 
    and While loops (based on conditions)."""


# Nested Loop
    # Python programming language allows to use one loop inside another loop which is called nested loop. 
    # Following example illustrates the concept:
from __future__ import print_function
for i in range(1, 5):
    for j in range(i):
        print(i, end=' ')
    print()
print()

# For Loop 
    # For loops is used to iterate over a sequence such as a list, tuple, string or range. 
    # It allows to execute a block of code repeatedly, once for each item in the sequence. 
n = 4
for i in range(0, n):
    print(i)
# OUTPUT:
    # 0 
    # 1
    # 2
    # 3
print()
# Another example of For Loop
li = ["Nerds", "love", "programming."]
for x in li:
    print(x)

tup = ("Nerds", "love", "programming.")
for x in tup:
    print(x)

s = "abc"
for x in s:
    print(x)

d = dict({'x':123, 'y':354})
for x in d:
    print("%s %d" % (x, d[x]))

set1 = {10, 30, 20}
for x in set1:
    print(x),
# OUTPUT:
    # Nerds
    # love
    # programming.
    # Nerds
    # love
    # programming.
    # a
    # b
    # c
    # x 123
    # y 354
    # 10
    # 20
    # 30
print()

# Iterating by Index of Sequences
    # We can also use the index of elements in the sequence to iterate.
li = ["Nerds", "Adore", "Python!"]
for index in range(len(li)):
    print(li[index])
# OUTPUT:
    # Nerds
    # Adore
    # Python!
print()

# While Loop
    # In Python, a while loop is used to execute a block of statements repeatedly until a given condition is 
    # satisfied. When the condition becomes false, the line immediately after the loop in the program is executed. 
cnt = 0
while (cnt < 3):
    cnt = cnt + 1
    print("Hello User.")
# OUTPUT:
    # Hello User.
    # Hello User.
    # Hello User.
print()

"""Loop Control Statements
    Loop control statements change execution from their normal sequence. When execution leaves a scope, 
    all automatic objects that were created in that scope are destroyed. Python supports the following control statements."""

# Continue Statement
    # The continue statement in Python returns the control to the beginning of the loop.
for letter in "ilovetoprogramusingpython":
    if letter == 'o' or letter == 's':
        continue
    print('Current Letter :', letter)
# OUTPUT:
    # Current Letter : i
    # Current Letter : l
    # Current Letter : v
    # Current Letter : e
    # Current Letter : t
    # Current Letter : p
    # Current Letter : r
    # Current Letter : g
    # Current Letter : r
    # Current Letter : a
    # Current Letter : m
    # Current Letter : u
    # Current Letter : i
    # Current Letter : n
    # Current Letter : g
    # Current Letter : p
    # Current Letter : y
    # Current Letter : t
    # Current Letter : h
    # Current Letter : n
print()

# Break Statement
    # The break statement in Python brings control out of the loop.
for letter in 'givememorepythoncodes':
    if letter =='e' or letter == 's':
        break
print ('Current Letter :', letter) # OUTPUT: Current Letter : e
print()

# Pass Statement
    # We use pass statement in Python to write empty loops. 
    # Pass is also used for empty control statements, functions and classes.
for letter in 'pythonpythonpython':
    pass
print('Last Letter :', letter) # OUTPUT: Last Letter: n
    

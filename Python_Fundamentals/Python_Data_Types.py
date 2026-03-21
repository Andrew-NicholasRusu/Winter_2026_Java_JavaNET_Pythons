"""Python Data Types:
    Data types in Python are a way to classify data items. They represent the kind of value, which determines what operations can be 
    performed on that data. Since everything is an object in Python programming, Python data types are classes and variables are
    instances (objects) of these classes. """

# Numeric Data Types
    # Python numbers represent data that has a numeric value. A numeric value can be an integer, a floating number or even a complex number. 
    # These values are defined as int, float and complex classes. 

a = 5 
print (type(a)) # <class 'int'>
b = 5.0
print (type(b)) # <class 'float'>
c = 2 + 4j
print (type(c)) # <class 'complex'>

print()
# Sequence Data Types
    # A sequence is an ordered collection of items, which can be of similar or different data types. 
    # Sequences allow storing of multiple values in an organized and efficient fashion. There are several sequence data types of Python: 
# 1. String Data Type
s = 'Welcome to the World of Python!'
print (s)

# check data type
print(type(s))

# access string with index
print(s[1])
print(s[2])
print(s[-1]) # -1 refers to the last character, -2 is second last, and so on

print()
# 2. List Data Type
a = [] # Empty list
a = [1, 2, 3] # List with int values
print(a)

b = ["I", "Love", "Python!", 4, 5] # List with mixed values (int and String)
print (b) # ["I", "Love", "Python!", 4, 5] 

print()
# 3. Access List Items
a = ["Python", "Is", "An", "Easy", "Program!"]
print("Accessing element from the list.")
print(a[0])
print(a[2])
print(a[4])

print("Accessing element using negative indexing:")
print(a[-1])
print(a[-3])
print(a[-4])

print()
# 4. Tuple Data Type
tup1 = () # initiate empty tuple
tup2 = ('Geeks', 'For')
print("\nTuple with the use of String", tup2) # Tuple with the use of String:  ('Geeks', 'For')
print()

# 5. Access Tuple Items
tup1 = (1, 2, 3, 4, 5)

# access tuple items
print(tup1[0])
print(tup1[-1])
print(tup1[-3])

"""Boolean Data Type:
    Python Boolean Data type is one of the two built-in values, True or False. Boolean objects that are equal to True are truthy (true) 
    and those equal to False are falsy (false). However non-Boolean objects can be evaluated in a Boolean context as well and 
    determined to be true or false. It is denoted by class bool. """

print(type(True))
print(type(False))
# print(type(true)) 
# NameError: name 'true is not defined. Did you mean: 'True'?

# Truthy and Falsy Values
    # In Python, truthy and falsy values are values that evaluate to True or False in a Boolean context. 
    # Truthy values behave like True, while falsy values behave like False when used in conditions.
if 1:
    print ("1 is truthy")
if not 0:
    print("0 is falsy")

print()
"""Set Data Type:
    In Python Data Types, Set is an unordered collection of data types that is iterable, mutable, and has no duplicate elements. 
    The order of elements in a set is undefined though it may consist of various elements."""

# Creating a Set in Python
s1 = set() # initializing empty set
s1 = set ("This is a Python program.")
print("Set with the use of String: ", s1)
s2 = set(["This", "is", "a", "Python", "program."])
print("Set with the use of List: ", s2)

print()
#Access Set Items
    # Set items cannot be accessed by referring to an index, since sets are unordered the items have no index. But we can loop through 
    # the set items using a for loop, or ask if a specified value is present in a set, by using the keyword in.
set1 = set(["I", "love", "and", "really", "love", "my", "computer!"]) # Duplicates are removed automatically
print(set1)

# loop through set 
for i in set1:
    print(i, end = " ") # prints elements one by one

# check if item exist in set
print("Geeks" in set1)
print()

"""Dictionary Data Type
    A dictionary in Python is a collection of data values, used to store information like a map. Unlike other Python data types, 
    a dictionary holds key-value pairs, where each key maps to a value, allowing efficient access and retrieval of data. 
    Each key-value pair in a dictionary is separated by a colon (:), and multiple pairs are separated by commas."""

# Creating a Dictionary in Python

d = {} # initialize empty dictionary
d = {1: 'Nerds', 2: 'Are', 3: 'Smart'}
print(d)

# Creating dictionary using dict() constructor
d1 = dict({1: 'Nerds', 2: 'Are', 3: 'Smart'})
print(d1)
    # OUTPUT:
        # {1: 'Nerds', 2: 'Are', 3: 'Smart'}
        # {1: 'Smart', 2: 'Are', 3: 'Smart'}
print()

# Accessing Key-value in Dictionary
d = {1:'Nerds', 'are': 'very', 3: 'smart', 4: 'or', 5: 'foolish'}
print(d['are']) # Accessing an element using key
print(d.get(3)) # Accessing an element using get
    # OUTPUT:
        # very
        # smart
print()

"""Python Tuples:
    A tuple i Python is an immutable ordered collection of elements. 
    - Tuples are similar to lists, but unlike lists, they cannot be changed after their creation (i.e., they are immutable).
    - Tuples can hold elements of different data types.
    - The main characteristics of tuples are being ordered, heterogeneous and immutable."""

# Creating a Tuple
tup()
print(tup) # ()

# Using String 
tup = ('Geeks', 'For')
print(tup) # ('Geeks', 'For')

# Using List
li = [1, 2, 4, 5, 6]
print(tuple(li)) # (1, 2, 4, 5, 6)

# Using Built-in Function
tup = tuple ('Geeks')
print(tup) # ('G', 'e', 'e', 'k', 's')

## Creating a Tuple with Mixed Datatypes
tup = (5, 'Welcome', 7, 'Geeks')
print(tup) # (5, 'Welcome', 7, 'Geeks')

# Creating a Tuple with nested tuples
tup1 = (0, 1, 2, 3)
tup2 = ('python', 'geek')
tup3 = (tup1, tup2) 
print(tup3) # ((0, 1, 2, 3), ('python', 'geek'))

# Creating Tuple wtih Mixed Datatypes 
tup = (5, 'Welcome', 7, 'Geeks')
print(tup) # ('Geeks', 'Geeks', 'Geeks')

"""Tuple Basic Operations"""

# 1. Accessing of Tuples
    # We can access the elements of a tuple by using indexing and slicing, similar to how we access elements in a list. 
tup = tuple ("Geeks")
print(tup[0])

# Accessing a range of elements using slicing
print(tup[1:4])
print(tup[:3])

# Tuple unpacking
tup = ("Geeks", "For", "Geeks")

# This line unpack values off Tuple1
a, b, c = tup
print(a) # Geeks
print(b) # For
print(c) # Geeks

# 2. Concatenation of Tuples
    # Tuples can be concatenated using the + operator. This operation combines two or more tuples to create a new tuple.
tup1 = (0, 1, 2, 3)
tup2 = ('Geeks', 'For', 'Geeks')

tup3 = tup1 + tup2
print(tup3) # (0, 1, 2, 3, 'Geeks', 'For', 'Geeks')

# 3. Slicing of Tuple 
    # Slicing a tuple means creating a new tuple from a subset of elements of the original tuple. The slicing syntax is tuple[start:stop:step].
tup = tuple('GEEKSFORGEEKS')

# Removing First element
print(tup[1:])

# Reversing the Tuple
print(tup[::-1]) # ('S', 'K', 'E', 'E', 'G', 'R', 'O', 'F', 'S', 'K', 'E', 'E', 'G')

# Printing elements of a Range
print(tup[4:9]) # ('S', 'F', 'O', 'R', 'G')

# 4. Deleting a Tuple
    # Since tuples are immutable, we cannot delete individual elements of a tuple. 
tup = (0, 1, 2, 3, 4)
del tup

print(tup) # ERROR

# 5. Tuple Unpacking with Asterisk (*)
tup (1, 2, 3, 4, 5)
a, *b, c = tup
print (a) # 1
print (b) # [2, 3, 4]
print (c) # 5



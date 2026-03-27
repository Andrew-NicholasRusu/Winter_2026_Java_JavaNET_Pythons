"""Python Sets:
    Python set is an unordered collection of multiple items having different datatypes. In Python, sets are mutable, unindexed and do 
    not contain duplicates. The order of elements in a set is not preserved and can change.
    - Can store None values.
    - Implemented using hash tables internally.
    - Do not implement interfaces like Serializable or Cloneable.
    - Python sets are not inherently thread-safe; synchronization is needed if used across threads."""

# Creating a Set
s = {1, 2 , 3, 4}
print(s) # {1, 2, 3, 4}

s = set()
print(s)

a = set("PythonCoding")
print(a)

# Creating a Set with the use of a List
l = set(["Python", "Programming", "is", "fun"])
print(l)

# Creating a Set with the use of a tuple
t = ("GFG", "for", "Geeks")
print(set(t))

# Creating a Set with the use of a dictionary
d = {"GFG": 1, "for": 2, "Geeks": 3}
print(set(d))

"""Unordered, Unindexed and Mutability
    In set, the order of elements is not guaranteed to be the same as the order in which they were added. The output could vary 
    each time we run the program. Also the duplicate items entered are removed by itself."""

s = {3, 1, 4, 1, 5, 9, 2}
print(s)
try:
    print(s[0]) # {1, 2, 3, 4, 5, 9}
except TypeError as e:
    print(e) # 'set' object is not subscriptable

# Adding Elements to a Set
s = {1, 2, 3}
s.add(4) # add() method can be used to add only a single item
s.update([5, 6]) # To add multiple items we use update() method.
print(s) # {1, 2, 3, 4, 5, 6}

# Accessing a Set
s = {"Geeks", "For", "Geeks"}
for i in s:
    print(i, end=" ")
print("\n", "Geeks" in s)

"""Removing Elements from the Set:
    We can remove an element from a set in Python using several methods: remove(), discard() and pop(). 
    Each method works slightly differently :"""

# Using remove() Method or discard() Method
s = {1, 2, 3, 4, 5}
s.remove(3)
print(s)

try :
    s.remove(10)
except KeyError as e:
    print("Error:", e)

s.discard(4)
print(s)

s.discard(10)
print(s)

# Using pop() Method
s = {1, 2, 3, 4, 5}
val = s.pop() # removes and returns an arbitrary element from the set.
print(val)
print(s)

s.clear()
try:
    s.pop()
except KeyError as e:
    print("Error:", e) # Error: 'pop from an empty set'

# Using clear() Method
s = {1, 2, 3, 4, 5}
s.clear() # removes all elements from the set, leaving it empty.
print(s)

# Frozen Sets
    # A frozenset in Python is a built-in data type that is similar to a set but with one key difference that is immutability. 
    # This means that once a frozenset is created, we cannot modify its elements that is we cannot add, remove or change any items 
    # in it.
fs = frozenset([1, 2, 3, 4, 5])
print(fs)  

s = {3, 1, 4, 1, 5}
fs = frozenset(s)
print(fs)

# Typecasting Objects into Sets
li = [1, 2, 3, 3, 4, 5, 5, 6, 2]
s = set(li)
print(s) # {1, 2, 3, 4, 5, 6}

s = "GeeksforGeeks"
s = set(s)
print(s)

d = {1: "One", 2: "Two", 3: "Three"}
s = set(d)
print(s)

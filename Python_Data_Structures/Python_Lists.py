"""Python Lists
    In Python, a list is a built-in data structure that can hold an ordered collection of items. 
    Unlike arrays in some languages, Python lists are very flexible:"""

'''Creating a List
    Lists can be created in several ways, such as using square brackets, the list() constructor 
    or by repeating elements. Let's look at each method one by one with example:'''

# 1. Using Square Brackets
a = [1, 2, 3, 4, 5] # List of integers
b = ['apple', 'banana', 'cherry'] # List of strings
c = [1, 'hello', 3.14, True] # Mixed data types 

print(a) # [1, 2, 3, 4, 5]
print(b) # ['apple', 'banana', 'cherry']
print(c) # [1, 'hello', 3.14, True]
print() # Space

# 2. Using list() Constructor
a = list((1, 2, 3, 'apple', 4.5))
print(a) # [1, 2, 3, 'apple', 4.5]
b = list("GFG")
print(b) # ['G', 'F', 'G']

# 3. Creating List with Repeated Elements
a = [2] * 5
b = [0] * 7
print(a) # [2, 2, 2, 2, 2]
print(b) # [0, 0, 0, 0, 0, 0, 0]

# 4. Accessing List Elements
a = [10, 20, 30, 40, 50]
print(a[0]) # 10
print(a[-1]) # 50
print(a[1:4]) # [20, 30, 40]
# Line 35 are elements from index 1 to 3

'''Adding Elements into List:
    - append(): Adds an element at the end of the list.
    - extend(): Adds multiple elements to the end of the list.
    - insert(): Adds an element at a specific position.
    - clear(): removes all items.                           '''
a = []
a.append(10)
print("After append(10):", a) # After append(10): [10]

a.insert(0, 5)
print("After insert(0, 5):", a) # After insert(0, 5): [5, 10]

a.extend([15, 20, 25])
print("After extend([15, 20, 25]):", a) # After extend([15, 20, 25]): [5, 10, 15, 20, 25]

a.clear()
print("After clear():", a) # After clear(): []

# Updating Elements into List
a = [10, 20, 30, 40, 50]
a[1] = 25 # changes index 1 to 25 instead of 20
print(a) # [10, 25, 30, 40, 50]


'''Removing Elements from List
    - remove(): Removes the first occurrence of an element.
    - pop(): Removes the element at a specific index or the last element if no index is specified.
    - del statement: Deletes an element at a specified index.       '''
a = [10, 20, 30, 40, 50]

a.remove(30) # Removes 30 (Index 2)
print("After remove(30):", a) # After remove(30): [10, 20, 40, 50]

popped_val = a.pop(1) # Removes index 1 (20)
print("Popped element:", popped_val) # Popped element: 20
print("After pop(1):", a) After pop(1): [10, 40, 50]

del a[0] # Deletes index 0, which at this point, is 10
print ("After del a[0]:", a)

# Iterating Over Lists
a = ['controller', 'console', 'remote']
for item in a:
    print(item) 

# Nested Lists 
matrix = [ [1, 2, 3], 
           [4, 5, 6],
           [7, 8, 9] ]
print(matrix[1][2]) # Prints the element from row 1, column 2, which is 6

# List Comprehension
    # List comprehension is a concise way to create lists using a single line of code. It is useful for applying an operation or filter to items in an iterable, such as a list or range.
squares = [x**2 for x in range(1, 6)]
    # for x in range(1, 6): loops through each number from 1 to 5 (excluding 6)
    # x** 2 squares each number x
    # [] collects all the squared numbers into a new list
print(squares) # [1, 4, 9, 16, 25]

# How does Python store list elements?
    # In Python, a list doesn’t store actual values directly. Instead, it stores references (pointers) to objects in memory. This means numbers, strings and booleans are separate objects in memory and the list just keeps their addresses.
a = [10, 20, "GfG", 40, True]
print (a) # [10, 20, 'GfG', 40, True]
print (a[0]) # Prints only 10 (index 0)
print (a[1]) # Prints only 20 (index 1)
print (a[2]) # Prints only GfG (index 2)
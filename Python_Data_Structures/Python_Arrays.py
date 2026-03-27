"""Python Arrays:
    Lists in Python are the most flexible and commonly used data structure for sequential storage. They are similar to arrays in other languages but with several key 
    differences:
    - Dynamic Typing: Python lists can hold elements of different types in the same list. We can have an integer, a string and 
      even other lists all stored within a single list.
    - Dynamic Resizing: Lists are dynamically resized, meaning you can add or remove elements without declaring the size of the 
      list upfront.
    - Built-in Methods: Python lists come with numerous built-in methods that allow for easy manipulation of the elements 
      within them, including methods for appending, removing, sorting and reversing elements."""

'NumPy Arrays'
import numpy as np 
a = np.array([1, 2, 3, 4])

# Element-wise operations
print(a * 2)

# Multi-dimensional array
res = np.array([[1, 2], [3, 4]])
print(res * 2)

'Python Arrays'
import array as arr
a = arr.array('i', [1, 2, 3])
# accessing First array
print(a[0])
# adding element to array
a.append(5)
print(a)

'Creating an Array'
import array as arr
a = arr.array('i', [1, 2, 3])
for i in range(0, 3):
    print(a[i], end=" ")

'Adding Elements to an Array'
import array as arr
a = arr.array('i', [1, 2, 3])
print(*a)

a.insert(1, 4) # Insert 4 at index 1
print(*a) # 1 4 2 3

'Accessing Array Items'
import array as arr
a = arr.array('i', [1, 2, 3, 4, 5, 6])
print(a[0])
print(a[3])
b = arr.array('d', [2.5, 3.2, 3.3])
print(b[1]) # Gets the 1st index, which is 3.2
print(b[2]) # Gets the 2nd index, which is 3.3

'Removing Elements from the Array'
import array
a = array.array('i', [1, 2, 3, 1, 5])

# remove first occurance of 1
a.remove(1)
print(a) # array('i', [2, 3, 1, 5])

# remove item at index 2
a.pop(2)
print(a) # array('i', [2, 3, 5])

'Slicing of an Array'
import array as arr
a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b = arr.array('i', a)

res = a[3:8]
print(res) # [4, 5, 6, 7, 8]

res = a[5:]
print(res) # [6, 7, 8, 9, 10]

res = a[:]
print(res) # [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

'Searching Element in an Array'
import array
a = array.array ('i', [1, 2, 3, 1, 2, 5])

# index of 1st occurance of 2
print(a.index(2))

# index of 1st occurrence of 1
print(a.index(1)) 

'Updating Elements in an Array'
import array
a = array.array('i', [1, 2, 3, 1, 2, 5])

# Update item at index 2
a[2] = 6
print(a)

# Update item at index 4
a[4] = 8
print(a)
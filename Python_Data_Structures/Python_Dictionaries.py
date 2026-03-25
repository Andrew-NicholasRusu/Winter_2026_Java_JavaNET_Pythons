"""Python Dictionary
    A Python dictionary is a data structure that stores information in key-value pairs. While keys must be unique and immutable 
    (like strings or numbers), the values can be of any data type, whether mutable or immutable. This makes dictionaries ideal for 
    accessing data by a specific name rather than a numeric position like in list."""

# Example:
data = { "name": "Jake", "age": 22 } # "name" andd "age" are keys
print(data) # {'name': 'Jake', 'age': 22}

# Creating a Dictionary
d1 = {1: 'Geeks', 2: 'For', 3: 'Geeks'}
print(d1) # {1: 'Geeks', 2: 'For', 3: 'Geeks'}

"""using dict() constructor"""
d2 = dict (a = "Geeks", b = "for", c = "Geeks")
print(d2) # {'a': 'Geeks', 'b': 'for', 'c': 'Geeks'}

# Accessing Dictionary Items
d = {"name": "Kat", 1: "Python", (1, 2): [1, 2, 4] }

# Access using key
print(d["name"]) # Kat

# Access using get()
print(d.get("name")) # Kat

"""Removing Dictionary Items
    Dictionary items can be removed using built-in deletion methods that work on keys:
    - del: removes an item using its key
    - pop(): removes the item with the given key and returns its value
    - clear(): removes all items from the dictionary
    - popitem(): removes and returns the last inserted key – value pair"""


d = {1: 'Geeks', 2: 'For', 3: 'Geeks', 'age': 22}

# Using del
del d ["age"]
print(d) # {1: 'Geeks', 2: 'For', 3: 'Geeks'}

# Using pop()
val = d.pop(1)
print(val) Geeks

# Using popitem()
key, val = d.popitem()
print(f"Key: {key}, Value: {val}") # Key: 3, Value: Geeks

# Using clear()
d.clear()
print(d)


"""Iterating Throught a Dictionary"""

d = {1: 'Geeks', 2: 'For', 'age':22}

# Iterate over keys
for key in d:
    print(key)

# Iterate over values
for value in d.values():
    print(value)

# Iterate over key-value pairs
for key, value in d.items():
    print(f"{key}: {value}")

"""Nested Dictionaries
    A nested dictionary is a dictionary that contains another dictionary as one of its values. Below diagram shows how a nested 
    dictionary works, where key 3 points to another dictionary inside the main dictionary."""

d = {1: 'Geeks', 2: 'For', 3: {'A': 'Welcome', 'B': 'To', 'C': 'Geeks'}}
print(d) # {1: 'Geeks', 2: 'For', 3: {'A': 'Welcome', 'B': 'To', 'C': 'Geeks'}}
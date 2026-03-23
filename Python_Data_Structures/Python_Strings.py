"""Python String
    In Python, a string is a sequence of characters written inside quotes. It can include letters, numbers, symbols and spaces."""

# Creating a String
s1 = 'GfG'
s2 = "GfG"
print(s1) # GfG
print(s2) # GfG

# Multi-line Strings
s = """I am Learning 
    Python String on GeeksforGeeks"""
print(s)

s = '''I'm a massive
    Geek.'''
print(s)

# Accessing characters in String
    #  Strings are indexed sequences. Positive indices start at 0 from the left, 
    #  negative indices start at -1 from the right as represented in below image:
s = "GeeksforGeeks"
print(s[0]) # G
print(s[4]) # s
print(s[-10]) # k
print(s[-5]) # G

# String Slicing
    # Slicing is a way to extract a portion of a string by specifying the start and end indexes. 
    # The syntax for slicing is string[start:end], where start starting index and end is stopping index (excluded).
s = "GeeksforGeeks"
print(s[1:4]) # eek
print(s[:3]) # Gee
print(s[3:]) # ksforGeeks
print(s[::-1]) # skeeGrofskeeG

# String Iteration
    # Strings are iterable, you can loop through characters one by one.
s = "Python"
for char in s:
    print(char)
    # OUTPUT:
        # P
        # y
        # t
        # h
        # o
        # n

# Updating a String
    # As strings are immutable, “updates” create new strings using slicing or methods such as replace().
s = "hello geeks"
s1 = "H" + s[1:]
s2 = s.replace("geeks", "GeeksforGeeks")
print(s1) # Hello geeks
print(s2) # hello GeeksforGeeks

"""Common String Methods
    Python provides various built-in methods to manipulate strings. Below are some of the most useful methods:"""

# 1. len(): The len() function returns the total number of characters in a string (including spaces and punctuation).
s = "Givemetheoutputforhowmanylettersareinthisphrase"
print(len(s))

# 2. upper() and lower(): upper() method converts all characters to uppercase whereas, lower() method converts all characters to lowercase.
s = "Hello World"
print(s.upper()) # HELLO WORLD
print(s.lower()) # hello world

# 3. strip() and replace():  strip() removes leading and trailing whitespace from the string and replace() replaces all occurrences of a specified substring with another.
s = "  Gfg  "
print(s.strip()) # Gfg

s = "Python is fun"
print(s.replace("fun", "awesome")) # Python is awesome

"""Concatenating and Repeating Strings:
    We can concateate strings using + operator and repeat them using * operator."""

# 1. Strings can be combined by using + operator.
s1 = "Hello"
s2 = "World"
print(s1 + " " + s2) # Hello World

# 2. We can repeat a string multiple times using * operator
s = "Hello "
print(s * 3) # Hello Hello Hello 

"""Formatting Strings"""

# 1. Using f-strings
name = "Alice"
age = 22
print(f"Name: {name}, Age: {age}") # Name: Alice, Age: 22

# 2. Using format()
s = "My name is {} and I am {} years old.".format("Nicky", 19)
print(s) # My name is Nicky and I am 19 years old.

# String Membership Testing
s = "PythonIsAmazing"
print("Python" in s) # True
print("Cool" in s) # False





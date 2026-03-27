"""File Handling in Python:
    File handling refers to the process of performing operations on a file, such as creating, opening, reading, writing and closing it 
    through a programming interface. It involves managing the data flow between the program and the file system on the storage device, 
    ensuring that data is handled safely and efficiently. """

"""Why do we need File Handling?
    - To store data permanently, even after the program ends.
    - To access external files like .txt, .csv, .json, etc.
    - To process large files efficiently without using much memory.
    - To automate tasks like reading configs or saving outputs."""

# Opening a File
f = open("python.txt", "r")
print(f)

# Closing a File
file = open("python.txt", "r") # Perform file operations
file.close()

# Checking File Properties 
f = open("python.txt", "r")
print("Filename:", f.name) # Returns the name of the file that was opened
print("Mode:", f.mode) # Tells us the mode in which the file was opened. Here, it’s 'r' which means read mode.
print("Is Closed?", f.closed) # Returns a boolean value- False when file is currently open otherwise True.

f.close()
print("Is Closed?", f.closed)

# Reading a File
file = open ("python.txt", "r")
content = file.read()
print(content)
file.close() 

# Writing a File
    # In Python, writing to a file is done using the mode "w". This creates a new file if it doesn’t exist, or overwrites the existing 
    # file if it does. The write() method is used to add content. After writing, make sure to close the file.
with open("newPython.txt", "w") as file:
    # "w" mode opens the file for writing (overwrites existing content if the file already exists).
    file.write("Hello, Python!\n")
    file.write("File handling is easy with Python.")
print("File written successfully!")

# Using with Statement
with open ("python.txt", "r") as file:
    content = file.read()
    print(content)

# Handling Excpetions When Closing a File
try:
    file = open ("python.txt", "r")
    content = file.read()
    print(content)
finally:
    file.close()

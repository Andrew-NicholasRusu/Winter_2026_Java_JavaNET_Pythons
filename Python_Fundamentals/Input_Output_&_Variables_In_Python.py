
## Input and Output in Python


# Printing Variables

s = "Brad"
print(s)

s = "Anjelina"
age = 25
city = "New York"
print(s, age, city) # We can use the print() function to print single and multiple variables. 
# We can print multiple variables by separating them with commas. 

# Take Multiple Input in Python

x, y = input("Enter two values: ").split()
print("Number of boys: ", x)
print("Number of girls: ", y)
 
x, y, z = input("Enter three values: ").split()
print("Total number of students: ", x)
print("Number of boys is : ", y)
print("Number of girls is : ", z)

# Print Names in Python
# The code prompts the user to input a string (the color of a rose), assigns it to the varibale color and then prints the inputted color.
color = input ("What color is a rose?")
print(color)

# Print Numbers in Python
n = int(input("How many roses?"))
print(n)

# Print Float or Decimal Number in Python
# The code prompts the user to input the price of each rose as a floating-point number,
# converts the input to a float using typecasting and then prints the price. 
price = float(input("Price of each rose?"))
print (price)

# Find DataType of Input in Python
a = "Hello World"
b = 10
c = 11.22
d = ("Geeks", "for", "Geeks")
e = ["Geeks", "for", "Geeks"]
f = {"Geeks": 1, "for":2, "Geeks":3}

print(type(a))
print(type(b))
print(type(c))
print(type(d))
print(type(e))
print(type(f))

## Python Variables
    # In Python, variables are used to store data that can be referenced and manipulated during program execution. 
    # A variable is essentially a name that is assigned to a value.
        # Unlike Java and many other languages, Python variables do not require explicit declaration of type.
        # The type of the variable is inferred based on the value assigned.

x = 5
name = "Samantha"  
print(x)
print(name)

# Assigning DIfferent Values
    # We can assign different values to multiple variables simultaneously, making the code concise and easier to read.
x, y, z = 1, 2.5, "Python"
print(x, y, z)






















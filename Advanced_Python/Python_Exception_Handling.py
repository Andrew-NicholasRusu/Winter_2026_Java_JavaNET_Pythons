"""Python Exception Handling
    Python Exception Handling allows a program to gracefully handle unexpected events (like invalid input or missing files) without crashing. 
    Instead of terminating abruptly, Python lets you detect the problem, respond to it, and continue execution when possible. """

# Example:
n = 10
try:
    res = n / 0
except ZeroDivisionError:
    print("Can't be divided by zero!") # Dividing a number by 0 raises a ZeroDivisionError

'''Difference Between Errors and Exceptions:
    - Error: Issues in the program logic such as SyntaxError, etc. It occurs at compile time.
    - Exception: Problems that occur at runtime and can be managed using exception handling (e.g., invalid input, missing files).'''

# This example shows the difference between a syntax error and a runtime exception.

# print("Hello world!" # Missing closing parenthesis
    
# n = 10 # ZeroDivisionError (Exception)
# res = n / 0

'''Syntax of Exception Handling
    - try: Runs the risky code that might cause an error.
    - except: Catches and handles the error if one occurs.
    - else: Executes only if no exception occurs in try.
    - finally: Runs regardless of what happens useful for cleanup tasks like closing files.'''

# This code attempts division and handles errors gracefully using try-except-else-finally.
try:
    n = 0
    res = 100 / n
except ZeroDivisionError:
    print("You can't divide by zero!")
except ValueError:
    print("Enter a valid number!")
else:
    print("result is", res)
finally:
    print("Execution complete.")

'''Catching Exceptions'''

# 1. Catching Specifc Exceptions:
try:
    x = int("str") # This will cause ValueError
    inv = 1 / x # Inverse calculation
except ValueError:
    print("Not Valid!")
except ZeroDivisionError:
    print("Zero has no inverse!")

# 2. Catching Multiple Exceptions
a = ["10", "twenty", 30]
try:
    total = int(a[0]) + int (a[1])
except (ValueError, TypeError) as e:
    print("Error", e)
except IndexError:
    print("Index out of range")
    # OUTPUT: Error invalid literal for int() with base 10: 'twenty'

# 3. Catch-All Handlers and Their Risks
try:
    res = "100" / 20 # Risky operation: dividing string by number
except ArithmeticError:
    print("Arithmetic problem.")
except:
    print("Something went wrong!") # A TypeError occurs because you can’t divide a string by a number. 

'''Raise an Exception'''
def set(age):
    if age < 0:
        raise ValueError ("Age cannot be negative.")
    print(f"Age set to {age}")

try:
    set(-5)
except ValueError as e:
    print(e)

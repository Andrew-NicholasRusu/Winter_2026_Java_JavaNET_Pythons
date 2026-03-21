""" Condtional Statements in Python
    Conditional statements in Python are used to execute certain blocks of code based on specific conditions. 
    These statements help control the flow of a program, making it behave differently in different situations."""

# If Conditional Statement
    # If statement is the simplest form of a conditional statement. It executes a block of code if the given condition is true.
age = 20
if age >= 18:
    print("Eligible to vote.") # Eligible to vote.

# Short Hand if
age = 16
if age > 18: print("Eligible to Vote.") # Won't print anything because age < 18

# If else Condtional Statement
    # If Else allows us to specify a block of code that will execute if the condition(s) associated with an if or else if statement
    # evaluates to False. Else block provides a way to handle all other cases that don't meet the specified conditions.
age = 10
if age <= 12:
    print("Travel for free.") # Will print this because age <= 12
else:
    print("Pay for ticket.") 

# Short Hand if-else
    # The short-hand if-else statement allows us to write a single-line if-else statement.
marks = 45
res = "Pass" if marks >= 40 else "Fail"
print(f"Result: {res}") # OUTPUT: Result: Pass

# elif Statement
    # elif statement in Python stands for "else if." It allows us to check multiple conditions, providing a way to execute different 
    # blocks of code based on which condition is true. Using elif statements makes our code more readable and efficient by eliminating 
    # the need for multiple nested if statements.
age = 25

if age <= 12:
    print("Child.")
elif age <= 19:
    print("Teenager.")
elif age <= 35:
    print ("Young adult.")
else: 
    print("Adult.")
# OUTPUT: Young adult

# Nested if..else Condtional Statement
    # Nested if..else means an if-else statement inside another if statement. 
    # We can use nested if statements to check conditions within conditions.
age = 70
is_member = True

if age >= 60:
    if is_member:
        print("30% senior discount!")
    else:
        print("20% senior discount.")
else:
    print("Not eligible for a senior discount.")
# OUTPUT: 30# senior discount!

# Ternary Conditonal Statement
    # A ternary conditional statement is a compact way to write an if-else 
    # condition in a single line. It’s sometimes called a "conditional expression."

# Assign a value based on a condition
age = 20
s = "Adult" if age >= 18 else "Minor"
print(s) # Adult
print()

# Match-Case Statement
    # match-case statement is Python's version of a switch-case found in other languages. 
    # It allows us to match a variable's value against a set of patterns.
number = 2

match number:
    case 1:
        print("One")
    case 2 | 3:
        print("Two or Three")
    case _:
        print("Other number")
# OUTPUT: Two or Three
print()




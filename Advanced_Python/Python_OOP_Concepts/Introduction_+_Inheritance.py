"""Python OOP Concepts:
    Object Oriented Programming empowers developers to build modular, maintainable and scalable applications. OOP is a way of organizing 
    code that uses objects and classes to represent real-world entities and their behavior. In OOP, object has attributes thing that has 
    specific data and can perform certain actions using methods.

- Organizes code into classes and objects.
- Supports encapsulation to group data and methods together.
- Enables inheritance for reusability and hierarchy.
- Allows polymorphism for flexible method implementation.
- Improves modularity, scalability and maintainability."""

# Creating a Class:
class Dog:
    species = "Canine" # Class attribute

    def __init__(self, name, age):
        self.name = name  # Instance attribute
        self.age = age  # Instance attribute

# Creating an Object:
class Cat:
    species = "Siamese" 

    def __init__(self, name, age):
        self.name = name
        self.age = age
# Creating an object of the Cat class
cat1 = Cat("Yeti", 5)

print(cat1.name)
print(cat1.age)
print(cat1.species)

"""Inheritance in Python:
    Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a class (called a child or derived class) to inherit 
    attributes and methods from another class (called a parent or base class). """

# Example:
class Fruit: # Parent Class
    def __init__(self, color):
        self.color = color

    def info(self):
        print("Name of fruit:", self.color)

class Banana (Fruit): # Child Class
    def sound(self):
        print(self.color)
f = Banana("Banana")
f.info()
f.sound()

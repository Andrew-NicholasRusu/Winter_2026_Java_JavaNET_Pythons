using System;
using System.Collections.Generic;
using System.Reflection.Emit;
using System.Text;

namespace NET_Methods_For_C_
{
    internal class Method_Parameters
    {
        // default parameter
        static void Display(int x)
        {
            Console.WriteLine("Value Parameter: " = x);
        }

        // reference parameter
        static void Update (ref int y)
        {
            // Modify the original variable 
            y += 5;
            Console.WriteLine("Reference Parameter: " + y);
        }

        // output parameter
        static void GetValues(out int z)
        {
            // Assign a value before returning
            z = 20;
            Console.WriteLine("Output Parameter: " + z);
        }

        static void main(String[] args)
        {
            int value = 10;
            // Call method with value parameter
            Display(value);
            // Call method with reference parameter
            Update(ref value);
            int outputValue;
            // Call method with output parameter
            GetValues(out outputValue);
        }
    }

    // Instance Methods
        // Belong to an Object: Instance methods require an object of the class to be called.
        // Access to Instance Variables: They can access and modify instance variables and other instance methods directly.
        // Dynamic Binding: Instance methods can be overridden in derived classes, allowing for polymorphic behavior in each
        // instance method that resides within the memory allocated for that specific object.

    // Advantages of Methods
        //It makes the program well structured.
        //Methods enhance the readability of the code.
        //It provides an effective way for the user to reuse the existing code.

    //Limitations of Methods
        //Performance Overhead: Each method call adds a slight delay due to stack frame creation.
        //Limited Context: Methods may require additional parameters to access class-level data, increasing code complexity.
        //Debugging Complexity: Nested or numerous method calls can make debugging more difficult
}

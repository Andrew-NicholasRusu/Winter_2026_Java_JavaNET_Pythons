using System;
using System.Collections.Generic;
using System.Text;

namespace NET_Methods_For_C_
// Static methods belong to the class itself rather than any specific instance.
// They can be called without creating an object of the class.
{
    internal class StaticMethod
    {
        public static int Square (int number)
        {
            // Return the square of the number
            return number * number;
        }

        public static void main(String[] args)
        {
        // Call the static method directly using the class name
            int result = StaticMethod.Square(5);
            Console.WriteLine("Square of 5 is: " + result);
        }
    }
}

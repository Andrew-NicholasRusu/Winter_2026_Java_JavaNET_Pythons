using System;
using System.Collections.Generic;
using System.Text;
using System.Xml.Linq;

namespace NET_Methods_For_C_
// The method signature consists of the method name and its parameter list.
// It uniquely identifies the method within its class.
    /// Access Modifier: Defines the visibility of the method.
    /// Return Type: Specifies the type of value the method returns.
    /// Method Name: The name used to call the method.
    /// Parameters: A list of inputs the method can take and it is optional
    /// Method Body: The block of code that defines what the method does
{
    internal class Display {
        public void DisplayMessage()
        {
            Console.WriteLine("Hello from the display " + "Message method!");
        }
        static void Main(string[] args)
        {
            Display display = new Display();
            // Create an instance of Display.
            // Call the instance method directly.
            display.DisplayMessage();
        }
    }
}

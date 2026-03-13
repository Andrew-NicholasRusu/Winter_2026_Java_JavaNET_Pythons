/*
 * C# Decision Making (if, if-else, if-else-if ladder, 
 * nested if, switch, nested switch)
 */
namespace Control_Statements_In_C_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string name = "WhoAmI";
            string program = "Java";
            int i = 20;
            int b = 10;
            int number3 = 30;
            int outter = 2;
            int inner = 3;
            int nitem = 4;
            string topic;
            string category;
            int greeting = 2;

            // Using if statement
            if (name == "WhoAmI")
            {
                Console.WriteLine("I am a person.");
            }

            // Using if-else statement
            if (program == "Java")
            {
                Console.WriteLine("This program is Java");
            }
            else
            {
                Console.WriteLine("This program is something else.");
            }

            // Using if-else-if ladder
            if (i == 10)
            {
                Console.WriteLine("i is 10");
            }
            else if (i == 15)
            {
                Console.WriteLine("i is 15");
            }
            else if (i == 20)
            {
                Console.WriteLine("i is 20");
            }
            else
            {
                Console.WriteLine("i is not present");
            }

            // Another if-else-if example
            topic = "Inheritance";

            // using compare function of string class
            if ((String.Compare(topic, "Introduction to C#") == 0) || 
                (String.Compare(topic, "Variables") == 0) ||
                (String.Compare(topic, "Data Types") == 0)) 
            {
                category = "Basic";
            }
            else if ((String.Compare(topic, "Loops") == 0) ||
                (String.Compare(topic, "If Statements") == 0) ||
                (String.Compare(topic, "Jump Statements") == 0))
            {
                category = "Control Flow";
            }
            else if ((String.Compare(topic, "Class & Object") == 0) ||
                (String.Compare(topic, "Inheritance") == 0) ||
                (String.Compare(topic, "Constructors") == 0))
            {
                category = "OOPS Concept";
            }
            else
            {
                category = "Not Mentioned";
            }
            System.Console.Write("Category is " + category);

            // Using Nested - If Statement
            if (b == 10)
            {
                // Nested - if statement will only be executed if statement about it is true
                if (b < 12)
                {
                    Console.WriteLine("b is smaller than 12 too.");
                } else
                {
                    Console.WriteLine("b is greater than 11.");
                }
            }

            // Switch Statement
            switch(number3)
            {
                case 10: 
                    Console.WriteLine("case 10");
                    break;
                case 15:
                    Console.WriteLine("case 15");
                    break;
                case 20:
                    Console.WriteLine("case 20");
                    break;
                case 25:
                    Console.WriteLine("case 25");
                    break;
                case 30:
                    Console.WriteLine("case 30");
                    break;
                default:
                    Console.WriteLine("None matches");
                    break;
            }

            // Another Switch Case Statement/Example
            switch (nitem)
            {
                case 1:
                    Console.WriteLine("Case 1");
                    break;
                case 5:
                    Console.WriteLine("Case 5");
                    break;
                case 9:
                    Console.WriteLine("Case 9");
                    break;
                default:
                    Console.WriteLine("No match found");
                    // Will print this because nitem = 4.
                    break;
            }

            // We use a switch statement instead of if-else statements because if-else statement
            // only works for a small number of logical evaluations of a value.

            // Using goto in the Switch Statement
            switch (greeting)
            {
                case 1:
                    Console.WriteLine("Hello");
                    goto default;
                case 2:
                    Console.WriteLine("Bonjour");
                    goto case 3;
                case 3:
                    Console.WriteLine("Namaste");
                    goto default;
                default:
                    Console.WriteLine("Enter value is: " + greeting);
                    break;
            }

            // Nested Switch
            switch (outter)
            {
                case 1:
                    Console.WriteLine("Outter Case 1");
                    break;
                case 2:
                    Console.WriteLine("Outter Case 2");
                    switch (inner)
                    {
                        case 1:
                            Console.WriteLine("Inner Case 1");
                            break;
                        case 2:
                            Console.WriteLine("Inner Case 2");
                            break;
                        case 3:
                            Console.WriteLine("Inner Case 3");
                            break;
                        default:
                            Console.WriteLine("Default Inner Run");
                            break;

                    }
                    break;
                default:
                    Console.WriteLine("Default Outter Run");
                    break;
            }
        }
    }
}

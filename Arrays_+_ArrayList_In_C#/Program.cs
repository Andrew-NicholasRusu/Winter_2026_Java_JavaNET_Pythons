namespace Arrays___ArrayList_In_C_
{
    internal class Program
    {
        // Main Method
        static void Main(string[] args)
        {
            // One Dimensional Array Example
            // Declaring a 1D Array of string.
            string[] weekDays;

            // allocating memory for days.
            weekDays = new string[] {
            "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"
            };

            // Displaying Elements of array
            foreach (string day in weekDays)
            {
                Console.Write(day + " ");
            }
            Console.WriteLine();

            // Multidimensional Arrays Example
            int[,,] arr = new int[2, 2, 3] { { { 1, 2, 3},
                                               { 4, 5, 6} },
                                               { { 7, 8, 9},
                                               { 10, 11, 12} } };
            
            // Checking elements at particular index
            Console.WriteLine("arr[1][0][1] : " + arr[1, 0, 1]);
            Console.WriteLine("arr[1][1][2] : " + arr[1, 1, 2]);

            // Jagged Arrays Example
            // Declaring Jagged Array
            int[][] jaggedArr = { new int[] { 1, 3, 5, 7, 9},
                                  new int[] { 2, 4, 6, 8}};
            Console.WriteLine("Arrays:");
            
            // Display the array elements
            for (int i = 0;  i < jaggedArr.Length; i++)
            {
                System.Console.Write("Elements[" + i + "] Array: ");

                // Printing the elements of array
                for (int j = 0; j < jaggedArr[i].Length; j++)
                {
                    Console.Write(jaggedArr[i][j] + " ");
                }
                Console.WriteLine();
            }

            /*
             * Using arrays with loops
             */

            // Declares an Array of integers
            int[] intArray;

            // Allocating memory for 5 integers
            intArray = new int[5];

            // Initialize the first elements of the array
            intArray[0] = 10;

            // Initialize the second elements of the array
            intArray[1] = 20;

            // So on...
            intArray[2] = 30;
            intArray[3] = 40;
            intArray[4] = 50;

            // Accessing the elements using for loop
            Console.Write("For Loop: ");
            for (int i = 0; i < intArray.Length; i++)
            {
                Console.Write(" " + intArray[i]);
            }

            Console.WriteLine();
            Console.Write("For-each Loop:");

            // using for-each loop
            foreach(int i in intArray)
            {
                Console.Write(" " + i);
            }

            Console.WriteLine();
            Console.Write("while loop:");

            // using while loop
            int j = 0;
            while (j < intArray.Length) 
            {
                Console.Write(" " + intArray[j]);
                j++;
            }

            Console.WriteLine();
            Console.Write("Do-while loop:");
            int k = 0;
            do
            {
                Console.Write(" " + intArray[k]);
                k++;
            } while (k < intArray.Length);
        }
    }
}

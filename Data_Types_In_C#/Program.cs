namespace Data_Types_In_C_
{
    internal class Fundamentals
    {
        // only declaration, compiler will provide the defauly value 0 to it
        int y;
        static void Main(string[] args)
        {
            char a = 'G';
            int i = 89;
            short s = 56;
            long l = 4564;
            uint ui = 95;
            ushort us = 76;
            ulong ul = 3624573; ;
            double d = 8.358974532;
            float f = 3.7330645f;
            decimal dec = 389.5423m;

            Console.WriteLine("char: " + a);
            Console.WriteLine("integer: " + i);
            Console.WriteLine("short: " + s);
            Console.WriteLine("long: " + l);
            Console.WriteLine("float: " + f);
            Console.WriteLine("double: " + d);
            Console.WriteLine("decimal: " + dec);
            Console.WriteLine("Unsigned integer: " + ui);
            Console.WriteLine("Unsigned short: " + us);
            Console.WriteLine("Unsigned long:" + ul);

        // Sbyte signed integral data types
            sbyte sb = 126;
            // sbyte is an 8-bit signed value
            Console.WriteLine(sb);
            sb++;
            Console.WriteLine(sb);
            // It overflows here because btye can hold values from - 128 to 127.
            sb++;
            Console.WriteLine(sb);
            // Looping back within the range.
            sb++;
            Console.WriteLine(sb);

        // Program to demonstrate the byte data type
            byte by = 0;
            // byte is an 8-bit unsigned value.
            Console.WriteLine(by);
            by++;
            Console.WriteLine(by);
            by = 254;
            // It over flowflows here because byte can hold values from 0 to 255.
            by++;
            Console.WriteLine(by);
            // Looping back within the range.
            by++;
            Console.WriteLine(by);

        // Reference Data Types
            string g = "Geeks";
            // Append in a
            g += "for";
            g = g + "Geeks";
            Console.WriteLine(g);
            // Declare object obj
            object obj;
            obj = 20;
            Console.WriteLine(obj);
            // To show type of object using GetType()
            Console.WriteLine(obj.GetType());

        // Compile Time Initialization
            // Compile Time Initialization of variable 'x' 
            // Assigning value 32 to x
            int x = 32;
            Console.WriteLine("Value of x is " + x);
            // Creating object to access the variable y
            Fundamentals gfg = new Fundamentals();
            // Printing the value
            Console.WriteLine("Value of y is " + gfg.y);

        // Run Time Inititalization
            // Value will be taken from user input and assigned to variable num
            int num = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Value of num is " + num);


    // C# Literals
        // Integer Literals
            int decima = 101;
            int hexadecimal = 0xFace;
            int binary = 0b101;

            Console.WriteLine("Decimal Literal: " + decima);
            Console.WriteLine("Hexadecimal Literal: " + hexadecimal);
            Console.WriteLine("Binary Literal: " + binary);

        // Floating-point Literals
            float floatLiteral = 12.5f;
            double doubleLiteral = 12.5;
            decimal decimalLiteral = 12.5m;
            Console.WriteLine("Float Literal: " + floatLiteral);
            Console.WriteLine("Double Literal: " + doubleLiteral);
            Console.WriteLine("Decimal Literal: " + decimalLiteral);

        // Character Literals
            char character = 'A';
            // Unicode representation
            char unicode = '\u0061';
            Console.WriteLine(character);
            Console.WriteLine(unicode);
            // Escape character literal
            Console.WriteLine("Hello\n\nGeeks\t!");

        // String Literals
            string str1 = "Hello, you filthy animals!";
            string str2 = @"Hello Geeks!";
            // If we assign without "", then it treats as a variable and causes compiler error
            Console.WriteLine(str1);
            Console.WriteLine(str2);

        // Boolean Literals
            bool isCSharpFun = true;
            bool isFishTasty = false;
            Console.WriteLine(isCSharpFun);
            Console.WriteLine(isFishTasty);

    // Operators in C#
        // Arithmetic Operators (Similar to Java)
            int add = 8, sub = 4;
            // Using different arithmetic operators
            Console.WriteLine("Addition: " + (add + sub));
            Console.WriteLine("Subtraction: " + (add - sub));
            Console.WriteLine("Multiplication: " + (add * sub));
            Console.WriteLine("Division: " + (add / sub));
            Console.WriteLine("Modulo: " + (add % sub));

        // Relational Operators (similar to Java)
            int p = 5, q = 10;
            // Compare using different relational operators
            Console.WriteLine(p == q);  // Equal to
            Console.WriteLine(p != q);  // Not equal to
            Console.WriteLine(p > q); // Greater than
            Console.WriteLine(p < q); // Less than
            Console.WriteLine(p >= q); // Greater than or equal to
            Console.WriteLine(p <= q); // Less than or equal to


        }
    }
}

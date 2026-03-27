using System;
using SimpleCalculator;
using Lab2_CalculatorEngine;
using System.Text;

namespace SimpleCalculator
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                
                Console.WriteLine("Welcome to Simple Calculator\nEnter your first number then press Enter:");
                double firstNumber = InputConverter.ConvertInputToNumeric(Console.ReadLine());

                Console.WriteLine("Enter your Second number then press Enter:");
                double secondNumber = InputConverter.ConvertInputToNumeric(Console.ReadLine());

                Console.WriteLine("Enter operation symbol like +, -, *, / or % then press Enter:");
                string operation = Console.ReadLine();

                double result = CalculatorEngine.Calculate(operation, firstNumber, secondNumber);

                StringBuilder sb = new StringBuilder();
                sb.AppendLine($"The value {firstNumber} {operation} {secondNumber} is equal to {result:F2}.");
                Console.WriteLine(sb.ToString());

            }
            catch (Exception ex)
            {
                // Normally, we'd log this error to a file.
                Console.WriteLine(ex.Message);
            }

        }
    }
}
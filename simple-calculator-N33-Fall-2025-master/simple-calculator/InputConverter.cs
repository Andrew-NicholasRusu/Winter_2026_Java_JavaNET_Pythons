using System;

namespace SimpleCalculator
{
    public class InputConverter
    {
        public static double ConvertInputToNumeric(string argTextInput)
        {
            return double.Parse(argTextInput);
            //return Convert.ToDouble(input);
        }
    }
}
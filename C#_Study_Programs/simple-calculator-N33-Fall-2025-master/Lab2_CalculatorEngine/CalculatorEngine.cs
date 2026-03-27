namespace Lab2_CalculatorEngine
{
    public class CalculatorEngine
        {
            public static double Calculate(string argOperation, double argFirstNumber, double argSecondNumber)
            {
                //You can use switch case also here for multiple operations or use if-else-if ladder
                double result = 0;

                if (argOperation == "+" || argOperation.ToLower() == "add")
                {
                    result = argFirstNumber + argSecondNumber;
                }

                else if (argOperation == "-" || argOperation.ToLower() == "subtract")
                {
                    result = argFirstNumber - argSecondNumber;
                }

                else if (argOperation == "*" || argOperation.ToLower() == "multiply")
                {
                    result = argFirstNumber * argSecondNumber;
                }

                else if (argOperation == "/" || argOperation.ToLower() == "divide")
                {
                    result = argFirstNumber / argSecondNumber;
                }
                else if (argOperation == "%" || argOperation.ToLower() == "modulus")
                {
                    result = argFirstNumber % argSecondNumber;
                }


                return result;
            }
        }
    }


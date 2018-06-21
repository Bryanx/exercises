using System;

namespace Calculator.CA
{
    public class Calculator
    {     
        public void Add(int number1, int number2)
        {
            int result = number1 + number2;
            Console.WriteLine("Result of {0} and {1}: (+) {2}", number1, number2, result);
        }

        public void Multiply(int baseNumber, int factor)
        {
            int result = baseNumber * factor;
            Console.WriteLine("Result of {0} and {1}: (*) {2}", baseNumber, factor, result);
        }   
    }
}

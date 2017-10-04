using System;

namespace CA {
    public class BasicCalculator {
        delegate double AddDel(double getal1, double getal2);

        public double Add(double getal1, double getal2) {
            return getal1 + getal2;
        }
        
        public double Subtract(double getal1, double getal2) {
            return getal1 - getal2;
        }
        
        public double Multiply(double getal1, double getal2) {
            return getal1 * getal2;
        }
        
        public double Divide(double getal1, double getal2) {
            if (getal2 == 0) return 0;
            return getal1 / getal2;
        }
        
        public static void ShowCalulcationResult(double number1, double number2, double result) {
            Console.WriteLine($"Calculation of {number1:F2} and {number2:F2} gives {result:F2}");
        }
    }
}
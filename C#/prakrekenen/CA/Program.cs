using System;
using System.Collections.Generic;

namespace CA {
    internal class Program {
        delegate double Del(double getal1, double getal2);

        public static void Main(string[] args) {
            double result = 1;
            while (result != 0) {
                Console.Write("=== Choose the type of calculation ===\n" +
                              "1) Add\n" +
                              "2) Subtract\n" +
                              "3) Multiply\n" +
                              "4) Divide\n" +
                              "5) Add and Subtract\n" +
                              "6) MultiplyRange\n" +
                              "0) Exit/quit\n" +
                              "Keuze: ");
                bool gelukt = Int32.TryParse(Console.ReadLine(), out int keuze);
                if (keuze > 6 || keuze < 0) Console.WriteLine("Foutieve invoer");
                if (gelukt) {
                    Random rand = new Random();
                    double getal1 = rand.NextDouble() * 10;
                    double getal2 = rand.NextDouble() * 10;
                    result = ExecuteCalculation(keuze, getal1, getal2);
                    Console.WriteLine($"Calculation of {getal1:F2} and {getal2:F2} gives {result:F2}");
                }
            }
        }

        public static double ExecuteCalculation(double keuze, double getal1, double getal2) {
            BasicCalculator bc = new BasicCalculator();
            
            // anonymous method delegate:
            Del add = delegate(double getal3, double getal4) { return getal3 + getal4; };
            // lambda delegate:
            Del subtract = (getal3, getal4) => getal3 - getal4;
            //Delegate with initialization
            Del multiply = bc.Multiply;
            //Traditional delegate
            Del divide = new Del(bc.Divide);
            
            switch (keuze) {
                case 1: return add(getal1, getal2);
                case 2: return subtract(getal1, getal2);
                case 3: return multiply(getal1, getal2);
                case 4: return divide(getal1, getal2);
                case 5: {
                    add += subtract;
                    return add(getal1, getal2);
                }
                case 6: return divide(getal1, getal2);
                    break;
                case 0: return 0;
            }
            return 0;
        }
    }
}
using System;
using System.Collections.Generic;

namespace CA {
    internal class Program {
        delegate int MyPower(int baseNumber);


        public static void Main(string[] args) {
            MyPower del = null;
            Console.Write("Tweedemacht (0) Vierdemacht (1): ");
            bool gelukt = Int32.TryParse(Console.ReadLine(), out int getal);

            if (getal == 0) del = TweedeMacht;
            else {
                del = VierdeMacht;
            }

            int result = del(4);
            Console.WriteLine("Het resultaat is: " + result);
        }

        public static int TweedeMacht(int basisGetal) {
            return basisGetal * basisGetal;
        }

        public static int VierdeMacht(int basisGetal) {
            return basisGetal * basisGetal * basisGetal * basisGetal;
        }

        public static void ProbeerEeens(int basisGetal) {
        }
    }
}
using System;

namespace CA1 {
    public class MathProgram {
        public static void Main(string[] args) {
            int value = 1;
            do {
                Console.WriteLine("======================");
                Console.WriteLine("= Wiskunde Programma =");
                Console.WriteLine("======================");
                Console.WriteLine("1) Faculteit berekenen");
                Console.WriteLine("2) Priemgetallen berekenen");
                Console.WriteLine("0) Programma verlaten");
                Console.WriteLine("=> Maak uw keuze:");
                bool gelukt = int.TryParse(Console.ReadLine(), out value);

                if (!gelukt) Console.WriteLine("!!! U heeft een niet-numerieke waarde ingegeven !!!");
                if (gelukt && value != 0) {
                    if (value != 1 && value != 2) {
                        Console.WriteLine("‘!!! U heeft een ongeldige keuze gemaakt !!!");
                    } else {
                        Console.WriteLine("Geef het laagste getal: ");
                        bool test1 = int.TryParse(Console.ReadLine(), out int onder);
                        Console.WriteLine("Geef het hoogste getal: ");
                        bool test2 = int.TryParse(Console.ReadLine(), out int boven);

                        if (!test1 || !test2 || boven < onder) {
                            Console.WriteLine("!!Ongeldige invoer!!");
                        } else {
                            if (value == 1) Faculteit(onder, boven);
                            if (value == 2) Priemgetallen(onder, boven);
                        }
                    }
                }
            } while (value != 0);
        }
           
        //zonder recursie
        private static void Priemgetallen2(int x1, int x2) {
            if (x1 == 0 || x1 == 1) x1 = 2;
            
            bool priem = true;
            for (int j = x1; j < x2; j++) {
                for (int i = x1; i < x2; i++) {
                    if (i!= j && j%i==0) priem = false;;
                }
                if (priem) Console.WriteLine(j + " is priem");
                priem = true;
            }
        }
        
        //met recursie
        private static void Priemgetallen(int x1, int x2) {
            if (x1 == 0 || x1 == 1) x1 = 2;
            
            bool priem = true;
            for (int i = 2; i < x1; i++) {
                if (i != x1 && x1 % i == 0) priem = false;
            }
            
            if (priem) Console.WriteLine(x1 + " is priem");

            if (x1 != x2) Priemgetallen(++x1,x2);
        }

        private static void Faculteit(int x1, int x2) {
            int fac = x1;
            for (int i = 1; i < x1; i++) {
                fac *= i;
            }
            Console.WriteLine(x1 + ": " + fac);

            if (x1 != x2) Faculteit(++x1, x2);
        }
    }
}
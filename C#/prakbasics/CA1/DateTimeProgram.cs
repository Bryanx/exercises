using System;
using static System.Console;

namespace CA1 {
    public class DateTimeProgram {
        public static void Main2(string[] args) {
            
            DateTime nu = DateTime.Now;
            
            WriteLine("Huidige tijd: {0:M/d/yyyy HH:mm}", nu);
            WriteLine("Wat is uw geboorte datum? (YYYY/MM/DD)");
            
            bool gelukt = DateTime.TryParse(ReadLine(), out DateTime gebdatum);
            
            if (gelukt) {
                TimeSpan leeftijd = nu - gebdatum;
                WriteLine("U bent {0:F} jaar oud.", leeftijd.Days / 365.0);
            } else {
                WriteLine("Input niet correct.");
            }
        }
    }
}
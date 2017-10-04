using System;
using System.Text.RegularExpressions;

namespace CA1 {
    public class StringProgram {
        public static void Main2(string[] args) {
            
            String fox = Console.ReadLine();

            Console.WriteLine(fox);

            Console.WriteLine("Aantal karakters: {0}", fox.Length);

            Console.WriteLine("Hoofdletters: {0}", fox.ToUpper());

            Console.WriteLine("Eerste letter: {0}", fox[0]);

            Console.WriteLine("43ste letter: {0}", fox[fox.Length-1]);

            Console.WriteLine("Helft: {0}", fox.Substring(0, fox.Length / 2));

            Console.WriteLine("Vervanging: {0}", fox.Replace('o', '_'));

            Console.WriteLine("Spatie-loos: {0}", fox.Replace(" ", String.Empty));

            Console.WriteLine("Klinker-loos: {0}", Regex.Replace(fox, @"a|e|o|u|i|y",""));
        }
    }
}
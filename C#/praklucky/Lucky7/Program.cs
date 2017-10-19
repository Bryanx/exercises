using System;
using System.Collections.Generic;

namespace Lucky7 {
    internal class Program {
        public static void Main(string[] args) {

            bool doorgaan = true;
            do {
                Lucky lucky = new Lucky();
                bool geraden = lucky.Try();
                Console.WriteLine(lucky.Gok1 + "\t" + lucky.Gok2 + "\t" + lucky.Gok3);
                if (geraden) {
                    Console.WriteLine("G E W O N N E N ! ! !");
                } else {
                    Console.WriteLine("VERLOREN :-(");
                }
                
                Console.WriteLine("Another Try (Y/N) ?");
                Char.TryParse(Console.ReadLine(), out char output);
                if (output == 'Y' || output == 'y') {
                    doorgaan = true;
                } else if (output == 'N' || output == 'n') {
                    doorgaan = false;
                }
            } while (doorgaan);
            Console.WriteLine("Bye");
        }
    }
}
using System;
using System.Collections.Generic;

namespace CA {
    internal class Program {
        public static void Main(string[] args) {
            // TextBook
            string text = "C# is one of the programming languages designed"
                          + " for the Common Language Infrastructure";
            INavigatable tb = new TextBook(ISBN.GetNewISBN(), "C# Language", "KdG", text);
            Console.WriteLine(tb.ToString());
            Console.WriteLine("Next: " + tb.Next());
            Console.WriteLine("Next: " + tb.Next());
            Console.WriteLine("Next: " + tb.Next());
            Console.WriteLine("Prev: " + tb.Previous());
            Console.WriteLine("Next: " + tb.Next());
            Console.WriteLine("Next: " + tb.Next());
            Console.WriteLine("Next: " + tb.Next());
            Console.WriteLine();
           
        }
    }
}
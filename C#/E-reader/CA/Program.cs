using System;
using System.Collections;
using System.Collections.Generic;
using CA.Extensions;

namespace CA {
    internal class Program {
        public static void Main(string[] args) {
        
            
            
            
            // TextBook
            char[] images = { 'A', 'B', 'C', 'D' };
            ImageBook ib = new ImageBook(ISBN.GetNewISBN(), "Some Images", "KdG", images);
            IReader ibr = new BookReader(ib);
            Console.WriteLine("Reading book: {0}", ib.ToString());
            Console.WriteLine(ibr.Next());
            Console.WriteLine(ibr.Next());
            Console.WriteLine(ibr.Next());
            Console.WriteLine(ibr.Previous());
            Console.WriteLine(ibr.Next());
            Console.WriteLine(ibr.Next());
            Console.WriteLine(ibr.Next());
            
            Console.WriteLine();
            
            //Extensions methods:
            Console.WriteLine(ib.ToCsv());
            
        }
    }
}
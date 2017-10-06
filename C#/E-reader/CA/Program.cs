using System;
using System.Collections;
using System.Collections.Generic;
using CA.Extensions;

namespace CA {
    internal class Program {
        public static void Main(string[] args) {
            
            
            List<string> list = new List<string>();
            list.Add("Item 1");
            
            Stack<int> stack = new Stack<int>();
            stack.Push(5);
            
            Queue<double> queue = new Queue<double>();
            queue.Enqueue(5.6);

            List<string> list2 = new List<string>() { "item 1", "item 2" };
            
            foreach (string item in list) {
                if (item.ToUpper().Contains("E")) 
                    Console.WriteLine(item);
                if (item.Substring(0,3) == "ite")
                    Console.WriteLine(item);
            }
            
            
            
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
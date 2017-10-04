using System;
using System.Collections.Generic;

namespace CA.Struct {
        internal class Program {
            public static void Main2(string[] args) {
                // (3) (Default) Contructor
                // + object initializer (C# 3.0)
                string title = "C# Language";
                string author = "KdG";
                string text = "C# is one of the programming languages designed"
                              + " for the Common Language Infrastructure";
                Book b1 = new Book("2017-0001", title, author, text);
                Console.WriteLine(b1.GetInfo());
                Console.WriteLine(b1.Content);
    
                Console.WriteLine();
        
                // TRY-PARSE
                string isbn2String = "2017-0002";
                ISBN isbn2 = null;
                Book b2 = null;
                if (ISBN.TryParse(isbn2String, out isbn2))
                    b2 = new Book("2017-0001", "Title2", "Author2", "Content2");
                if (b2 != null) {
                    Console.WriteLine(b2.GetInfo());
                    Console.WriteLine(b2.Content);
                }
            }
    }
}
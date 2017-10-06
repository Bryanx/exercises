using System;
using Microsoft.SqlServer.Server;

namespace CA.Extensions {
    
    public static class ExtensionMethods {
        
        internal static string ToCsv(this Book book) {
            return String.Format("{0};{1};{2};{3}",
                book.ISBN, book.Title, book.Author, book.Format);
        }
    }
}
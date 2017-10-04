using System;

namespace CA.Struct {
    public class Book {

        #region properties
        // field (private field for ISBN-property)

        // property: long notation (code-snippet 'propfull', creates also a private field)
        public ISBNStruct ISBN { get; private set; }
        
        // property: short notation (auto-properties: code-snippet 'prop')
        // compiler will generate private anonymous (backing) field!
        public string Title { get; private set; }

        public string Author { get; private set; }
        public string Content { get; private set; }
        public BookFormat Format { get; private set; }
        #endregion
        
        public Book(ISBNStruct isbn, string title, string author, string content, 
            BookFormat format = BookFormat.TXT) {
            this.ISBN = isbn;
            Title = title;
            Author = author;
            Content = content;
            Format = format;
        }
        
        public string GetInfo()
        {
            return String.Format("Book: '{0}', by {1} ({2}, {3})", Title, Author, ISBN, Format);
        }
    }
}
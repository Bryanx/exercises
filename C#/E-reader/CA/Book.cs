using System;

namespace CA {
    public abstract class Book : INavigatable {
        #region properties

        // field (private field for ISBN-property)

        // property: long notation (code-snippet 'propfull', creates also a private field)
        public ISBN ISBN { get; private set; }

        // property: short notation (auto-properties: code-snippet 'prop')
        // compiler will generate private anonymous (backing) field!
        public string Title { get; private set; }

        public string Author { get; private set; }
        public BookFormat Format { get; private set; }

        #endregion

        public Book(ISBN isbn, string title, string author,
            BookFormat format = BookFormat.TXT) {
            this.ISBN = isbn;
            Title = title;
            Author = author;
            Format = format;
        }

        public abstract string GetInfo();

        public sealed override string ToString() {
            return String.Format("Book: '{0}', by {1} ({2}, {3})", Title, Author, ISBN, Format);
        }

        public abstract object Previous();

        public abstract object Next();
    }
}
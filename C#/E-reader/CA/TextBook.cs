using System;

namespace CA {
    public class TextBook : Book {
        private int currentPage = 0;
        private ushort pageSize = 35;
        public string Content { get; private set; }

        public TextBook(ISBN isbn, string title, string author, string content)
            : base(isbn, title, author, BookFormat.TXT) {
            Content = content;
        }

        public override string GetInfo() {
            return $"TextBook: '{Title}', by {Author} ({Content.Length} chars)";
        }
       
    }
}
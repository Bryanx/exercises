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

        public override object Previous() {
            if (currentPage > 1) currentPage--;
            else currentPage = 1;
            return GetPage(currentPage);
        }

        public override object Next() {
            double numberOfPages = Math.Ceiling((double) Content.Length / pageSize);
            if ((double) currentPage < numberOfPages) currentPage++;
            else currentPage = 1;
            return GetPage(currentPage);
        }

        private string GetPage(int pageNumber) {
            int remainingTextSize = Content.Length - (pageSize * (pageNumber - 1));
            if (remainingTextSize < 0) remainingTextSize = 0;
            return Content.Substring((pageNumber - 1) * pageSize, Math.Min(pageSize, remainingTextSize));
        }
    }
}
using System;
using System.Data.SqlTypes;

namespace CA {
    public class TextBookReader : IReader {
        private TextBook textBook = null;
        private int currentPage = 0;
        private ushort pageSize = 35;

        public TextBookReader(TextBook textBook) {
            this.textBook = textBook;
        }

        public object Previous() {
            if (currentPage > 1) currentPage--;
            else currentPage = 1;
            return GetPage(currentPage);
        }

        public object Next() {
            double numberOfPages = Math.Ceiling((double) textBook.Content.Length / pageSize);
            if ((double) currentPage < numberOfPages) currentPage++;
            else currentPage = 1;
            return GetPage(currentPage);
        }

        private string GetPage(int pageNumber) {
            int remainingTextSize = textBook.Content.Length - (pageSize * (pageNumber - 1));
            if (remainingTextSize < 0) remainingTextSize = 0;
            return textBook.Content.Substring((pageNumber - 1) * pageSize, Math.Min(pageSize, remainingTextSize));
        }
    }
}
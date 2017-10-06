using System;
using System.Collections.Generic;
using System.Linq;

namespace CA {
    public class ImageBook : Book {
        private int currentPosition = 0;
        public IEnumerable<char> Images { get; private set; }

        public ImageBook(ISBN isbn, string title, string author, IEnumerable<char> images,
            BookFormat format = BookFormat.TXT) : base(isbn, title, author, BookFormat.CBR) {
            Images = images;
        }

        // 'new' <> 'override'? | 'sealed'?

        public override string GetInfo() {
            return $"ImageBook: '{Title}', by {Author} ({Images.Count()} pics)";
        }
    }
}
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

        public override object Previous() {
            if (currentPosition > 1 && currentPosition <= Images.Count()) currentPosition--;
            else currentPosition = 1;
            return GetImage(currentPosition);
        }


        public override object Next() {
            if (currentPosition > 0 && currentPosition < Images.Count()) currentPosition = 1;
            else currentPosition++;
            return GetImage(currentPosition);
        }

        private object GetImage(int imagePosition) {
            return Images.ElementAt(imagePosition - 1);
        }
    }
}
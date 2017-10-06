using System.Linq;

namespace CA {
    public class ImageBookReader : IReader {
        private ImageBook imageBook = null;
        private int currentPosition = 0;

        public ImageBookReader(ImageBook imageBook) {
            this.imageBook = imageBook;
        }

        public object Previous() {
            if (currentPosition > 1 && currentPosition <= imageBook.Images.Count()) currentPosition--;
            else currentPosition = 1;
            return GetImage(currentPosition);
        }


        public object Next() {
            if (currentPosition > 0 && currentPosition < imageBook.Images.Count()) currentPosition = 1;
            else currentPosition++;
            return GetImage(currentPosition);
        }

        private object GetImage(int imagePosition) {
            return imageBook.Images.ElementAt(imagePosition - 1);
        }
    }
}
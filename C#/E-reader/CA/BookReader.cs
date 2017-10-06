using System;

namespace CA {
    public class BookReader : IReader {
        private delegate object Navigate();
        private Navigate previousNavHandler;
        private Navigate nextNavHandler;
        public BookReader(Book bookToRead)
        {
            this.LoadBook(bookToRead);
        }
        public object Previous()
        {
            return previousNavHandler();
        }
        public object Next()
        {
            return nextNavHandler();
        }
        
        private void LoadBook(Book bookToRead)
        {
            IReader reader = null;
            TextBook textBook = bookToRead as TextBook;
            if (textBook != null)
                reader = new TextBookReader(textBook);
            else
            {
                ImageBook imageBook = bookToRead as ImageBook;
                if (imageBook != null)
                    reader = new ImageBookReader(imageBook);
            }
            if (reader != null)
            {
                previousNavHandler = reader.Previous;
                nextNavHandler = reader.Next;
            }
            else throw new InvalidCastException("Unable to load the book!");
// Variabele 'reader' gaat out of scope, maar het verwezen object zal niet door de garbage-collector
// opgeruimd worden vermits er nog function-pointers zijn naar de Previous- en Next-methode!
        }
    }
}
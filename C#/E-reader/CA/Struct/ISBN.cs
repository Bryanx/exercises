using System;

namespace CA.Struct {
    public sealed class ISBN {
        private readonly int year;
        private readonly int number;

        public ISBN(int year, int number) {
            this.year = year;
            this.number = number;
        }


        public override string ToString() {
            return String.Format("{0:d4}-{1:d4}", year, number);
        }

        public static ISBN Parse(string isbnString) {
            if (System.Text.RegularExpressions.Regex.IsMatch(isbnString, @"^\d{4}-\d{4}$")) {
                int year = Int32.Parse(isbnString.Substring(0, 4));
                int number = Int32.Parse(isbnString.Substring(5, 4));
                return new ISBN(year, number);
            } else
                throw new FormatException("Invalid ISBN-format!");
        }

        public static bool TryParse(string isbnString, out ISBN isbn) {
            bool isMatch = System.Text.RegularExpressions.Regex.IsMatch(isbnString, @"^\d{4}-\d{4}$");
            if (isMatch) {
                int year;
                bool yearOk = Int32.TryParse(isbnString.Substring(0, 4), out year);
                int number;
                bool numberOk = Int32.TryParse(isbnString.Substring(5, 4), out number);
                isbn = new ISBN(year, number);
            } else
                isbn = null;
            //throw new FormatException("Invalid ISBN-format!"); //Niet nodig bij TryParse!
            return isMatch;
        }
    }
}
using System;
using System.Text.RegularExpressions;

namespace CA.Struct {
    public struct ISBNStruct {
        private readonly int year;
        private readonly int number;

        private ISBNStruct(int year, int number) {
            this.year = year;
            this.number = number;
        }

        public override string ToString() {
            return String.Format("{0:d4}-{1:d4}", year, number);
        }

        public static implicit operator ISBNStruct(string isbnString) {
            bool isMatch = Regex.IsMatch(isbnString, @"^\d{4}-\d{4}$");
            if (isMatch) {
                int year;
                bool yearOk = Int32.TryParse(isbnString.Substring(0, 4), out year);
                int number;
                bool numberOk = Int32.TryParse(isbnString.Substring(5, 4), out number);
                return new ISBNStruct(year, number);
            } else
                throw new InvalidCastException("Invalid ISBN-format!");
        }

        // eg: string isbnString = isbnStruct;
        public static implicit operator string(ISBNStruct isbn) {
            return isbn.ToString();
        }
    }
}
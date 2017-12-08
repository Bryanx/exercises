using System;
using IM.Domain;

namespace IM.UI.CA.ExtensionMethods {
    internal static class ExtensionMethods {
        internal static string Summary(this Person p) {
            return String.Format("({0}) {1} ({2})", p.PersonNumber, p.Name, p.BirthDate);
        }
        
        internal static string Summary(this Immo eigendom) {
            return String.Format("({0}) {1} @ {2} BR:{3} {4} > {5} {6}",
                eigendom.Id,
                eigendom.Type,
                eigendom.Zipcode,
                eigendom.NumberOfBedrooms,
                eigendom.Garage ? "G" : "",
                eigendom.Price == null ? "?" : eigendom.Price + "",
                eigendom.Sold ? "(S)" : "");
        }

        internal static string Details(this Immo eigendom) {
            return String.Format("Immo nr: {0}\n" +
                                 "Type: {1}\n" +
                                 "Zipcode: {2}\n" +
                                 "Number of bedrooms: {3}\n" +
                                 "Garage: {4}\n" +
                                 "Price: {5}\n" +
                                 "Sold: {6}\n" +
                                 "Owner: {7}",
                eigendom.Id,
                eigendom.Type,
                eigendom.Zipcode,
                eigendom.NumberOfBedrooms,
                eigendom.Garage ? "YES" : "NO",
                eigendom.Price == null ? "0" : eigendom.Price + "",
                eigendom.Sold ? "YES" : "NO",
                eigendom.Eigenaar.Name);
        }
    }
}
using System;
using System.Data.Entity;
using HK.BL.Domain;

namespace HK.DAL {
    
    internal class HotelDbInitializer : DropCreateDatabaseAlways<HotelDbContext> {
        
        protected override void Seed(HotelDbContext context) {
            Hotel h1 = new Hotel() {
                Type = HotelType.Hotel,
                Name = "Radison",
                Capacity = 150,
                Country = "BE",
                Price = 564.14,
//                FoundingDate = new DateTime(2015, 12, 1),
                ZipCode = "2000",
                HasRestaurant = true
            };
            context.Hotels.Add(h1);
            context.SaveChanges();


            Hotel h2 = new Hotel() {
                Type = HotelType.ParkFly,
                Name = "Accor",
                Capacity = 250,
                Country = "be",
                Price = 60.10,
//                FoundingDate = new DateTime(1999, 12, 11),
                ZipCode = "2000"
            };
            context.Hotels.Add(h2);

            Hotel h3 = new Hotel() {
                Type = HotelType.ParkFly,
                Name = "Charion Shiphol",
                Capacity = 250,
                Country = "nl",
                Price = 49.99,
//                FoundingDate = new DateTime(2015, 06, 16),
                ZipCode = "NL-1000",
                HasRestaurant = true
            };
            context.Hotels.Add(h3);

            Hotel h4 = new Hotel() {
                Type = HotelType.ParkFly,
                Name = "Sandman",
                ZipCode = "NL-2000",
                HasRestaurant = false
            };
            context.Hotels.Add(h4);

            context.SaveChanges();
        }
    }
}
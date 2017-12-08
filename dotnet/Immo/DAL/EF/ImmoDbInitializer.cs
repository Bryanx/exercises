using System.Data.Entity;
using IM.Domain;

namespace IM.DAL.EF {
    public class ImmoDbInitializer : DropCreateDatabaseIfModelChanges<ImmoDbContext> {
        protected override void Seed(ImmoDbContext ctx) {
            Immo i1 = new Immo() {
                Id = 1,
                Type = ImmoType.House,
                Zipcode = 2000,
                NumberOfBedrooms = 3,
                Garage = true,
                Price = 355000,
                Sold = false,
            };
            Immo i2 = new Immo() {
                Id = 2,
                Type = ImmoType.Apartment,
                NumberOfBedrooms = 1,
                Zipcode = 2600,
                Garage = false,
                Sold = false,
            };
            Immo i3 = new Immo() {
                Id = 3,
                Type = ImmoType.Apartment,
                Zipcode = 2020,
                NumberOfBedrooms = 1,
                Garage = true,
                Price = 185000,
                Sold = false,
            };
            Immo i4 = new Immo() {
                Id = 4,
                Type = ImmoType.House,
                Zipcode = 2100,
                NumberOfBedrooms = 2,
                Garage = true,
                Price = 235000,
                Sold = true,
            };
            Immo i5 = new Immo() {
                Id = 5,
                Type = ImmoType.House,
                Zipcode = 2600,
                NumberOfBedrooms = 2,
                Garage = true,
                Price = 305000,
                Sold = false,
            };
            Immo i6 = new Immo() {
                Id = 6,
                Type = ImmoType.Residential,
                Zipcode = 2100,
                NumberOfBedrooms = 0,
                Garage = false,
                Price = 160000,
                Sold = true,
            };
            Person p1 = new Person() {
                PersonNumber = 1,
                Name = "Stefanie Vermeers",
                Email = "stefanie@vermeers.be"
            };
            Person p2 = new Person() {
                PersonNumber = 2,
                Name = "Coen Boemans",
                Email = "coen@boemans.be"
            };
            Person p3 = new Person() {
                PersonNumber = 3,
                Name = "Philip De Rijcker",
                Email = "philip@derijcker.be"
            };
            Person p4 = new Person() {
                PersonNumber = 4,
                Name = "Anna Maes",
                Email = "anna@maes.be"
            };
            i1.Eigenaar = p3;
            i2.Eigenaar = p1;
            i3.Eigenaar = p3;
            i4.Eigenaar = p4;
            i5.Eigenaar = p1;
            i6.Eigenaar = p2;
            ctx.Persons.Add(p1);
            ctx.Persons.Add(p2);
            ctx.Persons.Add(p3);
            ctx.Persons.Add(p4);
            ctx.Immos.Add(i1);
            ctx.Immos.Add(i2);
            ctx.Immos.Add(i3);
            ctx.Immos.Add(i4);
            ctx.Immos.Add(i5);
            ctx.Immos.Add(i6);
            ctx.SaveChanges();
        }
    }
}
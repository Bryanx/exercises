using System;
using System.Collections.Generic;
using System.Linq;
using HK.BL.Domain;

namespace HK.DAL {
    public class Repository : IRepository {
        private HotelDbContext dbcontext;

        public Repository() {
            dbcontext = new HotelDbContext();
#if DEBUG
            dbcontext.Database.Log += msg => System.Diagnostics.Debug.WriteLine(msg);
#endif
        }

        public IEnumerable<Hotel> ReadAllHotels() {
            return dbcontext.Hotels;
        }

        public int CountAllHotels() {
            return dbcontext.Hotels.Count();
        }

        public Hotel ReadHotel(int id) {
            return dbcontext.Hotels.Find(id);
        }

        public Hotel ReadHotel(string name) {
            if (!String.IsNullOrEmpty(name)) {
                return dbcontext.Hotels.SingleOrDefault(h => h.Name.ToUpper().Equals(name.ToUpper()));
            }
            return null;
        }

        public Hotel ReadHotelWithMaxCapacity() {
            dbcontext.Hotels.OrderByDescending(h => h.Capacity);
            return dbcontext.Hotels.FirstOrDefault();
        }

        public IEnumerable<Hotel> ReadHotelsWithResto() {
            return dbcontext.Hotels.Where(h => h.HasRestaurant);
        }

        public IEnumerable<Hotel> ReadHotelsOfZipCode(string zipCode) {
            return dbcontext.Hotels.Where(h => h.ZipCode.ToUpper().Equals(zipCode.ToUpper()));
        }

        public IEnumerable<Hotel> ReadHotelsOfType(HotelType type) {
            return dbcontext.Hotels.Where(h => h.Type == type);
        }

        public IEnumerable<Hotel> ReadHotelsOfAYear(int year) {
            throw new NotImplementedException();
        }

        public IEnumerable<Hotel> ReadHotelsWithLetterOrWord(string text) {
            
            return dbcontext.Hotels.Where(h => h.Name.Contains(text));
            
            
        }

        public void CreateHotel(Hotel hotelToInsert) {
            dbcontext.Hotels.Add(hotelToInsert);
            dbcontext.SaveChanges();
        }

        public void UpdateHotel(int hotelId, double nieuwePrijs) {
            Hotel hotel = ReadHotel(hotelId);
            if (hotel != null) {
                hotel.Price = nieuwePrijs;
                dbcontext.SaveChanges();
            }
        }

        public void DeleteHotel(Hotel hotelToDelete) {
            if (ReadHotel(hotelToDelete.HotelId) != null) {
                dbcontext.Hotels.Remove(hotelToDelete);
                dbcontext.SaveChanges();
            }
        }
    }
}
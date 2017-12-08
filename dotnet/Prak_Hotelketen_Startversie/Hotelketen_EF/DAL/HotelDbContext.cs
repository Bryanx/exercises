

using System.Data.Entity;
using HK.BL.Domain;

namespace HK.DAL {
    public class HotelDbContext : DbContext {
        
        public HotelDbContext() : base("myHotel-EF") {
            Database.SetInitializer(new HotelDbInitializer());
        }
        public DbSet<Hotel> Hotels { get; set; }
    }
}

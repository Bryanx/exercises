using System.Data.Entity;
using IM.Domain;

namespace IM.DAL.EF {
    public class ImmoDbContext : DbContext {
        public DbSet<Immo> Immos { get; set; }
        public DbSet<Person> Persons { get; set; }
        public bool Lazyloading { get; set; }
        
        public ImmoDbContext() : base("myImmo") {
            Database.SetInitializer(new ImmoDbInitializer());
            Configuration.LazyLoadingEnabled = false;
            Lazyloading = Configuration.LazyLoadingEnabled;
        }
    }
}
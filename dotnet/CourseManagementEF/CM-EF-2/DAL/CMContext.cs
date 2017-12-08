using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity;
using System.Data.Entity.Infrastructure.Annotations;
using CM_EF.Models;

namespace CM_EF.DAL {
    public class CMContext : DbContext {
        public DbSet<Course> Courses { get; set; }
        public DbSet<Teacher> Teachers { get; set; }
        public DbSet<Person> AllPeople { get; set; }

        public CMContext() : base("myCM-EF") {
            Database.SetInitializer(new CMInitializer());
            this.Configuration.LazyLoadingEnabled = false;
            this.Configuration.ProxyCreationEnabled = false;
        }

        protected override void OnModelCreating(DbModelBuilder modelBuilder) {
            //'Course': de achterliggende tabel moet ‘tblCourses’ noemen 
            //'Course.Number' is de PK (meerdere annotaties tgl. toewijzen kan ook!) 
            //'Course.Name' moet in de databank geïndexeerd worden 
            //'Course.FullName' mag niet gemapped worden 
            modelBuilder.Entity<Course>()
                .ToTable("tblCourses")
                .HasKey(c => c.Number)
                .Ignore(c => c.FullName)
                .Property(c => c.Name).HasColumnAnnotation("Index", new IndexAnnotation(new IndexAttribute()));
            //'Course.Room' is een complex-type 
            modelBuilder.ComplexType<Room>();
            //’Course.TheTeachersId’ is de FK-property voor navigationproperty ‘Teacher' 
            //We moeten hiervoor de hele relatie definiëren in beide richtingen 
            //We gaan ook expliciet de cascade delete afzetten 
            modelBuilder.Entity<Course>()
                .HasOptional(c => c.Teacher) 
                .WithMany(t => t.Courses) 
                .HasForeignKey(c => c.TheTeacherId)
                .WillCascadeOnDelete(false);
        }
    }
}
using System.Collections.Generic;
using System.Data.Entity;
using CM_EF.Models;

namespace CM_EF.DAL {
    public class CMInitializer : DropCreateDatabaseAlways<CMContext> {
        protected override void Seed(CMContext context) {
            Course c1 = new Course {
                CourseType = CourseType.Online,
                LaptopRequired = true,
                MaximumParticipants = 150,
                Name = "Programming in Java",
                Price = 564.14,
//                StartDate = new DateTime(2016, 1, 10),
                Teacher = new Teacher() {Firstname = "Johan", Lastname = "Ven"},
                ClassRoom = new Room() { Number = "GR-100", Seats = 40 }
            };
            Teacher t1 = new Teacher {
                Id = 1,
                Firstname = "Johan",
                Lastname = "Ven"
            };
            c1.Teacher = t1;

            Course c2 = new Course {
                CourseType = CourseType.OnCampus,
                LaptopRequired = true,
                MaximumParticipants = 40,
                Name = "Programming in .NET",
                Price = 225.50,
//                StartDate = new DateTime(2016, 1, 10),
                Teacher = new Teacher() {Firstname = "Kenneth", Lastname = "De Keulenaer"},
                ClassRoom = new Room() {Number ="GR403", Seats = 50}
            };
            Teacher t2 = new Teacher {
                Id = 2,
                Firstname = "Kenneth",
                Lastname = "De Keulenaer"
            };
            c2.Teacher = t2;

            Course c3 = new Course {
                CourseType = CourseType.OnCampus,
                LaptopRequired = false,
                MaximumParticipants = 25,
                Name = "Web Design 1",
                Price = 120.48,
//                StartDate = new DateTime(2014, 11, 10),
                Teacher = null,
                ClassRoom = new Room() { Number = "GR305", Seats = 40 }
            };

            Student s1 = new Student() {
                Firstname = "Stro",
                Lastname = "Mae",
                Number = 123
            };

            Student s2 = new Student() {
                Firstname = "Bill",
                Lastname = "Gates"
            };

            c1.Participants = new List<Student>() {s1, s2};
            c2.Participants = new List<Student>() {s1};

            context.AllPeople.Add(s1);
            
            context.AllPeople.Add(s2);
            context.Teachers.Add(t1);

            context.Teachers.Add(t2);
            context.Courses.Add(c1);
            context.Courses.Add(c2);
            context.Courses.Add(c3);
            context.SaveChanges();
        }
    }
}
using System;
using System.Collections.Generic;
using System.Linq;
using CM_EF.DAL;
using CM_EF.Models;
using System.Data.Entity;

namespace CM_EF_2 {
    internal class Program {
        private static CMContext context = new CMContext();

        public static void Main(string[] args) {
            ShowCoursesEagerLoading();
            Console.WriteLine("Done!");
        }

        private static void ShowCoursesWithRoom() {
            foreach (var item in context.Courses.AsEnumerable<Course>()) {
                System.Console.WriteLine("{0} in room {1}", item.Name, item.ClassRoom.Number);
            }
        }

        private static void ChangeTeacherFromCourse() {
            var javaCourse = context.Courses.Include(c => c.Teacher).Single(c => c.Name.Contains("Java"));
            string teacherName = javaCourse.Teacher.Name;
            javaCourse.Teacher = null;
            context.SaveChanges();
            Console.WriteLine("Bestaat teacher '{0}' nog in je DB?", teacherName);
            Console.ReadLine();
            javaCourse.Teacher = new Teacher() {Lastname = "Burssens", Firstname = "Dominique"};
            context.SaveChanges();
        }

        private static void ChangeParticipantsFromCourse() {
            Course firstCourse = context.Courses.Include(c => c.Participants)
                .First(c => c.Participants.Count > 0);
            Student s1 = firstCourse.Participants.First();
            firstCourse.Participants.Remove(s1);
            context.SaveChanges();
            Console.WriteLine("Bestaat student {0} nog in je DB?", s1.Number);
            Console.ReadLine();
            firstCourse.Participants.Add(s1);
            firstCourse.Participants.Add(new Student() {
                Firstname = "Joske",
                Lastname = "Vermeulen",
                Number = 9
            });
            context.SaveChanges();
        }

        private static void ShowAllPeople() {
            var allPeople = context.AllPeople.ToList();
            allPeople.ForEach(p => Console.WriteLine($"{p.Name} is a {p.GetType().Name}"));
        }

        private static void ShowTeachersWithTheirCoursesExplicitLoading() {
            IEnumerable<Teacher> allTeachers = context.Teachers.AsEnumerable();
            foreach (var teacher in allTeachers.ToList()) {
                context.Entry(teacher).Collection(t => t.Courses).Load();
                printen(teacher);
            }
        }

        private static void ShowTeachersWithTheirCoursesEagerLoading() {
            IEnumerable<Teacher> allTeachers = context.Teachers.Include(t => t.Courses).AsEnumerable();
            foreach (var teacher in allTeachers) printen(teacher);
        }

        private static void printen(Teacher teacher) {
            Console.WriteLine($"{teacher.Name}: ");
            foreach (var course in teacher.Courses) Console.WriteLine("-{0}", course.Name);
        }

        private static void ShowTeachersWithTheirCoursesLazyLoading() {
            IEnumerable<Teacher> teachers = context.Teachers.AsEnumerable();
            teachers.ToList().ForEach(t => printen(t));
        }

        private static void ShowCoursesExplicitLoading() {
            IEnumerable<Course> allCourses = context.Courses.AsEnumerable();
            foreach (var course in allCourses.ToList()) {
                //ToList!
                context.Entry(course).Reference(c => c.Teacher).Load();
                Console.WriteLine("{0} by {1}", course.Name,
                    course.Teacher == null ? "?" : course.Teacher.Name);
            }
        }

        private static void ShowCoursesEagerLoading() {
            IEnumerable<Course> allCourses = context.Courses.Include(c => c.Teacher).AsEnumerable();
            foreach (var course in allCourses) {
                Console.WriteLine("{0} by {1}", course.Name,
                    course.Teacher == null ? "?" : course.Teacher.Name);
            }
        }

        private static void ShowCourses() {
            IEnumerable<Course> allCourses = context.Courses.AsEnumerable();
            foreach (var course in allCourses) {
                Console.WriteLine("{0} by {1}", course.Name,
                    course.Teacher == null ? "?" : course.Teacher.Name);
            }
        }
    }
}
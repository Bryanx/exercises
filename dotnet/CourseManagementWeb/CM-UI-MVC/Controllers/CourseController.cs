using System;
using System.Collections.Generic;
using System.Web.Mvc;
using CM_UI_MVC.Models;
using CM_UI_MVC.Models.ViewModels;

namespace CM_UI_MVC.Controllers {
    public class CourseController : Controller {
        public ActionResult SubscriptionConfirmation(Subscription subscription) {
            var vm = new SubscriptionConfirmationViewModel();
            vm.StudentName = subscription.Student;
            vm.SubscriptionDate = subscription.SubscriptionDate;
            vm.CourseName = GetCourses().Find(c => c.CourseId == subscription.CourseId).Name;
            return View(vm);
        }
        
        private List<Course> GetCourses() {
            var allCourses = new List<Course>();
            allCourses.Add(new Course() {CourseId = 1, Name = ".NET"});
            allCourses.Add(new Course() {CourseId = 2, Name = "Java"});
            allCourses.Add(new Course() {CourseId = 3, Name = "Python"});
            return allCourses;
        }

        [HttpPost]
        public ActionResult Subscribe(Subscription subscription) {
            return RedirectToAction("SubscriptionConfirmation", subscription);
        }

        [HttpGet]
        public ActionResult Subscribe() {
            var vm = new SubscribeViewModel();
            vm.Courses = GetCourses();
            vm.Subscription = new Subscription() {SubscriptionDate = DateTime.Now};
            return View(vm);
        }

        // GET
        public ActionResult UseViewBag() {
            Course c = new Course {
                CourseId = 1,
                Date = DateTime.Now,
                Price = 231,
                MaxParticipants = 222,
                Name = "Professional Web Development"
            };
            ViewBag.MyCourse = c;
            return View();
        }

        public ActionResult UseModel() {
            Course c = new Course() {
                CourseId = 1,
                Date = DateTime.Now,
                Price = 231,
                MaxParticipants = 100,
                Name = "Web dev"
            };
            return View(c);
        }

        [HttpPost]
        public string UseModel(Course c) {
            if (ModelState.IsValid)
                return "Ok";
            System.Text.StringBuilder sb = new System.Text.StringBuilder();
            foreach (ModelState state in ModelState.Values) {
                foreach (ModelError error in state.Errors) {
                    sb.AppendLine("- " + error.ErrorMessage);
                }
            }
            return sb.ToString();
        }
    }
}
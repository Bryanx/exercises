using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Web.Mvc.Ajax;

namespace CM_UI_MVC.Controllers {
    public class HomeController : Controller {
        public ActionResult Index() {
            return View();
        }

        public ActionResult About() {
            ViewBag.Message = "Your application description page.";

            return View();
        }

        public ActionResult Contact() {
            ViewBag.Message = "Your contact page.";

            return View();
        }

        public string ReceiveAndReturn() {
            return "I'm back!";
        }

        public string ReceiveAndReturnValue(string name) {
            return name + "<br/>Welcome back!";
        }

        public string ReceiveAndReturnTwoValues(string name, int number) {
            return String.Format("{0}<br/>{1} ({2})", name, "I'm back!", number);
        }
    }
}
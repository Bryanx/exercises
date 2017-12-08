using System;
using System.Web.Mvc;

namespace CM_UI_MVC.Controllers {
    public class DemoController : Controller {

        private int nbrOfCalls = 0;

        public int DoCall() {
            if (HttpContext.Session["nbrOfCalls"] == null)
                HttpContext.Session.Add("nbrOfCalls", 1);
            else {
                int nbrOfCalls = (int) HttpContext.Session["nbrOfCalls"];
                HttpContext.Session["nbrOfCalls"] = ++nbrOfCalls;
            }
            return (int) HttpContext.Session["nbrOfCalls"];
        }
        
        public string RouteWithParameters(string name, int? number) {
            return String.Format("{0}<br/>{1} ({2})",
                name,
                "I'm back!",
                number);
        }

        public string RouteWithObject(Models.Demo demo) {
            return String.Format("{0}<br/>{1} ({2})",
                demo.Name,
                "I'm back!",
                demo.Number);
        }

        public int RouteWithId(int id) {
            return id;
        }

        public Models.Demo ReturnObject(Models.Demo demo) {
            return demo;
        }

        public ActionResult ReturnJSON() {
            Models.Demo demo = new Models.Demo()
                {Name = "JSON Demo", Number = 753};
            return base.Json(demo, JsonRequestBehavior.AllowGet);
        }

        public ActionResult DoRedirect() {
            return RedirectToAction("RouteWithParameters"
                , "Demo"
                , new {
                    name = "Redirect demo",
                    number = 10
                });
        }
    }
}
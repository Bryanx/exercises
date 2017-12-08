using System;
using System.Web.Mvc;

namespace CM_UI_MVC.Controllers {
    public class DemoViewController : Controller {
        
        // GET
        public ActionResult Index() {
            return View();
        }
                
        [HttpPost]
        public ActionResult index(string name, int nbr) {
            return RedirectToAction("RouteWithParameters",
                "Demo",
                new {name = name, number = nbr});
        }
        
        [HttpPost]
        public ActionResult index(Models.Customer c) {
            return RedirectToAction("RouteWithParameters",
                "Demo",
                new {name = c.nameCustomer, number = c.Nbr});
        }
        
        [HttpPost]
        public ActionResult index(FormCollection form) {
            string name = form["nameCustomer"];
            int  nbr = Int32.Parse(form["nbr"]);
            return RedirectToAction("RouteWithParameters",
                "Demo",
                new {name = name, number = nbr});
        }
    }
}
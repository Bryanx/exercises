using System.Collections.Generic;
using System.Web.Mvc;
using SC.BL;
using SC.BL.Domain;

namespace SC.UI.Web.MVC.Controllers {
    public class TicketController : Controller {
        private ITicketManager mgr = new TicketManager();

        // GET: Default
        public ActionResult Index() {
            IEnumerable<Ticket> tickets = mgr.GetTickets();
            return View(tickets);
        }

        // GET: Default/Details/5
        public ActionResult Details(int id) {
            return View();
        }

        // GET: Default/Create
        public ActionResult Create() {
            return View();
        }

        // POST: Default/Create
        [HttpPost]
        public ActionResult Create(FormCollection collection) {
            try {
                // TODO: Add insert logic here

                return RedirectToAction("Index");
            }
            catch {
                return View();
            }
        }

        // GET: Default/Edit/5
        public ActionResult Edit(int id) {
            return View();
        }

        // POST: Default/Edit/5
        [HttpPost]
        public ActionResult Edit(int id, FormCollection collection) {
            try {
                // TODO: Add update logic here

                return RedirectToAction("Index");
            }
            catch {
                return View();
            }
        }

        // GET: Default/Delete/5
        public ActionResult Delete(int id) {
            return View();
        }

        // POST: Default/Delete/5
        [HttpPost]
        public ActionResult Delete(int id, FormCollection collection) {
            try {
                // TODO: Add delete logic here

                return RedirectToAction("Index");
            }
            catch {
                return View();
            }
        }
    }
}
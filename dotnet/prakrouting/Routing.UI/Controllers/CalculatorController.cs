using System.Web.Mvc;

namespace Routing.UI.Controllers {
    public class CalculatorController : Controller {
        // GET
        public int Sum(int nbr1, int nbr2) {
            return nbr1 + nbr2;
        }
    }
}
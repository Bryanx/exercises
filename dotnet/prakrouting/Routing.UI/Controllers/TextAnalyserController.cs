using System.Linq;
using System.Web.Mvc;

namespace Routing.UI.Controllers {
    public class TextAnalyserController : Controller {
        private const string COUNT = "nbrOfCallsCountCowel";

        // GET
        public int CountVowels(string text) {
            //globaal variabele
            if (HttpContext.Session[COUNT] == null)
                HttpContext.Session.Add(COUNT, 1);
            else {
                int nbrOfCallsCountCowel = (int) HttpContext.Session[COUNT];
                HttpContext.Session[COUNT] = ++nbrOfCallsCountCowel;
            }
            
            //methode
            return text.Count(c => "aeiou".Contains(c.ToString()));
        }

        public int CountOccurences(string text, char? character) {
            return character != null ? text.Count(c => c == character) : text.Length;
        }

        public int Statistics() {
            int nbrOfCallsCountCowel = 0;
            if (HttpContext.Session["nbrOfCallsCountCowel"] == null)
                nbrOfCallsCountCowel = (int) HttpContext.Session[COUNT];
            return nbrOfCallsCountCowel;
        }
    }
}
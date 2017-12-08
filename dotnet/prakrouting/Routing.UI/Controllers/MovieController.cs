using System;
using System.Web.Mvc;
using Routing.UI.DAL;
using Routing.UI.Models;

namespace Routing.UI.Controllers {
    public class MovieController : Controller {
        private MovieRepository repo = new MovieRepository();
        // GET
        public string GetMovie(int id) {
            return String.Format($"{repo.ReadMovie(id).MovieId} {repo.ReadMovie(id).Title}");
        }
        
        public string GetMovies() {
            string text = "";
            foreach (Movie m in repo.ReadMovies()) {
                text += m.MovieId + " " + m.Title + "<br />";
            }
            return text;
        }

        public string ChangeMovie(Movie movie) {
            repo.UpdateMovie(movie);
            return GetMovie(movie.MovieId);
        }
    }
}
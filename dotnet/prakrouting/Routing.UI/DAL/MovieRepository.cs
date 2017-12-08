using System.Collections.Generic;
using System.IO;
using System.Linq;
using Routing.UI.Models;

namespace Routing.UI.DAL {
    public class MovieRepository {
        private List<Movie> movieRepo;

        public MovieRepository() {
            movieRepo = new List<Movie>();
            movieRepo.Add(new Movie() { MovieId = 1, Title = "De Premier" });
            movieRepo.Add(new Movie() { MovieId = 2, Title = "Inferno" });
            movieRepo.Add(new Movie() { MovieId = 3, Title = "Rogue One" });
            movieRepo.Add(new Movie() { MovieId = 4, Title = "Allied" });
        }

        public void UpdateMovie(Movie movie) {
            ReadMovie(movie.MovieId).Title = movie.Title;
        }

        public Movie ReadMovie(int id) {
            if (movieRepo.Find(m => m.MovieId==id) == null) throw new FileNotFoundException();
            return movieRepo.Find(m => m.MovieId == id);
        }

        public IEnumerable<Movie> ReadMovies() {
            return movieRepo.AsEnumerable();
        }
    }
}
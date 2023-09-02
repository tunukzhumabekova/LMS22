package LMS22.Servise;

import LMS22.Interface.FindableInterface;
import LMS22.Model.Cast;
import LMS22.Model.Director;
import LMS22.Model.Movie;

import java.util.LinkedList;
import java.util.List;

public class FindableService implements FindableInterface {
    private LinkedList<Movie> movie;

    public FindableService(LinkedList<Movie> movie) {
        this.movie = movie;
    }

    public LinkedList<Movie> getMovie() {
        return movie;
    }

    public void setMovie(LinkedList<Movie> movie) {
        this.movie = movie;
    }

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return movies;
    }

    @Override
    public void findMovieByFullNameOrPartName(String searchTerm) {
        for (Movie movie : movie) {
            if (movie.getName().contains(searchTerm)) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByActorName(String ActorName) {
        for (Movie movie : movie) {
            LinkedList<Cast> casts = (LinkedList<Cast>) movie.getCast();
            for (Cast cast : casts) {
                if (cast.getActorFullName().contains(ActorName)) {
                    System.out.println(cast);
                }
            }
        }
    }

    @Override
    public void findMovieByYear(int year) {
        for (Movie movie : movie) {
            if (movie.getYear() == year) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByDirector(Director director) {
        for (Movie movie : movie) {
            if (movie.getDirector().equals(director)) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByGenre(String genre) {
        for (Movie movie : movie) {
            if (movie.getGenre().contains(genre)) {
                System.out.println(movie);
            }
        }
    }


    @Override
    public void findMovieByRole(String role) {
        for (Movie movie : movie) {
            LinkedList<Cast> casts = (LinkedList<Cast>) movie.getCast();
            for (Cast cast : casts) {
                if (cast.getRole().contains(role)) {
                    System.out.println(cast);
                }
            }
        }
    }
}



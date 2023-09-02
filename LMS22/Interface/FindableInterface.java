package LMS22.Interface;

import LMS22.Model.Director;
import LMS22.Model.Movie;

import java.util.List;

public interface FindableInterface {
    List<Movie> getAllMovies(List<Movie>movies);

    void findMovieByFullNameOrPartName(String searchTerm);

    void findMovieByActorName(String ActorName);

    void findMovieByYear(int year);

    void findMovieByDirector(Director director);

    void findMovieByGenre(String genre);

    void findMovieByRole(String role);


}

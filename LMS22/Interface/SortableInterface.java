package LMS22.Interface;

import LMS22.Model.Movie;

import java.util.List;

public interface SortableInterface {



    List<Movie> sortByMovieName(List<Movie> movies, boolean ascending);

    List<Movie> sortByYear(List<Movie> movies, boolean ascending);

    List<Movie> sortByDirector(List<Movie> movies, boolean ascending);
}

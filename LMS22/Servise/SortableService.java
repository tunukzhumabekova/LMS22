package LMS22.Servise;

import LMS22.Interface.SortableInterface;
import LMS22.Model.Movie;

import java.util.*;

public class SortableService implements SortableInterface {
    private LinkedList<Movie> movie;

    public SortableService(LinkedList<Movie> movie) {
        this.movie = movie;
    }

    public LinkedList<Movie> getMovie() {
        return movie;
    }

    public void setMovie(LinkedList<Movie> movie) {
        this.movie = movie;
    }

    public SortableService(List<Movie> allMovies) {}

    @Override
    public List<Movie> sortByMovieName(List<Movie> movies, boolean ascending) {
        Comparator<Movie> movieNameComparator = Comparator.comparing(Movie::getName);

        if (!ascending) {
            movieNameComparator = movieNameComparator.reversed();
        }

        List<Movie> sortedMovies = new ArrayList<>(movies);
        Collections.sort(sortedMovies, movieNameComparator);
        return sortedMovies;
    }


    @Override
    public List<Movie> sortByYear(List<Movie> movies, boolean ascending) {
        Comparator<Movie> yearComparator = Comparator.comparingInt(Movie::getYear);

        if (!ascending) {
            yearComparator = yearComparator.reversed();
        }

        List<Movie> sortedMovies = new ArrayList<>(movies);
        Collections.sort(sortedMovies, yearComparator);
        return sortedMovies;
    }

    @Override
    public List<Movie> sortByDirector(List<Movie> movies, boolean ascending) {
        Comparator<Movie> directorComparator = Comparator.comparing(movie -> movie.getDirector().getName());

        if (!ascending) {
            directorComparator = directorComparator.reversed();
        }

        List<Movie> sortedMovies = new ArrayList<>(movies);
        Collections.sort(sortedMovies, directorComparator);
        return sortedMovies;
    }
}


package LMS22;

import LMS22.Interface.FindableInterface;
import LMS22.Model.Cast;
import LMS22.Model.Director;
import LMS22.Model.Movie;
import LMS22.Servise.FindableService;
import LMS22.Servise.SortableService;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Movie> allMovies = new LinkedList<>();
        // Example 1
        List<Cast> castList1 = new LinkedList<>();
        castList1.add(new Cast("Actor1 Full Name", "Role1"));
        castList1.add(new Cast("Actor2 Full Name", "Role2"));
        Director director1 = new Director("aDirector1 First Name", "Director1 Last Name");
        Movie movie1 = new Movie("Movie1", 2020, "Action", director1, castList1);
        allMovies.add(movie1);
        // Example 2
        List<Cast> castList2 = new LinkedList<>();
        castList2.add(new Cast("Actor3 Full Name", "Role3"));
        castList2.add(new Cast("Actor4 Full Name", "Role4"));
        Director director2 = new Director("Director2 First Name", "Director2 Last Name");
        Movie movie2 = new Movie("Movie2", 2019, "Comedy", director2, castList2);
        allMovies.add(movie2);
        // Example 3
        List<Cast> castList3 = new LinkedList<>();
        castList3.add(new Cast("Actor5 Full Name", "Role5"));
        castList3.add(new Cast("Actor6 Full Name", "Role6"));
        Director director3 = new Director("Director3 First Name", "Director3 Last Name");
        Movie movie3 = new Movie("Movie3", 2021, "Drama", director3, castList3);
        allMovies.add(movie3);
        // Example 4
        List<Cast> castList4 = new LinkedList<>();
        castList4.add(new Cast("Actor7 Full Name", "Role7"));
        castList4.add(new Cast("Actor8 Full Name", "Role8"));
        Director director4 = new Director("Director4 First Name", "Director4 Last Name");
        Movie movie4 = new Movie("Home alone", 2018, "Thriller", director4, castList4);
        allMovies.add(movie4);
        // Example 5
        List<Cast> castList5 = new LinkedList<>();
        castList5.add(new Cast("Actor9 Full Name", "Role9"));
        castList5.add(new Cast("10 Full Name", "Role10"));
        Director director5 = new Director("Director5 First Name", "Director5 Last Name");
        Movie movie5 = new Movie("212", 2022, "Science Fiction", director5, castList5);
        allMovies.add(movie5);

        SortableService S = new SortableService(allMovies);
        FindableService F = new FindableService((LinkedList<Movie>) allMovies);
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 METHODS TO FIND");
        System.out.println("2 METHODS TO SORT");

        int a = scanner.nextInt();
        while (true) {
            switch (a) {
                case 1:
                    System.out.println("Methods to find");
                    System.out.println("1 Get all movies");
                    System.out.println("2 Find movie by full or part name");
                    System.out.println("3 Find movie by actor name");
                    System.out.println("4 Find movie by year");
                    System.out.println("5 Find movie by director");
                    System.out.println("6 Find movie by genre");
                    System.out.println("7 Find movie by role");
                    int b = scanner.nextInt();
                    switch (b) {
                        case 1:
                            System.out.println("Get all movies");
                            System.out.println(F.getAllMovies(allMovies));
                            break;
                        case 2:
                            System.out.println("Find movie by full name or part name");
                            System.out.println("Enter name of film that you want to find");
                            String name = scanner.nextLine();
                            F.findMovieByFullNameOrPartName(name);
                            break;
                        case 3:
                            System.out.println("Find movie by actor name");
                            System.out.println("Enter actor that you want to find");
                            String actor = scanner.nextLine();
                            F.findMovieByActorName(actor);
                            break;
                        case 4:
                            System.out.println("Find movie by year");
                            System.out.println("Enter year that you want to find");
                            int year = scanner.nextInt();
                            F.findMovieByYear(year);
                            break;
                        case 5:
                            System.out.println("Find movie by director");
                            F.findMovieByDirector(director1);
                            break;
                        case 6:
                            System.out.println("Find movie by genre");
                            System.out.println("Enter genre that you want to find");
                            String genre = scanner.nextLine();
                            F.findMovieByGenre(genre);
                            break;
                        case 7:
                            System.out.println("Find movie by role");
                            System.out.println("Enter role that you want to find");
                            String role = scanner.nextLine();
                            F.findMovieByRole(role);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Methods to sort");
                    System.out.println("1 Sort by name");
                    System.out.println("2 Sort by year");
                    System.out.println("3 Sort by director");
int x=scanner.nextInt();


                        switch (x) {
                            case 1:
                                System.out.println("Sort by movie name");
                                System.out.println("1 Sort from A to Z");
                                System.out.println("2 Sort from Z to A");
                                int k= scanner.nextInt();
                                switch (k) {
                                    case 1:
                                        System.out.println(" Sort from A-Z");
                                        List<Movie> sortedMoviesByNameAscending = S.sortByMovieName(allMovies, true);
                                        System.out.println(sortedMoviesByNameAscending);
                                        break;
                                    case 2:
                                        System.out.println(" Sort from z to A");
                                        List<Movie> sortedMoviesByNameDescending = S.sortByMovieName(allMovies, false);
                                        System.out.println(sortedMoviesByNameDescending);
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Sort By year");
                                System.out.println("1 Sort from biggest to lowest");
                                System.out.println("2 Sort from lowest to highest");
                                int w = scanner.nextInt();
                                switch (w) {
                                    case 1:
                                        System.out.println("Sort from biggest to lowest");
                                        List<Movie> sortedMoviesByAgeAscending = S.sortByYear(allMovies, false);
                                        System.out.println(sortedMoviesByAgeAscending);
                                        break;
                                    case 2:
                                        System.out.println("Sort from lowest to highest");
                                        List<Movie> sortedMoviesByYearDescending = S.sortByYear(allMovies, true);
                                        System.out.println(sortedMoviesByYearDescending);
                                }
                                break;
                            case 3:
                                System.out.println("Sort by director");
                                System.out.println("1 Sort from A to Z");
                                System.out.println("2 Sort from Z to A");
                                int t = scanner.nextInt();
                                switch (t) {
                                    case 1:
                                        System.out.println("Sort from A to Z");
                                        List<Movie> sortedMoviesByDirectorDescending = S.sortByDirector(allMovies, false);
                                        System.out.println(sortedMoviesByDirectorDescending);
                                        break;
                                    case 2:
                                        System.out.println("Sort from Z to A");
                                        List<Movie> sortedMoviesByAgeAscending = S.sortByYear(allMovies, true);
                                        System.out.println(sortedMoviesByAgeAscending);
                                        break;
                                }

                                break;
                        }
                    }
            }
        }
    }


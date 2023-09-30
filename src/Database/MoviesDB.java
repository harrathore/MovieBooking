package Database;

import theater.Movie;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MoviesDB {
    private static MoviesDB moviesDB = null;
    private Set<Movie> allMovies;
    private MoviesDB(){
        allMovies = new HashSet<>();
    }

    public static MoviesDB getInstanceOfMovieDb(){
        if(moviesDB==null){
            synchronized (new Object()){
                if(moviesDB==null){
                    moviesDB = new MoviesDB();
                }
            }
        }
        return moviesDB;
    }

    public String addANewMovieInDb(Movie movie){
        allMovies.add(movie);
        return "Movie added successfully to Database";
    }
}

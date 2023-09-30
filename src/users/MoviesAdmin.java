package users;

import Database.MoviesDB;
import theater.Movie;

public class MoviesAdmin {
    private MoviesDB moviesDB;
    public MoviesAdmin(){
        moviesDB = MoviesDB.getInstanceOfMovieDb();
    }
    public String addAMovieToDb(){
        Movie movie = new Movie("Jawaan", 1888999999L);
        return moviesDB.addANewMovieInDb(movie);
    }
}

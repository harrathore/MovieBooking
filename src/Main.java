import theater.models.Ticket;
import users.MoviesAdmin;
import users.TheaterAdmin;
import users.Customer;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is the Main interface where all users will interact");

        MoviesAdmin moviesAdmin1 = new MoviesAdmin();
        moviesAdmin1.addAMovieToDb();

        TheaterAdmin theaterAdmin1 = new TheaterAdmin();
        theaterAdmin1.createTheaterAndAddShows();

        Customer customer1 = new Customer("Harvendra");
        Ticket ticket = customer1.bookMovieTickets();

        Customer customer2 = new Customer("Ram");
        customer2.bookMovieTickets();
    }
}
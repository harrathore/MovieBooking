import admin.Admin;
import users.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is the application to book movie shows!");

        Admin admin = new Admin();
        admin.createTheaterAndAddShows();

        User user = new User("Harvendra");
        user.bookMovieTickets();

        User user1 = new User("Ram");
        user1.bookMovieTickets();
    }
}
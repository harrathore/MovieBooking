package users;

import theater.models.AddressModel;
import theater.Movie;
import theater.Theater;
import theater.screens.Screen;
import theater.shows.Show;



public class TheaterAdmin {
    /**
     * 1. create a theater and add screens into this
     * 2. Add shows to theater and remove shows
     */

    //private ShowsCatalog catalog;  //Not secure why should a theaterAdmin have access to complete shows catalog
    private TheaterAdminInterface theaterAdminInterface;

    public TheaterAdmin(){
        theaterAdminInterface = TheaterAdminInterface.getTheaterAdminInterfaceAdmin();
    }

    public Theater createTheaterAndAddShows(){
        AddressModel addressModel = new AddressModel("Indore", "MP", 450071);
        Theater theater = new Theater("Raj Cinema",addressModel, 2);
        Screen screen1 = new Screen(1);
        Screen screen2 = new Screen(2);
        theater.addScreenToTheater(screen2);
        theater.addScreenToTheater(screen1);

        /**
         * This should be searched from MoviesDb - which are going to release and all
         */
        Movie movie = new Movie("Movie", 18000L);
        Show show1 = new Show(400L, 500L, screen1, movie);
        theater.addShow(show1);

        Show show2 = new Show(500L, 600L, screen2, movie);
        theater.addShow(show2);

        System.out.println("Created theater with " + theater +
                "Screens as : " + screen1 + " and " + screen2 + "With Show " + show1 + " and " + show2);

        theaterAdminInterface.addTheaterToShowCatalog(theater);
        return theater;
    }


}

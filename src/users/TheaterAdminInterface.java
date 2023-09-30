package users;

import Database.ShowsCatalog;
import theater.Theater;

public class TheaterAdminInterface {
    private static TheaterAdminInterface theaterAdminInterface = new TheaterAdminInterface();

    private ShowsCatalog catalog;

    private TheaterAdminInterface(){
        catalog = ShowsCatalog.getInstanceOfCatalog();
    }

    public static TheaterAdminInterface getTheaterAdminInterfaceAdmin(){
        return theaterAdminInterface;
    }

    public String addTheaterToShowCatalog(Theater theater){
        catalog.addTheaterToCatalog(theater);
        return "theater added to catalog";
    }


}

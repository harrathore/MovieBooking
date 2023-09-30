package theater.models;

public class SearchTheaterRequestModel {
    private String city;
    private Integer pinCode;
    private String movieName;
    private Long showFrom;
    private Long showTo;

    /**
     * Need to use builder design pattern
     */

    public SearchTheaterRequestModel() {

    }

    public SearchTheaterRequestModel(String city, Integer pinCode, String movieName, Long showFrom, Long showTo) {
        this.city = city;
        this.pinCode = pinCode;
        this.movieName = movieName;
        this.showFrom = showFrom;
        this.showTo = showTo;
    }


}

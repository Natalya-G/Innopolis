package Homework3;

public class Movie {

    String name;
    double rating;
    String genre;
    String country;
    boolean oscar;
    String year;

    public Movie(String name, double rating, String genre, String country, boolean oscar) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.oscar = oscar;
    }

    public Movie(String name, double rating, String genre, String year) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.year = year;
    }
}

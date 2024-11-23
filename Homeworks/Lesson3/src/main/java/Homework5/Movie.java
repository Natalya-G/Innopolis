package Homework5;

public class Movie {

    String name;
    double rating;
    String genre;
    String country;
    String oscar;

    public Movie(String name, double rating, String genre, String country, String oscar) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.oscar = oscar;
    }

    @Override
    public String toString() {
        return "название: " + name + '\n' +
                "рейтинг: " + rating + '\n'+
                "жанр: " + genre + '\n' +
                "страна: " + country + '\n' +
                "премия оскар: " + oscar +'\n';
    }
}

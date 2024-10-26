package Homework3;

public class Task5 {
    public static void main(String[] args) {
        Movie[] films = {
                new Movie("Хатико", 8.4, "драма", "2009"),
                new Movie("Битва за Севастополь", 7.7, "драма", "2015"),
                new Movie("Иван Васильевич меняет профессию", 7.4, "комедия", "1973")
        };
        for (int i=0; i < films.length; i++){
           System.out.println("год - " + films[i].year + ", название - " + films[i].name + ", жанр - " + films[i].genre + ", рейтинг - " + films[i].rating);
        }
    }
}

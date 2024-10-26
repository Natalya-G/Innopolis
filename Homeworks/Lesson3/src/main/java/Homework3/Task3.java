package Homework3;

public class Task3 {
    public static void main(String[] args) {

        Movie[] films = new Movie[3];
        films[0] = new Movie("Хатико", 8.4, "драма", "США", false);
        films[1] = new Movie("Битва за Севастополь", 7.7, "драма", "Россия", false);
        films[2] = new Movie("Иван Васильевич меняет профессию", 7.4, "комедия", "СССР", false);

        System.out.println("Список фильмов");
        for (int i=0; i < films.length; i++){
            System.out.println("Название: " + films[i].name);
            System.out.println("Рейтинг: " + films[i].rating);
            System.out.println("Жанр: " + films[i].genre);
            System.out.println("Страна: " + films[i].country);
            if (films[i].oscar) {
                System.out.println("Оскар: Да \n");
            } else {
                System.out.println("Оскар: Нет \n");
            }
        }
    }
}

package Homework5;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Warner Bros",1918));
        companies.add(new Company("Columbia Pictures",1919));
        companies.add(new Company("20th Century Fox",1935));

        List<String> warnerBrosFilms = companies.get(0).getFilms();
        warnerBrosFilms.add("Зеленая миля");
        warnerBrosFilms.add("Гарри Поттер");
        warnerBrosFilms.add("Великий Гэтсби");

        List<String> columbiaPicturesFilms = companies.get(1).getFilms();
        columbiaPicturesFilms.add("Побег из Шоушенка");
        columbiaPicturesFilms.add("Остров проклятых");
        columbiaPicturesFilms.add("Люди в черном");

        List<String> centuryFoxFilms = companies.get(2).getFilms();
        centuryFoxFilms.add("Богемская рапсодия");
        centuryFoxFilms.add("Титаник");
        centuryFoxFilms.add("Люди икс");

        for (Company company : companies) {
            System.out.println(company.getName() + ": " + company.getFilms());
        }

    }
}

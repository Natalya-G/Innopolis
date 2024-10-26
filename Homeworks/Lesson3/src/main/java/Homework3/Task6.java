package Homework3;

public class Task6 {
    public static void main(String[] args) {

        String[] names = new  String[10];
        names[0] = "Александр";
        names[1] = "Никита";
        names[8] = "Михаил";
        names[4] = "Дарья";
        names[7] = "Максим";
        names[3] = "Пётр";
        names[9] = "Олег";
        names[5] = "Владислав";
        names[2] = "Надежда";
        names[6] = "Светлана";

        System.out.println("Топ-3 игроков:");
        for (int i=0; i < 3; i++){
            System.out.println(names[i]);
        }
    }
}

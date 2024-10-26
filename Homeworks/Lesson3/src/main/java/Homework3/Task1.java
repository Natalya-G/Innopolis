package Homework3;

public class Task1 {
    public static void main(String[] args) {

        String[] todoList = new String[5];
        todoList[1] = "Посмотреть лекцию";
        todoList[2] = "Сделать домашнее задание";
        todoList[0] = "Записаться к врачу";
        todoList[3] = "Погулять";
        todoList[4] = "Посмотреть вакансии";

        for (int i=0; i<5; i=i+1) {
            System.out.println(todoList[i]);
        }
    }
}

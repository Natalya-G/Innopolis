package CertificationModule1;

public class Game {

    private  int result = 0;
    private  int resultRobot = 0;

    public void getSymbolRobot(int symbolRobot){
        switch (symbolRobot) {
            case 1 : System.out.println("Выбор робота: камень");
                break;
            case 2 : System.out.println("Выбор робота: ножницы");
                break;
            case 3 : System.out.println("Выбор робота: бумага");
                break;
            default: System.out.println("Упс! Ошибочка!");
                break;
        }
    }

    public void getGameResult(int symbol, int symbolRobot){
        if (symbol == 1) {
            switch (symbolRobot) {
                case 2 : result += 1;
                    break;
                case 3 : resultRobot += 5;
                    break;
                default: System.out.println("Ничья!");
                    break;
            }
        }
        if (symbol == 2) {
            switch (symbolRobot) {
                case 1 : resultRobot += 1;
                    break;
                case 3 : result += 2;
                    break;
                default: System.out.println("Ничья!");
                    break;
            }
        }
        if (symbol == 3) {
            switch (symbolRobot) {
                case 1 : result += 5;
                    break;
                case 2 : resultRobot += 2;
                    break;
                default: System.out.println("Ничья!");
                    break;
            }
        }
        System.out.println("Результат очков: Ваш - " + result + " , робота: " + resultRobot+ "\n" );
    }

    public void getTotalResult(){
        System.out.println("Результат игры: ");
        if (result > resultRobot){
            System.out.println("Вы победили! Поздравляем!");
        } else if (result < resultRobot) {
            System.out.println("Победил робот! Попробуйте еще раз! ");
        } else {
            System.out.println("Ничья!");
        }
    }

}

package CertificationModule1;

public class Inscription {

    private double wordLength = 0.62;
    private double space = 0.12;
    private double lengthInscription;

    public void getLengthInscription(double length)  {

        lengthInscription = 5 * wordLength + 2 * space;

        if (lengthInscription <= length) {
            System.out.println("Надпись поместится на заборе ");
        } else {
            System.out.println("Длины забора не достаточно для надписи");
        }
    }
}

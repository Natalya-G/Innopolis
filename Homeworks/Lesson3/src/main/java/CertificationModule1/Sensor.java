package CertificationModule1;

import java.util.Random;

public class Sensor {
    private int humidity;

    public int getHumidity() {

        return humidity = new Random(System.currentTimeMillis()).nextInt(0, 100);
    }

}

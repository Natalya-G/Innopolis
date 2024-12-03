package CertificationModule1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] numbers = {10,5,7,3,2,9,0,4,9,9,6,10,-2,-7,-10};
        int[] numbersNew = new int[numbers.length];
        int i;

        for (i = 0; i < numbers.length; i++){
            numbersNew[i] = numbers[i];
        }

        for (i = 0; i < numbersNew.length; i++){
            for (int j = i + 1; j < numbersNew.length; j++){
                if (numbersNew[j] >= numbersNew[i]){
                    int max = numbersNew[j];
                    numbersNew[j] = numbersNew[i];
                    numbersNew[i] = max;
                }
            }
        }
        i = -1;
        do {
           i++;
        } while (numbersNew[i] == numbersNew[i+1]);
        System.out.println("Второй по величине элемент: " + numbersNew[i + 1]);
    }

}

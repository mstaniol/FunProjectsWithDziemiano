package pl.withDziemian;

import java.util.Random;

public class Losowanie {
    public static void main(String[] args) {

        Random random = new Random();
        String [] leanguages = new String[]{"PHP", "C#", "Kotlin", "Ruby", "Python"};
        System.out.println(leanguages[random.nextInt(4)]);

    }


}

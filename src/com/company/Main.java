package com.company;

public class Main {

    public static void main(String[] args) {
        double [] a = {1.2, 82.5, -57.33, 75.1, -78.21, 22.1, -7.0, 80.5, 33.0, 45.9, 11.1, 45.1, 66.6, 12.5};
        double b = 0;
        int c = 0;
        boolean primer = false;
        for (double consider : a ){
            if (consider < 0) {
                primer = true;
            }
            else {
                if (primer) {
                    c ++;
                    b += consider;

                }
            }
        }

        System.out.println("Среднее арифмитические"+ b/c);
    }
}

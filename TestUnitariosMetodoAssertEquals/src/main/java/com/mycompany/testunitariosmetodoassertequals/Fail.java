package com.mycompany.testunitariosmetodoassertequals;

public class Fail {

    public static double raiz(double num) throws IllegalArgumentException {
        if (num < 0) {
           throw new IllegalArgumentException("El numero deber ser positivo");
        }
        return Math.sqrt(num);
    }
}

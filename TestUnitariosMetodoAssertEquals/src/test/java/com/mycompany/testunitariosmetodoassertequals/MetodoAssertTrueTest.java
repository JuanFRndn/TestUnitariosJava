package com.mycompany.testunitariosmetodoassertequals;

import java.util.function.BooleanSupplier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MetodoAssertTrueTest {

    public MetodoAssertTrueTest() {
    }

    @Test
    void test() {
        //metodo que permite verificar si un booleano es true      
        assertTrue(true);
    }

    @Test
    void test1() {
        assertTrue(3 > 0);
        assertTrue("hola".contains("h"));
    }

    @Test
    void test2() {
        assertTrue("ola".contains("h"));
    }

    @Test
    void test3() {
        int x = 3;
        assertTrue(esPositivo(x));
        assertTrue("ola".contains("h"));
    }

    boolean esPositivo(int x) {
        return x >= 0;
    }

    @Test
    void test4() {
        int x = 3;
        BooleanSupplier esPar = () -> x % 2 == 0;
        assertFalse(esPar);
    }
}

package com.mycompany.testunitariosmetodoassertequals;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OtrosMetodosAsserts {

    public OtrosMetodosAsserts() {
    }

    @Test
    void test1() {
        int x = 3;
        assertAll(
            () -> assertEquals(3, x), //variable es 3
            () -> assertFalse(x % 2 == 0),  //variable no es par
            () -> assertTrue(x>0), // variable mayor que 0
            () -> assertNotNull(Integer.valueOf(x)) // variable no es nula
        );
    }
    
    @Test
    void test2() {
        int x = 4;
        assertAll(
            () -> assertEquals(3, x), //variable es 3
            () -> assertFalse(x % 2 == 0),  //variable no es par
            () -> assertTrue(x>0), // variable mayor que 0
            () -> assertNotNull(Integer.valueOf(x)) // variable no es nula
        );
    }
    
    @Test
    void test3(){
        assertTimeout(Duration.of(1, ChronoUnit.MILLIS),
                () -> {
                    System.out.println("3 hola");
                    Thread.sleep(10);
                    System.out.println("adios");
                }
        );
    }
    
    @Test
    void test4(){
        assertTimeout(Duration.of(20, ChronoUnit.MILLIS),
                () -> {
                    System.out.println("3 hola");
                    Thread.sleep(10);
                    System.out.println("adios");
                }
        );
    }
    
    @Test
    void test5(){
        assertTimeout(Duration.of(1, ChronoUnit.MILLIS),
                () -> {
                    System.out.println("5 hola");
                    Thread.sleep(10);
                    System.out.println("adios");
                }
        );
    }
    
    @Test
    void test6(){
        assertTimeout(Duration.of(20, ChronoUnit.MILLIS),
                () -> {
                    System.out.println("6 hola");
                    Thread.sleep(10);
                    System.out.println("adios");
                }
        );
    }
}

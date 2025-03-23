package com.mycompany.testunitariosmetodoassertequals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class NotacionesAfterBeforeTest {
    
    public NotacionesAfterBeforeTest() {
    }
    
    @BeforeAll
    static void antesDeNada(){
        System.out.println("antes de nada");
    }
    
    @BeforeEach
    static void antesDeCada(){
        System.out.println("antes de cada");
    }
    
    @Test
    void test1(){
        System.out.println("test1");
    }
    
    @Test
    void test2(){
        System.out.println("test1");
    }
    
    @AfterEach
    void despuesDeCada(){
        System.out.println("después de cada");
    }
    
    @AfterAll
    void despuesDeTodo(){
        System.out.println("después de todo");
    }
    
    @Test
    void test3(){
        System.out.println("test3");
    }
    
    @Test
    void test4(){
        System.out.println("test4");
    }
}

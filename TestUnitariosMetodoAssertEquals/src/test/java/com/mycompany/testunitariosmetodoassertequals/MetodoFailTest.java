package com.mycompany.testunitariosmetodoassertequals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MetodoFailTest {
    
    public MetodoFailTest() {
    }
    
    @Test
    void test(){
        double resultado= Fail.raiz(25.0);
        assertEquals(5.0, resultado);
    }
    
    @Test
    void test1a(){
        try{
            double resultado= Fail.raiz(-25.0);
        }catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }
    
        @Test
    void test1b(){
        try{
            double resultado= Fail.raiz(25.0);
        }catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }
    
        @Test
    void test1c(){
        try{
            double resultado= Fail.raiz(-25.0);
            fail("Deber[ia haber lanzado una excepcion");
        }catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }
    
        @Test
    void test1d(){
        try{
            double resultado= Fail.raiz(25.0);
            fail("Deber[ia haber lanzado una excepcion");
        }catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }
}

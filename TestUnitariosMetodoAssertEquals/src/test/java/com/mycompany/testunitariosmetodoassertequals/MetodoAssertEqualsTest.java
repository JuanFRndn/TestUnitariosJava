package com.mycompany.testunitariosmetodoassertequals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MetodoAssertEqualsTest {
    
    public MetodoAssertEqualsTest() {
    }

    @Test
    public void testSintaxis() {
        //recibe valor esperado y valor real
        Assertions.assertEquals(2,2);
        assertEquals(2,2);
    }
    
    @Test
    void test1(){
        assertEquals(2,3);
    }
    
    @Test
    void test2(){
        assertEquals(""," ");
    }
    
    @Test
    void test3(){
        assertEquals("","\n");
    }
    
}

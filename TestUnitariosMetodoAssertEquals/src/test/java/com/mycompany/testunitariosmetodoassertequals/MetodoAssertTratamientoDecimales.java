package com.mycompany.testunitariosmetodoassertequals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MetodoAssertTratamientoDecimales {
    
    public MetodoAssertTratamientoDecimales() {
    }
    
    //assert equals para numeros decimales
    @Test
    void testDecimales1(){
        assertEquals(3.3333,10.0/3);
    }
    
    @Test
    void testDecimales2(){
        assertEquals(3.3333333333333335,10.0/3);
    }
    
    @Test
    void testDecimales3(){
//      para trabajar con decimales se recomienda usar un assertEquals con un 
//      tercer parametro de entrada llamado Delta
        assertEquals(3.33,10.0/3,0.01);
        assertEquals(3.33,3.321,0.01);
        assertEquals(3.33,3.330,0.01);
        assertEquals(3.33,3.339,0.01);
    }
    
    @Test
    void testDecimales4(){
        assertEquals(3.3333, 10.0/3, "inconveninte con los decimales");
    }
    
    @Test
    void testDecimales5(){
        assertEquals(3.33, 3.3333, 0.001, "inconveninte con los decimales");
    }
}

package com.mycompany.testunitariosmetodoassertequals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComprobacionColeccionesTest {
    
    public ComprobacionColeccionesTest() {
    }
    
    @Test
    void testIguales(){
        List<String> l1 = Arrays.asList("a","e","i","o","u");
        List<String> l2 = Arrays.asList("a","e","i","o","u");
        List<String> l3 = Arrays.asList("a","e","i","o","z");
        
        assertEquals(l1,l2);//ok
        assertNotSame(l1,l2);//ok
        assertNotEquals(l1,l3);//ok
        
        assertIterableEquals(l1,l2);//ok
        assertIterableEquals(l1,l3);//u diferente de z
    }
    
    @Test
    void testParecidas(){
        List<String> l1 = Arrays.asList("a","e","i","o","u");
        List<String> l2 = Arrays.asList("u","o","i","e","a");
        List<String> l3 = Arrays.asList("a","e","i","o","o","u","u");
    }
}

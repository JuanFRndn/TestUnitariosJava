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
        
        //mismo tamaño
        assertEquals(l1.size(), l2.size());
        
        //mismos elementos
        assertTrue(l1.containsAll(l2) && l2.containsAll(l1));
        assertTrue(l1.containsAll(l3) && l3.containsAll(l1));
        
        //distinto tamaño
        assertNotEquals(l1.size(),l3.size());
        
        //iguales ? no
        assertIterableEquals(l1,l2);
    }
    
    @Test
    void testArraysMal(){
        char[] letras1 = "buenos días".toCharArray();
        char[] letras2 = "buenos días".toCharArray();
        
        assertEquals(letras1, letras2);
    }
    
    @Test
    void testArraysBien(){
        char[] letras1 = "buenos días".toCharArray();
        char[] letras2 = "buenos días".toCharArray();
        char[] letras3 = "buenos dias".toCharArray();
        
        assertArrayEquals(letras1, letras2);
        assertArrayEquals(letras1, letras3);
    }
}

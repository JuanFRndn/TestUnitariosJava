package com.mycompany.testunitariosmetodoassertequals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HolaMundoTest {
    
    public HolaMundoTest() {
    }

    @Test
    public void testOut() {
        PrintStream originalOut = System.out; //salida original
        ByteArrayOutputStream bos = new ByteArrayOutputStream(); //nueva salida
        System.setOut(new PrintStream(bos)); // reemplazo de salida
        
        HolaMundo.main(null);
        String salida = bos.toString(); //recuperación del contenido
        assertEquals("Hola mundo\n",salida);
        
        System.setOut(originalOut); // restauración de la consola
        
    }
    
    @Test
    public void testErr() {
        PrintStream originalErr = System.err; //salida original
        ByteArrayOutputStream bos = new ByteArrayOutputStream(); //nueva salida
        System.setErr(new PrintStream(bos)); // reemplazo de salida
        
        HolaMundo.main(null);
        String salida = bos.toString(); //recuperación del contenido
        assertEquals("Y adiós",salida.trim());
        
        System.setErr(originalErr); // restauración de la consola
        
    }
}

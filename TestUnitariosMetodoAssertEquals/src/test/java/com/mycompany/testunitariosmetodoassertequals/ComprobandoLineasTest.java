package com.mycompany.testunitariosmetodoassertequals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComprobandoLineasTest {
    
    public ComprobandoLineasTest() {
    }
    
    @Test
    void test(){
        List<String> lista1 = Arrays.asList("hola", "qué tal", "adiós");
        List<String> lista2 = Arrays.asList("hola", "qué tal", "adiós");
        
        assertLinesMatch(lista1, lista2);
    }
    
    @Test
    void test1(){
        List<String> entrada = Arrays.asList("hola", ">>>>", "adiós");
        List<String> obtenida = Arrays.asList("hola", "qué tal", "adiós");
        
        assertLinesMatch(entrada, obtenida);
    }
    
    @Test
    void test2(){
        List<String> esperada = Arrays.asList("hola", ">>>>", "adiós");
        List<String> obtenida = Arrays.asList("hola", "qué tal", "como estás",
                "adiós");
        
        assertLinesMatch(esperada, obtenida);
    }
    
    @Test
    void test3(){
        List<String> esperada = Arrays.asList("hola", ">> 2 >>", "adiós");
        List<String> obtenida = Arrays.asList("hola", "qué tal", "como estás",
                "adiós");
        
        assertLinesMatch(esperada, obtenida);
    }
    
    @Test
    void test4(){
        List<String> esperada = Arrays.asList("hola", ">> 3 >>", "adiós");
        List<String> obtenida = Arrays.asList("hola", "qué tal", "como estás",
                "adiós");
        
        assertLinesMatch(esperada, obtenida);
    }
    
    @Test
    void test5(){
        List<String> esperada = Arrays.asList("hola", ">> 1 >>", "adiós");
        List<String> obtenida = Arrays.asList("hola", "qué tal", "como estás",
                "adiós");
        
        assertLinesMatch(esperada, obtenida);
    }
    
    @Test
    void test6(){
        List<String> esperada = Arrays.asList("hola", ">> 1 >>", "\\d+", "adiós");
        List<String> obtenida = Arrays.asList("hola", "qué tal", "33", "adiós",
                "adiós");
        
        assertLinesMatch(esperada, obtenida);
    }
    
    @Test
    void test7(){
        List<String> esperada = Arrays.asList("hola", ">> 1 >>", "\\d+", "adiós");
        List<String> obtenida = Arrays.asList("hola", "qué tal", "s33", "adiós",
                "adiós");
        
        assertLinesMatch(esperada, obtenida);
    }
    
    @Test
    void test8(){
        List<String> esperada = Arrays.asList(
                "Inicio operación",
                "a = \\d+",
                ">> trazas previas >>",
                "En operación",
                ">> trazas posteriores >> ",
                "Fin operación");
        List<String> obtenida = Arrays.asList(
                "Inicio operación",
                "a = 3",
                "b = 8",
                "a + b = 11",
                "En operación",
                "Fin operación");
        
        assertLinesMatch(esperada, obtenida);
    }
}

package com.mycompany.introducciontestunitarios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntroduccionJUnitTest {
    
    public IntroduccionJUnitTest() {
    }

    @Test
    public void testSuma() {
        int res = IntroduccionJUnit.suma(1,2);
        assertEquals(res,3);
    }
    
    @Test
    public void testSumaMal() {
        int res = IntroduccionJUnit.suma(2,2);
        assertEquals(res,3);
    }
    
    @Test
    public void testSumaFatal() {
        int res = IntroduccionJUnit.suma(1/0,2);
        assertEquals(res,3);
    }
    
}

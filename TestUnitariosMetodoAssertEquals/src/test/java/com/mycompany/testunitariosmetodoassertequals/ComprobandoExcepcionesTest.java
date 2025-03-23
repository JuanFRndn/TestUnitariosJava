package com.mycompany.testunitariosmetodoassertequals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComprobandoExcepcionesTest {

    public ComprobandoExcepcionesTest() {
    }

    @Test
    void test1() {
        try {
            int[] nums = new int[]{1, 2};
            int num = nums[10];
            fail("se espera una excepcion");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue(e.getMessage().contains("10"));
        } catch (Throwable t) {
            fail(t);
        }
    }

    @Test
    void test2() {
        int[] nums = new int[]{1, 2};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int num = nums[10];
        });
    }
    
    @Test
    void test3(){
        int[] nums = new int[] {1,2};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int num = nums[1];
        });
    }
    
    @Test
    void test4() {
        int[] nums = new int[]{1, 2};
        assertThrows(NullPointerException.class, () -> {
            int num = nums[10];
        });
    }
    
    @Test
    void test5() {
        int[] nums = new int[]{1, 2};
        assertThrows(Exception.class, () -> {
            int num = nums[10];
        });
    }
}

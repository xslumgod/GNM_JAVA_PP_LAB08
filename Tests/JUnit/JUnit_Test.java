package JUnit;
import org.junit.Test;
import static org.junit.Assert.*;

import static javafxapplication.FXMLDocumentController.completing;
        
public class JUnit_Test {


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    @Test
    public void resolveTest() throws Exception {
        assertTrue(completing(1, 2, 3) == 15.0);
        assertTrue(completing(1, 2, 4) == -48.0);
    }
    
    @Test
    public void zeroDivision() throws Exception {
        try {
            assertTrue("Проверка деления на 0", completing(2, 8, 4) == 0);
            fail("Нет ошибки при делнии на 0");
        }catch (Exception thrown){
            assertNotEquals("", thrown.getMessage());
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Customer.
     */
  
    /**
     * Test of loadCustomer method, of class Customer.
     */
  
    /**
     * Test of checkNic method, of class Customer.
     */
    @Test
    public void testCheckNic() {
        System.out.println("checkNic");
        String nic = "981452313v";
        String nic1 = "981452313f";
        String nic2 = "98145231v";


        Customer instance = new Customer();
        boolean expResult = true;
        boolean result = instance.checkNic(nic);
                boolean result1 = instance.checkNic(nic1);
        boolean result2 = instance.checkNic(nic2);

        assertEquals(expResult, result);
       

        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

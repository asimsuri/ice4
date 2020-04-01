/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asim
 */
public class Ice4Test {
    
    public Ice4Test() {
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
     * Test of main method, of class Ice4.
     */
    //@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ice4.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of firstmethod method, of class Ice4.
     */
    @Test
    public void testFirstmethod() {
        System.out.println("firstmethod");
        int expResult = 0;
        int result = Ice4.firstmethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of secondmethod method, of class Ice4.
     */
    @Test
    public void testSecondmethod() {
        System.out.println("secondmethod");
        int expResult = 0;
        int result = Ice4.secondmethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of thirdmethod method, of class Ice4.
     */
     @Test
    public void testThirdmethod() {
        System.out.println("thirdmethod");
        Ice4 instance = new Ice4();
        boolean expResult = false;
        boolean result = instance.thirdmethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
       
}

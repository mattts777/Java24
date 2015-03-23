/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*; 


/**
 *
 * @author matthew
 */
public class ClockFrameTest {
    
    public ClockFrameTest() {
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
     * Test of main method, of class ClockFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] arguments = null;
        ClockFrame.main(arguments);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(arguments[0],arguments[1]);
        
        
        //fail("The test case is a prototype.");
    }
    
}

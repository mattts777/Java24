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
public class DSLModemTest {
    
    public DSLModemTest() {
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
     * Test of connect method, of class DSLModem.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        DSLModem DSM = new DSLModem();
        
        
        assertEquals(DSM.method, "DSL phone connection");
        assertEquals(DSM.speed, 0);
        assertEquals(DSM.connect(), 777);
        
        
    }
    
}

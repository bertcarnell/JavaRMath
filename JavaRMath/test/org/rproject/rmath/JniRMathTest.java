/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rproject.rmath;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author carnellr
 */
public class JniRMathTest {
    
    public JniRMathTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dnorm method, of class JniRMath.
     */
    @Test
    public void testDnorm4() {
        System.out.println("dnorm4");
        double expResult = 1.0 / Math.sqrt(2 * Math.PI);
        double result = JniRMath.dnorm(0.0, 0.0, 1.0, 0);
        assertEquals(expResult, result, 1E-6);
    }

    /**
     * Test of pnorm method, of class JniRMath.
     */
    @Test
    public void testPnorm5() {
        System.out.println("pnorm5");
        double expResult = 0.5;
        double result = JniRMath.pnorm(0.0, 0.0, 1.0, 1, 0);
        assertEquals(expResult, result, 1E-6);
    }

    /**
     * Test of qnorm method, of class JniRMath.
     */
    @Test
    public void testQnorm5() {
        System.out.println("qnorm5");
        double expResult = 0.0;
        double result = JniRMath.qnorm(0.5, 0.0, 1.0, 1, 0);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of rnorm method, of class JniRMath.
     */
    @Test
    public void testRnorm() {
        System.out.println("rnorm");
        double result = JniRMath.rnorm(0.0, 1.0);
        assertTrue(result > Double.NEGATIVE_INFINITY && result < Double.POSITIVE_INFINITY);
    }

}

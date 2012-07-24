/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rproject.rmath;

import com.sun.jna.ptr.IntByReference;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author carnellr
 */
public class JnaRMathTest {
    
    public JnaRMathTest() {
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
     * Test of dnorm4 method, of class JnaRMath.
     */
    @Test
    public void testDnorm4() {
        System.out.println("dnorm4");
        double expResult = 1.0 / Math.sqrt(2 * Math.PI);
        double result = JnaRMath.dnorm4(0.0, 0.0, 1.0, 0);
        assertEquals(expResult, result, 1E-6);
    }

    /**
     * Test of pnorm5 method, of class JnaRMath.
     */
    @Test
    public void testPnorm5() {
        System.out.println("pnorm5");
        double expResult = 0.5;
        double result = JnaRMath.pnorm5(0.0, 0.0, 1.0, 1, 0);
        assertEquals(expResult, result, 1E-6);
    }

    /**
     * Test of qnorm5 method, of class JnaRMath.
     */
    @Test
    public void testQnorm5() {
        System.out.println("qnorm5");
        double expResult = 0.0;
        double result = JnaRMath.qnorm5(0.5, 0.0, 1.0, 1, 0);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of rnorm method, of class JnaRMath.
     */
    @Test
    public void testRnorm() {
        System.out.println("rnorm");
        double result = JnaRMath.rnorm(0.0, 1.0);
        assertTrue(result > Double.NEGATIVE_INFINITY && result < Double.POSITIVE_INFINITY);
    }

    /**
     * Test of dlnorm method, of class JnaRMath.
     */
    @Test
    public void testDlnorm() {
        System.out.println("dlnorm");
        double expResult = 0.0;
        double result = JnaRMath.dlnorm(0, 0.0, 1.0, 0);
        assertEquals(expResult, result, 0.0);
        expResult = 0.3989423;
        result = JnaRMath.dlnorm(1.0, 0.0, 1.0, 0);
        assertEquals(expResult, result, 1E-6);
    }

    /**
     * Test of plnorm method, of class JnaRMath.
     */
    @Test
    public void testPlnorm() {
        System.out.println("plnorm");
        double expResult = 0.0;
        double result = JnaRMath.plnorm(0, 0.0, 1.0, 1, 0);
        assertEquals(expResult, result, 0.0);
        expResult = 0.5;
        result = JnaRMath.plnorm(1.0, 0.0, 1.0, 1, 0);
        assertEquals(expResult, result, 1E-12);
    }

    /**
     * Test of qlnorm method, of class JnaRMath.
     */
    @Test
    public void testQlnorm() {
        System.out.println("qlnorm");
        double expResult = 0.0;
        double result = JnaRMath.qlnorm(0.0, 0.0, 1.0, 1, 0);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of rlnorm method, of class JnaRMath.
     */
    @Test
    public void testRlnorm() {
        System.out.println("rlnorm");
        double result = JnaRMath.rlnorm(0.0, 1.0);
        assertTrue(result >= 0.0 && result < Double.POSITIVE_INFINITY);
    }

    /**
     * Test of norm_rand method, of class JnaRMath.
     */
    @Test
    public void testNorm_rand() {
        System.out.println("norm_rand");
        double result = JnaRMath.norm_rand();
        assertTrue(result > Double.NEGATIVE_INFINITY && result < Double.POSITIVE_INFINITY);
    }

    /**
     * Test of unif_rand method, of class JnaRMath.
     */
    @Test
    public void testUnif_rand() {
        System.out.println("unif_rand");
        double result = JnaRMath.unif_rand();
        assertTrue(result >= 0.0 && result <= 1.0);
    }

    /**
     * Test of exp_rand method, of class JnaRMath.
     */
    @Test
    public void testExp_rand() {
        System.out.println("exp_rand");
        double result = JnaRMath.exp_rand();
        assertTrue(result > Double.NEGATIVE_INFINITY && result < Double.POSITIVE_INFINITY);
    }

    /**
     * Test of set_seed method, of class JnaRMath.
     */
    @Test
    public void testSet_seed() {
       System.out.println("set_seed");
       JnaRMath.set_seed(1976, 1986);
       
       IntByReference seed1 = new IntByReference();
       IntByReference seed2 = new IntByReference();
       JnaRMath.get_seed(seed1, seed2);
       
       assertEquals(1976, seed1.getValue());
       assertEquals(1986, seed2.getValue());
    }

    /**
     * Test of get_seed method, of class JnaRMath.
     */
    @Test
    public void testGet_seed() {
       System.out.println("set_seed");
       JnaRMath.set_seed(1976, 1986);
       
       IntByReference seed1 = new IntByReference();
       IntByReference seed2 = new IntByReference();
       JnaRMath.get_seed(seed1, seed2);
       
       assertEquals(1976, seed1.getValue());
       assertEquals(1986, seed2.getValue());
    }

    /**
     * Test of dunif method, of class JnaRMath.
     */
    @Test
    public void testDunif() {
        System.out.println("dunif");
        double result = JnaRMath.dunif(1.0, 0.0, 2.0, 0);
        assertEquals(1.0 / 2.0, result, 0.0);
    }

    /**
     * Test of punif method, of class JnaRMath.
     */
    @Test
    public void testPunif() {
        System.out.println("punif");
        double expResult = 0.5;
        double result = JnaRMath.punif(1.0, 0.0, 2.0, 1, 0);
        assertEquals(expResult, result, 1E-12);
    }

    /**
     * Test of qunif method, of class JnaRMath.
     */
    @Test
    public void testQunif() {
        System.out.println("qunif");
        double expResult = 1.0;
        double result = JnaRMath.qunif(0.5, 0.0, 2.0, 1, 0);
        assertEquals(expResult, result, 1E-12);
    }

    /**
     * Test of runif method, of class JnaRMath.
     */
    @Test
    public void testRunif() {
        System.out.println("runif");
        double result = JnaRMath.runif(0.0, 2.0);
        assertTrue(result >= 0.0 && result <= 2.0);
    }

    /**
     * Test of dgamma method, of class JnaRMath.
     */
    @Test
    public void testDgamma() {
        System.out.println("dgamma");
        double result = JnaRMath.dgamma(2.0, 1.0, 3.0, 0);
        assertEquals(0.171139, result, 1E-6);
    }

    /**
     * Test of pgamma method, of class JnaRMath.
     */
    @Test
    public void testPgamma() {
        System.out.println("pgamma");
        double result = JnaRMath.pgamma(0.5, 2.0, 3.0, 1, 0);
        assertEquals(0.01243799, result, 1E-6);
    }

    /**
     * Test of qgamma method, of class JnaRMath.
     */
    @Test
    public void testQgamma() {
        System.out.println("qgamma");
        double result = JnaRMath.qgamma(0.1, 2.0, 3.0, 1, 0);
        assertEquals(1.595435, result, 1E-6);
    }

    /**
     * Test of rgamma method, of class JnaRMath.
     */
    @Test
    public void testRgamma() {
        System.out.println("rgamma");
        double result = JnaRMath.rgamma(2.0, 3.0);
        assertTrue(result > 0.0 && result < Double.MAX_VALUE);
    }

    /**
     * Test of dbeta method, of class JnaRMath.
     */
    @Test
    public void testDbeta() {
        System.out.println("dbeta");
        double result = JnaRMath.dbeta(0.5, 2.0, 3.0, 0);
        assertEquals(1.5, result, 1E-12);
    }

    /**
     * Test of pbeta method, of class JnaRMath.
     */
    @Test
    public void testPbeta() {
        System.out.println("pbeta");
        double result = JnaRMath.pbeta(0.5, 2.0, 2.0, 1, 0);
        assertEquals(0.5, result, 1E-12);
    }

    /**
     * Test of qbeta method, of class JnaRMath.
     */
    @Test
    public void testQbeta() {
        System.out.println("qbeta");
        double result = JnaRMath.qbeta(0.5, 1.0, 2.0, 1, 0);
        assertEquals(0.2928932, result, 1E-6);
    }

    /**
     * Test of rbeta method, of class JnaRMath.
     */
    @Test
    public void testRbeta() {
        System.out.println("rbeta");
        double result = JnaRMath.rbeta(5.0, 1.0);
        assertTrue(result > 0.0 && result < 1.0);
    }

    /**
     * Test of dchisq method, of class JnaRMath.
     */
    @Test
    public void testDchisq() {
        System.out.println("dchisq");
        double result = JnaRMath.dchisq(1.0, 2, 0);
        assertEquals(0.3032653, result, 1E-6);
    }

    /**
     * Test of pchisq method, of class JnaRMath.
     */
    @Test
    public void testPchisq() {
        System.out.println("pchisq");
        double result = JnaRMath.pchisq(01.0, 2, 1, 0);
        assertEquals(0.3934693, result, 1E-6);
    }

    /**
     * Test of qchisq method, of class JnaRMath.
     */
    @Test
    public void testQchisq() {
        System.out.println("qchisq");
        double result = JnaRMath.qchisq(0.5, 2, 1, 0);
        assertEquals(1.386294, result, 1E-6);
    }

    /**
     * Test of rchisq method, of class JnaRMath.
     */
    @Test
    public void testRchisq() {
        System.out.println("rchisq");
        double result = JnaRMath.rchisq(2);
        assertTrue(result > 0.0 && result < Double.MAX_VALUE);
    }

    /**
     * Test of dnchisq method, of class JnaRMath.
     */
    @Test
    public void testDnchisq() {
        System.out.println("dnchisq");
        double result = JnaRMath.dnchisq(1.0, 2, 3.0, 0);
        assertEquals(0.1287654, result, 1E-6);
    }

    /**
     * Test of pnchisq method, of class JnaRMath.
     */
    @Test
    public void testPnchisq() {
        System.out.println("pnchisq");
        double result = JnaRMath.pnchisq(0.5, 2, 3.0, 1, 0);
        assertEquals(0.05878495, result, 1E-6);
    }

    /**
     * Test of qnchisq method, of class JnaRMath.
     */
    @Test
    public void testQnchisq() {
        System.out.println("qnchisq");
        double result = JnaRMath.qnchisq(0.5, 2, 3.0, 1, 0);
        assertEquals(4.059802, result, 1E-6);
    }

    /**
     * Test of rnchisq method, of class JnaRMath.
     */
    @Test
    public void testRnchisq() {
        System.out.println("rnchisq");
        double result = JnaRMath.rnchisq(2, 3.0);
        assertTrue(result > 0 && result < Double.MAX_VALUE);
    }

    /**
     * Test of df method, of class JnaRMath.
     */
    @Test
    public void testDf() {
        System.out.println("df");
        double x = 0.0;
        double df1 = 0.0;
        double df2 = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.df(x, df1, df2, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pf method, of class JnaRMath.
     */
    @Test
    public void testPf() {
        System.out.println("pf");
        double q = 0.0;
        double df1 = 0.0;
        double df2 = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.pf(q, df1, df2, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qf method, of class JnaRMath.
     */
    @Test
    public void testQf() {
        System.out.println("qf");
        double p = 0.0;
        double df1 = 0.0;
        double df2 = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qf(p, df1, df2, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rf method, of class JnaRMath.
     */
    @Test
    public void testRf() {
        System.out.println("rf");
        double df1 = 0.0;
        double df2 = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rf(df1, df2);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dt method, of class JnaRMath.
     */
    @Test
    public void testDt() {
        System.out.println("dt");
        double x = 0.0;
        double df = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dt(x, df, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pt method, of class JnaRMath.
     */
    @Test
    public void testPt() {
        System.out.println("pt");
        double q = 0.0;
        double df = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.pt(q, df, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qt method, of class JnaRMath.
     */
    @Test
    public void testQt() {
        System.out.println("qt");
        double p = 0.0;
        double df = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qt(p, df, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rt method, of class JnaRMath.
     */
    @Test
    public void testRt() {
        System.out.println("rt");
        double df = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rt(df);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dbinom method, of class JnaRMath.
     */
    @Test
    public void testDbinom() {
        System.out.println("dbinom");
        double x = 0.0;
        double size = 0.0;
        double prob = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dbinom(x, size, prob, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pbinom method, of class JnaRMath.
     */
    @Test
    public void testPbinom() {
        System.out.println("pbinom");
        double q = 0.0;
        double size = 0.0;
        double prob = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.pbinom(q, size, prob, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qbinom method, of class JnaRMath.
     */
    @Test
    public void testQbinom() {
        System.out.println("qbinom");
        double p = 0.0;
        double size = 0.0;
        double prob = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qbinom(p, size, prob, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rbinom method, of class JnaRMath.
     */
    @Test
    public void testRbinom() {
        System.out.println("rbinom");
        double size = 0.0;
        double prob = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rbinom(size, prob);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rmultinom method, of class JnaRMath.
     */
    @Test
    public void testRmultinom() {
        System.out.println("rmultinom");
        int n = 10;
        int k = 5;
        double[] prob = new double[k];
        prob[0] = 0.4; prob[1] = 0.3; prob[2] = 0.1; prob[3] = 0.1; prob[4] = 0.1;
        int[] rN = new int[k];
        JnaRMath.rmultinom(n, prob, k, rN);
        
        int sum = 0;
        for (int i = 0; i < k; i++)
        {
            assertTrue(rN[i] <= n);
            sum += rN[i];
        }
        assertEquals(n, sum);
    }

    /**
     * Test of dcauchy method, of class JnaRMath.
     */
    @Test
    public void testDcauchy() {
        System.out.println("dcauchy");
        double x = 0.0;
        double location = 0.0;
        double scale = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dcauchy(x, location, scale, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pcauchy method, of class JnaRMath.
     */
    @Test
    public void testPcauchy() {
        System.out.println("pcauchy");
        double q = 0.0;
        double location = 0.0;
        double scale = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.pcauchy(q, location, scale, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qcauchy method, of class JnaRMath.
     */
    @Test
    public void testQcauchy() {
        System.out.println("qcauchy");
        double p = 0.0;
        double location = 0.0;
        double scale = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qcauchy(p, location, scale, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rcauchy method, of class JnaRMath.
     */
    @Test
    public void testRcauchy() {
        System.out.println("rcauchy");
        double location = 0.0;
        double scale = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rcauchy(location, scale);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dexp method, of class JnaRMath.
     */
    @Test
    public void testDexp() {
        System.out.println("dexp");
        double x = 0.0;
        double rate = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dexp(x, rate, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pexp method, of class JnaRMath.
     */
    @Test
    public void testPexp() {
        System.out.println("pexp");
        double q = 0.0;
        double rate = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.pexp(q, rate, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qexp method, of class JnaRMath.
     */
    @Test
    public void testQexp() {
        System.out.println("qexp");
        double p = 0.0;
        double rate = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qexp(p, rate, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rexp method, of class JnaRMath.
     */
    @Test
    public void testRexp() {
        System.out.println("rexp");
        double rate = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rexp(rate);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dgeom method, of class JnaRMath.
     */
    @Test
    public void testDgeom() {
        System.out.println("dgeom");
        double x = 0.0;
        double prob = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dgeom(x, prob, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pgeom method, of class JnaRMath.
     */
    @Test
    public void testPgeom() {
        System.out.println("pgeom");
        double q = 0.0;
        double prob = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.pgeom(q, prob, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qgeom method, of class JnaRMath.
     */
    @Test
    public void testQgeom() {
        System.out.println("qgeom");
        double p = 0.0;
        double prob = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qgeom(p, prob, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rgeom method, of class JnaRMath.
     */
    @Test
    public void testRgeom() {
        System.out.println("rgeom");
        double prob = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rgeom(prob);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dhyper method, of class JnaRMath.
     */
    @Test
    public void testDhyper() {
        System.out.println("dhyper");
        double x = 0.0;
        double m = 0.0;
        double n = 0.0;
        double k = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dhyper(x, m, n, k, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of phyper method, of class JnaRMath.
     */
    @Test
    public void testPhyper() {
        System.out.println("phyper");
        double q = 0.0;
        double m = 0.0;
        double n = 0.0;
        double k = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.phyper(q, m, n, k, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qhyper method, of class JnaRMath.
     */
    @Test
    public void testQhyper() {
        System.out.println("qhyper");
        double p = 0.0;
        double m = 0.0;
        double n = 0.0;
        double k = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qhyper(p, m, n, k, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rhyper method, of class JnaRMath.
     */
    @Test
    public void testRhyper() {
        System.out.println("rhyper");
        double m = 0.0;
        double n = 0.0;
        double k = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rhyper(m, n, k);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dnbinom method, of class JnaRMath.
     */
    @Test
    public void testDnbinom() {
        System.out.println("dnbinom");
        double x = 0.0;
        double size = 0.0;
        double prob = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dnbinom(x, size, prob, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pnbinom method, of class JnaRMath.
     */
    @Test
    public void testPnbinom() {
        System.out.println("pnbinom");
        double q = 0.0;
        double size = 0.0;
        double prob = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.pnbinom(q, size, prob, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qnbinom method, of class JnaRMath.
     */
    @Test
    public void testQnbinom() {
        System.out.println("qnbinom");
        double p = 0.0;
        double size = 0.0;
        double prob = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qnbinom(p, size, prob, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rnbinom method, of class JnaRMath.
     */
    @Test
    public void testRnbinom() {
        System.out.println("rnbinom");
        double size = 0.0;
        double prob = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rnbinom(size, prob);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dnbinom_mu method, of class JnaRMath.
     */
    @Test
    public void testDnbinom_mu() {
        System.out.println("dnbinom_mu");
        double x = 0.0;
        double size = 0.0;
        double mu = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dnbinom_mu(x, size, mu, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pnbinom_mu method, of class JnaRMath.
     */
    @Test
    public void testPnbinom_mu() {
        System.out.println("pnbinom_mu");
        double q = 0.0;
        double size = 0.0;
        double mu = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.pnbinom_mu(q, size, mu, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qnbinom_mu method, of class JnaRMath.
     */
    @Test
    public void testQnbinom_mu() {
        System.out.println("qnbinom_mu");
        double p = 0.0;
        double size = 0.0;
        double mu = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qnbinom_mu(p, size, mu, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rnbinom_mu method, of class JnaRMath.
     */
    @Test
    public void testRnbinom_mu() {
        System.out.println("rnbinom_mu");
        double size = 0.0;
        double mu = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rnbinom_mu(size, mu);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dpois method, of class JnaRMath.
     */
    @Test
    public void testDpois() {
        System.out.println("dpois");
        double x = 0.0;
        double lambda = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dpois(x, lambda, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ppois method, of class JnaRMath.
     */
    @Test
    public void testPpois() {
        System.out.println("ppois");
        double q = 0.0;
        double lambda = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.ppois(q, lambda, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qpois method, of class JnaRMath.
     */
    @Test
    public void testQpois() {
        System.out.println("qpois");
        double p = 0.0;
        double lambda = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qpois(p, lambda, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rpois method, of class JnaRMath.
     */
    @Test
    public void testRpois() {
        System.out.println("rpois");
        double lambda = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rpois(lambda);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dweibull method, of class JnaRMath.
     */
    @Test
    public void testDweibull() {
        System.out.println("dweibull");
        double x = 0.0;
        double shape = 0.0;
        double scale = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dweibull(x, shape, scale, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pweibull method, of class JnaRMath.
     */
    @Test
    public void testPweibull() {
        System.out.println("pweibull");
        double q = 0.0;
        double shape = 0.0;
        double scale = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.pweibull(q, shape, scale, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qweibull method, of class JnaRMath.
     */
    @Test
    public void testQweibull() {
        System.out.println("qweibull");
        double p = 0.0;
        double shape = 0.0;
        double scale = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qweibull(p, shape, scale, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rweibull method, of class JnaRMath.
     */
    @Test
    public void testRweibull() {
        System.out.println("rweibull");
        double shape = 0.0;
        double scale = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rweibull(shape, scale);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dlogis method, of class JnaRMath.
     */
    @Test
    public void testDlogis() {
        System.out.println("dlogis");
        double x = 0.0;
        double location = 0.0;
        double scale = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dlogis(x, location, scale, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plogis method, of class JnaRMath.
     */
    @Test
    public void testPlogis() {
        System.out.println("plogis");
        double q = 0.0;
        double location = 0.0;
        double scale = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.plogis(q, location, scale, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qlogis method, of class JnaRMath.
     */
    @Test
    public void testQlogis() {
        System.out.println("qlogis");
        double p = 0.0;
        double location = 0.0;
        double scale = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qlogis(p, location, scale, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rlogis method, of class JnaRMath.
     */
    @Test
    public void testRlogis() {
        System.out.println("rlogis");
        double location = 0.0;
        double scale = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rlogis(location, scale);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dnbeta method, of class JnaRMath.
     */
    @Test
    public void testDnbeta() {
        System.out.println("dnbeta");
        double x = 0.0;
        double shape1 = 0.0;
        double shape2 = 0.0;
        double ncp = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dnbeta(x, shape1, shape2, ncp, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pnbeta method, of class JnaRMath.
     */
    @Test
    public void testPnbeta() {
        System.out.println("pnbeta");
        double p = 0.0;
        double shape1 = 0.0;
        double shape2 = 0.0;
        double ncp = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.pnbeta(p, shape1, shape2, ncp, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qnbeta method, of class JnaRMath.
     */
    @Test
    public void testQnbeta() {
        System.out.println("qnbeta");
        double q = 0.0;
        double shape1 = 0.0;
        double shape2 = 0.0;
        double ncp = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qnbeta(q, shape1, shape2, ncp, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rnbeta method, of class JnaRMath.
     */
    @Test
    public void testRnbeta() {
        System.out.println("rnbeta");
        double shape1 = 0.0;
        double shape2 = 0.0;
        double ncp = 0.0;
        double expResult = 0.0;
        
        //TODO:  not found in RMath
        //// double result = JnaRMath.rnbeta(shape1, shape2, ncp);
        //// assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dnf method, of class JnaRMath.
     */
    @Test
    public void testDnf() {
        System.out.println("dnf");
        double x = 0.0;
        double df1 = 0.0;
        double df2 = 0.0;
        double ncp = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dnf(x, df1, df2, ncp, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pnf method, of class JnaRMath.
     */
    @Test
    public void testPnf() {
        System.out.println("pnf");
        double p = 0.0;
        double df1 = 0.0;
        double df2 = 0.0;
        double ncp = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.pnf(p, df1, df2, ncp, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qnf method, of class JnaRMath.
     */
    @Test
    public void testQnf() {
        System.out.println("qnf");
        double q = 0.0;
        double df1 = 0.0;
        double df2 = 0.0;
        double ncp = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qnf(q, df1, df2, ncp, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dnt method, of class JnaRMath.
     */
    @Test
    public void testDnt() {
        System.out.println("dnt");
        double x = 0.0;
        double df = 0.0;
        double ncp = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dnt(x, df, ncp, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pnt method, of class JnaRMath.
     */
    @Test
    public void testPnt() {
        System.out.println("pnt");
        double q = 0.0;
        double df = 0.0;
        double ncp = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.pnt(q, df, ncp, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qnt method, of class JnaRMath.
     */
    @Test
    public void testQnt() {
        System.out.println("qnt");
        double p = 0.0;
        double df = 0.0;
        double ncp = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qnt(p, df, ncp, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ptukey method, of class JnaRMath.
     */
    @Test
    public void testPtukey() {
        System.out.println("ptukey");
        double q = 0.0;
        double nranges = 0.0;
        double nmeans = 0.0;
        double df = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.ptukey(q, nranges, nmeans, df, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qtukey method, of class JnaRMath.
     */
    @Test
    public void testQtukey() {
        System.out.println("qtukey");
        double p = 0.0;
        double nranges = 0.0;
        double nmeans = 0.0;
        double df = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qtukey(p, nranges, nmeans, df, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dwilcox method, of class JnaRMath.
     */
    @Test
    public void testDwilcox() {
        System.out.println("dwilcox");
        double x = 0.0;
        double m = 0.0;
        double n = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dwilcox(x, m, n, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pwilcox method, of class JnaRMath.
     */
    @Test
    public void testPwilcox() {
        System.out.println("pwilcox");
        double q = 0.0;
        double m = 0.0;
        double n = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.pwilcox(q, m, n, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qwilcox method, of class JnaRMath.
     */
    @Test
    public void testQwilcox() {
        System.out.println("qwilcox");
        double p = 0.0;
        double m = 0.0;
        double n = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qwilcox(p, m, n, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rwilcox method, of class JnaRMath.
     */
    @Test
    public void testRwilcox() {
        System.out.println("rwilcox");
        double m = 0.0;
        double n = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rwilcox(m, n);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dsignrank method, of class JnaRMath.
     */
    @Test
    public void testDsignrank() {
        System.out.println("dsignrank");
        double x = 0.0;
        double n = 0.0;
        int log = 0;
        double expResult = 0.0;
        // double result = JnaRMath.dsignrank(x, n, log);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of psignrank method, of class JnaRMath.
     */
    @Test
    public void testPsignrank() {
        System.out.println("psignrank");
        double q = 0.0;
        double n = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.psignrank(q, n, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qsignrank method, of class JnaRMath.
     */
    @Test
    public void testQsignrank() {
        System.out.println("qsignrank");
        double p = 0.0;
        double n = 0.0;
        int lower_tail = 0;
        int log_p = 0;
        double expResult = 0.0;
        // double result = JnaRMath.qsignrank(p, n, lower_tail, log_p);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rsignrank method, of class JnaRMath.
     */
    @Test
    public void testRsignrank() {
        System.out.println("rsignrank");
        double n = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.rsignrank(n);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gammafn method, of class JnaRMath.
     */
    @Test
    public void testGammafn() {
        System.out.println("gammafn");
        double x = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.gammafn(x);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lgammafn method, of class JnaRMath.
     */
    @Test
    public void testLgammafn() {
        System.out.println("lgammafn");
        double x = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.lgammafn(x);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of psigamma method, of class JnaRMath.
     */
    @Test
    public void testPsigamma() {
        System.out.println("psigamma");
        double x = 0.0;
        double deriv = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.psigamma(x, deriv);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of digamma method, of class JnaRMath.
     */
    @Test
    public void testDigamma() {
        System.out.println("digamma");
        double x = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.digamma(x);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trigamma method, of class JnaRMath.
     */
    @Test
    public void testTrigamma() {
        System.out.println("trigamma");
        double x = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.trigamma(x);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beta method, of class JnaRMath.
     */
    @Test
    public void testBeta() {
        System.out.println("beta");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.beta(a, b);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lbeta method, of class JnaRMath.
     */
    @Test
    public void testLbeta() {
        System.out.println("lbeta");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.lbeta(a, b);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of choose method, of class JnaRMath.
     */
    @Test
    public void testChoose() {
        System.out.println("choose");
        double n = 0.0;
        double k = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.choose(n, k);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lchoose method, of class JnaRMath.
     */
    @Test
    public void testLchoose() {
        System.out.println("lchoose");
        double n = 0.0;
        double k = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.lchoose(n, k);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bessel_i method, of class JnaRMath.
     */
    @Test
    public void testBessel_i() {
        System.out.println("bessel_i");
        double x = 0.0;
        double nu = 0.0;
        double expon_scaled = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.bessel_i(x, nu, expon_scaled);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bessel_j method, of class JnaRMath.
     */
    @Test
    public void testBessel_j() {
        System.out.println("bessel_j");
        double x = 0.0;
        double nu = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.bessel_j(x, nu);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bessel_k method, of class JnaRMath.
     */
    @Test
    public void testBessel_k() {
        System.out.println("bessel_k");
        double x = 0.0;
        double nu = 0.0;
        double expon_scaled = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.bessel_k(x, nu, expon_scaled);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bessel_y method, of class JnaRMath.
     */
    @Test
    public void testBessel_y() {
        System.out.println("bessel_y");
        double x = 0.0;
        double nu = 0.0;
        double expResult = 0.0;
        // double result = JnaRMath.bessel_y(x, nu);
        // assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

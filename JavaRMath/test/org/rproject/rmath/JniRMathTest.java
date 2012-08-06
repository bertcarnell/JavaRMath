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
    public void testDnorm() {
        System.out.println("dnorm");
        double expResult = 1.0 / Math.sqrt(2 * Math.PI);
        double result = JniRMath.dnorm(0.0, 0.0, 1.0, 0);
        assertEquals(expResult, result, 1E-6);
    }
    
    /**
     * Test of pnorm method, of class JniRMath.
     */
    @Test
    public void testPnorm() {
        System.out.println("pnorm");
        double expResult = 0.5;
        double result = JniRMath.pnorm(0.0, 0.0, 1.0, 1, 0);
        assertEquals(expResult, result, 1E-6);
    }

    /**
     * Test of qnorm method, of class JniRMath.
     */
    @Test
    public void testQnorm() {
        System.out.println("qnorm");
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

    /**
     * Test of dlnorm method, of class JniRMath.
     */
    @Test
    public void testDlnorm() {
        System.out.println("dlnorm");
        double expResult = 0.0;
        double result = JniRMath.dlnorm(0, 0.0, 1.0, 0);
        assertEquals(expResult, result, 0.0);
        expResult = 0.3989423;
        result = JniRMath.dlnorm(1.0, 0.0, 1.0, 0);
        assertEquals(expResult, result, 1E-6);
    }

    /**
     * Test of plnorm method, of class JniRMath.
     */
    @Test
    public void testPlnorm() {
        System.out.println("plnorm");
        double expResult = 0.0;
        double result = JniRMath.plnorm(0, 0.0, 1.0, 1, 0);
        assertEquals(expResult, result, 0.0);
        expResult = 0.5;
        result = JniRMath.plnorm(1.0, 0.0, 1.0, 1, 0);
        assertEquals(expResult, result, 1E-12);
    }

    /**
     * Test of qlnorm method, of class JniRMath.
     */
    @Test
    public void testQlnorm() {
        System.out.println("qlnorm");
        double expResult = 0.0;
        double result = JniRMath.qlnorm(0.0, 0.0, 1.0, 1, 0);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of rlnorm method, of class JniRMath.
     */
    @Test
    public void testRlnorm() {
        System.out.println("rlnorm");
        double result = JniRMath.rlnorm(0.0, 1.0);
        assertTrue(result >= 0.0 && result < Double.POSITIVE_INFINITY);
    }

    /**
     * Test of norm_rand method, of class JniRMath.
     */
    @Test
    public void testNorm_rand() {
        System.out.println("norm_rand");
        double result = JniRMath.norm_rand();
        assertTrue(result > Double.NEGATIVE_INFINITY && result < Double.POSITIVE_INFINITY);
    }

    /**
     * Test of unif_rand method, of class JniRMath.
     */
    @Test
    public void testUnif_rand() {
        System.out.println("unif_rand");
        double result = JniRMath.unif_rand();
        assertTrue(result >= 0.0 && result <= 1.0);
    }

    /**
     * Test of exp_rand method, of class JniRMath.
     */
    @Test
    public void testExp_rand() {
        System.out.println("exp_rand");
        double result = JniRMath.exp_rand();
        assertTrue(result > Double.NEGATIVE_INFINITY && result < Double.POSITIVE_INFINITY);
    }

    /**
     * Test of set_seed method, of class JniRMath.
     */
    @Test
    public void testSet_seed() {
       System.out.println("set_seed");
       JniRMath.set_seed(1976, 1986);

       int[] seed = JniRMath.get_seed();
       
       assertEquals(1976, seed[0]);
       assertEquals(1986, seed[1]);
    }

    /**
     * Test of get_seed method, of class JniRMath.
     */
    @Test
    public void testGet_seed() {
       System.out.println("get_seed");
       JniRMath.set_seed(1976, 1986);

       int[] seed = JniRMath.get_seed();
       
       assertEquals(1976, seed[0]);
       assertEquals(1986, seed[1]);
    }

    /**
     * Test of dunif method, of class JniRMath.
     */
    @Test
    public void testDunif() {
        System.out.println("dunif");
        double result = JniRMath.dunif(1.0, 0.0, 2.0, 0);
        assertEquals(1.0 / 2.0, result, 0.0);
    }

    /**
     * Test of punif method, of class JniRMath.
     */
    @Test
    public void testPunif() {
        System.out.println("punif");
        double expResult = 0.5;
        double result = JniRMath.punif(1.0, 0.0, 2.0, 1, 0);
        assertEquals(expResult, result, 1E-12);
    }

    /**
     * Test of qunif method, of class JniRMath.
     */
    @Test
    public void testQunif() {
        System.out.println("qunif");
        double expResult = 1.0;
        double result = JniRMath.qunif(0.5, 0.0, 2.0, 1, 0);
        assertEquals(expResult, result, 1E-12);
    }

    /**
     * Test of runif method, of class JniRMath.
     */
    @Test
    public void testRunif() {
        System.out.println("runif");
        double result = JniRMath.runif(0.0, 2.0);
        assertTrue(result >= 0.0 && result <= 2.0);
    }

    /**
     * Test of dgamma method, of class JniRMath.
     */
    @Test
    public void testDgamma() {
        System.out.println("dgamma");
        double result = JniRMath.dgamma(2.0, 1.0, 3.0, 0);
        assertEquals(0.171139, result, 1E-6);
    }

    /**
     * Test of pgamma method, of class JniRMath.
     */
    @Test
    public void testPgamma() {
        System.out.println("pgamma");
        double result = JniRMath.pgamma(0.5, 2.0, 3.0, 1, 0);
        assertEquals(0.01243799, result, 1E-6);
    }

    /**
     * Test of qgamma method, of class JniRMath.
     */
    @Test
    public void testQgamma() {
        System.out.println("qgamma");
        double result = JniRMath.qgamma(0.1, 2.0, 3.0, 1, 0);
        assertEquals(1.595435, result, 1E-6);
    }

    /**
     * Test of rgamma method, of class JniRMath.
     */
    @Test
    public void testRgamma() {
        System.out.println("rgamma");
        double result = JniRMath.rgamma(2.0, 3.0);
        assertTrue(result > 0.0 && result < Double.MAX_VALUE);
    }

    /**
     * Test of dbeta method, of class JniRMath.
     */
    @Test
    public void testDbeta() {
        System.out.println("dbeta");
        double result = JniRMath.dbeta(0.5, 2.0, 3.0, 0);
        assertEquals(1.5, result, 1E-12);
    }

    /**
     * Test of pbeta method, of class JniRMath.
     */
    @Test
    public void testPbeta() {
        System.out.println("pbeta");
        double result = JniRMath.pbeta(0.5, 2.0, 2.0, 1, 0);
        assertEquals(0.5, result, 1E-12);
    }

    /**
     * Test of qbeta method, of class JniRMath.
     */
    @Test
    public void testQbeta() {
        System.out.println("qbeta");
        double result = JniRMath.qbeta(0.5, 1.0, 2.0, 1, 0);
        assertEquals(0.2928932, result, 1E-6);
    }

    /**
     * Test of rbeta method, of class JniRMath.
     */
    @Test
    public void testRbeta() {
        System.out.println("rbeta");
        double result = JniRMath.rbeta(5.0, 1.0);
        assertTrue(result > 0.0 && result < 1.0);
    }

    /**
     * Test of dchisq method, of class JniRMath.
     */
    @Test
    public void testDchisq() {
        System.out.println("dchisq");
        double result = JniRMath.dchisq(1.0, 2, 0);
        assertEquals(0.3032653, result, 1E-6);
    }

    /**
     * Test of pchisq method, of class JniRMath.
     */
    @Test
    public void testPchisq() {
        System.out.println("pchisq");
        double result = JniRMath.pchisq(01.0, 2, 1, 0);
        assertEquals(0.3934693, result, 1E-6);
    }

    /**
     * Test of qchisq method, of class JniRMath.
     */
    @Test
    public void testQchisq() {
        System.out.println("qchisq");
        double result = JniRMath.qchisq(0.5, 2, 1, 0);
        assertEquals(1.386294, result, 1E-6);
    }

    /**
     * Test of rchisq method, of class JniRMath.
     */
    @Test
    public void testRchisq() {
        System.out.println("rchisq");
        double result = JniRMath.rchisq(2);
        assertTrue(result > 0.0 && result < Double.MAX_VALUE);
    }

    /**
     * Test of dnchisq method, of class JniRMath.
     */
    @Test
    public void testDnchisq() {
        System.out.println("dnchisq");
        double result = JniRMath.dnchisq(1.0, 2, 3.0, 0);
        assertEquals(0.1287654, result, 1E-6);
    }

    /**
     * Test of pnchisq method, of class JniRMath.
     */
    @Test
    public void testPnchisq() {
        System.out.println("pnchisq");
        double result = JniRMath.pnchisq(0.5, 2, 3.0, 1, 0);
        assertEquals(0.05878495, result, 1E-6);
    }

    /**
     * Test of qnchisq method, of class JniRMath.
     */
    @Test
    public void testQnchisq() {
        System.out.println("qnchisq");
        double result = JniRMath.qnchisq(0.5, 2, 3.0, 1, 0);
        assertEquals(4.059802, result, 1E-6);
    }

    /**
     * Test of rnchisq method, of class JniRMath.
     */
    @Test
    public void testRnchisq() {
        System.out.println("rnchisq");
        double result = JniRMath.rnchisq(2, 3.0);
        assertTrue(result > 0 && result < Double.MAX_VALUE);
    }

    /**
     * Test of df method, of class JniRMath.
     */
    @Test
    public void testDf() {
        System.out.println("df");
        double result = JniRMath.df(2.0, 2.0, 3.0, 0);
        assertEquals(0.1202425, result, 1E7);
    }

    /**
     * Test of pf method, of class JniRMath.
     */
    @Test
    public void testPf() {
        System.out.println("pf");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.pf(2.0, 2.0, 3.0, lower_tail, log_p);
        assertEquals(0.7194341, result, 1E-7);
    }

    /**
     * Test of qf method, of class JniRMath.
     */
    @Test
    public void testQf() {
        System.out.println("qf");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.qf(0.5, 2.0, 3.0, lower_tail, log_p);
        assertEquals(0.8811016, result, 1E-7);
    }

    /**
     * Test of rf method, of class JniRMath.
     */
    @Test
    public void testRf() {
        System.out.println("rf");
        double result = JniRMath.rf(2.0, 3.0);
        assertTrue(result > 0 && result < Double.MAX_VALUE);
    }

    /**
     * Test of dt method, of class JniRMath.
     */
    @Test
    public void testDt() {
        System.out.println("dt");
        int log = 0;
        double result = JniRMath.dt(2.0, 3.0, log);
        assertEquals(0.06750966, result, 1E-7);
    }

    /**
     * Test of pt method, of class JniRMath.
     */
    @Test
    public void testPt() {
        System.out.println("pt");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.pt(2.0, 3.0, lower_tail, log_p);
        assertEquals(0.930337, result, 1E-7);
    }

    /**
     * Test of qt method, of class JniRMath.
     */
    @Test
    public void testQt() {
        System.out.println("qt");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.qt(0.9, 3.0, lower_tail, log_p);
        assertEquals(1.637744, result, 1E-6);
    }

    /**
     * Test of rt method, of class JniRMath.
     */
    @Test
    public void testRt() {
        System.out.println("rt");
        double result = JniRMath.rt(3.0);
        assertTrue(result > Double.NEGATIVE_INFINITY && result < Double.POSITIVE_INFINITY);
    }

    /**
     * Test of dbinom method, of class JniRMath.
     */
    @Test
    public void testDbinom() {
        System.out.println("dbinom");
        int log = 0;
        double result = JniRMath.dbinom(3.0, 10.0, 0.6, log);
        assertEquals(0.04246733, result, 1E-8);
    }

    /**
     * Test of pbinom method, of class JniRMath.
     */
    @Test
    public void testPbinom() {
        System.out.println("pbinom");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.pbinom(3.0, 10.0, 0.6, lower_tail, log_p);
        assertEquals(0.05476188, result, 1E-7);
    }

    /**
     * Test of qbinom method, of class JniRMath.
     */
    @Test
    public void testQbinom() {
        System.out.println("qbinom");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.qbinom(0.5, 10.0, 0.6, lower_tail, log_p);
        assertEquals(6.0, result, 1E-12);
    }

    /**
     * Test of rbinom method, of class JniRMath.
     */
    @Test
    public void testRbinom() {
        System.out.println("rbinom");
        double result = JniRMath.rbinom(10.0, 0.6);
        assertTrue(result >= 0.0 && result <= 10.0);
    }

    /**
     * Test of rmultinom method, of class JniRMath.
     */
    @Test
    public void testRmultinom() {
        System.out.println("rmultinom");
        int n = 10;
        int k = 5;
        double[] prob = new double[k];
        prob[0] = 0.4; prob[1] = 0.3; prob[2] = 0.1; prob[3] = 0.1; prob[4] = 0.1;
        int[] rN = new int[k];
        JniRMath.rmultinom(n, prob, k, rN);
        
        int sum = 0;
        for (int i = 0; i < k; i++)
        {
            assertTrue(rN[i] <= n);
            sum += rN[i];
        }
        assertEquals(n, sum);
    }

    /**
     * Test of dcauchy method, of class JniRMath.
     */
    @Test
    public void testDcauchy() {
        System.out.println("dcauchy");
        int log = 0;
        double result = JniRMath.dcauchy(0.0, 1.0, 2.0, log);
        assertEquals(0.127324, result, 1E-6);
    }

    /**
     * Test of pcauchy method, of class JniRMath.
     */
    @Test
    public void testPcauchy() {
        System.out.println("pcauchy");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.pcauchy(0.0, 1.0, 2.0, lower_tail, log_p);
        assertEquals(0.3524164, result, 1E-7);
    }

    /**
     * Test of qcauchy method, of class JniRMath.
     */
    @Test
    public void testQcauchy() {
        System.out.println("qcauchy");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.qcauchy(0.6, 1.0, 2.0, lower_tail, log_p);
        assertEquals(1.649839, result, 1E-6);
    }

    /**
     * Test of rcauchy method, of class JniRMath.
     */
    @Test
    public void testRcauchy() {
        System.out.println("rcauchy");
        double result = JniRMath.rcauchy(1.0, 2.0);
        assertTrue(result > Double.NEGATIVE_INFINITY && result < Double.POSITIVE_INFINITY);
    }

    /**
     * Test of dexp method, of class JniRMath.
     */
    @Test
    public void testDexp() {
        System.out.println("dexp");
        int log = 0;
        double result = JniRMath.dexp(1.0, 0.5, log);
        assertEquals(0.2706706, result, 1E-7);
    }

    /**
     * Test of pexp method, of class JniRMath.
     */
    @Test
    public void testPexp() {
        System.out.println("pexp");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.pexp(0.5, 0.5, lower_tail, log_p);
        assertEquals(0.6321206, result, 1E-7);
    }

    /**
     * Test of qexp method, of class JniRMath.
     */
    @Test
    public void testQexp() {
        System.out.println("qexp");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.qexp(0.5, 0.5, lower_tail, log_p);
        assertEquals(0.3465736, result, 1E-7);
    }

    /**
     * Test of rexp method, of class JniRMath.
     */
    @Test
    public void testRexp() {
        System.out.println("rexp");
        double result = JniRMath.rexp(2.0);
        assertTrue(result > 0.0 && result < Double.MAX_VALUE);
    }

    /**
     * Test of dgeom method, of class JniRMath.
     */
    @Test
    public void testDgeom() {
        System.out.println("dgeom");
        int log = 0;
        double result = JniRMath.dgeom(1.0, 0.5, log);
        assertEquals(0.25, result, 1E-12);
    }

    /**
     * Test of pgeom method, of class JniRMath.
     */
    @Test
    public void testPgeom() {
        System.out.println("pgeom");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.pgeom(1.0, 0.5, lower_tail, log_p);
        assertEquals(0.75, result, 1E-12);
    }

    /**
     * Test of qgeom method, of class JniRMath.
     */
    @Test
    public void testQgeom() {
        System.out.println("qgeom");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.qgeom(0.9, 0.6, lower_tail, log_p);
        assertEquals(2.0, result, 1E-12);
    }

    /**
     * Test of rgeom method, of class JniRMath.
     */
    @Test
    public void testRgeom() {
        System.out.println("rgeom");
        double result = JniRMath.rgeom(0.6);
        assertTrue(result >= 0.0 && result < Double.MAX_VALUE);
    }

    /**
     * Test of dhyper method, of class JniRMath.
     */
    @Test
    public void testDhyper() {
        System.out.println("dhyper");
        int log = 0;
        double result = JniRMath.dhyper(3, 5, 20, 10, log);
        assertEquals(0.2371542, result, 1e-7);
    }

    /**
     * Test of phyper method, of class JniRMath.
     */
    @Test
    public void testPhyper() {
        System.out.println("phyper");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.phyper(3.0, 5.0, 20.0, 10.0, lower_tail, log_p);
        assertEquals(0.9359684, result, 1E-7);
    }

    /**
     * Test of qhyper method, of class JniRMath.
     */
    @Test
    public void testQhyper() {
        System.out.println("qhyper");
        int lower_tail = 1;
        int log_p = 0;
       double result = JniRMath.qhyper(0.5, 5.0, 20.0, 10.0, lower_tail, log_p);
        assertEquals(2.0, result, 1E-12);
    }

    /**
     * Test of rhyper method, of class JniRMath.
     */
    @Test
    public void testRhyper() {
        System.out.println("rhyper");
        double m = 0.0;
        double n = 0.0;
        double k = 0.0;
        double result = JniRMath.rhyper(m, n, k);
        assertTrue(result >= 0 && result < Double.MAX_VALUE);
        assertTrue(Math.abs(Math.floor(result) - result) < 1E-12);
    }

    /**
     * Test of dnbinom method, of class JniRMath.
     */
    @Test
    public void testDnbinom() {
        System.out.println("dnbinom");
        int log = 0;
        double result = JniRMath.dnbinom(3.0, 10.0, 0.5, log);
        assertEquals(0.02685547, result, 1E-7);
    }

    /**
     * Test of pnbinom method, of class JniRMath.
     */
    @Test
    public void testPnbinom() {
        System.out.println("pnbinom");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.pnbinom(3.0, 10.0, 0.5, lower_tail, log_p);
        assertEquals(0.04614258, result, 1E-7);
    }

    /**
     * Test of qnbinom method, of class JniRMath.
     */
    @Test
    public void testQnbinom() {
        System.out.println("qnbinom");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.qnbinom(0.5, 10.0, 0.5, lower_tail, log_p);
        assertEquals(9.0, result, 1E-12);
    }

    /**
     * Test of rnbinom method, of class JniRMath.
     */
    @Test
    public void testRnbinom() {
        System.out.println("rnbinom");
        double result = JniRMath.rnbinom(10.0, 0.5);
        assertTrue(result >= 0.0 && result < Double.MAX_VALUE);
        assertTrue(Math.abs(Math.floor(result) - result) < 1E-12);
    }

    /**
     * Test of dnbinom_mu method, of class JniRMath.
     */
    @Test
    public void testDnbinom_mu() {
        System.out.println("dnbinom_mu");
        int log = 0;
        double result = JniRMath.dnbinom_mu(3.0, 10.0, 1.0, log);
        assertEquals(0.06372616, result, 1E-8);
    }

    /**
     * Test of pnbinom_mu method, of class JniRMath.
     */
    @Test
    public void testPnbinom_mu() {
        System.out.println("pnbinom_mu");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.pnbinom_mu(3.0, 10.0, 1.0, lower_tail, log_p);
        assertEquals(0.9750103, result, 1E-7);
    }

    /**
     * Test of qnbinom_mu method, of class JniRMath.
     */
    @Test
    public void testQnbinom_mu() {
        System.out.println("qnbinom_mu");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.qnbinom_mu(0.8, 10.0, 1.0, lower_tail, log_p);
        assertEquals(2.0, result, 1E-12);
    }

    /**
     * Test of rnbinom_mu method, of class JniRMath.
     */
    @Test
    public void testRnbinom_mu() {
        System.out.println("rnbinom_mu");
        double result = JniRMath.rnbinom_mu(10.0, 1.0);
        assertTrue(result >= 0.0 && result < Double.MAX_VALUE);
    }

    /**
     * Test of dpois method, of class JniRMath.
     */
    @Test
    public void testDpois() {
        System.out.println("dpois");
        int log = 0;
        double result = JniRMath.dpois(1.0, 2.0, log);
        assertEquals(0.2706706, result, 1e-7);
    }

    /**
     * Test of ppois method, of class JniRMath.
     */
    @Test
    public void testPpois() {
        System.out.println("ppois");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.ppois(1.0, 2.0, lower_tail, log_p);
        assertEquals(0.4060058, result, 1e-7);
    }

    /**
     * Test of qpois method, of class JniRMath.
     */
    @Test
    public void testQpois() {
        System.out.println("qpois");
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.qpois(0.7, 4.0, lower_tail, log_p);
        assertEquals(5.0, result, 1e-12);
    }

    /**
     * Test of rpois method, of class JniRMath.
     */
    @Test
    public void testRpois() {
        System.out.println("rpois");
        double result = JniRMath.rpois(2.0);
        assertTrue(result >= 0.0 && result <= Double.MAX_VALUE);
        assertTrue(Math.abs(Math.floor(result) - result) < 1E-12);
    }

    /**
     * Test of dweibull method, of class JniRMath.
     */
    @Test
    public void testWeibull() {
        double x = 1.0;
        double q = 1.0;
        double p = 0.5;
        double shape = 2.0;
        double scale = 3.0;
        int log = 0;
        int lower_tail = 1;
        int log_p = 0;
        System.out.println("dweibull");
        double result = JniRMath.dweibull(x, shape, scale, log);
        assertEquals(0.1988532, result, 1E-7);
        System.out.println("pweibull");
        result = JniRMath.pweibull(q, shape, scale, lower_tail, log_p);
        assertEquals(0.1051607, result, 1E-7);
        System.out.println("qweibull");
        result = JniRMath.qweibull(p, shape, scale, lower_tail, log_p);
        assertEquals(2.497664, result, 1E-6);
        System.out.println("rweibull");
        result = JniRMath.rweibull(shape, scale);
        assertTrue(result > 0.0 && result < Double.MAX_VALUE);
    }

    /**
     * Test of logis methods, of class JniRMath.
     */
    @Test
    public void testLogis() {
        double x = 1.0;
        double q = 1.0;
        double p = 0.7;
        double location = 1.0;
        double scale = 2.0;
        int log = 0;
        int lower_tail = 1;
        int log_p = 0;
        System.out.println("dlogis");
        double result = JniRMath.dlogis(x, location, scale, log);
        assertEquals(0.125, result, 1E-12);
        System.out.println("plogis");
        result = JniRMath.plogis(q, location, scale, lower_tail, log_p);
        assertEquals(0.5, result, 1E-12);
        System.out.println("qlogis");
        result = JniRMath.qlogis(p, location, scale, lower_tail, log_p);
        assertEquals(2.694596, result, 1E-6);
        System.out.println("rlogis");
        result = JniRMath.rlogis(location, scale);
        assertTrue(result > Double.NEGATIVE_INFINITY && result < Double.POSITIVE_INFINITY);
    }

    /**
     * Test of nbeta methods, of class JniRMath.
     */
    @Test
    public void testNbeta() {
        double x = 0.2;
        double p = 0.7;
        double q = 0.2;
        double shape1 = 2.0;
        double shape2 = 3.0;
        double ncp = 1.0;
        int log = 0;
        int lower_tail = 1;
        int log_p = 0;
        System.out.println("dnbeta");
        double result = JniRMath.dnbeta(x, shape1, shape2, ncp, log);
        assertEquals(1.189244, result, 1e-6);
        System.out.println("pnbeta");
        result = JniRMath.pnbeta(q, shape1, shape2, ncp, lower_tail, log_p);
        assertEquals(0.1285727, result, 1E-7);
        System.out.println("qnbeta");
        result = JniRMath.qnbeta(p, shape1, shape2, ncp, lower_tail, log_p);
        assertEquals(0.5645086, result, 1e-7);
    }

    /**
     * Test of nf methods, of class JniRMath.
     */
    @Test
    public void testNf() {
        double x = 1.0;
        double p = 0.6;
        double q = 1.0;
        double df1 = 2.0;
        double df2 = 3.0;
        double ncp = 1.0;
        int log = 0;
        int lower_tail = 1;
        int log_p = 0;
        System.out.println("dnf");
        double result = JniRMath.dnf(x, df1, df2, ncp, log);
        assertEquals(0.2700874, result, 1e-7);
        System.out.println("pnf");
        result = JniRMath.pnf(q, df1, df2, ncp, lower_tail, log_p);
        assertEquals(0.4119545, result, 1e-7);
        System.out.println("qnf");
        result = JniRMath.qnf(p, df1, df2, ncp, lower_tail, log_p);
        assertEquals(1.947079, result, 1e-6);
    }
    
    /**
     * Test of qnt method, of class JniRMath.
     */
    @Test
    public void testNt() {
        double x = 1.0;
        double p = 0.6;
        double q = 1.0;
        double df = 2.0;
        double ncp = 1.0;
        int log = 0;
        int lower_tail = 1;
        int log_p = 0;
        System.out.println("dnt");
        double result = JniRMath.dnt(x, df, ncp, log);
        assertEquals(0.3178518, result, 1e-7);
        System.out.println("pnt");
        result = JniRMath.pnt(q, df, ncp, lower_tail, log_p);
        assertEquals(0.4557458, result, 1e-7);
        System.out.println("qnt");
        result = JniRMath.qnt(p, df, ncp, lower_tail, log_p);
        assertEquals(1.502078, result, 1e-6);
    }

    /**
     * Test of tukey methods, of class JniRMath.
     */
    @Test
    public void testTukey() {
        System.out.println("ptukey");
        double q = 1.0;
        double nranges = 2.0;
        double nmeans = 3.0;
        double df = 4.0;
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.ptukey(q, nranges, nmeans, df, lower_tail, log_p);
        assertEquals(0.06951396, result, 1E-7);
        System.out.println("qtukey");
        double p = 0.6;
        result = JniRMath.qtukey(p, nranges, nmeans, df, lower_tail, log_p);
        assertEquals(2.659781, result, 1E-6);
    }

    /**
     * Test of wilcox methods, of class JniRMath.
     */
    @Test
    public void testDwilcox() {
        double x = 3.0;
        double q = 10.0;
        double p = 0.5;
        double m = 5.0;
        double n = 8.0;
        int log = 0;
        int lower_tail = 1;
        int log_p = 0;
        System.out.println("dwilcox");
        double result = JniRMath.dwilcox(x, m, n, log);
        assertEquals(0.002331002, result, 1E-8);
        System.out.println("pwilcox");
        result = JniRMath.pwilcox(q, m, n, lower_tail, log_p);
        assertEquals(0.08547009, result, 1E-7);
        System.out.println("qwilcox");
        result = JniRMath.qwilcox(p, m, n, lower_tail, log_p);
        assertEquals(20.0, result, 1E-12);
        System.out.println("rwilcox");
        result = JniRMath.rwilcox(m, n);
        assertTrue(result > 0 && result < Double.MAX_VALUE);
        assertTrue(Math.abs(Math.floor(result) - result) < 1E-12);
    }

    /**
     * Test of signrank methods, of class JniRMath.
     */
    @Test
    public void testSignrank() {
        System.out.println("dsignrank");
        double x = 12.0;
        double q = 12.0;
        double p = 0.6;
        double n = 10.0;
        int log = 0;
        int lower_tail = 1;
        int log_p = 0;
        double result = JniRMath.dsignrank(x, n, log);
        assertEquals(0.01269531, result, 1E-7);
        System.out.println("psignrank");
        result = JniRMath.psignrank(q, n, lower_tail, log_p);
        assertEquals(0.06542969, result, 1E-8);
        System.out.println("qsignrank");
        result = JniRMath.qsignrank(p, n, lower_tail, log_p);
        assertEquals(30.0, result, 1E-12);
        System.out.println("rsignrank");
        result = JniRMath.rsignrank(n);
        assertTrue(result >= 0 && result < Double.MAX_VALUE);
        assertTrue(Math.abs(Math.floor(result) - result) < 1E-12);
    }

    /**
     * Test of gammafn method, of class JniRMath.
     */
    @Test
    public void testGammafn() {
        System.out.println("gammafn");
        double result = JniRMath.gammafn(2.1);
        assertEquals(1.046486, result, 1e-6);
    }

    /**
     * Test of lgammafn method, of class JniRMath.
     */
    @Test
    public void testLgammafn() {
        System.out.println("lgammafn");
        double result = JniRMath.lgammafn(5.0);
        assertEquals(3.178054, result, 1e-6);
    }

    /**
     * Test of psigamma method, of class JniRMath.
     */
    @Test
    public void testPsigamma() {
        System.out.println("psigamma");
        double result = JniRMath.psigamma(4.0, 2.0);
        assertEquals(-0.08003973, result, 1E-7);
    }

    /**
     * Test of digamma method, of class JniRMath.
     */
    @Test
    public void testDigamma() {
        System.out.println("digamma");
        double result = JniRMath.digamma(3.0);
        assertEquals(0.9227843, result, 1E-7);
    }

    /**
     * Test of trigamma method, of class JniRMath.
     */
    @Test
    public void testTrigamma() {
        System.out.println("trigamma");
        double result = JniRMath.trigamma(3.0);
        assertEquals(0.3949341, result, 1E-7);
    }

    /**
     * Test of beta method, of class JniRMath.
     */
    @Test
    public void testBeta() {
        System.out.println("beta");
        double result = JniRMath.beta(2.0, 3.0);
        assertEquals(0.08333333, result, 1e-7);
    }

    /**
     * Test of lbeta method, of class JniRMath.
     */
    @Test
    public void testLbeta() {
        System.out.println("lbeta");
        double result = JniRMath.lbeta(2.0, 3.0);
        assertEquals(-2.484907, result, 1E-6);
    }

    /**
     * Test of choose method, of class JniRMath.
     */
    @Test
    public void testChoose() {
        System.out.println("choose");
        double result = JniRMath.choose(5.0, 2.0);
        assertEquals(10.0, result, 1E-12);
    }

    /**
     * Test of lchoose method, of class JniRMath.
     */
    @Test
    public void testLchoose() {
        System.out.println("lchoose");
        double result = JniRMath.lchoose(5, 2);
        assertEquals(2.302585, result, 1e-6);
    }

    /**
     * Test of bessel_i method, of class JniRMath.
     */
    @Test
    public void testBessel_i() {
        System.out.println("bessel_i");
        double result = JniRMath.bessel_i(2.0, 3.0, 1);
        assertEquals(0.21274, result, 1E-5);
    }

    /**
     * Test of bessel_j method, of class JniRMath.
     */
    @Test
    public void testBessel_j() {
        System.out.println("bessel_j");
        double result = JniRMath.bessel_j(2.0, 3.0);
        assertEquals(0.1289432, result, 1E-6);
    }

    /**
     * Test of bessel_k method, of class JniRMath.
     */
    @Test
    public void testBessel_k() {
        System.out.println("bessel_k");
        double result = JniRMath.bessel_k(2.0, 3.0, 1);
        assertEquals(0.6473854, result, 1E-7);
    }

    /**
     * Test of bessel_y method, of class JniRMath.
     */
    @Test
    public void testBessel_y() {
        System.out.println("bessel_y");
        double result = JniRMath.bessel_y(2.0, 3.0);
        assertEquals(-1.127784, result, 1E-6);
    }
}

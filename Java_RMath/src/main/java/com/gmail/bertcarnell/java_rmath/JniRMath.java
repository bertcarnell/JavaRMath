/*
 * Copyright (c) 2012 Robert Carnell
 * 
 * This file is part of the JavaRMath package
 * 
 * The JavaRMath package is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * The JavaRMath package is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with the JavaRMath package.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.gmail.bertcarnell.java_rmath;

/**
 * Class to interface Java with the RMath library
 * 
 * Must compile this with the following command or add a step to the
 * Ant build script: <code>javah -jni org.rproject.rmath.JniRMath</code>
 * 
 * For the netbeans project, the following section can be added to the 
 * <code>build.xml</code> file:
 * <code>
 *   <!-- Compile the JNI code into a DLL -->
 *   <target name="-post-compile">
 *     <!-- Make sure the output directories exists -->
 *     <mkdir dir="jni"/>
 *     <!-- Run javah to produce a header file for the JNI functions -->
 *     <javah verbose="yes" classpath="${build.classes.dir}" destdir="jni">
 *       <class name="org.rproject.rmath.JavaRMath"/>
 *     </javah>
 *   </target>
 * </code>
 * 
 * @author carnellr
 */
public class JniRMath {
    /* Normal Distribution */
    
    /**
     * Normal Distribution pdf
     * @param x
     * @param mean mean
     * @param std standard deviation
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dnorm(double x, double mean, double std, int log);
    /**
     * Normal Distribution cdf
     * @param q quantile
     * @param mean mean
     * @param std standard deviation
     * @param lower_tail if true, lower tail probabilities are returned if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pnorm(double q, double mean, double std, int lower_tail, int log_p);
    /**
     * Normal Distribution inverse cdf
     * @param p probability
     * @param mean mean
     * @param std standard deviation
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return distribution quantile
     */
    public static native double qnorm(double p, double mean, double std, int lower_tail, int log_p);
    /**
     * Normal Distribution sample
     * @param mean mean
     * @param std standard deviation
     * @return random sample
     */
    public static native double rnorm(double mean, double std);
    /* Lognormal Distribution */
    /**
     * LogNormal Distribution pdf
     * @param x 
     * @param meanlog mean of the distribution on the log scale
     * @param sdlog standard deviation of the distribution on the log scale
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dlnorm(double x, double meanlog, double sdlog, int log);
    /**
     * LogNormal Distribution cdf
     * @param q quantile
     * @param meanlog mean of the distribution on the log scale
     * @param sdlog standard deviation of the distribution on the log scale
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double plnorm(double q, double meanlog, double sdlog, int lower_tail, int log_p);
    /**
     * LogNormal Distribution inverse cdf
     * @param p probability
     * @param meanlog mean of the distribution on the log scale
     * @param sdlog standard deviation of the distribution on the log scale
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qlnorm(double p, double meanlog, double sdlog, int lower_tail, int log_p);
    /**
     * LogNormal Distribution sample
     * @param meanlog mean of the distribution on the log scale
     * @param sdlog standard deviation of the distribution on the log scale
     * @return random sample
     */
    public static native double rlnorm(double meanlog, double sdlog);
    /* Random Number Generators */
    /**
     * Standard Normal Distribution sample
     * @return random sample
     */
    public static native double norm_rand();
    /**
     * Uniform Distribution sample
     * @return random sample
     */
    public static native double unif_rand();
    /**
     * Exponential sample
     * @return random sample
     */
    public static native double exp_rand();
    /**
     * Set the random number seed for the default Marsaglia-Multicarry pseudo RNG
     * @param seed1 RNG seed
     * @param seed2 RNG seed
     */
    public static native void set_seed(int seed1, int seed2);
    /**
     * Get the random number seeds for the default Marsaglia-Multicarry pseudo RNG
     * @return RNG seeds
     */
    public static native int[] get_seed();
    /* Uniform Distribution */
    /**
     * Uniform Distribution pdf
     * @param x
     * @param min minimum
     * @param max maximum
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dunif(double x, double min, double max, int log);
    /**
     * Uniform Distribution cdf
     * @param q quantile
     * @param min minimum
     * @param max maximum
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double punif(double q, double min, double max, int lower_tail, int log_p);
    /**
     * Uniform Distribution inverse cdf
     * @param p probability
     * @param min minimum
     * @param max maximum
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qunif(double p, double min, double max, int lower_tail, int log_p);
    /**
     * Uniform Distribution sample
     * @param min minimum
     * @param max maximum
     * @return random sample
     */
    public static native double runif(double min, double max);
    /* Gamma Distribution  */
    /**
     * Gamma Distribution pdf
     * @param x
     * @param shape shape parameter such that E(X) = shape*scale
     * @param scale scale parameter such that E(X) = shape*scale
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dgamma(double x, double shape, double scale, int log);
    /**
     * Gamma Distribution cdf
     * @param q quantile
     * @param shape shape parameter such that E(X) = shape*scale
     * @param scale scale parameter such that E(X) = shape*scale
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pgamma(double q, double shape, double scale, int lower_tail, int log_p);
    /**
     * Gamma Distribution inverse cdf
     * @param p probability
     * @param shape shape parameter such that E(X) = shape*scale
     * @param scale scale parameter such that E(X) = shape*scale
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qgamma(double p, double shape, double scale, int lower_tail, int log_p);
    /**
     * Gamma Distribution sample
     * @param shape shape parameter such that E(X) = shape*scale
     * @param scale scale parameter such that E(X) = shape*scale
     * @return random sample
     */
    public static native double rgamma(double shape, double scale);
    /* Beta Distribution */
    /**
     * Beta Distribution pdf
     * @param x
     * @param shape1 shape parameter such that E(X) = shape1 / (shape1 + shape2)
     * @param shape2 shape parameter such that E(X) = shape1 / (shape1 + shape2)
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dbeta(double x, double shape1, double shape2, int log);
    /**
     * Beta Distribution cdf
     * @param q quantile
     * @param shape1 shape parameter such that E(X) = shape1 / (shape1 + shape2)
     * @param shape2 shape parameter such that E(X) = shape1 / (shape1 + shape2)
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pbeta(double q, double shape1, double shape2, int lower_tail, int log_p);
    /**
     * Beta Distribution inverse cdf
     * @param p probability
     * @param shape1 shape parameter such that E(X) = shape1 / (shape1 + shape2)
     * @param shape2 shape parameter such that E(X) = shape1 / (shape1 + shape2)
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qbeta(double p, double shape1, double shape2, int lower_tail, int log_p);
    /**
     * Beta Distribution sample
     * @param shape1 shape parameter such that E(X) = shape1 / (shape1 + shape2)
     * @param shape2 shape parameter such that E(X) = shape1 / (shape1 + shape2)
     * @return random sample
     */
    public static native double rbeta(double shape1, double shape2);
    /* Chi-squared Distribution */
    /**
     * Chi-Squared Distribution pdf
     * @param x
     * @param df degrees of freedom
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dchisq(double x, double df, int log);
    /**
     * Chi-Squared Distribution cdf
     * @param q quantile
     * @param df degrees of freedom
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pchisq(double q, double df, int lower_tail, int log_p);
    /**
     * Chi-Squared Distribution inverse cdf
     * @param p probability
     * @param df degrees of freedom
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qchisq(double p, double df, int lower_tail, int log_p);
    /**
     * Chi-Squared Distribution Sample
     * @param df degrees of freedom
     * @return random sample
     */
    public static native double rchisq(double df);
    /* Non-central Chi-squared Distribution  */
    /**
     * Non-Central Chi-Squared Distribution pdf
     * @param x
     * @param df degrees of freedom
     * @param ncp non-centrality parameter
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dnchisq(double x, double df, double ncp, int log);
    /**
     * Non-Central Chi-Squared Distribution cdf
     * @param q quantile
     * @param df degrees of freedom
     * @param ncp non-centrality parameter
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pnchisq(double q, double df, double ncp, int lower_tail, int log_p);
    /**
     * Non-Central Chi-Squared Distribution inverse cdf
     * @param p probability
     * @param df degrees of freedom
     * @param ncp non-centrality parameter
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qnchisq(double p, double df, double ncp, int lower_tail, int log_p);
    /**
     * Non-Central Chi-Square Distribution sample
     * @param df degrees of freedom
     * @param ncp non-centrality parameter
     * @return random sample
     */
    public static native double rnchisq(double df, double ncp);
    /* F Distibution */
    /**
     * F Distribution pdf
     * @param x
     * @param df1 degrees of freedom
     * @param df2 degrees of freedom
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double df(double x, double df1, double df2, int log);
    /**
     * F Distribution cdf
     * @param q quantile
     * @param df1 degrees of freedom
     * @param df2 degrees of freedom
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pf(double q, double df1, double df2, int lower_tail, int log_p);
    /**
     * F Distribution inverse cdf
     * @param p probability
     * @param df1 degrees of freedom
     * @param df2 degrees of freedom
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qf(double p, double df1, double df2, int lower_tail, int log_p);
    /**
     * F Distribution random sample
     * @param df1 degrees of freedom
     * @param df2 degrees of freedom
     * @return random sample
     */
    public static native double rf(double df1, double df2);
    /* Student t Distibution */
    /**
     * Student t Distribution pdf
     * @param x
     * @param df degrees of freedom
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dt(double x, double df, int log);
    /**
     * Student t Distribution cdf
     * @param q quantile
     * @param df degrees of freedom
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pt(double q, double df, int lower_tail, int log_p);
    /**
     * Student t Distribution inverse cdf
     * @param p probability
     * @param df degrees of freedom
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qt(double p, double df, int lower_tail, int log_p);
    /**
     * Student t Distribution sample
     * @param df degrees of freedom
     * @return random sample
     */
    public static native double rt(double df);
    /* Binomial Distribution */
    /**
     * Binomial Distribution pdf
     * @param x
     * @param size number of trials
     * @param prob probability of success
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dbinom(double x, double size, double prob, int log);
    /**
     * Binomial Distribution cdf
     * @param q quantile
     * @param size number of trials
     * @param prob probability of success
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pbinom(double q, double size, double prob, int lower_tail, int log_p);
    /**
     * Binomial Distribution inverse cdf
     * @param p probability
     * @param size number of trials
     * @param prob probability of success
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qbinom(double p, double size, double prob, int lower_tail, int log_p);
    /**
     * Binomial Distribution sample
     * @param size number of trials
     * @param prob probability of success
     * @return random sample
     */
    public static native double rbinom(double size, double prob);
    /* Multnomial Distribution */
    /**
     * Random variate from a Multinomial Distribution
     * @param n the multivariate sample size
     * @param prob the binomial probabilities of each option.  <code>prob.length = k, sum(prob) = 1</code>
     * @param k the number of multivariate options
     * @param rN the return sample size for each option.  <code>rN.length = k, sum(rN) = n</code>
     */
    //public static native void rmultinom(int n, double* prob, int k, int* rN);
    public static native void rmultinom(int n, double[] prob, int k, int[] rN);
    /* Cauchy Distribution  */
    /**
     * Cauchy Distribution pdf
     * @param x
     * @param location the median
     * @param scale
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dcauchy(double x, double location, double scale, int log);
    /**
     * Cauchy Distribution cdf
     * @param q quantile
     * @param location the median
     * @param scale
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pcauchy(double q, double location, double scale, int lower_tail, int log_p);
    /**
     * Cauchy Distribution inverse cdf
     * @param p probability
     * @param location the median
     * @param scale
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qcauchy(double p, double location, double scale, int lower_tail, int log_p);
    /**
     * Cauchy Distribution sample
     * @param location the median
     * @param scale
     * @return random sample
     */
    public static native double rcauchy(double location, double scale);
    /* Exponential Distribution */
    /**
     * Exponential Distribution pdf
     * @param x
     * @param rate E(X) = 1 / rate
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dexp(double x, double rate, int log);
    /**
     * Exponential Distribution cdf
     * @param q quantile
     * @param rate E(X) = 1 / rate
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pexp(double q, double rate, int lower_tail, int log_p);
    /**
     * Exponential Distribution inverse cdf
     * @param p probability
     * @param rate E(X) = 1 / rate
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qexp(double p, double rate, int lower_tail, int log_p);
    /**
     * Exponential Distribution sample
     * @param rate E(X) = 1 / rate
     * @return random sample
     */
    public static native double rexp(double rate);
    /* Geometric Distribution */
    /**
     * Geometric Distribution pdf
     * @param x
     * @param prob probability of success
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dgeom(double x, double prob, int log);
    /**
     * Geometric Distribution cdf
     * @param q quantile
     * @param prob probability of success
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pgeom(double q, double prob, int lower_tail, int log_p);
    /**
     * Geometric Distribution inverse cdf
     * @param p probability
     * @param prob probability of success
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qgeom(double p, double prob, int lower_tail, int log_p);
    /**
     * Geometric Distribution sample
     * @param prob probability of success
     * @return random sample
     */
    public static native double rgeom(double prob);
    /* Hypergeometric Distribution */
    /**
     * Hypergeometric Distribution pdf
     * @param x white balls drawn without replacement
     * @param m number of white balls in the urn
     * @param n number of black balls in the urn
     * @param k number of balls drawn from the urn
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double	dhyper(double x, double m, double n, double k, int log);
    /**
     * Hypergeometric Distribution cdf
     * @param q quantile
     * @param m number of white balls in the urn
     * @param n number of black balls in the urn
     * @param k number of balls drawn from the urn
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double	phyper(double q, double m, double n, double k, int lower_tail, int log_p);
    /**
     * Hypergeometric Distribution inverse cdf
     * @param p probability
     * @param m number of white balls in the urn
     * @param n number of black balls in the urn
     * @param k number of balls drawn from the urn
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double	qhyper(double p, double m, double n, double k, int lower_tail, int log_p);
    /**
     * Hypergeometric Distribution sample
     * @param m number of white balls in the urn
     * @param n number of black balls in the urn
     * @param k number of balls drawn from the urn
     * @return random sample
     */
    public static native double	rhyper(double m, double n, double k);
    /* Negative Binomial Distribution */
    /**
     * Negative Binomial Distribution pdf
     * @param x
     * @param size target number of successful trials
     * @param prob probability of success in each trial
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double	dnbinom(double x, double size, double prob, int log);
    /**
     * Negative Binomial Distribution cdf
     * @param q quantile
     * @param size target number of successful trials
     * @param prob probability of success in each trial
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double	pnbinom(double q, double size, double prob, int lower_tail, int log_p);
    /**
     * Negative Binomial Distribution inverse cdf
     * @param p probability
     * @param size target number of successful trials
     * @param prob probability of success in each trial
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double	qnbinom(double p, double size, double prob, int lower_tail, int log_p);
    /**
     * Negative Binomial Distribution sample
     * @param size target number of successful trials
     * @param prob probability of success in each trial
     * @return random sample
     */
    public static native double	rnbinom(double size, double prob);
    /**
     * Negative Binomial Distribution pdf (alternate)
     * @param x
     * @param size target number of successful trials
     * @param mu E(X) = size / (size + mu)
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double	dnbinom_mu(double x, double size, double mu, int log);
    /**
     * Negative Binomial Distribution cdf (alternate)
     * @param q quantile
     * @param size target number of successful trials
     * @param mu E(X) = size / (size + mu)
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double	pnbinom_mu(double q, double size, double mu, int lower_tail, int log_p);
    /**
     * Negative Binomial Distribution inverse cdf (alternate)
     * @param p probability
     * @param size target number of successful trials
     * @param mu E(X) = size / (size + mu)
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double	qnbinom_mu(double p, double size, double mu, int lower_tail, int log_p);
    /**
     * Negative Binomial Distribution sample (alternate)
     * @param size target number of successful trials
     * @param mu E(X) = size / (size + mu)
     * @return random sample
     */
    public static native double	rnbinom_mu(double size, double mu);
    /* Poisson Distribution */
    /**
     * Poisson Distribution pdf
     * @param x
     * @param lambda E(X) = lambda
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dpois(double x, double lambda, int log);
    /**
     * Poisson Distribution cdf
     * @param q quantile
     * @param lambda E(X) = lambda
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double	ppois(double q, double lambda, int lower_tail, int log_p);
    /**
     * Poisson Distribution inverse cdf
     * @param p probability
     * @param lambda E(X) = lambda
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double	qpois(double p, double lambda, int lower_tail, int log_p);
    /**
     * Poisson Distribution sample
     * @param lambda E(X) = lambda
     * @return random sample
     */
    public static native double	rpois(double lambda);
    /* Weibull Distribution */
    /**
     * Weibull Distribution pdf
     * @param x
     * @param shape F(x) = 1 - exp(-(x/scale)^shape)
     * @param scale F(x) = 1 - exp(-(x/scale)^shape)
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dweibull(double x, double shape, double scale, int log);
    /**
     * Weibull Distribution cdf
     * @param q quantile
     * @param shape F(x) = 1 - exp(-(x/scale)^shape)
     * @param scale F(x) = 1 - exp(-(x/scale)^shape)
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pweibull(double q, double shape, double scale, int lower_tail, int log_p);
    /**
     * Weibull Distribution inverse cdf
     * @param p probability
     * @param shape F(x) = 1 - exp(-(x/scale)^shape)
     * @param scale F(x) = 1 - exp(-(x/scale)^shape)
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qweibull(double p, double shape, double scale, int lower_tail, int log_p);
    /**
     * Weibull Distribution sample
     * @param shape F(x) = 1 - exp(-(x/scale)^shape)
     * @param scale F(x) = 1 - exp(-(x/scale)^shape)
     * @return random sample
     */
    public static native double rweibull(double shape, double scale);
    /* Logistic Distribution */
    /**
     * Logistic Distribution pdf
     * @param x
     * @param location F(X) = 1 / (1 + exp(=(x-location)/scale))
     * @param scale F(X) = 1 / (1 + exp(=(x-location)/scale))
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dlogis(double x, double location, double scale, int log);
    /**
     * Logistic Distribution cdf
     * @param q quantile
     * @param location F(X) = 1 / (1 + exp(=(x-location)/scale))
     * @param scale F(X) = 1 / (1 + exp(=(x-location)/scale))
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double plogis(double q, double location, double scale, int lower_tail, int log_p);
    /**
     * Logistic Distribution inverse cdf
     * @param p probability
     * @param location F(X) = 1 / (1 + exp(=(x-location)/scale))
     * @param scale F(X) = 1 / (1 + exp(=(x-location)/scale))
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qlogis(double p, double location, double scale, int lower_tail, int log_p);
    /**
     * Logistic Distribution sample
     * @param location F(X) = 1 / (1 + exp(=(x-location)/scale))
     * @param scale F(X) = 1 / (1 + exp(=(x-location)/scale))
     * @return random sample
     */
    public static native double rlogis(double location, double scale);
    /* Non-central Beta Distribution */
    /**
     * Non-central Beta Distribution pdf
     * @param x
     * @param shape1
     * @param shape2
     * @param ncp non-centrality parameter
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dnbeta(double x, double shape1, double shape2, double ncp, int log);
    /**
     * Non-central Beta Distribution cdf
     * @param p probability
     * @param shape1
     * @param shape2
     * @param ncp non-centrality parameter
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pnbeta(double p, double shape1, double shape2, double ncp, int lower_tail, int log_p);
    /**
     * Non-central Beta Distribution inverse cdf
     * @param q quantile
     * @param shape1
     * @param shape2
     * @param ncp non-centrality parameter
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qnbeta(double q, double shape1, double shape2, double ncp, int lower_tail, int log_p);
    /**
     * Non-central Beta Distribution sample
     * @param shape1
     * @param shape2
     * @param ncp non-centrality parameter
     * @return random sample
     */
    public static native double rnbeta(double shape1, double shape2, double ncp);
    /* Non-central F Distribution */
    /**
     * Non-central F Distribution pdf
     * @param x
     * @param df1 degrees of freedom
     * @param df2 degrees of freedom
     * @param ncp non-centrality parameter
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dnf(double x, double df1, double df2, double ncp, int log);
    /**
     * Non-central F Distribution cdf
     * @param p probability
     * @param df1 degrees of freedom
     * @param df2 degrees of freedom
     * @param ncp non-centrality parameter
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pnf(double p, double df1, double df2, double ncp, int lower_tail, int log_p);
    /**
     * Non-central F Distribution inverse cdf
     * @param q quantile
     * @param df1 degrees of freedom
     * @param df2 degrees of freedom
     * @param ncp non-centrality parameter
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qnf(double q, double df1, double df2, double ncp, int lower_tail, int log_p);
    /* Non-central Student t Distribution */
    /**
     * Non-central Student t Distribution pdf
     * @param x
     * @param df degrees of freedom
     * @param ncp non-centrality parameter
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double	dnt(double x, double df, double ncp, int log);
    /**
     * Non-central Student t Distribution cdf
     * @param q quantile
     * @param df degrees of freedom
     * @param ncp non-centrality parameter
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double	pnt(double q, double df, double ncp, int lower_tail, int log_p);
    /**
     * Non-central Student t Distribution inverse cdf
     * @param p probability
     * @param df degrees of freedom
     * @param ncp non-centrality parameter
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double	qnt(double p, double df, double ncp, int lower_tail, int log_p);
    /* Studentized Range Distribution */
    /**
     * Tukey Distribution cdf
     * @param q quantile
     * @param nranges number of groups whose maximum range is considered
     * @param nmeans sample size for range
     * @param df degrees of freedom
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double ptukey(double q, double nranges, double nmeans, double df, int lower_tail, int log_p);
    /**
     * Tukey distribution inverse cdf
     * @param p probability
     * @param nranges number of groups whose maximum range is considered
     * @param nmeans sample size for range
     * @param df degrees of freedom
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qtukey(double p, double nranges, double nmeans, double df, int lower_tail, int log_p);
    /* Wilcoxon Rank Sum Distribution */
    /**
     * Wilcoxon Rank Sum Distribution pdf
     * @param x
     * @param m number of observations in the first sample
     * @param n number of observations in the second sample
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dwilcox(double x, double m, double n, int log);
    /**
     * Wilcoxon Rank Sum Distribution cdf
     * @param q quantile
     * @param m number of observations in the first sample
     * @param n number of observations in the second sample
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double pwilcox(double q, double m, double n, int lower_tail, int log_p);
    /**
     * Wilcoxon Rank Sum Distribution inverse cdf
     * @param p probability
     * @param m number of observations in the first sample
     * @param n number of observations in the second sample
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qwilcox(double p, double m, double n, int lower_tail, int log_p);
    /**
     * Wilcoxon Rank Sum Distribution sample
     * @param m number of observations in the first sample
     * @param n number of observations in the second sample
     * @return random sample
     */
    public static native double rwilcox(double m, double n);
    /* Wilcoxon Signed Rank Distribution */
    /**
     * Wilcoxon Signed Rank Distribution pdf
     * @param x
     * @param n number of observations
     * @param log if true, probabilities are returned on a log scale
     * @return probability density
     */
    public static native double dsignrank(double x, double n, int log);
    /**
     * Wilcoxon Signed Rank Distribution cdf
     * @param q quantile
     * @param n number of observations
     * @param lower_tail if true, lower tail probabilities are returned
     * @param log_p if true, probabilities are returned on a log scale
     * @return probability
     */
    public static native double psignrank(double q, double n, int lower_tail, int log_p);
    /**
     * Wilcoxon Signed Rank Distribution inverse cdf
     * @param p probability
     * @param n number of observations
     * @param lower_tail if true, lower tail probabilities are input
     * @param log_p if true, probabilities are input on a log scale
     * @return quantile
     */
    public static native double qsignrank(double p, double n, int lower_tail, int log_p);
    /**
     * Wilcoxon Signed Rank Distribution sample
     * @param n number of observations
     * @return random sample
     */
    public static native double rsignrank(double n);

    /* Mathematical Functions documented in "Special Functions of Mathematics" ?Special from R */
    /**
     * Gamma function
     * @param x
     * @return result
     */
    public static native double gammafn(double x);
    /**
     * log gamma function
     * @param x
     * @return result
     */
    public static native double lgammafn(double x);
    /**
     * Derivatives of the log of the gamma function
     * @param x
     * @param deriv nth order derivative <code>deriv >= 0</code>
     * @return result
     */
    public static native double psigamma(double x, double deriv);
    /**
     * Derivative of the log gamma function
     * @param x
     * @return result
     */
    public static native double digamma(double x);
    /**
     * Second derivative of the log gamma function
     * @param x
     * @return result
     */
    public static native double trigamma(double x);
    /**
     * Beta function
     * @param a
     * @param b
     * @return result
     */
    public static native double beta(double a, double b);
    /**
     * Log of the Beta function
     * @param a
     * @param b
     * @return result
     */
    public static native double lbeta(double a, double b);
    /**
     * Number of combinations
     * @param n total number of options
     * @param k choose k out of n
     * @return result
     */
    public static native double choose(double n, double k);
    /**
     * log of the number of combinations
     * @param n total number of options
     * @param k choose k out of n
     * @return result
     */
    public static native double lchoose(double n, double k);

    /* Bessel Functions documented in ?Bessel from R */
    /**
     * Modified Bessel function of the first kind
     * @param x <code>x>=0</code>
     * @param nu order of the Bessel function
     * @param expon_scaled if true, the results are exponentially scaled to prevent over/underflow
     * @return
     */
    public static native double bessel_i(double x, double nu, double expon_scaled);
    /**
     * Bessel function of the first kind
     * @param x <code>x>=0</code>
     * @param nu order of the Bessel function
     * @return
     */
    public static native double bessel_j(double x, double nu);
    /**
     * Modified Bessel function of the second kind
     * @param x <code>x>=0</code>
     * @param nu order of the Bessel function
     * @param expon_scaled if true, the results are exponentially scaled to prevent over/underflow
     * @return
     */
    public static native double bessel_k(double x, double nu, double expon_scaled);
    /**
     * Bessel function of the second kind
     * @param x <code>x>=0</code>
     * @param nu order of the Bessel function
     * @return result
     */
    public static native double bessel_y(double x, double nu);

    static {
        System.loadLibrary("RmathJni");
    }
}

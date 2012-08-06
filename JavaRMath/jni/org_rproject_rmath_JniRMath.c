
/* include Malloc.h to allocate memory for get_seed */
#include <Malloc.h>
/* include macros to make writing this library more readable */
#include "org_rproject_rmath_macros.h"
/* include the jni header */
#include "org_rproject_rmath_JniRMath.h"

/* This library should only be used with the RMath library compiled as a standalone library */
#ifndef MATHLIB_STANDALONE
#define MATHLIB_STANDALONE
#endif
#include "Rmath.h"

DMACRO(dnorm, mean, std)
PMACRO(pnorm, mean, std)
QMACRO(qnorm, mean, std)
RMACRO(rnorm, mean, std)

DMACRO(dlnorm, meanlog, sdlog)
PMACRO(plnorm, meanlog, sdlog)
QMACRO(qlnorm, meanlog, sdlog)
RMACRO(rlnorm, meanlog, sdlog)

/*
 * Class:     org_rproject_rmath_JniRMath
 * Method:    norm_rand
 * Signature: ()D
 */
JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_norm_1rand
  (JNIEnv * oJNIEnv, jclass jc)
{
	return (jdouble) norm_rand();
}

/*
 * Class:     org_rproject_rmath_JniRMath
 * Method:    unif_rand
 * Signature: ()D
 */
JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_unif_1rand
  (JNIEnv * oJNIEnv, jclass jc)
{
	return (jdouble) unif_rand();
}

/*
 * Class:     org_rproject_rmath_JniRMath
 * Method:    exp_rand
 * Signature: ()D
 */
JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_exp_1rand
  (JNIEnv * oJNIEnv, jclass jc)
{
	return (jdouble) exp_rand();
}

/*
 * Class:     org_rproject_rmath_JniRMath
 * Method:    set_seed
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_org_rproject_rmath_JniRMath_set_1seed
  (JNIEnv * oJNIEnv, jclass jc, jint seed1, jint seed2)
{
	set_seed((unsigned int) seed1, (unsigned int) seed2);
}

/*
 * Class:     org_rproject_rmath_JniRMath
 * Method:    get_seed
 * Signature: ()[I
 */
JNIEXPORT jintArray JNICALL Java_org_rproject_rmath_JniRMath_get_1seed
  (JNIEnv * oJNIEnv, jclass jc)
{
    jintArray jResult = (*oJNIEnv)->NewIntArray(oJNIEnv, 2);
    jint * jResult_pinned = (*oJNIEnv)->GetIntArrayElements(oJNIEnv, jResult, 0);
    get_seed((unsigned int *)(&(jResult_pinned[0])), (unsigned int *)(&(jResult_pinned[1])));
    //(*oJNIEnv)->SetIntArrayRegion(oJNIEnv, jResult, 0, 2, (jint*) result);
    (*oJNIEnv)->ReleaseIntArrayElements(oJNIEnv, jResult, jResult_pinned, 0);
    return jResult;
}

DMACRO(dunif, min, max)
PMACRO(punif, min, max)
QMACRO(qunif, min, max)
RMACRO(runif, min, max)

DMACRO(dgamma, shape, scale)
PMACRO(pgamma, shape, scale)
QMACRO(qgamma, shape, scale)
RMACRO(rgamma, shape, scale)

DMACRO(dbeta, shape1, shape2)
PMACRO(pbeta, shape1, shape2)
QMACRO(qbeta, shape1, shape2)
RMACRO(rbeta, shape1, shape2)

DMACRO_1(dchisq, df)
PMACRO_1(pchisq, df)
QMACRO_1(qchisq, df)
RMACRO_1(rchisq, df)

DMACRO(dnchisq, df, ncp)
PMACRO(pnchisq, df, ncp)
QMACRO(qnchisq, df, ncp)
RMACRO(rnchisq, df, ncp)

DMACRO(df, df1, df2)
PMACRO(pf, df1, df2)
QMACRO(qf, df1, df2)
RMACRO(rf, df1, df2)

DMACRO_1(dt, df)
PMACRO_1(pt, df)
QMACRO_1(qt, df)
RMACRO_1(rt, df)

DMACRO(dbinom, size, prob)
PMACRO(pbinom, size, prob)
QMACRO(qbinom, size, prob)
RMACRO(rbinom, size, prob)

/*
 * Class:     org_rproject_rmath_JniRMath
 * Method:    rmultinom
 * Signature: (I[DI[I)V
 */
JNIEXPORT void JNICALL Java_org_rproject_rmath_JniRMath_rmultinom
  (JNIEnv * oJNIEnv, jclass jc, jint n, jdoubleArray prob, jint k, jintArray rN)
{
    /* pin the Java arrays and create a pointer to them */
    jdouble * jProb = (*oJNIEnv)->GetDoubleArrayElements(oJNIEnv, prob, 0);
    jint * jRN = (*oJNIEnv)->GetIntArrayElements(oJNIEnv, rN, 0);
    /* call rmultinom */
    rmultinom((int) n, (double *) jProb, (int) k, (int*) jRN);
    /* release the pinned Java arrays */
    (*oJNIEnv)->ReleaseDoubleArrayElements(oJNIEnv, prob, jProb, 0);
    (*oJNIEnv)->ReleaseIntArrayElements(oJNIEnv, rN, jRN, 0);
}

DMACRO(dcauchy, location, scale)
PMACRO(pcauchy, location, scale)
QMACRO(qcauchy, location, scale)
RMACRO(rcauchy, location, scale)

DMACRO_1(dexp, rate)
PMACRO_1(pexp, rate)
QMACRO_1(qexp, rate)
RMACRO_1(rexp, rate)

DMACRO_1(dgeom, prob)
PMACRO_1(pgeom, prob)
QMACRO_1(qgeom, prob)
RMACRO_1(rgeom, prob)

DMACRO_3(dhyper, m, n, k)
PMACRO_3(phyper, m, n, k)
QMACRO_3(qhyper, m, n, k)
RMACRO_3(rhyper, m, n, k)

DMACRO(dnbinom, size, prob)
PMACRO(pnbinom, size, prob)
QMACRO(qnbinom, size, prob)
RMACRO(rnbinom, size, prob)

DMACRO_B(dnbinom_1mu, dnbinom_mu, size, mu)
PMACRO_B(pnbinom_1mu, pnbinom_mu, size, mu)
QMACRO_B(qnbinom_1mu, qnbinom_mu, size, mu)
RMACRO_B(rnbinom_1mu, rnbinom_mu, size, mu)

DMACRO_1(dpois, lambda)
PMACRO_1(ppois, lambda)
QMACRO_1(qpois, lambda)
RMACRO_1(rpois, lambda)

DMACRO(dweibull, shape, scale)
PMACRO(pweibull, shape, scale)
QMACRO(qweibull, shape, scale)
RMACRO(rweibull, shape, scale)

DMACRO(dlogis, location, scale)
PMACRO(plogis, location, scale)
QMACRO(qlogis, location, scale)
RMACRO(rlogis, location, scale)

DMACRO_3(dnbeta, shape1, shape2, ncp)
PMACRO_3(pnbeta, shape1, shape2, ncp)
QMACRO_3(qnbeta, shape1, shape2, ncp)
/*RMACRO_3(rnbeta, shape1, shape2, ncp)*/

DMACRO_3(dnf, df1, df2, ncp)
PMACRO_3(pnf, df1, df2, ncp)
QMACRO_3(qnf, df1, df2, ncp)

DMACRO(dnt, df, ncp)
PMACRO(pnt, df, ncp)
QMACRO(qnt, df, ncp)

PMACRO_3(ptukey, nranges, nmeans, df)
QMACRO_3(qtukey, nranges, nmeans, df)

DMACRO(dwilcox, m, n)
PMACRO(pwilcox, m, n)
QMACRO(qwilcox, m, n)
RMACRO(rwilcox, m, n)

DMACRO_1(dsignrank, n)
PMACRO_1(psignrank, n)
QMACRO_1(qsignrank, n)
RMACRO_1(rsignrank, n)

FUNCTIONMACRO(gammafn, x)
FUNCTIONMACRO(lgammafn, x)
FUNCTIONMACRO_2(psigamma, x, deriv)
FUNCTIONMACRO(digamma, x)
FUNCTIONMACRO(trigamma, x)
FUNCTIONMACRO_2(beta, a, b)
FUNCTIONMACRO_2(lbeta, a, b)
FUNCTIONMACRO_2(choose, n, k)
FUNCTIONMACRO_2(lchoose, n, k)

FUNCTIONMACRO_3(bessel_1i, bessel_i, x, nu, expon_scaled)
FUNCTIONMACRO_2B(bessel_1j, bessel_j, x, nu)
FUNCTIONMACRO_3(bessel_1k, bessel_k, x, nu, expon_scaled)
FUNCTIONMACRO_2B(bessel_1y, bessel_y, x, nu)

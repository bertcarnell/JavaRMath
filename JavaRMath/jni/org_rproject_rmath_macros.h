/* Macros to standardize repeated function definitions */

/* _name = name of the r function */
/* _var1 = name of the first parameter in R */
/* _var2 = name of the second parameter in R */

/* Macro for the density function */
#define DMACRO(_name, _var1, _var2) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble x, jdouble _var1, jdouble _var2, jint log) \
	{ \
		return (jdouble) _name((double) x, (double) _var1, (double) _var2, (int) log); \
	}
#define DMACRO_1(_name, _var1) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble x, jdouble _var1, jint log) \
	{ \
		return (jdouble) _name((double) x, (double) _var1, (int) log); \
	}
#define DMACRO_3(_name, _var1, _var2, _var3) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble x, jdouble _var1, jdouble _var2, jdouble _var3, jint log) \
	{ \
		return (jdouble) _name((double) x, (double) _var1, (double) _var2, (double) _var3, (int) log); \
	}
#define DMACRO_B(_name, _rname, _var1, _var2) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble x, jdouble _var1, jdouble _var2, jint log) \
	{ \
		return (jdouble) _rname((double) x, (double) _var1, (double) _var2, (int) log); \
	}
/* Macro for the CDF */
#define PMACRO(_name, _var1, _var2) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble q, jdouble _var1, jdouble _var2, jint lower_tail, jint log_p) \
	{ \
		return (jdouble) _name((double) q, (double) _var1, (double) _var2, (int) lower_tail, (int) log_p); \
	}
#define PMACRO_1(_name, _var1) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble q, jdouble _var1, jint lower_tail, jint log_p) \
	{ \
		return (jdouble) _name((double) q, (double) _var1, (int) lower_tail, (int) log_p); \
	}
#define PMACRO_3(_name, _var1, _var2, _var3) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble q, jdouble _var1, jdouble _var2, jdouble _var3, jint lower_tail, jint log_p) \
	{ \
		return (jdouble) _name((double) q, (double) _var1, (double) _var2, (double) _var3, (int) lower_tail, (int) log_p); \
	}
#define PMACRO_B(_name, _rname, _var1, _var2) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble q, jdouble _var1, jdouble _var2, jint lower_tail, jint log_p) \
	{ \
		return (jdouble) _rname((double) q, (double) _var1, (double) _var2, (int) lower_tail, (int) log_p); \
	}
/* Macro for the inverse CDF */
#define QMACRO(_name, _var1, _var2) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble p, jdouble _var1, jdouble _var2, jint lower_tail, jint log_p) \
	{ \
		return (jdouble) _name((double) p, (double) _var1, (double) _var2, (int) lower_tail, (int) log_p); \
	}
#define QMACRO_1(_name, _var1) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble p, jdouble _var1, jint lower_tail, jint log_p) \
	{ \
		return (jdouble) _name((double) p, (double) _var1, (int) lower_tail, (int) log_p); \
	}
#define QMACRO_3(_name, _var1, _var2, _var3) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble p, jdouble _var1, jdouble _var2, jdouble _var3, jint lower_tail, jint log_p) \
	{ \
		return (jdouble) _name((double) p, (double) _var1, (double) _var2, (double) _var3, (int) lower_tail, (int) log_p); \
	}
#define QMACRO_B(_name, _rname, _var1, _var2) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble p, jdouble _var1, jdouble _var2, jint lower_tail, jint log_p) \
	{ \
		return (jdouble) _rname((double) p, (double) _var1, (double) _var2, (int) lower_tail, (int) log_p); \
	}
/* Macro for the random sample function */
#define RMACRO(_name, _var1, _var2) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble _var1, jdouble _var2) \
	{ \
		return (jdouble) _name((double) _var1, (double) _var2); \
	}
#define RMACRO_1(_name, _var1) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble _var1) \
	{ \
		return (jdouble) _name((double) _var1); \
	}
#define RMACRO_3(_name, _var1, _var2, _var3) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble _var1, jdouble _var2, jdouble _var3) \
	{ \
		return (jdouble) _name((double) _var1, (double) _var2, (double) _var3); \
	}
#define RMACRO_B(_name, _rname, _var1, _var2) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble _var1, jdouble _var2) \
	{ \
		return (jdouble) _rname((double) _var1, (double) _var2); \
	}
/* Macro for a single function */
#define FUNCTIONMACRO(_name, _var1) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble _var1) \
	{ \
		return (jdouble) _name((double) _var1); \
	}
#define FUNCTIONMACRO_2(_name, _var1, _var2) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble _var1, jdouble _var2) \
	{ \
		return (jdouble) _name((double) _var1, (double) _var2); \
	}
#define FUNCTIONMACRO_2B(_name, _rname, _var1, _var2) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble _var1, jdouble _var2) \
	{ \
		return (jdouble) _rname((double) _var1, (double) _var2); \
	}
#define FUNCTIONMACRO_3(_name, _rname, _var1, _var2, _var) \
	JNIEXPORT jdouble JNICALL Java_org_rproject_rmath_JniRMath_ ## _name \
	(JNIEnv * oJNIEnv, jclass jc, jdouble _var1, jdouble _var2, jdouble _var3) \
	{ \
		return (jdouble) _rname((double) _var1, (double) _var2, (double) _var3); \
	}

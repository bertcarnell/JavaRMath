#
# Generated Makefile - do not edit!
#
# Edit the Makefile in the project folder instead (../Makefile). Each target
# has a -pre and a -post target defined where you can add customized code.
#
# This makefile implements configuration specific macros and targets.


# Environment
MKDIR=mkdir
CP=cp
GREP=grep
NM=nm
CCADMIN=CCadmin
RANLIB=ranlib
CC=gcc.exe
CCC=g++.exe
CXX=g++.exe
FC=gfortran.exe
AS=as.exe

# Macros
CND_PLATFORM=MinGW-Windows
CND_CONF=Release
CND_DISTDIR=dist
CND_BUILDDIR=build

# Include project Makefile
include Makefile

# Object Directory
OBJECTDIR=${CND_BUILDDIR}/${CND_CONF}/${CND_PLATFORM}

# Object Files
OBJECTFILES= \
	${OBJECTDIR}/_ext/1516434402/phyper.o \
	${OBJECTDIR}/_ext/1516434402/pbinom.o \
	${OBJECTDIR}/_ext/1516434402/log1p.o \
	${OBJECTDIR}/_ext/1516434402/d1mach.o \
	${OBJECTDIR}/_ext/1516434402/pnt.o \
	${OBJECTDIR}/_ext/1516434402/qexp.o \
	${OBJECTDIR}/_ext/1516434402/beta.o \
	${OBJECTDIR}/_ext/1516434402/dchisq.o \
	${OBJECTDIR}/_ext/1516434402/runif.o \
	${OBJECTDIR}/_ext/1516434402/choose.o \
	${OBJECTDIR}/_ext/1516434402/stirlerr.o \
	${OBJECTDIR}/_ext/1516434402/mlutils.o \
	${OBJECTDIR}/_ext/1516434402/imin2.o \
	${OBJECTDIR}/_ext/1516434402/rnbinom.o \
	${OBJECTDIR}/_ext/1516434402/rf.o \
	${OBJECTDIR}/_ext/1516434402/qtukey.o \
	${OBJECTDIR}/_ext/1516434402/pnf.o \
	${OBJECTDIR}/_ext/1516434402/qpois.o \
	${OBJECTDIR}/_ext/1516434402/chebyshev.o \
	${OBJECTDIR}/_ext/1516434402/rlnorm.o \
	${OBJECTDIR}/_ext/1516434402/qt.o \
	${OBJECTDIR}/_ext/1516434402/dbeta.o \
	${OBJECTDIR}/_ext/1516434402/pnorm.o \
	${OBJECTDIR}/_ext/1516434402/rbinom.o \
	${OBJECTDIR}/_ext/1516434402/dt.o \
	${OBJECTDIR}/_ext/1516434402/punif.o \
	${OBJECTDIR}/_ext/1516434402/rpois.o \
	${OBJECTDIR}/_ext/1516434402/rnorm.o \
	${OBJECTDIR}/_ext/1516434402/dpois.o \
	${OBJECTDIR}/_ext/1516434402/snorm.o \
	${OBJECTDIR}/_ext/1516434402/dnorm.o \
	${OBJECTDIR}/_ext/1516434402/i1mach.o \
	${OBJECTDIR}/_ext/1516434402/polygamma.o \
	${OBJECTDIR}/_ext/1516434402/gamma.o \
	${OBJECTDIR}/_ext/1516434402/rcauchy.o \
	${OBJECTDIR}/_ext/1516434402/qnchisq.o \
	${OBJECTDIR}/_ext/1516434402/ftrunc.o \
	${OBJECTDIR}/_ext/1516434402/qbeta.o \
	${OBJECTDIR}/_ext/1516434402/ppois.o \
	${OBJECTDIR}/_ext/1516434402/fmin2.o \
	${OBJECTDIR}/_ext/1516434402/dhyper.o \
	${OBJECTDIR}/_ext/1516434402/rgamma.o \
	${OBJECTDIR}/_ext/1516434402/signrank.o \
	${OBJECTDIR}/_ext/1516434402/plogis.o \
	${OBJECTDIR}/_ext/1516434402/qhyper.o \
	${OBJECTDIR}/_ext/1516434402/plnorm.o \
	${OBJECTDIR}/_ext/1516434402/pbeta.o \
	${OBJECTDIR}/_ext/1516434402/qchisq.o \
	${OBJECTDIR}/_ext/1516434402/bessel_k.o \
	${OBJECTDIR}/_ext/1516434402/bessel_i.o \
	${OBJECTDIR}/_ext/1516434402/dgamma.o \
	${OBJECTDIR}/_ext/1516434402/rgeom.o \
	${OBJECTDIR}/_ext/1516434402/gammalims.o \
	${OBJECTDIR}/_ext/1516434402/dbinom.o \
	${OBJECTDIR}/_ext/1516434402/dunif.o \
	${OBJECTDIR}/_ext/965872513/org_rproject_rmath_JniRMath.o \
	${OBJECTDIR}/_ext/1516434402/pt.o \
	${OBJECTDIR}/_ext/1516434402/qunif.o \
	${OBJECTDIR}/_ext/1516434402/rbeta.o \
	${OBJECTDIR}/_ext/1516434402/dnf.o \
	${OBJECTDIR}/_ext/1516434402/qnbinom.o \
	${OBJECTDIR}/_ext/1516434402/dnchisq.o \
	${OBJECTDIR}/_ext/1516434402/dnbinom.o \
	${OBJECTDIR}/_ext/1516434402/rexp.o \
	${OBJECTDIR}/_ext/1516434402/pnbeta.o \
	${OBJECTDIR}/_ext/1516434402/pf.o \
	${OBJECTDIR}/_ext/1516434402/qweibull.o \
	${OBJECTDIR}/_ext/1516434402/imax2.o \
	${OBJECTDIR}/_ext/1516434402/wilcox.o \
	${OBJECTDIR}/_ext/1516434402/lgamma.o \
	${OBJECTDIR}/_ext/1516434402/pgeom.o \
	${OBJECTDIR}/_ext/1516434402/bessel_j.o \
	${OBJECTDIR}/_ext/1516434402/qgamma.o \
	${OBJECTDIR}/_ext/1516434402/pweibull.o \
	${OBJECTDIR}/_ext/1516434402/rnchisq.o \
	${OBJECTDIR}/_ext/1516434402/fprec.o \
	${OBJECTDIR}/_ext/1516434402/pnchisq.o \
	${OBJECTDIR}/_ext/1516434402/qlnorm.o \
	${OBJECTDIR}/_ext/1516434402/dweibull.o \
	${OBJECTDIR}/_ext/1516434402/dnbeta.o \
	${OBJECTDIR}/_ext/1516434402/pgamma.o \
	${OBJECTDIR}/_ext/1516434402/toms708.o \
	${OBJECTDIR}/_ext/1516434402/sexp.o \
	${OBJECTDIR}/_ext/1516434402/dexp.o \
	${OBJECTDIR}/_ext/1516434402/dlogis.o \
	${OBJECTDIR}/_ext/1516434402/rt.o \
	${OBJECTDIR}/_ext/1516434402/ptukey.o \
	${OBJECTDIR}/_ext/1516434402/fmax2.o \
	${OBJECTDIR}/_ext/1516434402/rhyper.o \
	${OBJECTDIR}/_ext/1516434402/rlogis.o \
	${OBJECTDIR}/_ext/1516434402/rchisq.o \
	${OBJECTDIR}/_ext/1516434402/qcauchy.o \
	${OBJECTDIR}/_ext/1516434402/rmultinom.o \
	${OBJECTDIR}/_ext/1516434402/dnt.o \
	${OBJECTDIR}/_ext/364935466/sunif.o \
	${OBJECTDIR}/_ext/1516434402/gamma_cody.o \
	${OBJECTDIR}/_ext/1516434402/fround.o \
	${OBJECTDIR}/_ext/1516434402/dlnorm.o \
	${OBJECTDIR}/_ext/1516434402/df.o \
	${OBJECTDIR}/_ext/1516434402/rweibull.o \
	${OBJECTDIR}/_ext/1516434402/lbeta.o \
	${OBJECTDIR}/_ext/1516434402/qnorm.o \
	${OBJECTDIR}/_ext/1516434402/dgeom.o \
	${OBJECTDIR}/_ext/1516434402/lgammacor.o \
	${OBJECTDIR}/_ext/1516434402/qbinom.o \
	${OBJECTDIR}/_ext/1516434402/pcauchy.o \
	${OBJECTDIR}/_ext/1516434402/pnbinom.o \
	${OBJECTDIR}/_ext/1516434402/fsign.o \
	${OBJECTDIR}/_ext/1516434402/bd0.o \
	${OBJECTDIR}/_ext/1516434402/qnt.o \
	${OBJECTDIR}/_ext/1516434402/qnbeta.o \
	${OBJECTDIR}/_ext/1516434402/qlogis.o \
	${OBJECTDIR}/_ext/1516434402/expm1.o \
	${OBJECTDIR}/_ext/1516434402/qgeom.o \
	${OBJECTDIR}/_ext/1516434402/qnf.o \
	${OBJECTDIR}/_ext/1516434402/pexp.o \
	${OBJECTDIR}/_ext/1516434402/pchisq.o \
	${OBJECTDIR}/_ext/1516434402/bessel_y.o \
	${OBJECTDIR}/_ext/1516434402/dcauchy.o \
	${OBJECTDIR}/_ext/1516434402/sign.o \
	${OBJECTDIR}/_ext/1516434402/qf.o


# C Compiler Flags
CFLAGS=

# CC Compiler Flags
CCFLAGS=
CXXFLAGS=

# Fortran Compiler Flags
FFLAGS=

# Assembler Flags
ASFLAGS=

# Link Libraries and Options
LDLIBSOPTIONS=

# Build Targets
.build-conf: ${BUILD_SUBPROJECTS}
	"${MAKE}"  -f nbproject/Makefile-${CND_CONF}.mk ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/libJavaRMathLibrary.dll

${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/libJavaRMathLibrary.dll: ${OBJECTFILES}
	${MKDIR} -p ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}
	${LINK.c} -shared -o ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/libJavaRMathLibrary.dll ${OBJECTFILES} ${LDLIBSOPTIONS} 

${OBJECTDIR}/_ext/1516434402/phyper.o: ../../Rdevel/R-2.15.0/src/nmath/phyper.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/phyper.o ../../Rdevel/R-2.15.0/src/nmath/phyper.c

${OBJECTDIR}/_ext/1516434402/pbinom.o: ../../Rdevel/R-2.15.0/src/nmath/pbinom.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pbinom.o ../../Rdevel/R-2.15.0/src/nmath/pbinom.c

${OBJECTDIR}/_ext/1516434402/log1p.o: ../../Rdevel/R-2.15.0/src/nmath/log1p.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/log1p.o ../../Rdevel/R-2.15.0/src/nmath/log1p.c

${OBJECTDIR}/_ext/1516434402/d1mach.o: ../../Rdevel/R-2.15.0/src/nmath/d1mach.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/d1mach.o ../../Rdevel/R-2.15.0/src/nmath/d1mach.c

${OBJECTDIR}/_ext/1516434402/pnt.o: ../../Rdevel/R-2.15.0/src/nmath/pnt.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pnt.o ../../Rdevel/R-2.15.0/src/nmath/pnt.c

${OBJECTDIR}/_ext/1516434402/qexp.o: ../../Rdevel/R-2.15.0/src/nmath/qexp.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qexp.o ../../Rdevel/R-2.15.0/src/nmath/qexp.c

${OBJECTDIR}/_ext/1516434402/beta.o: ../../Rdevel/R-2.15.0/src/nmath/beta.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/beta.o ../../Rdevel/R-2.15.0/src/nmath/beta.c

${OBJECTDIR}/_ext/1516434402/dchisq.o: ../../Rdevel/R-2.15.0/src/nmath/dchisq.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dchisq.o ../../Rdevel/R-2.15.0/src/nmath/dchisq.c

${OBJECTDIR}/_ext/1516434402/runif.o: ../../Rdevel/R-2.15.0/src/nmath/runif.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/runif.o ../../Rdevel/R-2.15.0/src/nmath/runif.c

${OBJECTDIR}/_ext/1516434402/choose.o: ../../Rdevel/R-2.15.0/src/nmath/choose.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/choose.o ../../Rdevel/R-2.15.0/src/nmath/choose.c

${OBJECTDIR}/_ext/1516434402/stirlerr.o: ../../Rdevel/R-2.15.0/src/nmath/stirlerr.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/stirlerr.o ../../Rdevel/R-2.15.0/src/nmath/stirlerr.c

${OBJECTDIR}/_ext/1516434402/mlutils.o: ../../Rdevel/R-2.15.0/src/nmath/mlutils.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/mlutils.o ../../Rdevel/R-2.15.0/src/nmath/mlutils.c

${OBJECTDIR}/_ext/1516434402/imin2.o: ../../Rdevel/R-2.15.0/src/nmath/imin2.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/imin2.o ../../Rdevel/R-2.15.0/src/nmath/imin2.c

${OBJECTDIR}/_ext/1516434402/rnbinom.o: ../../Rdevel/R-2.15.0/src/nmath/rnbinom.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rnbinom.o ../../Rdevel/R-2.15.0/src/nmath/rnbinom.c

${OBJECTDIR}/_ext/1516434402/rf.o: ../../Rdevel/R-2.15.0/src/nmath/rf.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rf.o ../../Rdevel/R-2.15.0/src/nmath/rf.c

${OBJECTDIR}/_ext/1516434402/qtukey.o: ../../Rdevel/R-2.15.0/src/nmath/qtukey.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qtukey.o ../../Rdevel/R-2.15.0/src/nmath/qtukey.c

${OBJECTDIR}/_ext/1516434402/pnf.o: ../../Rdevel/R-2.15.0/src/nmath/pnf.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pnf.o ../../Rdevel/R-2.15.0/src/nmath/pnf.c

${OBJECTDIR}/_ext/1516434402/qpois.o: ../../Rdevel/R-2.15.0/src/nmath/qpois.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qpois.o ../../Rdevel/R-2.15.0/src/nmath/qpois.c

${OBJECTDIR}/_ext/1516434402/chebyshev.o: ../../Rdevel/R-2.15.0/src/nmath/chebyshev.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/chebyshev.o ../../Rdevel/R-2.15.0/src/nmath/chebyshev.c

${OBJECTDIR}/_ext/1516434402/rlnorm.o: ../../Rdevel/R-2.15.0/src/nmath/rlnorm.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rlnorm.o ../../Rdevel/R-2.15.0/src/nmath/rlnorm.c

${OBJECTDIR}/_ext/1516434402/qt.o: ../../Rdevel/R-2.15.0/src/nmath/qt.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qt.o ../../Rdevel/R-2.15.0/src/nmath/qt.c

${OBJECTDIR}/_ext/1516434402/dbeta.o: ../../Rdevel/R-2.15.0/src/nmath/dbeta.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dbeta.o ../../Rdevel/R-2.15.0/src/nmath/dbeta.c

${OBJECTDIR}/_ext/1516434402/pnorm.o: ../../Rdevel/R-2.15.0/src/nmath/pnorm.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pnorm.o ../../Rdevel/R-2.15.0/src/nmath/pnorm.c

${OBJECTDIR}/_ext/1516434402/rbinom.o: ../../Rdevel/R-2.15.0/src/nmath/rbinom.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rbinom.o ../../Rdevel/R-2.15.0/src/nmath/rbinom.c

${OBJECTDIR}/_ext/1516434402/dt.o: ../../Rdevel/R-2.15.0/src/nmath/dt.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dt.o ../../Rdevel/R-2.15.0/src/nmath/dt.c

${OBJECTDIR}/_ext/1516434402/punif.o: ../../Rdevel/R-2.15.0/src/nmath/punif.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/punif.o ../../Rdevel/R-2.15.0/src/nmath/punif.c

${OBJECTDIR}/_ext/1516434402/rpois.o: ../../Rdevel/R-2.15.0/src/nmath/rpois.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rpois.o ../../Rdevel/R-2.15.0/src/nmath/rpois.c

${OBJECTDIR}/_ext/1516434402/rnorm.o: ../../Rdevel/R-2.15.0/src/nmath/rnorm.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rnorm.o ../../Rdevel/R-2.15.0/src/nmath/rnorm.c

${OBJECTDIR}/_ext/1516434402/dpois.o: ../../Rdevel/R-2.15.0/src/nmath/dpois.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dpois.o ../../Rdevel/R-2.15.0/src/nmath/dpois.c

${OBJECTDIR}/_ext/1516434402/snorm.o: ../../Rdevel/R-2.15.0/src/nmath/snorm.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/snorm.o ../../Rdevel/R-2.15.0/src/nmath/snorm.c

${OBJECTDIR}/_ext/1516434402/dnorm.o: ../../Rdevel/R-2.15.0/src/nmath/dnorm.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dnorm.o ../../Rdevel/R-2.15.0/src/nmath/dnorm.c

${OBJECTDIR}/_ext/1516434402/i1mach.o: ../../Rdevel/R-2.15.0/src/nmath/i1mach.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/i1mach.o ../../Rdevel/R-2.15.0/src/nmath/i1mach.c

${OBJECTDIR}/_ext/1516434402/polygamma.o: ../../Rdevel/R-2.15.0/src/nmath/polygamma.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/polygamma.o ../../Rdevel/R-2.15.0/src/nmath/polygamma.c

${OBJECTDIR}/_ext/1516434402/gamma.o: ../../Rdevel/R-2.15.0/src/nmath/gamma.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/gamma.o ../../Rdevel/R-2.15.0/src/nmath/gamma.c

${OBJECTDIR}/_ext/1516434402/rcauchy.o: ../../Rdevel/R-2.15.0/src/nmath/rcauchy.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rcauchy.o ../../Rdevel/R-2.15.0/src/nmath/rcauchy.c

${OBJECTDIR}/_ext/1516434402/qnchisq.o: ../../Rdevel/R-2.15.0/src/nmath/qnchisq.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qnchisq.o ../../Rdevel/R-2.15.0/src/nmath/qnchisq.c

${OBJECTDIR}/_ext/1516434402/ftrunc.o: ../../Rdevel/R-2.15.0/src/nmath/ftrunc.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/ftrunc.o ../../Rdevel/R-2.15.0/src/nmath/ftrunc.c

${OBJECTDIR}/_ext/1516434402/qbeta.o: ../../Rdevel/R-2.15.0/src/nmath/qbeta.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qbeta.o ../../Rdevel/R-2.15.0/src/nmath/qbeta.c

${OBJECTDIR}/_ext/1516434402/ppois.o: ../../Rdevel/R-2.15.0/src/nmath/ppois.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/ppois.o ../../Rdevel/R-2.15.0/src/nmath/ppois.c

${OBJECTDIR}/_ext/1516434402/fmin2.o: ../../Rdevel/R-2.15.0/src/nmath/fmin2.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/fmin2.o ../../Rdevel/R-2.15.0/src/nmath/fmin2.c

${OBJECTDIR}/_ext/1516434402/dhyper.o: ../../Rdevel/R-2.15.0/src/nmath/dhyper.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dhyper.o ../../Rdevel/R-2.15.0/src/nmath/dhyper.c

${OBJECTDIR}/_ext/1516434402/rgamma.o: ../../Rdevel/R-2.15.0/src/nmath/rgamma.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rgamma.o ../../Rdevel/R-2.15.0/src/nmath/rgamma.c

${OBJECTDIR}/_ext/1516434402/signrank.o: ../../Rdevel/R-2.15.0/src/nmath/signrank.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/signrank.o ../../Rdevel/R-2.15.0/src/nmath/signrank.c

${OBJECTDIR}/_ext/1516434402/plogis.o: ../../Rdevel/R-2.15.0/src/nmath/plogis.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/plogis.o ../../Rdevel/R-2.15.0/src/nmath/plogis.c

${OBJECTDIR}/_ext/1516434402/qhyper.o: ../../Rdevel/R-2.15.0/src/nmath/qhyper.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qhyper.o ../../Rdevel/R-2.15.0/src/nmath/qhyper.c

${OBJECTDIR}/_ext/1516434402/plnorm.o: ../../Rdevel/R-2.15.0/src/nmath/plnorm.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/plnorm.o ../../Rdevel/R-2.15.0/src/nmath/plnorm.c

${OBJECTDIR}/_ext/1516434402/pbeta.o: ../../Rdevel/R-2.15.0/src/nmath/pbeta.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pbeta.o ../../Rdevel/R-2.15.0/src/nmath/pbeta.c

${OBJECTDIR}/_ext/1516434402/qchisq.o: ../../Rdevel/R-2.15.0/src/nmath/qchisq.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qchisq.o ../../Rdevel/R-2.15.0/src/nmath/qchisq.c

${OBJECTDIR}/_ext/1516434402/bessel_k.o: ../../Rdevel/R-2.15.0/src/nmath/bessel_k.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/bessel_k.o ../../Rdevel/R-2.15.0/src/nmath/bessel_k.c

${OBJECTDIR}/_ext/1516434402/bessel_i.o: ../../Rdevel/R-2.15.0/src/nmath/bessel_i.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/bessel_i.o ../../Rdevel/R-2.15.0/src/nmath/bessel_i.c

${OBJECTDIR}/_ext/1516434402/dgamma.o: ../../Rdevel/R-2.15.0/src/nmath/dgamma.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dgamma.o ../../Rdevel/R-2.15.0/src/nmath/dgamma.c

${OBJECTDIR}/_ext/1516434402/rgeom.o: ../../Rdevel/R-2.15.0/src/nmath/rgeom.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rgeom.o ../../Rdevel/R-2.15.0/src/nmath/rgeom.c

${OBJECTDIR}/_ext/1516434402/gammalims.o: ../../Rdevel/R-2.15.0/src/nmath/gammalims.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/gammalims.o ../../Rdevel/R-2.15.0/src/nmath/gammalims.c

${OBJECTDIR}/_ext/1516434402/dbinom.o: ../../Rdevel/R-2.15.0/src/nmath/dbinom.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dbinom.o ../../Rdevel/R-2.15.0/src/nmath/dbinom.c

${OBJECTDIR}/_ext/1516434402/dunif.o: ../../Rdevel/R-2.15.0/src/nmath/dunif.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dunif.o ../../Rdevel/R-2.15.0/src/nmath/dunif.c

${OBJECTDIR}/_ext/965872513/org_rproject_rmath_JniRMath.o: ../JavaRMath/jni/org_rproject_rmath_JniRMath.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/965872513
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/965872513/org_rproject_rmath_JniRMath.o ../JavaRMath/jni/org_rproject_rmath_JniRMath.c

${OBJECTDIR}/_ext/1516434402/pt.o: ../../Rdevel/R-2.15.0/src/nmath/pt.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pt.o ../../Rdevel/R-2.15.0/src/nmath/pt.c

${OBJECTDIR}/_ext/1516434402/qunif.o: ../../Rdevel/R-2.15.0/src/nmath/qunif.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qunif.o ../../Rdevel/R-2.15.0/src/nmath/qunif.c

${OBJECTDIR}/_ext/1516434402/rbeta.o: ../../Rdevel/R-2.15.0/src/nmath/rbeta.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rbeta.o ../../Rdevel/R-2.15.0/src/nmath/rbeta.c

${OBJECTDIR}/_ext/1516434402/dnf.o: ../../Rdevel/R-2.15.0/src/nmath/dnf.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dnf.o ../../Rdevel/R-2.15.0/src/nmath/dnf.c

${OBJECTDIR}/_ext/1516434402/qnbinom.o: ../../Rdevel/R-2.15.0/src/nmath/qnbinom.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qnbinom.o ../../Rdevel/R-2.15.0/src/nmath/qnbinom.c

${OBJECTDIR}/_ext/1516434402/dnchisq.o: ../../Rdevel/R-2.15.0/src/nmath/dnchisq.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dnchisq.o ../../Rdevel/R-2.15.0/src/nmath/dnchisq.c

${OBJECTDIR}/_ext/1516434402/dnbinom.o: ../../Rdevel/R-2.15.0/src/nmath/dnbinom.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dnbinom.o ../../Rdevel/R-2.15.0/src/nmath/dnbinom.c

${OBJECTDIR}/_ext/1516434402/rexp.o: ../../Rdevel/R-2.15.0/src/nmath/rexp.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rexp.o ../../Rdevel/R-2.15.0/src/nmath/rexp.c

${OBJECTDIR}/_ext/1516434402/pnbeta.o: ../../Rdevel/R-2.15.0/src/nmath/pnbeta.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pnbeta.o ../../Rdevel/R-2.15.0/src/nmath/pnbeta.c

${OBJECTDIR}/_ext/1516434402/pf.o: ../../Rdevel/R-2.15.0/src/nmath/pf.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pf.o ../../Rdevel/R-2.15.0/src/nmath/pf.c

${OBJECTDIR}/_ext/1516434402/qweibull.o: ../../Rdevel/R-2.15.0/src/nmath/qweibull.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qweibull.o ../../Rdevel/R-2.15.0/src/nmath/qweibull.c

${OBJECTDIR}/_ext/1516434402/imax2.o: ../../Rdevel/R-2.15.0/src/nmath/imax2.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/imax2.o ../../Rdevel/R-2.15.0/src/nmath/imax2.c

${OBJECTDIR}/_ext/1516434402/wilcox.o: ../../Rdevel/R-2.15.0/src/nmath/wilcox.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/wilcox.o ../../Rdevel/R-2.15.0/src/nmath/wilcox.c

${OBJECTDIR}/_ext/1516434402/lgamma.o: ../../Rdevel/R-2.15.0/src/nmath/lgamma.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/lgamma.o ../../Rdevel/R-2.15.0/src/nmath/lgamma.c

${OBJECTDIR}/_ext/1516434402/pgeom.o: ../../Rdevel/R-2.15.0/src/nmath/pgeom.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pgeom.o ../../Rdevel/R-2.15.0/src/nmath/pgeom.c

${OBJECTDIR}/_ext/1516434402/bessel_j.o: ../../Rdevel/R-2.15.0/src/nmath/bessel_j.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/bessel_j.o ../../Rdevel/R-2.15.0/src/nmath/bessel_j.c

${OBJECTDIR}/_ext/1516434402/qgamma.o: ../../Rdevel/R-2.15.0/src/nmath/qgamma.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qgamma.o ../../Rdevel/R-2.15.0/src/nmath/qgamma.c

${OBJECTDIR}/_ext/1516434402/pweibull.o: ../../Rdevel/R-2.15.0/src/nmath/pweibull.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pweibull.o ../../Rdevel/R-2.15.0/src/nmath/pweibull.c

${OBJECTDIR}/_ext/1516434402/rnchisq.o: ../../Rdevel/R-2.15.0/src/nmath/rnchisq.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rnchisq.o ../../Rdevel/R-2.15.0/src/nmath/rnchisq.c

${OBJECTDIR}/_ext/1516434402/fprec.o: ../../Rdevel/R-2.15.0/src/nmath/fprec.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/fprec.o ../../Rdevel/R-2.15.0/src/nmath/fprec.c

${OBJECTDIR}/_ext/1516434402/pnchisq.o: ../../Rdevel/R-2.15.0/src/nmath/pnchisq.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pnchisq.o ../../Rdevel/R-2.15.0/src/nmath/pnchisq.c

${OBJECTDIR}/_ext/1516434402/qlnorm.o: ../../Rdevel/R-2.15.0/src/nmath/qlnorm.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qlnorm.o ../../Rdevel/R-2.15.0/src/nmath/qlnorm.c

${OBJECTDIR}/_ext/1516434402/dweibull.o: ../../Rdevel/R-2.15.0/src/nmath/dweibull.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dweibull.o ../../Rdevel/R-2.15.0/src/nmath/dweibull.c

${OBJECTDIR}/_ext/1516434402/dnbeta.o: ../../Rdevel/R-2.15.0/src/nmath/dnbeta.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dnbeta.o ../../Rdevel/R-2.15.0/src/nmath/dnbeta.c

${OBJECTDIR}/_ext/1516434402/pgamma.o: ../../Rdevel/R-2.15.0/src/nmath/pgamma.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pgamma.o ../../Rdevel/R-2.15.0/src/nmath/pgamma.c

${OBJECTDIR}/_ext/1516434402/toms708.o: ../../Rdevel/R-2.15.0/src/nmath/toms708.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/toms708.o ../../Rdevel/R-2.15.0/src/nmath/toms708.c

${OBJECTDIR}/_ext/1516434402/sexp.o: ../../Rdevel/R-2.15.0/src/nmath/sexp.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/sexp.o ../../Rdevel/R-2.15.0/src/nmath/sexp.c

${OBJECTDIR}/_ext/1516434402/dexp.o: ../../Rdevel/R-2.15.0/src/nmath/dexp.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dexp.o ../../Rdevel/R-2.15.0/src/nmath/dexp.c

${OBJECTDIR}/_ext/1516434402/dlogis.o: ../../Rdevel/R-2.15.0/src/nmath/dlogis.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dlogis.o ../../Rdevel/R-2.15.0/src/nmath/dlogis.c

${OBJECTDIR}/_ext/1516434402/rt.o: ../../Rdevel/R-2.15.0/src/nmath/rt.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rt.o ../../Rdevel/R-2.15.0/src/nmath/rt.c

${OBJECTDIR}/_ext/1516434402/ptukey.o: ../../Rdevel/R-2.15.0/src/nmath/ptukey.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/ptukey.o ../../Rdevel/R-2.15.0/src/nmath/ptukey.c

${OBJECTDIR}/_ext/1516434402/fmax2.o: ../../Rdevel/R-2.15.0/src/nmath/fmax2.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/fmax2.o ../../Rdevel/R-2.15.0/src/nmath/fmax2.c

${OBJECTDIR}/_ext/1516434402/rhyper.o: ../../Rdevel/R-2.15.0/src/nmath/rhyper.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rhyper.o ../../Rdevel/R-2.15.0/src/nmath/rhyper.c

${OBJECTDIR}/_ext/1516434402/rlogis.o: ../../Rdevel/R-2.15.0/src/nmath/rlogis.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rlogis.o ../../Rdevel/R-2.15.0/src/nmath/rlogis.c

${OBJECTDIR}/_ext/1516434402/rchisq.o: ../../Rdevel/R-2.15.0/src/nmath/rchisq.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rchisq.o ../../Rdevel/R-2.15.0/src/nmath/rchisq.c

${OBJECTDIR}/_ext/1516434402/qcauchy.o: ../../Rdevel/R-2.15.0/src/nmath/qcauchy.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qcauchy.o ../../Rdevel/R-2.15.0/src/nmath/qcauchy.c

${OBJECTDIR}/_ext/1516434402/rmultinom.o: ../../Rdevel/R-2.15.0/src/nmath/rmultinom.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rmultinom.o ../../Rdevel/R-2.15.0/src/nmath/rmultinom.c

${OBJECTDIR}/_ext/1516434402/dnt.o: ../../Rdevel/R-2.15.0/src/nmath/dnt.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dnt.o ../../Rdevel/R-2.15.0/src/nmath/dnt.c

${OBJECTDIR}/_ext/364935466/sunif.o: ../../Rdevel/R-2.15.0/src/nmath/standalone/sunif.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/364935466
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/364935466/sunif.o ../../Rdevel/R-2.15.0/src/nmath/standalone/sunif.c

${OBJECTDIR}/_ext/1516434402/gamma_cody.o: ../../Rdevel/R-2.15.0/src/nmath/gamma_cody.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/gamma_cody.o ../../Rdevel/R-2.15.0/src/nmath/gamma_cody.c

${OBJECTDIR}/_ext/1516434402/fround.o: ../../Rdevel/R-2.15.0/src/nmath/fround.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/fround.o ../../Rdevel/R-2.15.0/src/nmath/fround.c

${OBJECTDIR}/_ext/1516434402/dlnorm.o: ../../Rdevel/R-2.15.0/src/nmath/dlnorm.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dlnorm.o ../../Rdevel/R-2.15.0/src/nmath/dlnorm.c

${OBJECTDIR}/_ext/1516434402/df.o: ../../Rdevel/R-2.15.0/src/nmath/df.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/df.o ../../Rdevel/R-2.15.0/src/nmath/df.c

${OBJECTDIR}/_ext/1516434402/rweibull.o: ../../Rdevel/R-2.15.0/src/nmath/rweibull.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/rweibull.o ../../Rdevel/R-2.15.0/src/nmath/rweibull.c

${OBJECTDIR}/_ext/1516434402/lbeta.o: ../../Rdevel/R-2.15.0/src/nmath/lbeta.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/lbeta.o ../../Rdevel/R-2.15.0/src/nmath/lbeta.c

${OBJECTDIR}/_ext/1516434402/qnorm.o: ../../Rdevel/R-2.15.0/src/nmath/qnorm.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qnorm.o ../../Rdevel/R-2.15.0/src/nmath/qnorm.c

${OBJECTDIR}/_ext/1516434402/dgeom.o: ../../Rdevel/R-2.15.0/src/nmath/dgeom.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dgeom.o ../../Rdevel/R-2.15.0/src/nmath/dgeom.c

${OBJECTDIR}/_ext/1516434402/lgammacor.o: ../../Rdevel/R-2.15.0/src/nmath/lgammacor.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/lgammacor.o ../../Rdevel/R-2.15.0/src/nmath/lgammacor.c

${OBJECTDIR}/_ext/1516434402/qbinom.o: ../../Rdevel/R-2.15.0/src/nmath/qbinom.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qbinom.o ../../Rdevel/R-2.15.0/src/nmath/qbinom.c

${OBJECTDIR}/_ext/1516434402/pcauchy.o: ../../Rdevel/R-2.15.0/src/nmath/pcauchy.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pcauchy.o ../../Rdevel/R-2.15.0/src/nmath/pcauchy.c

${OBJECTDIR}/_ext/1516434402/pnbinom.o: ../../Rdevel/R-2.15.0/src/nmath/pnbinom.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pnbinom.o ../../Rdevel/R-2.15.0/src/nmath/pnbinom.c

${OBJECTDIR}/_ext/1516434402/fsign.o: ../../Rdevel/R-2.15.0/src/nmath/fsign.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/fsign.o ../../Rdevel/R-2.15.0/src/nmath/fsign.c

${OBJECTDIR}/_ext/1516434402/bd0.o: ../../Rdevel/R-2.15.0/src/nmath/bd0.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/bd0.o ../../Rdevel/R-2.15.0/src/nmath/bd0.c

${OBJECTDIR}/_ext/1516434402/qnt.o: ../../Rdevel/R-2.15.0/src/nmath/qnt.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qnt.o ../../Rdevel/R-2.15.0/src/nmath/qnt.c

${OBJECTDIR}/_ext/1516434402/qnbeta.o: ../../Rdevel/R-2.15.0/src/nmath/qnbeta.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qnbeta.o ../../Rdevel/R-2.15.0/src/nmath/qnbeta.c

${OBJECTDIR}/_ext/1516434402/qlogis.o: ../../Rdevel/R-2.15.0/src/nmath/qlogis.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qlogis.o ../../Rdevel/R-2.15.0/src/nmath/qlogis.c

${OBJECTDIR}/_ext/1516434402/expm1.o: ../../Rdevel/R-2.15.0/src/nmath/expm1.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/expm1.o ../../Rdevel/R-2.15.0/src/nmath/expm1.c

${OBJECTDIR}/_ext/1516434402/qgeom.o: ../../Rdevel/R-2.15.0/src/nmath/qgeom.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qgeom.o ../../Rdevel/R-2.15.0/src/nmath/qgeom.c

${OBJECTDIR}/_ext/1516434402/qnf.o: ../../Rdevel/R-2.15.0/src/nmath/qnf.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qnf.o ../../Rdevel/R-2.15.0/src/nmath/qnf.c

${OBJECTDIR}/_ext/1516434402/pexp.o: ../../Rdevel/R-2.15.0/src/nmath/pexp.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pexp.o ../../Rdevel/R-2.15.0/src/nmath/pexp.c

${OBJECTDIR}/_ext/1516434402/pchisq.o: ../../Rdevel/R-2.15.0/src/nmath/pchisq.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/pchisq.o ../../Rdevel/R-2.15.0/src/nmath/pchisq.c

${OBJECTDIR}/_ext/1516434402/bessel_y.o: ../../Rdevel/R-2.15.0/src/nmath/bessel_y.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/bessel_y.o ../../Rdevel/R-2.15.0/src/nmath/bessel_y.c

${OBJECTDIR}/_ext/1516434402/dcauchy.o: ../../Rdevel/R-2.15.0/src/nmath/dcauchy.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/dcauchy.o ../../Rdevel/R-2.15.0/src/nmath/dcauchy.c

${OBJECTDIR}/_ext/1516434402/sign.o: ../../Rdevel/R-2.15.0/src/nmath/sign.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/sign.o ../../Rdevel/R-2.15.0/src/nmath/sign.c

${OBJECTDIR}/_ext/1516434402/qf.o: ../../Rdevel/R-2.15.0/src/nmath/qf.c 
	${MKDIR} -p ${OBJECTDIR}/_ext/1516434402
	${RM} $@.d
	$(COMPILE.c) -O2  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1516434402/qf.o ../../Rdevel/R-2.15.0/src/nmath/qf.c

# Subprojects
.build-subprojects:

# Clean Targets
.clean-conf: ${CLEAN_SUBPROJECTS}
	${RM} -r ${CND_BUILDDIR}/${CND_CONF}
	${RM} ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/libJavaRMathLibrary.dll

# Subprojects
.clean-subprojects:

# Enable dependency checking
.dep.inc: .depcheck-impl

include .dep.inc

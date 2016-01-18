# start in /JavaRMath/JavaRMath/jni

RDEVEL=/home/carnellr/Documents/repositories/R-3.0.2

rm -rf $RDEVEL

mkdir -p $RDEVEL

svn checkout https://svn.r-project.org/R/tags/R-3-0-2 $RDEVEL

cp org_rproject_rmath_JniRMath.c $RDEVEL/src/nmath/standalone
cp org_rproject_rmath_macros.h $RDEVEL/src/nmath/standalone

cd $RDEVEL

./configure --with-x=no --without-recommended-packages

cd src/nmath/standalone

sed --in-place s/signrank.c/signrank.c\ org_rproject_rmath_JniRmath.c/ Makefile

make shared

cp libRmath.so /home/carnellr/Documents/repositories/JavaRMath/JavaRMath/bin


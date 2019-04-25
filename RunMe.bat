set projectLocation="E:\edureka\Craftsvilla"
cd %projectLocation%
set classpath=%projectLocation%/bin;%projectLocation%/jars/*
java org.testng.TestNG %projectLocation%/testng.xml
pause
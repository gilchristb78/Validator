name := "Validator"

version := "1.0"

scalaVersion := "2.12.14"

libraryDependencies += "junit" % "junit" % "4.13.2" % Test

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

ThisBuild / testOptions += Tests.Argument(TestFrameworks.JUnit, "-q")

testOptions += Tests.Argument(TestFrameworks.JUnit, "-a", "-s")

testOptions += Tests.Argument(TestFrameworks.JUnit, "-n")

testOptions += Tests.Argument(TestFrameworks.JUnit, "-f", "junitxml", "-u", "test-reports")

ThisBuild / testOptions += Tests.Argument(TestFrameworks.JUnit, "-P", "javax.xml.parsers.DocumentBuilderFactory", "com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.15.0")
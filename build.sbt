name := "Validator"

version := "1.0"

scalaVersion := "2.13.7"

libraryDependencies += "junit" % "junit" % "4.13.2" % Test

unmanagedJars in Test += file("demo/standAlone.jar")

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

testOptions += Tests.Argument(TestFrameworks.JUnit, "--ignore-runners=org.junit.experimental.categories.Categories")

testOptions += Tests.Argument("-oD")

testOptions += Tests.Argument(TestFrameworks.JUnit, "--run-listener=org.junit.experimental.results.PrintableResultListener")




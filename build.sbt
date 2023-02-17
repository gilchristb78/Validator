name := "Validator"

version := "1.0"

scalaVersion := "2.12.4"

libraryDependencies += "junit" % "junit" % "4.13.2" % Test

unmanagedJars in Compile += file("demo/standalone.jar")
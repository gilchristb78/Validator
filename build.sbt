lazy val Validator = (project in file("."))
  .settings(
    scalaVersion := "2.12.4",
    unmanagedJars in Compile += file("demo/standAlone.jar"),
    libraryDependencies += "junit" % "junit" % "4.13.1" % "test"
  )
val dottyVersion = "0.19.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "try-dotty-again",
    version := "0.0.1-SNAPSHOT",

    scalaVersion := dottyVersion,

    libraryDependencies ++= Seq(
    )
  )

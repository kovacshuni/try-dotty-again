val dottyVersion = "0.19.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    organization := "com.hunorkovacs",
    name := "try-dotty-again",
    version := "0.0.1-SNAPSHOT",

    scalaVersion := dottyVersion,

    libraryDependencies ++= {
      val akkaVersion = "2.5.25"
      val akkaHttpVersion = "10.1.10"

      Seq(
        ("com.typesafe.akka" %% "akka-actor" % akkaVersion).withDottyCompat(scalaVersion.value) ,
        ("com.typesafe.akka" %% "akka-stream" % akkaVersion).withDottyCompat(scalaVersion.value),
    
        ("com.typesafe.akka" %% "akka-http" % akkaHttpVersion).withDottyCompat(scalaVersion.value)
      )
    },

    scalacOptions ++= { 
      if (isDotty.value) Seq("-language:Scala2") else Nil 
    },

    fork in run := true
  )

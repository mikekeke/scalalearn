name := "ScalaLearn"

version := "1.0"

scalaVersion := "2.12.4"
scalacOptions += "-feature"


libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.4",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.4" % Test,
  "com.typesafe.akka" %% "akka-stream" % "2.5.4",
  "org.scalafx" %% "scalafx" % "8.0.102-R11"

)
    
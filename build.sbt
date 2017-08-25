name := "akka-playground"

version := "1.0"

scalaVersion := "2.12.2"

lazy val akkaVersion = "2.5.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

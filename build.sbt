name := "sbt-project-skeleton"

version := "0.1"

scalaVersion := "2.13.8"

val akkaVersion = "2.6.18"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.10",
  "org.slf4j" % "slf4j-api" % "1.7.36"
)

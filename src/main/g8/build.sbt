scalaVersion := "2.12.5"

name := "$name$"
organization := "$organization$"
version := "1.0"

val circeVersion = "0.9.3"

val circe = Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

// Want to use a published library in your project?
// You can define other libraries as dependencies in your build like this:
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http"     	% "10.1.1",
  "com.typesafe.akka" %% "akka-stream"   	% "2.5.11",
  "de.heikoseeberger" %% "akka-http-circe"  % "1.20.1"
)



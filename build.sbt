name := "reactive-database-extensions"

version := "0.0.1"

scalaVersion := "2.11.2"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
   "com.typesafe.akka" %% "akka-actor" % "2.3.6",
   "com.typesafe" % "config" % "1.2.1"
)

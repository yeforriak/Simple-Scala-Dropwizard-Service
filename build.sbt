import AssemblyKeys._

name := "hello-dropwizard"

version := "0.1"

scalaVersion := "2.9.1"

resolvers ++= Seq(
   "Coda Hale repo" at "http://repo.codahale.com/"
 )

libraryDependencies ++= Seq(
  "com.yammer.dropwizard" % "dropwizard-core" % "0.6.1",
  "com.yammer.dropwizard" %% "dropwizard-scala" % "0.6.1"
)

assemblySettings

scalacOptions ++= Seq("-unchecked", "-deprecation")

mainClass in assembly := Some("com.hellodropwizard.HelloWorldService")

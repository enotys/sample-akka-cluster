name := "sample-akka-cluster"

version := "1.0"

scalaVersion := "2.11.7"

val akkaVersion = "2.4-SNAPSHOT"

val sprayVersion = "1.3.3"

resolvers ++= Seq(
  "Kamon Repository" at "http://repo.kamon.io",
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Typesave Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

javaOptions in run ++= Seq(
  "-Xms128m", "-Xmx1024m"
)


scalacOptions ++= Seq(
  "-deprecation"
  ,"-unchecked"
  ,"-encoding", "UTF-8"
  ,"-Xlint"
  ,"-Yclosure-elim"
  ,"-Yinline"
  ,"-Xverify"
  ,"-feature"
  ,"-language:postfixOps"
)

javacOptions in Compile ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint:unchecked", "-Xlint:deprecation")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-remote" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-metrics" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion,
  "io.spray" %% "spray-can" % sprayVersion,
  "io.spray" %% "spray-client" % sprayVersion,

  "com.typesafe.akka" %% "akka-multi-node-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
//  "io.kamon" % "sigar-loader" % "1.6.5",

  "joda-time" % "joda-time" % "2.7"
)
    
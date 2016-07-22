import sbt.Resolver

name := "h5spark"

version := "1.0"

scalaVersion := "2.11.8"

resolvers ++= Seq(
	"Unidata maven repository" at "http://artifacts.unidata.ucar.edu/content/repositories/unidata-releases",
	"Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  	"Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "1.5.1" % "provided",
    "org.scalanlp" %% "breeze" % "0.12" % "provided",
    "org.scalanlp" %% "breeze-natives" % "0.12" % "provided",
    "org.scalanlp" %% "breeze-viz" % "0.12" % "provided",
    "org.apache.spark" %% "spark-mllib" % "1.5.1" % "provided",
    "org.scalactic" %% "scalactic" % "2.2.6",
    "org.specs2" % "specs2_2.11" % "3.7",
    "org.specs2" %% "specs2-core" % "3.4" % "test",
    "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

/**
 * Prevents multiple SparkContexts from being launched
 */
parallelExecution in Test := false




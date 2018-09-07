


name := "twitter"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.3.0"


resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion
)
    
libraryDependencies ++= Seq(
  "org.twitter4j" % "twitter4j-core" % "3.0.3",
  "org.twitter4j" % "twitter4j-stream" % "3.0.3",
  "org.apache.bahir" %% "spark-streaming-twitter" % "2.0.1"
)

// libraryDependencies += "org.apache.bahir" %% "spark-streaming-twitter" % "2.3.0-SNAPSHOT"
// import AssemblyKeys._

// assemblySettings

// name := "twitter"
// version := "0.0.1"

// scalaVersion := "2.10.4"

// javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

// // protocol buffer support
// seq(sbtprotobuf.ProtobufPlugin.protobufSettings: _*)

// // additional libraries
// libraryDependencies ++= Seq(
//   "org.apache.spark" %% "spark-core" % "1.3.1" % "provided",
//   "org.apache.spark" %% "spark-sql" % "1.3.1",
//   "org.apache.spark" %% "spark-hive" % "1.3.1",
//   "org.apache.spark" %% "spark-streaming" % "1.3.1",
//   "org.apache.spark" %% "spark-streaming-kafka" % "1.3.1",
//   "org.apache.spark" %% "spark-streaming-flume" % "1.3.1",
//   "org.apache.spark" %% "spark-mllib" % "1.3.1",
//   "org.apache.commons" % "commons-lang3" % "3.0",
//   "org.eclipse.jetty"  % "jetty-client" % "8.1.14.v20131031",
//   "com.typesafe.play" % "play-json_2.10" % "2.2.1",
//   "com.fasterxml.jackson.core" % "jackson-databind" % "2.3.3",
//   "com.fasterxml.jackson.module" % "jackson-module-scala_2.10" % "2.3.3",
//   "org.elasticsearch" % "elasticsearch-hadoop-mr" % "2.0.0.RC1",
//   "net.sf.opencsv" % "opencsv" % "2.0",
//   "com.twitter.elephantbird" % "elephant-bird" % "4.5",
//   "com.twitter.elephantbird" % "elephant-bird-core" % "4.5",
//   "com.hadoop.gplcompression" % "hadoop-lzo" % "0.4.17",
//   "mysql" % "mysql-connector-java" % "5.1.31",
//   "com.datastax.spark" %% "spark-cassandra-connector" % "1.0.0-rc5",
//   "com.datastax.spark" %% "spark-cassandra-connector-java" % "1.0.0-rc5",
//   "com.github.scopt" %% "scopt" % "3.2.0",
//   "org.scalatest" %% "scalatest" % "2.2.1" % "test",
//   "com.holdenkarau" %% "spark-testing-base" % "0.0.1" % "test"
// )

// resolvers ++= Seq(
//   "JBoss Repository" at "http://repository.jboss.org/nexus/content/repositories/releases/",
//   "Spray Repository" at "http://repo.spray.cc/",
//   "Cloudera Repository" at "https://repository.cloudera.com/artifactory/cloudera-repos/",
//   "Akka Repository" at "http://repo.akka.io/releases/",
//   "Twitter4J Repository" at "http://twitter4j.org/maven2/",
//   "Apache HBase" at "https://repository.apache.org/content/repositories/releases",
//   "Twitter Maven Repo" at "http://maven.twttr.com/",
//   "scala-tools" at "https://oss.sonatype.org/content/groups/scala-tools",
//   "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
//   "Second Typesafe repo" at "http://repo.typesafe.com/typesafe/maven-releases/",
//   "Mesosphere Public Repository" at "http://downloads.mesosphere.io/maven",
//   Resolver.sonatypeRepo("public")
// )

// mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
//   {
//     case m if m.toLowerCase.endsWith("manifest.mf") => MergeStrategy.discard
//     case m if m.startsWith("META-INF") => MergeStrategy.discard
//     case PathList("javax", "servlet", xs @ _*) => MergeStrategy.first
//     case PathList("org", "apache", xs @ _*) => MergeStrategy.first
//     case PathList("org", "jboss", xs @ _*) => MergeStrategy.first
//     case "about.html"  => MergeStrategy.rename
//     case "reference.conf" => MergeStrategy.concat
//     case _ => MergeStrategy.first
//   }
// }









// // The simplest possible sbt build file is just one line:

// scalaVersion := "2.11.12"
// // That is, to create a valid sbt build, all you've got to do is define the
// // version of Scala you'd like your project to use.

// // ============================================================================
// scalacOptions ++= Seq("-deprecation")

// // courseId := "e8VseYIYEeWxQQoymFg8zQ"

// resolvers += Resolver.sonatypeRepo("releases")
// // Lines like the above defining `scalaVersion` are called "settings" Settings
// // are key/value pairs. In the case of `scalaVersion`, the key is "scalaVersion"
// // and the value is "2.12.6"

// // It's possible to define many kinds of settings, such as:

// name := "twitter"
// organization := "suket.scala"
// // version := "1.0"

// // Note, it's not required for you to define these three settings. These are
// // mostly only necessary if you intend to publish your library's binaries on a
// // place like Sonatype or Bintray.


// // Want to use a published library in your project?
// // You can define other libraries as dependencies in your build like this:
// libraryDependencies += "org.typelevel" %% "cats-core" % "1.1.0"
// // Here, `libraryDependencies` is a set of dependencies, and by using `+=`,
// // we're adding the cats dependency to the set of dependencies that sbt will go
// // and fetch when it starts up.
// // Now, in any Scala file, you can import classes, objects, etc, from cats with
// // a regular import.

// // TIP: To find the "dependency" that you need to add to the
// // `libraryDependencies` set, which in the above example looks like this:

// // "org.typelevel" %% "cats-core" % "1.1.0"

// // You can use Scaladex, an index of all known published Scala libraries. There,
// // after you find the library you want, you can just copy/paste the dependency
// // information that you need into your build file. For example, on the
// // typelevel/cats Scaladex page,
// // https://index.scala-lang.org/typelevel/cats, you can copy/paste the sbt
// // dependency from the sbt box on the right-hand side of the screen.

// // IMPORTANT NOTE: while build files look _kind of_ like regular Scala, it's
// // important to note that syntax in *.sbt files doesn't always behave like
// // regular Scala. For example, notice in this build file that it's not required
// // to put our settings into an enclosing object or class. Always remember that
// // sbt is a bit different, semantically, than vanilla Scala.

// // ============================================================================

// // Most moderately interesting Scala projects don't make use of the very simple
// // build file style (called "bare style") used in this build.sbt file. Most
// // intermediate Scala projects make use of so-called "multi-project" builds. A
// // multi-project build makes it possible to have different folders which sbt can
// // be configured differently for. That is, you may wish to have different
// // dependencies or different testing frameworks defined for different parts of
// // your codebase. Multi-project builds make this possible.

// // Here's a quick glimpse of what a multi-project build looks like for this
// // build, with only one "subproject" defined, called `root`:

// // lazy val root = (project in file(".")).
// //   settings(
// //     inThisBuild(List(
// //       organization := "ch.epfl.scala",
// //       scalaVersion := "2.12.6"
// //     )),
// //     name := "hello-world"
// //   )

// // To learn more about multi-project builds, head over to the official sbt
// // documentation at http://www.scala-sbt.org/documentation.html


// // grading libraries
// libraryDependencies += "junit" % "junit" % "4.10" % Test
// libraryDependencies ++= Seq(
//   "org.apache.spark" %% "spark-core" % "2.1.0",
//   "org.apache.spark" %% "spark-sql" % "2.1.0",
//   "joda-time"         % "joda-time"           % "2.1"
// )


// // include the common dir
// //commonSourcePackages += "common"
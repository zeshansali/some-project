import Dependencies._
import sbt._

organization := "com.zsali"
name := "some-project"
licenses := Seq("Apache 2.0 License" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))
scalaVersion := Version.scala
crossScalaVersions := Version.crossScala

lazy val root = (project in file("."))
  .settings(
    organization := "com.zsali",
    name := "some-project",
    licenses := Seq("Apache 2.0 License" -> url("http://www.apache.org/licenses/LICENSE-2.0.html")),
    scalaVersion := Version.scala,
    crossScalaVersions := Version.crossScala,
    libraryDependencies ++= Dependencies.get
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

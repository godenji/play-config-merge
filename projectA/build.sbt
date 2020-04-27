import play.sbt.PlayScala
import play.sbt.Play.autoImport._
import sbt._
import sbt.Keys._

lazy val projectB = ProjectRef(file("../projectB"), "project-b")

lazy val root =
  Project("project-a", file("."))
    .settings(
      name:="project-a",
      scalaVersion:="2.13.2",
      libraryDependencies ++= Seq(
        "com.softwaremill.macwire" %% "macros" % "2.3.3",
        "com.softwaremill.macwire" %% "util" % "2.3.3"
      )
    )
    .enablePlugins(PlayScala)
    .dependsOn(projectB)

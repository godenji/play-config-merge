import play.sbt.PlayScala
import play.sbt.Play.autoImport._
import sbt._
import sbt.Keys._

lazy val root =
  Project("project-b", file("."))
    .settings(
      name:="project-b",
      scalaVersion:="2.13.2"
    )
    .enablePlugins(PlayScala)

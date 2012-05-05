organization := "br.com.aprendascala"

name := "s99"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.6.1"
)

scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked")

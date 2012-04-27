organization := "br.com.aprendascala"

name := "s99"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.10" % "test",
   "com.novocode" % "junit-interface" % "0.8" % "test"
)

scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked")

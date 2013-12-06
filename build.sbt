import sbtassembly.Plugin.AssemblyKeys._

name := "jdbc-test"

version := "1.0"

organization := "com.alainodea"

scalaVersion := "2.10.2"

assemblySettings

mainClass in assembly := Some("com.alainodea.JDBCTestMain")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-g:vars", "-explaintypes", "-optimise", "-encoding", "UTF8")

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

libraryDependencies += "junit" % "junit" % "4.11" % "test"

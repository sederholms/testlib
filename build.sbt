lazy val commonSettings = Seq(
  organization := "net.sederholms",
  version := "0.1.0",
  scalaVersion := "2.11.4"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "testlib"
  )

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.ivy2/local/")))

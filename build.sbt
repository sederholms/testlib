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

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

useGpg := true

pgpSigningKey := Some(0x1465D828F217B147L)

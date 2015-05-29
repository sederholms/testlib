// Your profile name of the sonatype account. The default is the same with the organization value
sonatypeProfileName := "net.sederholms"

// To sync with Maven central, you need to supply the following information:
pomExtra := {
  <url>https://github.com/sederholms/testlib</url>
  <licenses>
    <license>
      <name>Apache 2</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
    </license>
  </licenses>
  <scm>
    <connection>scm:git:github.com/sederholms/testlib.git</connection>
    <developerConnection>scm:git:git@github.com:sederholms/testlib.git</developerConnection>
    <url>github.com/sederholms/testlib.git</url>
  </scm>
  <developers>
    <developer>
      <id>marsedsol</id>
      <name>Sederholms</name>
      <url>https://github.com/sederholms/testlib</url>
    </developer>
  </developers>
}

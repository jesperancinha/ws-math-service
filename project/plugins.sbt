scalaVersion := "2.12.13"
resolvers += Resolver.mavenLocal
resolvers += Resolver.mavenCentral
resolvers +=
  "Maven Central" at "https://repo1.maven.org/maven2/"

addSbtPlugin("com.github.sbt" % "sbt-jacoco" % "3.4.0")
addSbtPlugin("org.jesperancinha.plugins" % "omni-reporter-scala-plugin" % "0.0.0-SNAPSHOT")

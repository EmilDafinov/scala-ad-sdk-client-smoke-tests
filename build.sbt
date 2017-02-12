lazy val SCALATEST_VERSION = "3.0.0"
lazy val scalaAdSdkClientSmokeTests = (project in file("."))
  .enablePlugins()
  .settings(
    scalaVersion := "2.11.8",

    organization := "com.emiliorodo",

    name := "scala-ad-sdk-client-smoke-tests",

    version := "0.1",

    licenses += ("MIT", url("http://opensource.org/licenses/MIT")),

    resolvers += Resolver.bintrayRepo(owner = "emildafinov", repo = "com.emiliorodo"),

    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic" % "1.1.7",
      "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
      "org.scalactic" %% "scalactic" % SCALATEST_VERSION,
      "org.scalatest" %% "scalatest" % SCALATEST_VERSION % "test",
      "org.mockito" % "mockito-all" % "1.10.19" % "test",
      "org.apache.httpcomponents" % "httpclient" % "4.5.2"
    )
  )

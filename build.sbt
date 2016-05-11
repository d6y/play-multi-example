name := "multi-project-example"

version := "1.0"

scalaVersion in ThisBuild := "2.11.7"

scalacOptions in ThisBuild ++= Seq(
  "-target:jvm-1.8",
  "-deprecation",
  "-encoding", "UTF-8",
  "-unchecked",
  "-Xfatal-warnings",
  "-feature",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-Ywarn-dead-code"
)

lazy val app1 = (project in file("webapp1")).enablePlugins(PlayScala)
lazy val app2 = (project in file("webapp2")).enablePlugins(PlayScala)



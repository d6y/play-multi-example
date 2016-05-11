name := "web-app-2"

version := "1.0"

libraryDependencies ++= Seq(
  "org.scala-lang"      % "scala-reflect"         % scalaVersion.value,
  "com.h2database"      %  "h2"                   % "1.4.185",
  "ch.qos.logback"      %  "logback-classic"      % "1.1.2",
  "joda-time"           %  "joda-time"            % "2.6",
  "org.joda"            %  "joda-convert"         % "1.2",
  "com.typesafe.play"   %% "play-slick"           % "1.1.0",
  "com.typesafe.play"   %% "play-json"            % "2.4.3"
)

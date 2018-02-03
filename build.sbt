lazy val `market` = (project in file(".")).enablePlugins(PlayScala).dependsOn(`basics`)

name := "Market"

version := "1.0"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.4"

libraryDependencies ++= Seq( jdbc , ehcache , ws , guice )

lazy val subProjectSettings = Seq(
  organization := "market",
  version := "0.0.1",
  scalaVersion := "2.12.4",
  libraryDependencies ++= Seq( jdbc , ehcache , ws , guice ),
  doc in Compile := target.map(_ / "none").value
)

lazy val `basics` = (project in file("modules/Basics")).enablePlugins(PlayScala).settings(subProjectSettings)


      
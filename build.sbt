addCommandAlias("fm", "all compile:scalafmt test:scalafmt")
addCommandAlias("cc", "all clean compile")
addCommandAlias("c", "compile")
addCommandAlias("r", "run")
addCommandAlias("t", "test")
addCommandAlias("to", "testOnly")
addCommandAlias("ps", "projects")
addCommandAlias("p", "project")

lazy val global = project
  .in(file("."))
  .settings(settings)

lazy val settings = Seq(
  scalaVersion := "2.12.7",
  version := "0.1.0-SNAPSHOT",
  scalacOptions ++= scalacSettings,
  resolvers ++= resolversSettings,
  libraryDependencies ++= libsSettings,
  addCompilerPlugin("com.olegpy"     %% "better-monadic-for" % "0.2.4"),
  addCompilerPlugin("org.spire-math" %% "kind-projector"     % "0.9.8")
)

lazy val scalacSettings = Seq(
  "-encoding",
  "UTF-8",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-explaintypes",
  "-opt-warnings",
  "-language:existentials",
  "-language:higherKinds",
  "-opt:l:inline",
  "-opt-inline-from:<source>",
  "-Ypartial-unification",
  "-Yrangepos",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",  
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-extra-implicit",
  "-Ywarn-inaccessible",
  "-Ywarn-infer-any",
  "-Ywarn-nullary-override",
  "-Ywarn-nullary-unit",
  "-Ywarn-unused:_,-imports",
  "-Xsource:2.13",
  "-Xlint:_,-type-parameter-shadow",
  "-Xfuture",
  "-Xfatal-warnings"
)

lazy val resolversSettings = Seq(
  Resolver.sonatypeRepo("public"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)

lazy val libsSettings = Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)

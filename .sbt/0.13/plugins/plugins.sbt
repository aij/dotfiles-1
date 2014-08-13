// WORKAROUND https://github.com/sbt/sbt/issues/1439
def plugin(m: ModuleID) =
  Defaults.sbtPluginExtra(m, "0.13", "2.10") excludeAll ExclusionRule("org.scala-lang")

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  plugin("org.ensime" % "ensime-sbt" % "0.1.5-SNAPSHOT")
  plugin("com.timushev.sbt" % "sbt-updates" % "0.1.6")
)

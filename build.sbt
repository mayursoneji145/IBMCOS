name := "IBM_Assessment"
version := "1.0"
scalaVersion := "2.11.12"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.4",
  "org.apache.spark" %% "spark-sql" % "2.4.4"
)
libraryDependencies += "com.ibm.stocator" % "stocator" % "1.0.24"
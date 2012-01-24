name := "scala_study"

version := "1.0"

scalaVersion := "2.9.1"

resolvers ++= Seq(
        "Twitter" at "http://maven.twttr.com")


libraryDependencies ++= Seq(
  "com.rabbitmq" % "amqp-client" % "2.7.1",
  "com.twitter" % "finagle-http_2.9.1" % "1.9.12",
  "com.twitter" % "finagle-kestrel_2.9.1" % "1.9.12",
  "com.twitter" % "finagle-stream_2.9.1" % "1.9.12",
  "com.twitter" % "finagle-thrift_2.9.1" % "1.9.12",
  "org.apache.thrift" % "libthrift" % "0.6.1"
  )

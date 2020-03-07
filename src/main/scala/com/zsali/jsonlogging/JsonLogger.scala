package com.zsali.jsonlogging

case class JsonLogger(name: String = "main") {
  import net.logstash.logback.argument.StructuredArguments.entries
  import org.slf4j.LoggerFactory

  import scala.jdk.CollectionConverters._

  val logger = LoggerFactory.getLogger(name)

  def info(message: String, context: Map[String, String] = Map(), maybeException: Option[Exception] = None): Unit = {
    logger.info(message, entries(context.asJava), maybeException.getOrElse(None))
  }
}

object MyApp extends App {
  val logger = JsonLogger("jsonConsoleAppender")

  logger.info(
    message = "This is an informational log message."
  )

  logger.info(
    message = "This is an informational log message.",
    context = Map(
      "key1" -> "value1",
      "key2" -> "value2"
    )
  )

  logger.info(
    message = "This is an informational log message.",
    context = Map("key1" -> "value1", "key2" -> "value2"),
    maybeException = Some(new RuntimeException("This is an exception"))
  )
}
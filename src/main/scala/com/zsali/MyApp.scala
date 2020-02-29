package com.zsali

import java.util

import net.logstash.logback.argument.StructuredArguments.entries
import org.slf4j.LoggerFactory

import scala.jdk.CollectionConverters._

case class SomeObject(name: String, age: Int, family: Seq[String])

object MyApp extends App {
  val logger = LoggerFactory.getLogger("jsonConsoleAppender")
  val map: util.Map[String, String] = Map[String, String]("key1" -> "value1", "key2" -> "value2").asJava
  logger.info("INFO: Wow this logging works.", entries(map))
}
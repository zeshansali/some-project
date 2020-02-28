package com.zsali

import com.typesafe.scalalogging.Logger

object MyApp extends App {
  val logger = Logger("main-logger")
  logger.info("Wow this logging works.")
}
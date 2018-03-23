package choe.learn.finatra.wow.config

import io.getquill.{FinagleMysqlContext, SnakeCase}

object choeFinagleMysqlContext extends FinagleMysqlContext(SnakeCase, "choeDB")

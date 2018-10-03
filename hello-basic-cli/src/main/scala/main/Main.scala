package main

import scala.shadowmint.com.CliApp

object Main {
  def main(args: Array[String]): Unit = {
    val app = new CliApp()
    if (app.configure(args)) {
      app.execute()
    }
  }
}

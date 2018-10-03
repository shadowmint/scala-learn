package my.example.io

import scala.io.Source

object MyExample {

  class SomeExampleType {
    var one = "one"
  }

  def readFileIntoString(filename: String) =
    Source.fromFile(filename).getLines().mkString("\n")
}
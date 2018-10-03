import my.example.io.MyExample;

object Main extends App {
  val buffer = MyExample.readFileIntoString("build.sbt")
  println(s":: $buffer")

  var x = new MyExample.SomeExampleType
  x.one = "two"
  println(s"$x")
}
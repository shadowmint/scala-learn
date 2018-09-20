import Main.inc

object Grouo {
  def add(a: Int, b: Int) = {
    inc += 1
    a + b
  }
}

object Main extends App {
  var inc: Int = 1

  def matchTerm(term: Int) = {
    val output = term match {
      case i if i < 3 => action()
      case _ => "nah"
    }
    println(output)
  }

  def action(): String = {
    val output = Grouo.add(1, 2)
    s"Hello, World!: $output $inc"
  }

  def step(): Unit = {
    if (inc < 10) {
      matchTerm(inc)
    }
  }

  step()
  step()
  step()
  step()
  step()
  step()
}
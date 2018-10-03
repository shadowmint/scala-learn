package scala.shadowmint.com

case class CliConfig(a: Int = 0, b: Int = 0, verbose: Boolean = false, debug: Boolean = false)

class CliApp {
  private var _config: CliConfig = CliConfig()

  def execute(): Unit = {
    val output = _config.a + _config.b
    println(s"run: $output")
  }

  def configure(args: Array[String]): Boolean = {
    val parser = new scopt.OptionParser[CliConfig]("hello-cli") {
      head("scopt", "3.x")

      opt[Int]("a").required().action((x, c) => c.copy(a = x)).text("a is an integer property")
      opt[Int]("b").required().action((x, c) => c.copy(b = x)).text("b is an integer property")
      opt[Unit]("verbose").action((_, c) => c.copy(verbose = true)).text("verbose mode")
      opt[Unit]("debug").action((_, c) => c.copy(verbose = true)).text("debug mode")

      help("help").text("prints this usage text")
    }

    parser.parse(args, CliConfig()) match {
      case Some(config) => {
        this._config = config
        true
      }
      case None => {
        false
      }
    }
  }
}

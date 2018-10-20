package test.hellotest.shadowmint.com

import hellotest.shadowmint.com.Home
import org.scalatest.FlatSpec

class TestHome extends FlatSpec {
  "Main" should "return 1 from hello" in {
    val m = new Home()
    val r = m.hello()
    assert(r === 1)
  }
}
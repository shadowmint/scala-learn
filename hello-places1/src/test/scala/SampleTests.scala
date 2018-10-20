import org.scalatest.FunSuite

import places.shadowmint.com.{Place, PlaceNote, Point, Rect}

import argonaut._, Argonaut._

class CubeCalculatorTest extends FunSuite {
  test("create place note") {
    val place = new Place(layout = Rect(Point(0, 0), Point(1, 1)), name = "Some place", identity = "123-place")
    var note = new PlaceNote(place, "Hello World")

    val dump = note.asJson
    assert(dump != null)
  }
}
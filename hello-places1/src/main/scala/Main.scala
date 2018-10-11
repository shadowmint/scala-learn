import places.shadowmint.com.{Place, PlaceNote, Point, Rect}

import argonaut._, Argonaut._

object Main extends App {
  println("Hello, World!")
  val place = new Place(layout = Rect(Point(0, 0), Point(1, 1)), name = "Some place", identity = "123-place")
  var note = new PlaceNote(place, "Hello World")

  val dump = note.asJson
  println(dump)
}
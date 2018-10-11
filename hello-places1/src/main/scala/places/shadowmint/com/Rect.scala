package places.shadowmint.com

import argonaut._, Argonaut._

case class Rect(var p1: Point, var p2: Point) {
  def center: Point = Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2)

  def size: Double = (p1.x - p2.x) * (p1.y - p2.y)
}

object Rect {
  implicit def RectCodecJson =
    casecodec2(Rect.apply, Rect.unapply)("p1", "p2")
}
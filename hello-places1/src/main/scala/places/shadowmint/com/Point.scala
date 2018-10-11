package places.shadowmint.com

import argonaut._, Argonaut._

case class Point(x: Double, y: Double) {
}

object Point {
  implicit def PointCodecJson =
    casecodec2(Point.apply, Point.unapply)("x", "y")
}
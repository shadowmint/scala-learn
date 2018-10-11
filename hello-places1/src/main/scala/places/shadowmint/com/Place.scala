package places.shadowmint.com

import argonaut._, Argonaut._

case class Place(var layout: Rect, var name: String, var identity: String) {
  require(layout.size > 0)
  require(name != null && name.length > 0)
}

object Place {
  implicit def PlaceCodecJson =
    casecodec3(Place.apply, Place.unapply)("layout", "name", "identity")
}
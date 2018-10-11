package places.shadowmint.com

import argonaut._, Argonaut._

case class PlaceNote(var place: Place, var note: String) {
  require(note != null && note.length > 0)
}

object PlaceNote {
  implicit def PersonEncodeJson: EncodeJson[PlaceNote] =
    EncodeJson((p: PlaceNote) =>
      ("note" := p.note) ->: ("place" := p.place.identity) ->: jEmptyObject)
}
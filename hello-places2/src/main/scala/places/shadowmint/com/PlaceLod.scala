package places.shadowmint.com

/**
  * A level of detail for a text node
  *
  * @param description The text at this LOD
  * @param lod         The distance to until this is a valid LOD to display for the object
  */
case class PlaceLod(description: String, lod: Double) {
}

case class PlaceLodRef(lod: PlaceLod, ref: HasDetail) {
}

package places.shadowmint.com

case class PlaceRegion(area: PlaceArea, lod: List[PlaceLod], objects: List[PlaceObject]) extends HasDetail {
  override def detail(): List[PlaceLod] = lod
}

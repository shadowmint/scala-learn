package places.shadowmint.com

case class PlaceWorld(regionsIn: List[PlaceRegion]) {

  var regions: List[PlaceRegion] = regionsIn

  def addRegion(region: PlaceRegion): Unit = {
    this.regions ::= region
  }

  def viewFrom(x: Double, y: Double, viewDistance: Double) = {
    this.regions
      .map(i => (i, this.distanceBetween(x, y, i.area.x, i.area.y, i.area.radius)))
      .filter(i => i._2 <= viewDistance)
      .map(ref => ref._1.detail()
        .filter(detail => ref._2 >= detail.lod)
        .sortBy(detail => -detail.lod)
        .headOption)
      .filter(i => i.isDefined)
      .map(i => i.get)
  }

  private def distanceBetween(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Double = {
    val x = x1 - x2
    val y = y1 - y2
    val dist = Math.sqrt(x * x + y * y)
    Math.max(dist - radius, 0)
  }
}

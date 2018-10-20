package test.places.shadowmint.com

import org.scalatest.FunSuite
import places.shadowmint.com._

class TestPlaceWorld extends FunSuite {
  private def worldFixture() = {
    PlaceWorld(
      PlaceRegion(
        PlaceArea(0, 0, 4),
        PlaceLod("Inside", 0) :: PlaceLod("Near", 10) :: PlaceLod("Far", 25) :: Nil,
        PlaceObject("Some object 2") :: Nil
      ) :: Nil
    )
  }

  test("PlaceWorld.outsideRegion") {
    val world = this.worldFixture()
    val visible = world.viewFrom(0, 30, 30)
    assert(visible.head.description === "Far")
  }

  test("PlaceWorld.nearRegion") {
    val world = this.worldFixture()
    val visible = world.viewFrom(0, 15, 30)
    assert(visible.head.description === "Near")
  }

  test("PlaceWorld.insideRegion") {
    val world = this.worldFixture()
    val visible = world.viewFrom(0, 0, 30)
    assert(visible.head.description === "Inside")
  }
}


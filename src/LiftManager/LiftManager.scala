package LiftManager

import Models.{Floor, Lift}

import scala.collection.JavaConverters._

/**
  *
  * @author Timothy Bent on 04/10/2018
  *
  */
case class LiftManager() {

  /**
    * Function to determine which lift is closest to the floor which the call button has been pressed
    *
    * @param lifts
    * @param floor
    */
  def getClosestLift(lifts: List[Lift], floor: Floor): Lift = {
    var distanceOfClosetLift: Int = 0
    var closestLift: Lift = null

    for (l <- lifts) {

      if (!l.isMoving & l.equals(lifts.head)) {
        distanceOfClosetLift = Math.abs(floor.floorNum - l.currFloNum)
      } else if (!l.isMoving && Math.abs(floor.floorNum - l.currFloNum) < distanceOfClosetLift) {
        distanceOfClosetLift = Math.abs(floor.floorNum - l.currFloNum)
        closestLift = l
      }
    }
    closestLift
  }

  //TODO: Implement the addition of the lift direction to a request
  def getClosestLiftWithDirection(lifts: List[Lift], floor: Floor): Lift = {
    var distanceOfClosetLift: Int = 0
    var closestLift: Lift = null

    for (l <- lifts ) {
      if (!l.isMoving && l.equals(lifts.head)) {
        distanceOfClosetLift = Math.abs(floor.floorNum - l.currFloNum)
      } else if (!l.isMoving && Math.abs(floor.floorNum - l.currFloNum) < distanceOfClosetLift) {
        distanceOfClosetLift = Math.abs(floor.floorNum - l.currFloNum)
        closestLift = l
      }
    }
    closestLift
  }

  def getClosestLiftImproved(lifts: List[Lift], floor: Floor): Lift = {
    var distanceOfClosetLift: Int = 0
    var closestLift: Lift = null

    lifts.filter(l => l.direction.equals(floor.direction) && !l.isMoving).foreach(l => if (l.equals(lifts.head)) {
      distanceOfClosetLift = Math.abs(floor.floorNum - l.currFloNum)
    } else if (Math.abs(floor.floorNum - l.currFloNum) < distanceOfClosetLift) {
      distanceOfClosetLift = Math.abs(floor.floorNum - l.currFloNum)
      closestLift = l
    })
    closestLift
  }

}


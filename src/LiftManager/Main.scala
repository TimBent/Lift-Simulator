package LiftManager

import Models.{Floor, Lift}

/**
  *
  * @author Timothy Bent on 04/10/2018
  *
  */
object Main extends App{
  override def main(args : Array[String])={
    var listOfLists : List[Lift] = List( Lift("L1", 0, false, '+'),
      Lift("L2", 0, false, '+'),
      Lift("E1", 2, false, '-'),
      Lift("E2", 4, false, '+'),
      Lift("E3", 6, false, '+'),
      Lift("E4", 8, false, '-'),
      Lift("E5", 10, false, '-'),
      Lift("L3", 7, false, '+'))

    var closestLift = LiftManager.apply().getClosestLiftImproved(listOfLists, Floor(3, true,'+'))

    println(s"The number of elevators are  ${listOfLists.size}")
    println(s"The nearest elevator to the floor you are on is ${ closestLift.LiftID}")
    println(s"It is currently on floor number ${closestLift.currFloNum}")
}


/*println(s"The number of elevators are  ${listOfLists.size}")
println(s"The nearest elevator to the floor you are on is ${ closestLift.LiftID}")
println(s"It is currently on floor number ${closestLift.currFloNum}")

println(s"The number of elevators are  ${listOfLists.size}")
println(s"The nearest elevator to the floor you are on is ${ LiftManager.apply().getClosestLiftImproved(listOfLists, Floor(3, true,'-')).LiftID}")
println(s"It is currently on floor number ${LiftManager.apply().getClosestLiftImproved(listOfLists, Floor(3, true, '-')).currFloNum}")*/
}

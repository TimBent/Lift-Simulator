package LiftManager

import Models.{Floor, Lift}

import scala.io.StdIn

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
      Lift("E2", 4, true, '+'),
      Lift("E3", 6, false, '+'),
      Lift("E4", 8, true, '-'),
      Lift("E5", 10, false, '-'),
      Lift("L3", 7, true, '+'))

    println("Please select which floor you are on")
    var fn = StdIn.readInt()

    if( fn <= 10){
      var closestLift = LiftManager.apply().getClosestLift(listOfLists, Floor(fn, true,'+'))
      println(s"The number of elevators are  ${listOfLists.size}")
      println(s"The nearest elevator to the floor you are on is ${ closestLift.LiftID}")
      println(s"It is currently on floor number ${closestLift.currFloNum}")
    }


}


/*println(s"The number of elevators are  ${listOfLists.size}")
println(s"The nearest elevator to the floor you are on is ${ closestLift.LiftID}")
println(s"It is currently on floor number ${closestLift.currFloNum}")

println(s"The number of elevators are  ${listOfLists.size}")
println(s"The nearest elevator to the floor you are on is ${ LiftManager.apply().getClosestLiftImproved(listOfLists, Floor(3, true,'-')).LiftID}")
println(s"It is currently on floor number ${LiftManager.apply().getClosestLiftImproved(listOfLists, Floor(3, true, '-')).currFloNum}")*/
}

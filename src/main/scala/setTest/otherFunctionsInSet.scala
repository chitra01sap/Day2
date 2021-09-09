package setTest

object otherFunctionsInSet extends App {

    // Your code here!
    val set1: Set[Int] = Set(100, 200, 0, 400, 600, 900)
  var set2 = Set("hello", "this is ", "string set", "bye")
    // print set1
    println("values in set1 are :: "+ set1)
    // print set2
    println("values in set2 are :: " )
    for(setval<-set2)
    {
      println("value is ::" + setval)
    }

  //This method checks elements in the set. Return true and false based on results.
  var result = set1.contains(400)
  println("result for set is :: "+ result)

  //This method always returns a new set with all the previous element present in it.
  val bs1 = set1 + 500 + 700
  //bit set output
  println("result for bitset is :: "+ bs1)

}

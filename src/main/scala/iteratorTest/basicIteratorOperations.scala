package iteratorTest

object basicIteratorOperations {

    // Main method
    def main(args:Array[String])
    {
      val v = Array(5,1,2,3,6,4)
      //val v = List(5,1,2,3,6,4)

      // defining an iterator
      // for a collection
      val i = v.iterator

      while (i.hasNext)
        print(i.next + " ")

      // accessing elements using for loop
      for(k <- v) println(k)


    }

}

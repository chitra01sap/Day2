package iteratorTest

object maxOfIterator {
  // parameter is an Iterator of Int
  // returning Int value
  def large(ite: Iterator[Int]): Int =
  {

    // storing first value of collection
    var mx = ite.next

    for(i <- ite)
      if(i > mx) mx = i

    // returning
    mx
  }

  // Main method
  def main(args:Array[String])
  {
    // defining iterator
    val i = Iterator(5, 1, 2, 3, 6, 4)

    // calling large function
    println("Maximum: "+ large(i))
  }
}

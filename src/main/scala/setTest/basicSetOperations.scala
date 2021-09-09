package setTest

object basicSetOperations {
  def main(args: Array[String]) {
    val name = Set("Smith", "Brown", "Allen")
    val id: Set[Int] = Set()

    println( "Head of name : " + name.head )
    println( "Tail of name : " + name.tail )
    println( "Check if name is empty : " + name.isEmpty )
    println( "Check if id is empty : " + id.isEmpty )
  }

}

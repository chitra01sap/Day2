package listTest

object basicListFunctions {
    def main(args:Array[String]) {
      val names= "Harry" :: ("Adam" :: ("Jill" :: Nil))
      val age = Nil
      println( "Head of names array : " + names.head )
      println( "Tail of names array : " + names.tail )
      println( "Check if names is empty : " + names.isEmpty )
      println( "Check if age is empty : " + age.isEmpty )
    }
}

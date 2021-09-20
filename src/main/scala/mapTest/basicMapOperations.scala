package mapTest

object basicMapOperations {
      // Main method
      def main(args:Array[String])
      {

        val mapIm = Map("Ajay" -> 30,
          "Bhavesh" -> 20,
          "Charlie" -> 50)

        // Accessing score of Ajay
        val ajay = mapIm("Ajay")
        println(ajay)

        //Updating
        //error: value update is not a member of scala.collection.immutable.Map[String, Int]
        //mapIm("Ajay") = 10
        println(mapIm)
        // Adding a new key "Dinesh" and
        // updating an existing key "Ajay"


        val mapMut = scala.collection.mutable.Map("Ajay" -> 30,
          "Bhavesh" -> 20,
          "Charlie" -> 50)
        // Adding a new key "Dinesh" and
        // updating an existing key "Ajay"
        mapMut += ("Ajay" -> 10, "Dinesh" -> 60)
        println("After Adding: "+mapMut)

        // Deleting key-value pairs with
        // keys "Ajay" and "Charlie"
        mapMut -= ("Ajay", "Charlie")

        println("After Deleting: " + mapMut)
      }
}

package arrayBufferTest
import scala.collection.mutable.ArrayBuffer

object arrayBufferOperation {

    // Main Method
    def main(args: Array[String])
    {
      // Instance of ArrayBuffer is created
      var name = ArrayBuffer[String]()
      name += "GeeksFor "
      name += "ccc"
      name += "Chandan"

      // accessing 1th index element of arraybuffer
      println(name(1))

      // adding one or more element using append method
      name.append("S-series")
      println(name)

      // deletes two or more elements
      name -= "ccc"
    }

}

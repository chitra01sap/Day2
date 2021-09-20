package seqTest
import scala.collection.immutable.Seq
object BasicSeqOperations {

    def main(args: Array[String]) = {
      val seq = Seq(1, 2, 3, 4, 5, 3)
      val seq1: Seq[String] = Seq("Plain Donut","Strawberry Donut","Chocolate Donut")
      val seq2: Seq[String] = seq1 :+ "Vanilla Donut"
      // Print seq elements
      seq.foreach{(element:Int) => print(element + " ")}
      println()
      println("Seq ends with (5,3): " + seq.endsWith(Seq(5, 3)))
      println("Seq contains 4: " + seq.contains(4))
      println("Last index of 3: " + seq.lastIndexOf(3))
      println("Reversed Seq" + seq.reverse)

      println(s"Element at index 0 = ${seq1(0)}")
      println(s"Element at index 1 = ${seq1(1)}")
      println(s"Element at index 2 = ${seq1(2)}")

      println(s"Adding elements to Sequence using :+ = $seq2")
    }
}

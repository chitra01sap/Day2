package conversionTest

import scala.jdk.CollectionConverters.{CollectionHasAsScala, MapHasAsScala}

object javaToscalaTest {

 // Converting Java map to Scala map
def main(args:Array[String]){
  val javaHashMap = new java.util.HashMap[String,Double]()
  javaHashMap.put("jack",1000)
  javaHashMap.put("bob",2000)

  val scalaMap = javaHashMap.asScala
  println(scalaMap.getOrElse("dummy",0))
  println(scalaMap.map(value =>(value._1,value._2*value._2)))


  //Use “asScala “ to convert Java list to Scala list

  val javaList = new java.util.ArrayList[Double]()
  javaList.add(10.0)
  javaList.add(20.0)
  javaList.add(40.0)

  // use asScala to convert
  val scalaList = javaList.asScala
  val sum = scalaList.sum
  val squareList = scalaList.map(value => value*value)
  println("sum is "+ sum)
  println("square list is" + squareList)
}
}

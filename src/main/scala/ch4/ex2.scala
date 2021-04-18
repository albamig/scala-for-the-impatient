package es.albamig
package ch4

import scala.io.Source

object ex2 extends App {
  val txtSource = Source.fromFile("src/main/scala/ch4/ex2.txt")
  val words = txtSource
    .getLines()
    .flatMap(_.split("\\s+"))
    .toArray
  txtSource.close()

  def countByWord: Map[String, Int] = words
    .groupBy(identity)
    .mapValues(_.length)

  print(countByWord)
}

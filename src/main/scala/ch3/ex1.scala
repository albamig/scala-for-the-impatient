package es.albamig
package ch3

import scala.util.Random

object ex1 extends App {
  def randomArray(len: Int): Array[Int] = {
    val a: Array[Int] = new Array[Int](len)
    for (i <- a.indices) {
      val randInt = Random.nextInt(len)
      a(i) = randInt
    }

    a
  }

  def randomArrayFunctional(len: Int): Array[Int] = {
    new Array[Int](len).map(_ => Random.nextInt(len))
  }

  def randomArrayForComprehension(len: Int): Array[Int] = {
    (for (i <- 0 until len) yield Random.nextInt(len)).toArray
  }

  println(randomArray(4).mkString("Array(", ", ", ")"))
  println(randomArrayFunctional(20).mkString("Array(", ", ", ")"))
  println(randomArrayForComprehension(15).mkString("Array(", ", ", ")"))
}

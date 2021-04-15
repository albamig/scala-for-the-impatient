package es.albamig
package ch3

object ex2 extends App {
  def swapAdjacents(a: Array[Int]): Array[Int] = {
    for (i <- a.indices.tail by 2) {
      val temp = a(i)
      a(i) = a(i - 1)
      a(i - 1) = temp
    }

    a
  }

  println(swapAdjacents(Array(1, 2, 3, 4, 5, 6)).mkString("Array(", ", ", ")"))
  println(swapAdjacents(Array(1, 2, 3, 4, 5)).mkString("Array(", ", ", ")"))
}

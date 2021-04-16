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

  def swapAdjacentsRecursive(a: Array[Int]): Array[Int] = {
    if (a.length < 2) a
    else if (a.length == 2) a.reverse
    else swapAdjacents(Array(a.head, a.tail.head)) ++ swapAdjacents(a.tail.tail)
  }

  println(swapAdjacents(Array(1, 2, 3, 4, 5, 6)).mkString("Array(", ", ", ")"))
  println(swapAdjacents(Array(1, 2, 3, 4, 5)).mkString("Array(", ", ", ")"))

  println(swapAdjacentsRecursive(Array(1, 2, 3, 4, 5, 6)).mkString("Array(", ", ", ")"))
  println(swapAdjacentsRecursive(Array(1, 2, 3, 4, 5)).mkString("Array(", ", ", ")"))
}

package es.albamig
package ch3

object ex4 extends App {
  def reorder(a: Array[Int]): Array[Int] = a.filter(_ > 0) ++ a.filter(_ <= 0)

  println(reorder(Array(1, 2, 3, 0, -1, 45, 6, -13)).mkString("Array(", ", ", ")"))
}

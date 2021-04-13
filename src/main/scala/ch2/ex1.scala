package es.albamig
package ch2

object ex1 extends App {
  def signumMatchCase(num: Int): Int = num match {
    case num if num > 0 => 1
    case num if num < 0 => -1
    case num if num == 0 => 0
  }

  def signumIfElse(num: Int): Int = {
    if (num > 0) 1
    else if (num < 0) -1
    else 0
  }

  def signumStdLib(num: Int): Int= num compare 0

  println(signumMatchCase(42))
  println(signumMatchCase(-42))
  println(signumMatchCase(0))
}

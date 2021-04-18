package es.albamig
package ch4

object ex1 extends App {
  val coveted_gizmos = Map("foo" -> 10.2, "bar" -> 45.8)
  val gizmosDiscounted = for ((gizmo, price) <- coveted_gizmos) yield (gizmo, price * 0.9)

  println(gizmosDiscounted)
}

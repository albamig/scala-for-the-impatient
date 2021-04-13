package es.albamig
package ch2

import java.time.LocalDate

object ex11 extends App {
  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      val date = args.map(_.toString.toInt)
      LocalDate.of(date(0), date(1), date(2))
    }
  }
  val (year, month, day) = (2020, 4, 13)

  print(date"$year-$month-$day")
}

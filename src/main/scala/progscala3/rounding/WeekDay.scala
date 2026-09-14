// src/main/scala/progscala3/rounding/WeekDay.scala
package progscala3.rounding

enum WeekDaySimple:
  case Sun, Mon, Tue, Wed, Thu, Fri, Sat

enum WeekDay(val fullName: String):
  case Sun extends WeekDay("Sunday")
  case Mon extends WeekDay("Monday")
  case Tue extends WeekDay("Tuesday")
  case Wed extends WeekDay("Wednesday")
  case Thu extends WeekDay("Thursday")
  case Fri extends WeekDay("Friday")
  case Sat extends WeekDay("Saturday")

  def isWorkingDay: Boolean = ! (this == WeekDay.Sat || this == WeekDay.Sun)

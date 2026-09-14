// for Comprehensions - pg 88
// Expanded Scope and Value Definition
// src/main/scala/progscala3/rounding/scoped_for.scala

import progscala3.rounding.WeekDay

val days = for
  day <- WeekDay.values
  if day.isWorkingDay
  fn = day.fullName
yield fn

days.toSeq.sorted ==
  Seq("Friday", "Monday", "Thursday", "Tuesday", "Wednesday")

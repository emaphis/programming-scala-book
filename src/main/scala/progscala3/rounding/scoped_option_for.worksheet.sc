// for Comprehensions - pg 89
// Scoped Option For
// src/main/scala/progscala3/rounding/Scoped_Option_For.scala

import progscala3.rounding.WeekDay.*
import progscala3.rounding.WeekDay

val dayOptions = Seq(
  Some(Mon), None, Some(Tue), Some(Wed), None,
  Some(Thu), Some(Fri), Some(Sat), Some(Sun), None)

val goodDays1 = for
  dayOpt <- dayOptions
  day <- dayOpt
  fn <- day.fullName
yield fn


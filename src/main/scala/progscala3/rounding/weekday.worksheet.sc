// src/main/scala/progscala3/rounding/WeekDay.scala

import progscala3.rounding.WeekDay
import progscala3.rounding.WeekDay.*

val sorted = WeekDay.values.sortBy(_.ordinal).toSeq
// val sorted: Seq[WeekDay] = ArraySeq(Sun, Mon, Tue, Wed, Thu, Fri, Sat)

Sun.fullName == "Sunday"
Sun.ordinal == 0
!Sun.isWorkingDay
WeekDay.valueOf("Sun") == WeekDay.Sun

Mon.fullName == "Monday"
Mon.ordinal == 1
Mon.isWorkingDay
WeekDay.valueOf("Mon") == Mon

Tue.fullName == "Tuesday"
Tue.ordinal == 2
Tue.isWorkingDay
WeekDay.valueOf("Tue") == Tue

Wed.fullName == "Wednesday"
Wed.ordinal == 3
Wed.isWorkingDay
WeekDay.valueOf("Wed") == Wed

Thu.fullName == "Thursday"
Thu.ordinal == 4
Thu.isWorkingDay
WeekDay.valueOf("Thu") == Thu

Fri.fullName == "Friday"
Fri.ordinal == 5
Fri.isWorkingDay
WeekDay.valueOf("Fri") == Fri

Sat.fullName == "Saturday"
Sat.ordinal == 6
!Sat.isWorkingDay
WeekDay.valueOf("Sat") == Sat

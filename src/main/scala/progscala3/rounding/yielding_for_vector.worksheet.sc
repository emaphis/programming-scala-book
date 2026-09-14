// for Comprehensions - pg 88
// Yielding New Values
// src/main/scala/progscala3/rounding/yielding_for_vector.scala

val odds = for
  number <- Vector(1,2,3,4,5)
  if number % 2 == 1
yield number.toString

odds == Vector("1", "3", "5")

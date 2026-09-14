// for Comprehensions - pg 88
// Yielding New Values
// src/main/scala/progscala3/rounding/yielding_for.scala

// `yield` a value for the 'for' comprehension

val evens = for
  n <- 0 to 10
  if n%2 == 0
yield n

evens == Vector(0, 2, 4, 6, 8, 10)

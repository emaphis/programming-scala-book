// Scala Conditional Expressions
// src/main/scala/progscala3/rounding/if_typed.scala

val seq = (0 until 6) map { n =>
  if n%2 == 0 then Some(n.toString)
  else None
}

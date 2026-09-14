// Scala Conditional Expressions
// src/main/scala/progscala3/rounding/if.worksheet.scala

(0 until 6).map { n =>
  if n%2 == 0 then
    s"$n is even"
  else if n%3 == 0 then
    s"$n is divisible by 3"
  else
    n.toString
}

(0 until 6).map { n =>
  if n%2 == 0 then s"$n is even"
  else if n%3 == 0 then s"$n is divisible by 3"
  else n.toString
}

// Scala 2 Syntax

(0 until 6).map { n =>
  if (n%2 == 0) {
    s"$n is even"
  } else if (n%3 == 0) {
    s"$n is divisible by 3"
  } else {
    n
  }
}

(0 until 6).map { n =>
  if (n%2 == 0) s"$n is even"
  else if (n%3 == 0) s"$n is divisible by 3"
  else n
}

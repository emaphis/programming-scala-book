// Tuples
// src/scala/progscala3/typelessdomore/Tuples.scala

val tup0 = ("Hello", 1, 2.3)
val tup2: (String, Int, Double) = ("World", 4, 5.6)

val tup3 = (tup0._1, tup0(0))

val (s, i, d) = tup0

// Two element tuple - Pair

1 -> "one"
(1, "one")
Tuple2(1, "one")

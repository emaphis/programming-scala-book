// Values, Variables, and Types in Matches  - pg 107
// src/main/scala/progscala3/patternmatching/match_variable.sc

val seq2 = Seq(1, 2, 3.14, "one", (6, 7))
val result2 = seq2.map { x => x match
  case _: Int  => s"int: $x"
  case _       => s"unexpected value: $x"
}

result2


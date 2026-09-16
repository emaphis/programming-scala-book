// Scala while Loops
// do while alternative
// src/script/scala/progscala3/rounding/do_while_alternative.sc

// Since Scala 3 doesn't have a do-while loop use an alternative

var count = 0

while
  count += 1
  println(count)
  count < 10
do {}

count == 10

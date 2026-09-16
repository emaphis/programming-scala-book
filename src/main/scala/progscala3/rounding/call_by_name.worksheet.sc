// Using try, catch, and finally Clauses
// Call by name
// src/main/scala/progscala3/rounding/call_by_name.worksheet.sc

import scala.annotation.tailrec

@tailrec
def continue(conditional: => Boolean)(body: => Unit): Unit =
  if conditional then
    body
    continue(conditional)(body)

var count = 0

continue(count < 5) {
    println(s"at $count")
    count += 1
}

count == 5


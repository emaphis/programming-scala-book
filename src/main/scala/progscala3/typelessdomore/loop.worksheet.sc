import scala.annotation.tailrec
// src/main/000scala/progscala3/typelessdomore/Loop.scala

/** Do "pure side effect" work */
def loop(n: Int)(f: Int => Unit): Unit =
  @tailrec
  def lp(i: Int): Unit =
    if i <= n then
      f(i)
      lp(i + 1)
  lp(1)

var accumulator: Seq[Int] = Nil
loop(4)(i => accumulator = i +: accumulator)
assert(accumulator == Seq(4, 3, 2, 1))

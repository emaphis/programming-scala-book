import scala.annotation.tailrec
// Nesting Method Definitions and Recursion pg. 93

def factorial(i: Int): BigInt =
  @tailrec
  def fact(i: Int, accumulator: BigInt): BigInt =
    if i <= 1 then accumulator
    else fact(i - 1, i * accumulator)

  fact(i, BigInt(1))

(0 to 10).foreach(i => println(s"$i: ${factorial(i)}"))

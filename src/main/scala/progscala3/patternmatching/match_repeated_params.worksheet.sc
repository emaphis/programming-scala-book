// Pattern Matching on Repeated Parameters  - pg 114
// src/main/scala/progscala3/patternmatching/match_repeated_params.sc

def matchThree(seq: Seq[Int]): Unit = seq match
  case Seq(h1, h2, rest*) =>    // same as h1 +: h2 +: rest => ...
    println(s"head 1 = $h1, head 2 = $h2, the rest = $rest")
  case _ => println(s"Other! $seq")

matchThree(Seq(1,2,3,4))
matchThree(Seq(1,2,3))
matchThree(Seq(1,2))
matchThree(Seq(1))

def fact(n: Int) = 1 to n reduceLeft (_*_)

fact(5)
fact(8)
fact(10)

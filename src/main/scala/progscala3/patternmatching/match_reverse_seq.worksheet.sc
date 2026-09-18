// Matching on Sequences  - pg 113
// src/main/scala/progscala3/patternmatching/match_reverse_seq.sc

def reverseSeqToString[T](l: Seq[T]): String = l match
  case prefix :+ end => s"(${reverseSeqToString(prefix)} :+ $end)"
  case Nil => "Nil"

reverseSeqToString(Vector(1, 2, 3, 4, 5))
//val res0: String = "(((((Nil :+ 1) :+ 2) :+ 3) :+ 4) :+ 5)"

val revList1 = ((((Nil :+ 1) :+ 2) :+ 3) :+ 4) :+ 5

val revList2 = Nil :+ 1 :+ 2 :+ 3 :+ 4 :+ 5

val revList3 = Vector.empty[Int] :+ 1 :+ 2 :+ 3 :+ 4 :+ 5

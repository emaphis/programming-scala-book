// Matching on Sequences  - pg 111
// src/msin/scala/progscala3/patternmatching/matchz-deq.sc

def seqToString[T](seq: Seq[T]): String = seq match
  case head +: tail => s"($head +: ${seqToString(tail)})"
  case Nil => "Nil"

seqToString(Seq(1, 2, 3))
seqToString(Seq.empty[Int])

seqToString(Vector(1, 2, 3))
seqToString(Vector.empty[Int])

seqToString(Map("one" -> 1, "two" -> 2, "three" -> 3).toSeq)
seqToString(Map.empty[String, Int].toSeq)

// +: operator

val is = 1 +: 2 +: (3 +: Nil)

val kvs = ("one",1) +: (("two",2) +: (("three",3) +: Nil))

val map1 = Map(kvs *)

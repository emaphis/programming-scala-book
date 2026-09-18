// Safer Pattern Matching with Matchable - pg 105
// src/main/scala/progscala3/patternmatching/matchable.sc

val iArray = IArray(1,2,3,4,5)

//iArray match
//    case a: Array[Int] => a(2) = 300  // Scala 3 warning!!

println(iArray)

//def examine1[T](seq: Seq[T]): Seq[String] = seq map {
//    case i: Int => s"Int: $i"
//    case other => s"Other: $other"
//}
// pattern selector should be an instance of Matchable,
//but it has unmatchable type T instead

// The type T needs to be bound
def examine[T <: Matchable](seq: Seq[T]): Seq[String] = seq map {
    case i: Int => s"Int: $i"
    case other => s"Other: $other" 
}

val seq: Seq[Matchable] = Seq(1, "two", 3, 4.4)

examine(seq)
//res1: Seq[String] = List(Int: 1, Other: two, Int: 3, Other: 4.4)

val iArray3 = IArray(1,2,3,4,5)

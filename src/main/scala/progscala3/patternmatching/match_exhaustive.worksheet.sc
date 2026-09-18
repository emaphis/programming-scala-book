// Values, Variables, and Types in Matches  - pg 111
// src/script/scala/progscala3/patternmatching/Mmtch_exhaustive.sc

val seq3 = Seq(Some(1), None, Some(2), None)

val result3 = seq3.map {
  case Some(i) => s"Int $i"
  case None    => "none"
}

result3

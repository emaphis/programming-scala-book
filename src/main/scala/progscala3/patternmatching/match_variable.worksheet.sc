// Values, Variables, and Types in Matches  - pg 107
// src/main/scala/progscala3/patternmatching/match_variable.sc

val seq = Seq(1, 2, 3.14, 5.5F, "one", "four", true, (6,7))

val result = seq.map {
    case "one" => "string one"
    case s: String => s"other string: $s"
    case (x, y) => s"tuple: ($x, $y)"
    case 1 => "int 1"
    case i: Int => s"other int: $i"
    case d: (double | float) => s"a double or float: $d"
   // case unexpected => s"unexpected value: $unexpected"
}

result

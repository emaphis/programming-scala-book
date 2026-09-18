// Values, Variables, and Types in Matches  - pg 110
// src/script/msin/progscala3/patternmatching/Mmtch_urprise.sc

def checkYBad(y: Int): Seq[String] =
  for x <- Seq(99, 100, 101)
    yield x match
      case y => "found y!"
      case i: Int => "int: "+i   // Unreachable case!

checkYBad(100)
checkYBad(88)

// Fix 1 Use capital Y
def checkYGood1(Y: Int): Seq[String] =
  for x <- Seq(99, 100, 101)
    yield x match
      case Y => "found y!"
      case i: Int => "int: "+i

checkYGood1(100)
checkYGood1(88)

// The second solution is to use backticks
def checkYGood2(y: Int): Seq[String] =
  for x <- Seq(99, 100, 101)
    yield x match
      case `y` => "found y!"
      case i: Int => "int: " + i

checkYGood2(100)
checkYGood2(88)

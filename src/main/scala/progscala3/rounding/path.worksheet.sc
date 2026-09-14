
import progscala3.rounding.Path

val one = new Path("one")

val three : Path = one / "two" / "three"

three.file

val threeb = one./("two")./("three")

three == threeb

//one concat "two"

one append "two"

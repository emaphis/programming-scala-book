// Defining operators

case class Foo(str: String):
  def append(s: String): Foo = copy(str + s)
  infix def combine(s: String): Foo = append(s)

Foo("one").append("two")
Foo("one") append {"two"}
Foo("one") `append` "two"
Foo("one") append "two"

Foo("one") combine "tow"

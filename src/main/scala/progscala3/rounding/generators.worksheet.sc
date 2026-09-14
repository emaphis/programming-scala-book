// for Comprehensions
// Generators

// i <- 0 until 10  is a generator

for i <- Set(0,2,1,2,3,4,4,5) do print(s"$i|")

for (key, value) <- Map("one" -> 1, "two" -> 2, "three" -> 3)
  do println(s"$key -> $value")

// src/main/scala/progscala3/introscala/UpperMain2.scala
package progscala3.introscala

@main
def Hello2(params: String*): Unit =
  val output = params.map(_.toUpperCase).mkString(" ")
  println(output)

// > sbt
// > run hello world
// [38] progscala3.introscala.Hello2
// [info] running (fork) progscala3.introscala.Hello2

// > runMain progscala3.introscala.Hello2 hello world again!
// [info] running progscala3.introscala.Hello2

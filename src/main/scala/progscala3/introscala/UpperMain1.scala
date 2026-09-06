// src/main/scala/progscala3/introscala/UpperMain1.scala
package progscala3.introscala

object UpperMain1:
  def main(params: Array[String]): Unit =
    print("UpperMain1.main: ")
    params.map(s => s.toUpperCase).foreach(s => printf("%s ", s))
    println("")

// sbt
// >  runMain progscala3.introscala.UpperMain1 Hello World!
// UpperMain1.main: HELLO WORLD!

def main(params: Array[String]): Unit =
  print("main: ")
  params.map(s => s.toUpperCase).foreach(s => printf("%s ", s))
  println("")

// > runMain progscala3.introscala.UpperMain1$package Hello
// main: HELLO

@main def Hello(params: String*): Unit =
  print("Hello: ")
  params.map(s => s.toUpperCase).foreach(s => printf("%s ", s))
  println("")

// > runMain progscala3.introscala.Hello Hello World!
// Hello: HELLO WORLD!

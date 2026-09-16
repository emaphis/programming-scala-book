// Using try, catch, and finally Clauses
// Uninitialized
// src/script/scala/progscala3/rounding/Uninitialized.scala

package progscala3.rounding
import scala.io.Source
import scala.compiletime.uninitialized

case class LineLoader(file: java.io.File):
  private var source: Source = uninitialized
  val lines: Seq[String] = try
    source = Source.fromFile("README.md")
    source.getLines().toSeq
  finally
    if source != null then source.close()

@main
def Uninitialized(): Unit =
  val ll = LineLoader(java.io.File("README.md"))
  println(ll.lines.take(1))
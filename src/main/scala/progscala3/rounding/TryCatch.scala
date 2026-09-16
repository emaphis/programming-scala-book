// Using try, catch, and finally Clauses
// Try catch
// src/main/scala/progscala3/rounding/TryCatch.scala
package progscala3.rounding
import scala.io.Source
import scala.util.control.NonFatal

/** Usage: scala rounding.TryCatch filename1 filename2 */
@main
def TryCatch(fileNames: String*): Unit =
  fileNames.foreach { fileName =>
    var source: Option[Source] = None
    try
      source = Some(Source.fromFile(fileName))
      val size = source.get.getLines().size
      println(s"file $fileName has $size lines")
    catch
      case NonFatal(ex) => println(s"Non fatal exception! $ex")
    finally
      for s <- source do
        println(s"Closing $fileName ...")
        s.close
  }

// > runMain progscala3.rounding.TryCatch README.md foo/bar

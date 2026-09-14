// src/main/scala/progscala3/rounding/Path.scala


package progscala3.rounding

import java.io.File
import scala.annotation.targetName

case class Path(value: String, separator: String = Path.defaultSeparator):
  val file = File(value)

  override def toString: String = file.getPath

  @targetName("concat")
  def / (node: String): Path =
    copy( value + separator + node)

  infix def append(node: String): Path = /(node)

private object Path:
  private val defaultSeparator: String | Null = sys.props("file.separator")

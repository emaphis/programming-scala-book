// Parameterized Types Versus Abstract Type Members
// src/main/scala/progscala3/typelessdomore/BulkReader.scala

import progscala3.typelessdomore.{StringBulkReader, FileBulkReader}
import scala.io.Source

val strings = StringBulkReader("Hello Scala!").read
strings

val cwd = System.getProperty("user.dir")

val lines = FileBulkReader(Source.fromFile("README.md")).read
lines(0)
lines(2)

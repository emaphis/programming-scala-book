// Type erasure.
// src/script/scala/progscala3/rounding/TypeErasureProblem.scala
package progscala3.rounding

import scala.annotation.targetName

object o:
  def m(is: Seq[Int]): Int = is.sum
  // Type erasure error.
  //def m(ss: Seq[String]): Int = ss.length

object o_fix:
  def m(is: Seq[Int]): Int = is.sum
  @targetName("m_seq_string")
  def m(ss: Seq[String]): Int = ss.length

// Traits: Interfaces and Mixins in Scala - pg 98
// Logging
// src/main/scala/progscala3/rounding/traits.sc

import util.Random

open class Service(name: String):
  def work(i: Int): (Int, Int) = (i, Random.between(0, 1000))

val service1 = new Service("one")
(1 to 3) foreach (i => println(s"Result: ${service1.work(i)}"))


enum Level:
  case Info, Warn, Error
  def ==(other: Level): Boolean = this.ordinal == other.ordinal
  def >=(other: Level): Boolean = this.ordinal >= other.ordinal

trait Logging:
  import Level.*

  def level: Level
  def log(leve: Level, message: String): Unit

  final def info(message: String): Unit =
    if level >= Info then log(Info, message)
  final def warn(message: String): Unit =
    if level >= Warn then log(Warn, message)
  final def error(message: String): Unit =
    if level >= Error then log(Error, message)


trait StdoutLogging extends Logging:
  def log(level: Level, message: String): Unit =
    println(s"${level.toString.toUpperCase}: $message")


case class LoggedService(name: String, level: Level)
  extends Service(name) with StdoutLogging:
  override def work(i: Int): (Int, Int) =
    info(s"Starting work: i = $i")
    val result = super.work(i)
    info(s"Ending work: result = $result")
    result

val service2 = LoggedService("two", Level.Info)
(1 to 3) foreach (i => println(s"Result:  ${service2.work(i)}"))

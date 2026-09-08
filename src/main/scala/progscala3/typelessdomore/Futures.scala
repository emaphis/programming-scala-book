// src/script/scala/progscala3/typelessdomore/Futures.scala
package progscala3.typelessdomore

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

def sleep(millis: Long): Unit = Thread.sleep(millis)

//@main
def main(): Unit =
  println("start ---")

  (1 to 10).foreach { i =>
    val future = Future {
      val duration = (math.random() * 1000).toLong
      sleep(duration)
      if i == 3 then throw RuntimeException(s"$i -> $duration")
      duration
    }
    future.onComplete {
      case Success(result)    => println(s"Success! #$i -> $result")
      case Failure(throwable) => println(s"FAILURE! #$i -> $throwable")
    }
  }

  sleep(1000)  // Wait long enough for the "work" to finish.
  println("Finished")

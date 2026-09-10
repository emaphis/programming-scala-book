package progscala3.typelessdomore

val DefaultCount = 5
def countTo(limit: Int = DefaultCount) = (0 to limit).foreach(println)

class Class1:
  def m = "cm1"

object Object:
  def m = "om1"


import progscala3.typelessdomore.shapes.*

val p1: Point = Point(x = 3.3, y = 4.4)
val p2: Point = p1.copy(y = 6.6)

val s = Circle(Point(0.0, 0.0), 1.0)
s.draw(Point(1.0, 2.0)) (str => println(str))

// or
s.draw(Point(1.0, 2.0)) {
  str => println(str)
}

// default value
s.draw() {
  str => println(str)
}



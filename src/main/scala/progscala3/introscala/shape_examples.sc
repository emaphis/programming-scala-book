// Shape examples

import progscala3.introscala.shapes.*

val p00 = Point()

val p20 = Point(2.0)

val p20b = Point(2.0)

val p02 = Point(y = 2.0)

p20 == p20b

p20 == p02

val p1 = Point.apply(1.0, 2.0)  // Point is the companion

val p2 = Point(1.0, 2.0)

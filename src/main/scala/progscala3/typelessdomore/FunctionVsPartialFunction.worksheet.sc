// Partial Functions

// src\main\scala\progscala3\typelessdomore\FunctionVsPartialFunction.worksheet.sc

import progscala3.introscala.shapes.*

val func: Message => String = message => message
  match
    case Exit => "Got exit"
    case Draw(shape) => s"Got Draw($shape)"
    case Response(str) => s"Got Response($str)"

val pfunc: PartialFunction[Message, String] =
  case Exit => "Got exit"
  case Draw(shape) => s"Got Draw($shape)"
  case Response(str) => s"Got Response($str)"

val out1 = func(Draw(Circle(Point(0.0, 0.0), 1.0)))
val out2 = pfunc(Draw(Circle(Point(0.0, 0.0), 1.0)))
val out3 = func(Response(s"Say hello to pi: 3.14159"))
val out4 = pfunc(Response(s"Say hello to pi: 3.14159"))

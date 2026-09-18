// When `new` is Optional 
// src/main/scala/progscala3/typelessdomore/optional_new.sc

class Person(name: String, age: Int):
    def this() = this ("unknown", 0)  // Auxiliary constructor


import java.io.File

val file = File("README.md")   // No "new" needed, even for Java classes!

trait Welcome:
    def hello(name: String): Unit

val hello = new Welcome:
    def hello(name: String): Unit = println(s"Hello: $name")

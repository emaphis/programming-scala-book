// When You Really Can’t Avoid Nulls  pg 61
// src/script/main/progscala3/typelessdomore/Null.scala

import java.util.HashMap as JHashMap

val jhm = JHashMap[String, String]()
jhm.put("one", "1")

val one1: String = jhm.get("one")
val one2: String | Null = jhm.get("one")

val two1: String = jhm.get("two")
val two2: String | Null = jhm.get("two")

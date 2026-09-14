// Interpolated Strings

// s"foo ${bar}"

val name = "Buck Trends"
println(s"Hello, $name")

val gross   = 100000F
val net     = 64000F
val percent = (net/gross) * 100
println(f"$$$gross%.2f vs. $$$net%.2f or $percent%.1f%%")
//$100000.00 vs. $64000.00 or 64.0%s

// format strings
val s = "%02d: name = %s".format(5, "Dean Wampler")
//val s: String = "05: name = Dean Wampler"

val name2 = "Dean Wampler"
val multiLine = s"123\n$name2\n456"
println(multiLine)

val multiLineRaw = raw"123\n$name2\n456"
println(multiLineRaw)

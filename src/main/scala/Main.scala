// Example Main Application that finds Scala compiler version and current working directory

@main def hello(): Unit =
  println("Hello world!")
  println(msg)
  println(msg2)

def msg: String = "I was compiled by Scala " + getVersion + " :)"
def msg2: String = "I'm running in " + getCurrentDirectory

def getVersion: String =
  val compilerVersion = scala.util.Properties.versionString
  compilerVersion

def getCurrentDirectory: String =
  val cwd = System.getProperty("user.dir")
  cwd

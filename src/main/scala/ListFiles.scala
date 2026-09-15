import java.io.File

object ListFiles:
  def main(args: Array[String]): Unit =
    // Create a file object for the current directory
    val currentDir = File(".")

    // Print our current directory
    println(currentDir.getAbsolutePath)

    // List only files (not directories)
    val files = currentDir.listFiles.filter(_.isFile)

    // Print each files' path
    files.foreach { file =>
      println(file.getName)
    }

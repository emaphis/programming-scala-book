// Lazy Values
// Initialing lazy values
// src/main/scala/progscala3/rounding/lazy_init_val.sc

case class DBConnection():
  println("In constructor")
  type MySQLConnection = String
  lazy val connection: MySQLConnection =
    // Connect to the database
    println("Connected")
    "DB"

val dbc = DBConnection()

dbc.connection

dbc.connection

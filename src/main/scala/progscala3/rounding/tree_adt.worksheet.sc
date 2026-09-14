// // src/main/scala/progscala3/rounding/tree_adt.scala

object SealedADT:
  sealed trait Tree[T]
  case class Branch[T](left: Tree[T], right: Tree[T]) extends Tree[T]
  case class Leaf[T](elem: T) extends Tree[T]

  val tree = Branch(
    Branch(
      Leaf(1),
      Leaf(2)),
    Branch(
      Leaf(3),
      Branch(Leaf(4), Leaf(5))))


object EnumADT:
  enum Tree[T]:
    case Branch(left: Tree[T], right: Tree[T])
    case Leaf(elem: T)

  import Tree.*

  val tree = Branch(
    Branch(
      Leaf(1),
      Leaf(2)),
    Branch(
      Leaf(3),
      Branch(Leaf(4), Leaf(5))))

SealedADT.tree
EnumADT.tree

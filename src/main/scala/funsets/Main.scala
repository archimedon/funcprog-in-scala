package funsets

object Main extends App {
  import FunSets._

  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)

  val bigger = union(s1, union(s2, union(s3, singletonSet(4))))
  printSet(bigger)
}

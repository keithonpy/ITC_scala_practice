package exercises.mapFunc

object FoldNScan {
  val lst = List(1, 2, 3, 4, 5, 6, 7)
  val lst2 = List("A", "B", "C")
  def main(args:Array[String]): Unit = {
    // difference between fold and reduce is that an initial value is passed to fold
    println(lst.foldLeft(10)(_ + _));
    println(lst2.foldLeft("x")(_+_));
    // scan give the intermediate of fold
    println(lst.scanLeft(10)(_ + _));
    println(lst2.scanLeft("x")(_ + _));
  }
}

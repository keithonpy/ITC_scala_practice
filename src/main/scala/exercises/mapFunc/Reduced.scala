package exercises.mapFunc

object Reduced {
  val lst = List(1, 2, 3, 4, 5, 6, 7);
  val lst2 = List("A", "B", "C");
  def main(args:Array[String]): Unit = {
    // reduceLeft add all the number
    println(lst.reduceLeft(_ + _));
    // reduceLeft concatenate the string
    println(lst2.reduceLeft(_ + _));
    //show the process
    println(lst.reduceLeft((x, y) => {println(x + " , " + y); x+y;}))
    // now on reduceRight
    println(lst.reduceRight(_-_));
    //show the process
    println(lst.reduceRight((x, y) => {println(x + " , " + y); x-y}))
  }
}

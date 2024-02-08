package exercises.functions
/* A closure is a function which uses one or more
variables declared outside the function */

object Closures {
  var number = 10;
  val add = (x:Int) => x + number;

  def main(args: Array[String]): Unit = {
    println(s"number = $number")
    println(add(20))
    number = 100;
    println(add(20));
  }

}

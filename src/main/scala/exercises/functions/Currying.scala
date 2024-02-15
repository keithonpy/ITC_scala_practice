package exercises.functions
/* Currying is a technique of transforming a function
that takes multiple arguments into a function
that takes a single argument
 */

/* The primary purpose of currying is to enable partial function
 application and facilitate function composition,
 leading to more flexible and expressive code
 */
object Currying {
  def add(x:Int, y: Int)  = x + y;

  def add2(x:Int) = (y:Int) => x +y;

  def add3(x:Int) (y:Int) = x + y;

  def main(args: Array[String]): Unit = {
    // function without currying
    println(add(10, 20))
    // function with currying
    println(add2(10)(20))

    val sum40 = add2(40)
    println(sum40(50))

    // Currying with partial applied function
    val sum50 = add3(50)_;
    println(sum50(400))
  }

}

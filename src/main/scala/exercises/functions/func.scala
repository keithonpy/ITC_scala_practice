package exercises.functions


object func {
  // four ways to define functions
  def add(x:Int , y:Int): Int = {
    return x + y
  }

  def subtract(x:Int, y:Int): Int = {
    x - y;
  }

  def multiply(x:Int, y:Int): Int = x*y;

  def divide(x:Int, y:Int) = x/y;

  object Math {
    def add(x:Int = 1, y:Int = 1): Int = {
      return x + y;
    }
    def square(x:Int) = x*x;
  }


  def main(args:Array[String]): Unit = {
    println(add(45, 15))
    println(subtract(45, 15))
    println(multiply(45, 15))
    println(divide(45, 15))
    // since it's an object, we don't need to create another object (like class)
    println("Call add function from Math Object: "+ Math.add(45, 15))
    // only one argument
    print("Call square function with one argument: ")
    println(Math square 3)

    println("Call add function with default value: " + Math.add())

    // anonymous function
    var add_anonymous = (x:Int, y: Int) => x + y;
    println("Print add value " + add_anonymous(1, 2))
  }
}

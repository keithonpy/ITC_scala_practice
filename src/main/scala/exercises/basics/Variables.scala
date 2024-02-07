package exercises.basics

object Variables{
  def main(args: Array[String]): Unit = {

    // Variables types
    // Boolean, Bytes, Short, Char, Int, Long, Float, Double, String
    // Unit, NULL, Nothing, Any, AnyRef
    // define some variables
    // mutable variable
    var age: Int = 31;
    // immutable variable
    val name: String = "Keith";

    //print text
    println(name + " is " + age + " years old.");
    println(s"$name is $age years old.")
    println(f"$name%s is $age%d years old.")
    println(raw"Hello \n World")


  }

}

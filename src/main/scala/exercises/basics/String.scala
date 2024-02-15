package exercises.basics

object String {
  val num1 = 1;
  val num2 = 2.5f;
  val str1: String = "Hello World"
  val str2: String = " ITC"
  def main(args: Array[String]): Unit = {
    println("The length of the string is " + str1.length())

    println("Print two string as one string: " + str1.concat(str2))

    println("Print two string as one string by \"+\": " + (str1+str2))

    //print variables
    // METHOD 1
    val res = printf("num1 = %d| num2 = %f| str1 = %s", num1, num2, str1)
    // because printf :Unit as a function return None so it gives the bracket
    println(res)

    // METHOD 2
    println("num1 = %d| num2 = %f| str1 = %s".format(num1, num2, str1))

    // METHOD 3
    printf("num1 = %d| num2 = %f| str1 = %s", num1, num2, str1)


  }

}

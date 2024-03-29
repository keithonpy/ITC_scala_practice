package exercises.collections

object Lists {
  def main(args: Array[String]): Unit = {
    // create a list of integer
    val numbers = List(1, 2, 3, 4, 5)
    val strList: List[String] = List("Alice", "Bob", "Charlie")
    // create a lists with NIL
    println(1::5::9::Nil);

    //print the lists
    println(s"List of numbers = $numbers")

    // access the element
    println(s"First element: " + numbers.head)
    println(s"Last element: " + (numbers.last))
    println(s"Tail element (drop the first element): " + numbers.tail)
    println(s"The list is empty? " + numbers.isEmpty)

    // add element to a new list
    val updatedNumbers = numbers :+ 6
    println(s"Updated list = $updatedNumbers")

    // slicing starting with index 0
    val slicedList = numbers.slice(2, 5);
    println(s"Sliced list from 3 to 5 = $slicedList");

    // drop and take
    val dropList = numbers.drop(2);
    println(s"Dropped list to drop first 2 elements = $dropList")

    val subList = numbers.take(3);
    println(s"Taken list to take first 3 elements = $subList")

    // appendleft into the list
    val appendLeftList = 0::numbers;
    println(s"Left append to list = $appendLeftList")

    // concatenate two lists
    val numbers2 = List(6, 7, 8, 9, 10)
    val concatList = numbers ::: numbers2;
    println(s"Concatenated List = $concatList")

    // Lists operation
    numbers.foreach(println)
    var sum = 0;
    numbers.foreach(sum += _);
    println(s"The sum of the list is $sum")
  }

}

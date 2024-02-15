package exercises.collections

object MapsPractice{
  def main(args: Array[String]): Unit = {
    // Create a map
    val studentAges = Map("Alice"->20, "Bob"->22, "Charlie"-> 21);
    val studentAges2 = Map("Keith"->31);

    // Access and print values from the map
    println("Alice's age is " + studentAges("Alice"));
    println("Bob's age is " + studentAges("Bob"));


    // append new element into the map
    // METHOD 1:
    val addStudentAges1 = studentAges + ("Keith" -> 31)
    println(s"A new studentAge is $addStudentAges1")

    // METHOD 2:
    val addStudentAges2 = studentAges.updated("Keith", 31)
    println(s"A new studentAge is $addStudentAges2")
    // concat two map
    val addStudentAges3 = studentAges ++ studentAges2
    println(s"A new studentAge is $addStudentAges3")


    // delete element from the map
    // METHOD 1 -:
    val delStudentAges1 = studentAges - "Keith"
    println(s"A modified studentAge map is $delStudentAges1")

    // delete multiple elements from the map
    //METHOD 2 --:
    val delStudentAges2 = studentAges -- List("Bob", "Charlie")
    println(s"A modified studentAge map is $delStudentAges2")

//    //METHOD 3 filterKeys:
//    val DelStudentAges3 = studentAges.filterKeys(_!="Bob")
//    println(s"A modified studentAge map is $DelStudentAges3")

    // Map operation
    println(s"Print the keys of the map: ${studentAges.keys}" )
    println(s"Print the values of the map: ${studentAges.values}")
    println(s"Is the map empty or not? ${studentAges.isEmpty}")

    studentAges.keys.foreach{key =>
      println("key: "+key);
      println("Value: " + studentAges(key))
    }

    println(s"Check if there is key \"Alice\": ${studentAges.contains("Alice")}")
  }

}

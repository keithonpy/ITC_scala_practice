package exercises.mapFunc

object MapNFilter {
  val lst = List(1, 2, 3, 4, 5, 6, 7);
  val myMap = Map(1->"Tom", 2->"Max", 3 ->"John");
  def main(args: Array[String]): Unit = {
    // double the element by 2
    println(lst.map(_*2))
    // add 2 to each element
    println(lst.map(x=>x+2))
    // multiple number of "hi"
    println(lst.map(x => "hi"*x))
    // Try on the map, hi will be appended before the tuple => map is from the tuple
    println(myMap.map(x=>"hi"+x))
    // as mapValues is depreciated, here are how to add to the map values only
    println(myMap.map {
      case (key, value) => key -> ("hi " + value)
    })
    // map apply on every characters
    println("hello".map(_.toUpper))

    // flatten the list
    println(List(List(1, 2, 3), List(3, 4, 5))) // create a list of list
    println(List(List(1, 2, 3), List(3, 4, 5)).flatten)

    // map and flatten the list
    println(lst.flatMap(x=>List(x, x+1)));
    println(lst.map(x=>List(x, x+1)));

    // filter is a predicate
    // filter the even numer
    println(lst.filter(x => x %2 == 0))
  }
}

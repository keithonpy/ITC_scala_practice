package exercises.collections

object Options {
  val lst = List(1, 2, 3);
  val map = Map(1->"Tom", 2-> "Max", 3 -> "John")
  val opt: Option[Int] = None;
  val opt2: Option[Int] = Some(22);
  def main(args: Array[String]): Unit = {
      //use find to find from list
      println(lst.find(_>2));
      // get the value from map
      println(map.get(2));
      // find only display the most optimal value
      println(lst.find(_>1));
      // use get to get the value
      println(lst.find(_>1).get);
      // use getOrElse when there is no such value
      println(map.get(5).getOrElse("No name found"));

      // check if there is value in opt
      println(opt.isEmpty)
      // check if there is value in opt2
      println(opt2.isEmpty)

      // get the value out of Some
      println(opt2.get)

  }

}

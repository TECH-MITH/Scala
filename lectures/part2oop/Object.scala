package lectures.part2oop

object Objects extends App{
  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { // types + its only instance
    // "static"/"class" - level functionality
    val N_EYES= 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person =new Person("Mithilesh")

  }
  class Person(val name: String)
  {
    // instance-level functionality
  }
  // COMPANION
  println(Person.N_EYES)
  println(Person.canFly)

  // scala object = SINGLETON INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary==john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val Mithilesh = Person(mary, john)

  // Scala Applications = Scala object
  // def main(args: Array[String]):Unit

}
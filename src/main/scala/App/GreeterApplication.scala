package App

class Person (name : String) {
  def speak() : String = {
    if (name == "claire") {
      s"You don't get a Hello!"
      } else {
      s"Hello $name"

    }
  }
}

object GreeterApplication extends App{
  val name = "Claire"
  val person = new Person (name)
  println(person.speak())
}


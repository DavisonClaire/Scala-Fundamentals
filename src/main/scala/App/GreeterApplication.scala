package App

object GreeterApplication extends App {
  def greet(name: String): Unit = {

    if (name == "claire") {
      println(s"You don't get a hello")
    } else {
      println(s"Hello $name")
    }
  }

  val name = ("Claire")

  greet(name)
}
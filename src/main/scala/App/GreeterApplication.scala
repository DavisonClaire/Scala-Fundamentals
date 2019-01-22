package App

object GreeterApplication extends App
{
  def greet (name : String) : Unit = println(s"Hello $name")

  val name = "Claire"

  greet(name)
}
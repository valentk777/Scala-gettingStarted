class Person {

  var age: Int = 0

  def this(initialAge: Int) = {
    this()

    if (initialAge > 0) {
      age = initialAge
    }
    else {
      age = 0
      println("Age is not valid, setting age to 0.")
    }
  }

  def amIOld(): Unit = {
    if (age < 13) {
      println("You are young.")
    }
    else if (age < 18) {
      println("You are a teenager.")
    }
    else {
      println("You are old.")
    }
  }

  def yearPasses(): Unit = {
    age += 1
  }
}

object Solution {

  def main(args: Array[String]) {
    val T = scala.io.StdIn.readInt()
    for (_ <- 1 to T) {
      val age = scala.io.StdIn.readInt()
      val p = new Person(age)
      p.amIOld()
      for (_ <- 1 to 3) {
        p.yearPasses()
      }
      p.amIOld()
      System.out.println()
    }
  }
}
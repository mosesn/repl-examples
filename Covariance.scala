// paste directly into REPL

trait Animal {
  def feed()
}

case class Dog(name: String) extends Animal {
  def feed() {
    println("%s fed".format(name))
  }
}

val dogs: Seq[Dog] = Seq(Dog("Lucy"), Dog("Rover"), Dog("Chelsea"))
feedAnimals(dogs)

def feedAnimals(animals: Seq[Animal]) {
  animals foreach { _.feed() }
}

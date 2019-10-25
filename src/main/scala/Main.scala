object Main {

  def main(args: Array[String]): Unit = {
    println("Hello world!")
    println(msg)
  }

  def msg = "I was compiled by dotty :)"


  trait Monad[A] {
    def identity: A
    def flatMap[B](f: A => Monad[B]): Monad[B]
  }
}

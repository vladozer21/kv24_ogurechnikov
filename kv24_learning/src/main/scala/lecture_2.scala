package KV24

import scala.annotation.tailrec

object lecture_2 extends App{

  //1
  def chet(x: Int) = {
    if (x % 2 != 0 ) println(s"$x - нечет")
    else  println(s"$x - чет")
  }
  chet(2)
  chet(5)
  chet(10)
  println()

  //2
  def chislo(x: Int) = {
    if (x < 0) println(s"$x - отрицательное число")
    if (x == 0) println(s"$x - это ноль")
    if (x > 0) println(s"$x - положительное число")
  }
  chislo(3)
  chislo(0)
  chislo(-4)
  println()


  //3
  def one_to_ten() = {
    for (i <- 1 to 10) print(i)
  }
  one_to_ten()
  println()



  def one_until_ten() = {
    for (i <- 1 until 10) print(i)
  }
  one_until_ten()
  println()
  println()



  //4
  def five() = {
    for (i <- 1 to 10) println(s"$i * 5 = ${i * 5}")
  }
  five()
  println()


  //5
  def fibonacci(n: Int): Int = {
    @tailrec
    def fibTail(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => fibTail(n - 1, b, a + b)
    }

    fibTail(n, 0, 1)
  }

  println("Первые 10 чисел Фибоначчи (хвостовая рекурсия):")
  for (i <- 0 until 10) {
    print(fibonacci(i) + " ")
  }
  println()
}

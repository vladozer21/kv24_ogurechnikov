
import scala.io.StdIn._
import scala.math.{abs, pow, sqrt}
import scala.runtime.RichDouble

object lecture_1 extends App {
  //1 лекция
  // 1
  def sqr(x: Int) = x * x
  println(sqr(3))
  println(sqr(4))
  println(sqr(5))
  println()

  //2
  val pi = 3.14
  def area(r: Int) = pi * sqr(r)
  println(area(3))
  println()

  //3
  def conv(temp: Int) = temp * 9 / 5 + 32
  println(conv(25) + "F")
  println()

  //4
  def lengthStr(str: String) = str.length
  println(lengthStr("hello"))
  println()

  //5
  def distance(x1: Int, y1: Int, x2: Int, y2: Int ) = {
    val res: Double = sqrt(pow(abs(x2 - x1), 2) + pow(abs(y2 - y1), 2))
    println(s"Расстояние между точками равно $res")
  }


  println("Введите координаты первой точки")
  println("x = ")
  val x1 = readInt()
  println("y = ")
  val y1 = readInt()
  println("Введите координаты второй точки")
  println("x = ")
  val x2 = readInt()
  println("y = ")
  val y2 = readInt()

  distance(x1, y1, x2, y2)






}

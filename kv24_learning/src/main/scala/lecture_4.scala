import lecture_3._


object lecture_4 extends App {

  //Напишите функцию, для вычисления площади каждой фигуры
  def findFigureArea(fig: Any): Any ={
    val res = fig match {
      case fig: Circle =>  s"Площадь круга: ${fig.findArea}"
      case fig: Rectangle => s"Площадь прямоугольника: ${fig.findArea}"
      case fig: Square => s"Площадь квадрата: ${fig.findArea}"
      case _ => "Фигура не распознана"
    }
    res
  }


  val circle = Circle(3)
  val square = Square(5)
  val rectangle = Rectangle(4, 5)


  println(findFigureArea(circle))
  println(findFigureArea(square))
  println(findFigureArea(rectangle))
  println(findFigureArea(""))
  println()


    // Напишите функцию, которая проверяет, содержит ли Option[String] определенное слово.
    // Если содержит, то программа должна вывести "Слово найдено", иначе "Слово не найдено"


  def wordChek(option: Option[String], word: String): Unit = {
    val res: Unit = option match {
      case Some(s) => if (s.contains(word)) println("Cлово найдено") else println("Cлово не найдено")
      case _ => println("Неправильные данные")
    }
    res
  }

  val str = "слово"
  val opt1: Option[String] = Some("Здесь есть слово")
  val opt2: Option[String] = Some("А тут нет")

  wordChek(opt1, str)
  wordChek(opt2, str)



}

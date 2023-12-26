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


    //Напишите функцию, которая принимает на вход Option[Int] с возрастом человека
    // и выводит категорию возраста (ребенок, подросток, взрослый и т. д.)



  def oldCategory(option: Option[Int]): Unit = {
    val old = option.getOrElse(-1)
    val res: Unit = old match {
      case old => if (12 > old && old >= 0) println("Ребенок")
                  if (18 > old && old >= 12) println("Подросток")
                  if (old >= 18) println("Взрослый")
                  if (old < 0) println("Ошибка ввода возраста")


    }
    res
  }

  val opt_1: Option[Int] = Some(4)
  val opt_2: Option[Int] = Some(15)
  val opt_3: Option[Int] = Some(60)
  val opt_4: Option[Int] = None
  val opt_5: Option[Int] = Some(-3)

  println()
  oldCategory(opt_1)
  oldCategory(opt_2)
  oldCategory(opt_3)
  oldCategory(opt_4)
  oldCategory(opt_5)
  println()
}

import lecture_3._


object lecture_4 extends App {

  //Напишите функцию, для вычисления площади каждой фигуры
  def findFigureArea(fig: Any): Any ={
    val res = fig match {
      case fig: Circle =>  s"Площадь круга: ${fig.findArea}"
      case fig: Rectangle => s"Площадь прямоугольника: ${fig.findArea}"
      case fig: Square => s"Площадь квадрата: ${fig.findArea}"
      case _ => "Фигура не опознана"
    }
    res
  }


  val circle = Circle(3)
  val square = Square(5)
  val rectangle = Rectangle(4, 5)


  println(findFigureArea(circle))
  println(findFigureArea(square))
  println(findFigureArea(rectangle))


}

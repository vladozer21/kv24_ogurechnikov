import lecture_1.sqr

object lecture_3  extends App{

  //Создайте класс Book с полями "заголовок", "автор" и "год издания". Создайте companion object для этого класса, в котором
  // будет метод createBook, принимающий название, автора и год выпуска, и возвращающий объект Book с этими значениями

  class Book(val heading: String, val author: String, val yearOfPublic: String)
    object Book {
      def createBook(heading: String, author: String, yearOfPublic: String): Book = {
        new Book(heading, author, yearOfPublic)
      }
    }

   val res = Book.createBook("Scala для нетерпеливых", "Кей Хорстман", "2017")
    println()
    println(s"Название: ${res.heading}")
    println(s"Автор: ${res.author}")
    println(s"Год: ${res.yearOfPublic}")
    println()


  //Создайте кейс-классы для представления геометрических фигур: "круг", "прямоугольник", "квадрат", с необходимыми им параметрами.
  // Отнаследуйте их от трейта "фигура", с методом расчета площади.
  // Реализуйте метод расчета площади в каждом из наследников


  trait figure {
    def findArea: Int
  }

  case class Circle(radius: Int) extends figure {
    override def findArea: Int = (sqr(radius) * 3.14).toInt
  }
  case class Rectangle(high: Int, width: Int) extends figure {
    override def findArea: Int = high * width
  }
  case class Square( side: Int) extends figure {
    override def findArea: Int = side * side

  }

  val cir = Circle(3)
  val rect = Rectangle(5, 2)
  val squ = Square(5)

  println()
  println(s"Площадь круга: ${cir.findArea}")
  println(s"Площадь прямоугольника: ${rect.findArea}")
  println(s"Площадь квадрата: ${squ.findArea}")


}
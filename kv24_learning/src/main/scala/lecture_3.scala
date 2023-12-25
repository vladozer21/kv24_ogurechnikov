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




  


}
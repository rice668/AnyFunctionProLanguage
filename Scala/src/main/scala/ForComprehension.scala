/**
  * Created by root on 16-8-6.
  */
object ForComprehension extends App {
  val num = List(1, 2, 3, 4, 5, 6, 7, 8)
  for (i <- num) // generator expression
    print(i + " ")
  println()
  for (i <- num if i > 3 if i % 2 == 0) // guard and you can add any types here...
    print(i + " ")
  println()

  val dogBreeds = List("Bdsc", "sdcds", "IOOPSA", "csdcuiw")

}

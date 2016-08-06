/**
  * Created by root on 16-8-6.
  */
object Max extends App {

  def max(xs: List[Int]): Int = {
    if (xs.isEmpty) throw new NoSuchElementException
    if (xs.size == 1) xs.head // that was called recursive exit
    else if (xs.head > max(xs.tail))
      xs.head
    else max(xs.tail)
  }

  println(max(List(1, 2, 3, 4, 5)))

}

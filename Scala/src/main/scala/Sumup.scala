/**
  * Created by root on 16-8-6.
  */
object Sumup extends App {

  def sum(xs: List[Int]): Int = {
    if (xs.isEmpty) 0 else xs.head + sum(xs.tail)
  }
  
  println(sum(List(1,2,3,4,5)))
}

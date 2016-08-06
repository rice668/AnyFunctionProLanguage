/**
  * Created by root on 16-8-6.
  */
object Reverse extends App {

  def reverse(xs: String): String = {
    if (xs.length == 1) xs.head.toString // 对于一个只有一个字符的字符串，不需要反转，这是递归算法的边界条件
    else reverse(xs.tail) + xs.head
  }

  println(reverse("1223"))

}

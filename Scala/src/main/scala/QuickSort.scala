/**
  * Created by root on 16-8-6.
  */
object QuickSort extends App {

  def quickSort(xs: List[Int]): List[Int] = {
    if (xs.isEmpty) xs //显然，一个空的列表即为一个排好序的列表，这就是这个算法中的边界条件
    else
      quickSort(xs.filter(x => x < xs.head)) ::: (xs.head :: quickSort(xs.filter(x => x > xs.head)))
  }

  println(quickSort(List(4,8,9,1,0)))

}

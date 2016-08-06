/**
  * Created by root on 16-8-6.
  */
object ParticalFunc extends App {

  case class UnregisterApplication(appId: String)

  /**
    * 输入一个任意类型的数据，输出一个任意类型的数据，或者Unit什么都不输出
    */
  val pf: PartialFunction[Any, Any] = {
    case UnregisterApplication("1") =>
      ("Master FUCK YOU IM the receive ElectedLeader invoked!!!")
    case i:Int if i%2 == 0 => "even"
    case str: String => Option
  }

  println(pf(new UnregisterApplication("1")))
  println(pf(12))
  println(pf("1212"))

}

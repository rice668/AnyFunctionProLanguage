import java.util.concurrent.TimeUnit

import akka.actor.{Props, ActorSystem, Actor}


object Main extends App {

  // it is a good a practice to use case classes/case objects for each type of a message.
  // 非常重要，在Spark的源码里面，大量使用了 case class / case object
  // 【org.apache.spark.deploy.DeployMessages】

  case class SayHello(message: String) {}

  case class StopSystem(port: Int) {
    assert(port > 0)
  }

  class HelloWorldPrinter extends Actor {
    override def receive = {
      case SayHello => println("Hello World")
      case StopSystem => context.system.shutdown()
      case _ => println("Unknown message")
    }
  }

  val system = ActorSystem("Main")
  val helloWorldPrinter = system.actorOf(Props[HelloWorldPrinter])
  helloWorldPrinter ! SayHello
  helloWorldPrinter ! "another message"
  helloWorldPrinter ! StopSystem(1)

}

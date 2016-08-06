import java.util.concurrent.TimeUnit

import akka.actor.{Props, ActorSystem, Actor}


object Main extends App {

  // While it is possible to pass any object to Actor , it is a good
  // a practice to use case classes/case objects for each type of a
  // message.

  case object SayHello
  case object StopSystem

  class HelloWorldPrinter extends Actor {
    override def receive = {
      case SayHello => println("Hello World")
      case StopSystem => context.system.awaitTermination(3, TimeUnit.SECONDS)
      case _ => println("Unknown message")
    }
  }

  val system = ActorSystem("Main")
  val helloWorldPrinter = system.actorOf(Props[HelloWorldPrinter])
  helloWorldPrinter ! SayHello
  helloWorldPrinter ! "another message"
  helloWorldPrinter ! StopSystem

}

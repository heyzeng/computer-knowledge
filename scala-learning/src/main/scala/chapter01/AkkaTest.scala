package chapter01

import akka.actor.{Actor, ActorSystem, Props}

/**
 * Author:ZJF
 * Date:2021-01-14 下午2:46
 */
object AkkaTest extends App {
  val system = ActorSystem("HelloSystem")
  // 缺省的Actor构造函数
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "喂"

}

class HelloActor extends Actor{
  override def receive: Receive = {
    case "hello" => println("你好")
    case _ => println("?")

  }
}

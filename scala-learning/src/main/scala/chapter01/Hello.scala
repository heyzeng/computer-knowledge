package chapter01

import akka.actor.Actor

/**
 * Author:ZJF
 * Date:2020-12-30 下午6:01
 */
object Hello {
  def main(args: Array[String]): Unit = {

    println("hello,scala")

    //定义变量
    val a:Int = 1
    val b:Int = 2
    var age:Int = 10
    var name:String = "Jude"

    println(a)
    println(b)
    println(s"${age} ${name}")

  }
}


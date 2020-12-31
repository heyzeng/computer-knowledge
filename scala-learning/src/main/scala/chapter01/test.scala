package chapter01

import java.util

/**
 * Author:ZJF
 * Date:2020-12-30 下午6:02
 */
object test {
  def main(args: Array[String]): Unit = {

    val cat = new Cat
    cat.name = "Jim"
    cat.age = 100
    cat.color = "red"

    val ints = new Array[Int](4)
    println(ints.length)

    cat.hi()

    printf("cat is %s %d %s",cat.name,cat.age,cat.color)
  }
}

class Cat {
  var name: String = ""
  var age: Int = _
  var color: String = ""

  def hi(): Unit ={
    println("hello")
  }
}

package chapter01

import org.apache.spark.{SparkConf, SparkContext}


object sparkTest {
  def main(args: Array[String]): Unit = {

    // 创建sparkContext
    val conf = new SparkConf().setAppName("sparkTest").setMaster("local[2]")
    val sc = new SparkContext(conf)

    // 创建RDD
    val lines = sc.textFile("/Users/judezeng/Desktop/GoodGoodStudy/scala/spark-core/src/main/resources/a.txt")

    // 转换算子操作
    val data = lines.flatMap(_.split(" ")).map((_,1)).reduceByKey(_+_)

    //  对RDD做行动操作,把计算结果拉取到驱动端
    val result = data.collect()
    result.foreach(print)

    // 停止SparkContext
    sc.stop()


  }

}

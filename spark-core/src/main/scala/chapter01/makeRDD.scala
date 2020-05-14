package chapter01

import org.apache.spark.{SparkConf, SparkContext}


object makeRDD {

  def main(args: Array[String]): Unit = {

    val makeRDD = new SparkConf().setMaster("local[1]").setAppName("makeRDD")
    val sc = new SparkContext(makeRDD)

    val rdd = sc.parallelize(Array(1,2,4,5),1)

    val result = rdd.flatMap(x => Array(x,x * x ,x * x * x))

    result.collect().foreach(println)

    sc.stop()


  }

}

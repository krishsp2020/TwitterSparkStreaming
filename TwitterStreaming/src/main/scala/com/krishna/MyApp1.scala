package com.krishna
import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.log4j._

object MyApp1 {
  def main(args: Array[String]) {

    Logger.getLogger("org").setLevel(Level.OFF)
    Logger.getLogger("com").setLevel(Level.OFF)
    Logger.getLogger("MyApp1").setLevel(Level.OFF)

    val nums = 0 to 10;

    val conf = new SparkConf().setMaster("local[*]").setAppName("nums count");
    val sc = new SparkContext(conf);

    val rdd = sc.parallelize(nums, 3);

    val rdd1 = rdd.map(_ + 10);

    rdd1.foreach(println)

  }
}
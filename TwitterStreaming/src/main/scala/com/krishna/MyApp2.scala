package com.krishna
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.sql.types.StructField
import org.apache.spark.sql.Row;

object MyApp2 {
  def main(args: Array[String]) {

    val spark = SparkSession.builder().master("local[*]").appName("nums sum").getOrCreate();

    val schema: StructType = StructType(Array(
      StructField("id", org.apache.spark.sql.types.IntegerType, false),
      StructField("name", org.apache.spark.sql.types.IntegerType, false)));


    
    
   

  }
  
}
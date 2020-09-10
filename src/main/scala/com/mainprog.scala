package com

import org.apache.spark.sql.SparkSession

object mainprog {
  
     def main(args: Array[String]): Unit = {
	  println("Execution Started..............")
      println(".")
      println(".")
     
      val spark = createsession.sparksession()
     
      val file = spark.read.format("csv").option("header", "true").load("cos://candidate-exercise.myCos/emp-data.csv")
     
      file.show(30)
   }
}

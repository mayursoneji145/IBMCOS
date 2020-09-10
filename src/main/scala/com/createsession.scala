package com

import org.apache.spark.sql.SparkSession

object createsession {
  
      def sparksession(): SparkSession = {
    
    	val spark = SparkSession.builder().appName("IBM_DE_Code").master("local").getOrCreate()
    	
    	spark.conf.set("fs.cos.impl", "com.ibm.stocator.fs.ObjectStoreFileSystem")

		spark.conf.set("fs.stocator.scheme.list", "cos")
		spark.conf.set("fs.stocator.cos.impl", "com.ibm.stocator.fs.cos.COSAPIClient")
		spark.conf.set("fs.stocator.cos.scheme", "cos")

    	spark.conf.set("fs.myCos.service.endpoint", "s3.us.cloud-object-storage.appdomain.cloud")
    	spark.conf.set("fs.myCos.service.access.key", "0aba66146f3b450cacebaa908046d17e")
		spark.conf.set("fs.myCos.service.secret.key", "27b804de3b329a680dbf148fd76da208f33e8a5aaaea4cbd")
    
    	spark
   }
}
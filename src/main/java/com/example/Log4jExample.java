package com.example;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Log4jExample {
   static Logger log1 = Logger.getLogger(Log4jExample.class.getName());
   static Log log2 = LogFactory.getLog(Log4jExample.class);
   // 결국은 log2가 다 이김.
   
   static org.apache.log4j.Logger log3 = org.apache.log4j.Logger.getLogger(Log4jExample.class);
   
   public static void main(String[] args) {
      log1.info("###################");
      log1.info("Util Log Loading...");
      log1.info("###################");
      
      log2.info("###################");
      log2.info("Commons Log Loading...");
      log2.info("###################");

      log3.info("###################");
      log3.info("Log4J Log Loading...");
      log3.info("###################");
   }
}
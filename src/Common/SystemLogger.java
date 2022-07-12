/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

/**
 *
 * @author chrish
 */
public class SystemLogger {
    
    
public static Logger initLogger(Class c){
      try{
          String path = "D:/java/Loggers/log2.txt";
      //  HTMLLayout htmlLayout = new HTMLLayout();
          PatternLayout pattenLayout = new PatternLayout("%p %d %C %L %M %m %n ");
     //   RollingFileAppender appender = new RollingFileAppender(htmlLayout,path);
           RollingFileAppender appender = new RollingFileAppender(pattenLayout,path);
        appender.setMaxFileSize("10MB");
        appender.setName("logger");
        appender.activateOptions();
        Logger.getRootLogger().addAppender(appender);
        
        return org.apache.log4j.Logger.getLogger(c);
     } catch(Exception e){
         e.printStackTrace();
     }
      return null;
    }
    

}


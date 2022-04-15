/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author Chrishmal Rodrigo
 */
public class SystemData {
   private static String systemUser = "SYS1";

    public static String getSystemUser() {
        return systemUser;
    }

    public static void setSystemUser(String systemUser) {
        SystemData.systemUser = systemUser;
    }

  
   
}

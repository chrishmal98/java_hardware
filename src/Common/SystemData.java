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
    private static String name = "Chrish";
    private static String utype = "Admin";
    private static String code ;

    public static String getCode() {
        return code;
    }

    public static void setCode(String code) {
        SystemData.code = code;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        SystemData.name = name;
    }

    public static String getUtype() {
        return utype;
    }

    public static void setUtype(String utype) {
        SystemData.utype = utype;
    }

    public static String getSystemUser() {
        return systemUser;
    }

    public static void setSystemUser(String systemUser) {
        SystemData.systemUser = systemUser;
    }

}

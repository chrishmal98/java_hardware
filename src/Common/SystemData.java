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
    private static String utype = "Super Admin";
    private static String email ;
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static String getMob() {
        return mob;
    }

    public static String getNic2() {
        return nic2;
    }
private static final String mob = "^(?:0|94|\\+94|0094)?(?:(11|21|23|24|25|26|27|31|32|33|34|35|36|37|38|41|45|47|51|52|54|55|57|63|65|66|67|81|91)(0|2|3|4|5|7|9)|7(0|1|2|4|5|6|7|8)\\d)\\d{6}$";
private static final String nic2 = "^(?:19|20)?\\d{2}(?:[0-35-8]\\d\\d(?<!(?:000|500|36[7-9]|3[7-9]\\d|86[7-9]|8[7-9]\\d)))\\d{4}(?:[vVxX])$";

    public static String getEMAIL_PATTERN() {
        return EMAIL_PATTERN;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        SystemData.email = email;
    }
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

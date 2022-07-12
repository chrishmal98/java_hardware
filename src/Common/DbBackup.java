/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author chris
 */
public class DbBackup {
 void backup(){
    try{
            String dumpPath = "C:\\Program Files (x86)\\MySQL\\MySQL Server 5.5\\bin\\mysqldump.exe";
            String host = "localhost";
            String user = "root";
            String password = "123";
            String database = "sad_db1";
            String port = "3306";
            String batchCommand = dumpPath + " -h" + host + " --port=" + port+ " -u" + user +
                    " --password=" + password + " --add-drop-database -B " + database +
                    " -r \"" + "" + "C:/Users/B.M.D.C.Bandara/Desktop/databaseBackup.sql" + "\"";
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec(batchCommand);
            int waitFor = process.waitFor();
            if(waitFor == 0){
                System.out.println("Complete.");
            } else {
                System.out.println("Backup Failed...");
            }
        } catch (Exception ex) {

        }
 }
}

package Common;

import antlr.CommonAST;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;




public class Mail{

        public static boolean sendMail(String recepient) {

        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String account = "chrishmalrodrigo@gmail.com";
        String password = "kqjjebcnjnfhgzmg";

        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(account, password);//To change body of generated methods, choose Tools | Templates.
            }

        });
        Message message = prepareMassage(session, account, recepient);
        try {
            Transport.send(message);
            System.out.println("send Sucssesfully");
            return true;
        } catch (MessagingException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error ! Check your connection and try again");
            return false;

        }

    }
    
     
         private static Message prepareMassage(Session session, String account, String resipient) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(account));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(resipient));
            message.setSubject("MELO Hardware System Verification service");
            String htmlCode = "<html><body><h1>This is Your Verification code</h1><br/><h2>" + veriCode() + "</h2></body></html>";
             message.setContent(htmlCode, "text/html");
             //message.setText(veriCode());
            return message;
        } catch (Exception ex) {
          
        }
        return null;
    }
  public static String veriCode() {
        String firstN = String.valueOf(Math.random());
        String secondN = String.valueOf(Math.random());

        String code = firstN.substring(5, 7) + secondN.substring(4, 6);
        SystemData.setCode(code);

        return code;
    }
  
  
    
}
    
    
    

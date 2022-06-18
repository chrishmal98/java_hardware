/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Verification {
      public static void veriCode(){
        String firstN = String.valueOf(Math.random());
        String secondN = String.valueOf(Math.random());
        
        String code = firstN.substring(5, 7)+secondN.substring(4, 6);
    
    }
      
      public static void main(String[] args) {
        veriCode();
    }
}

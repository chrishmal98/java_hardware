/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Chrishmal Rodrigo
 */
public class TabData {

    private static String[] cus_num = new String[7];
    private static String[] cus_name = new String[7];

    private static String[] t1_id = new String[7];
    private static String[] t1_itemName = new String[7];
    
    private static String[] t1_sprice = new String[7];
    private static String[] t1_exp = new String[7];
    private static String[] t1_onHand = new String[7];

    private static String[] txt_id = new String[7];
    private static String[] txt_discount = new String[7];
    private static String[] txt_dprice = new String[7];
    private static String[] txt_qty = new String[7];
    private static String[] txt_subtotal = new String[7];
    private static String[] txt_warantyNum = new String[7];
    private static int[] comboIndex = new int[7];

  
    

    private static Vector[] t2_count = new Vector[7];
    private static Vector[] t2_id = new Vector[7];
    private static Vector[] t2_ItemName = new Vector[7];
    private static Vector[] t2_uPrice = new Vector[7];
    private static Vector[] t2_dprice = new Vector[7];
    private static Vector[] t2_qty = new Vector[7];
    private static Vector[] t2_tot = new Vector[7];

    private static String[] subtot = new String[7];
    private static String[] Discout = new String[7];
    private static String[] nettot = new String[7];
    private static String[] payment = new String[7];
    private static String[] balance = new String[7];
    private static int count = 0;

      public static int getComboIndex(int num) {
        return comboIndex[num];
    }

    public static String getCus_num(int num) {
        return cus_num[num];
    }

    public static String getCus_name(int num) {
        return cus_name[num];
    }

    public static String getT1_id(int num) {
        return t1_id[num];
    }

    public static String getT1_itemName(int num) {
        return t1_itemName[num];
    }

    public static String getT1_sprice(int num) {
        return t1_sprice[num];
    }

    public static String getT1_exp(int num) {
        return t1_exp[num];
    }

    public static String getT1_onHand(int num) {
        return t1_onHand[num];
    }

    public static String getTxt_id(int num) {
        return txt_id[num];
    }

    public static String getTxt_discount(int num) {
        return txt_discount[num];
    }

    public static String getTxt_dprice(int num) {
        return txt_dprice[num];
    }

    public static String getTxt_qty(int num) {
        return txt_qty[num];
    }

    public static String getTxt_subtotal(int num) {
        return txt_subtotal[num];
    }

    public static String getTxt_warantyNum(int num) {
        return txt_warantyNum[num];
    }

    public static Object getT2_count(int num) {
        return t2_count[num];
    }

    public static Object getT2_id(int num) {
        return t2_id[num];
    }

    public static Object getT2_ItemName(int num) {
        return t2_ItemName[num];
    }

    public static Object getT2_uPrice(int num) {
        return t2_uPrice[num];
    }

    public static Object getT2_dprice(int num) {
        return t2_dprice[num];
    }

    public static Object getT2_qty(int num) {
        return t2_qty[num];
    }

    public static Object getT2_tot(int num) {
        return t2_tot[num];
    }

    public static String getSubtot(int num) {
        return subtot[num];
    }

    public static String getDiscout(int num) {
        return Discout[num];
    }

    public static String getNettot(int num) {
        return nettot[num];
    }

    public static String getPayment(int num) {
        return payment[num];
    }

    public static String getBalance(int num) {
        return balance[num];
    }

    public static int getCount() {
        return count;
    }
    
    public static void setComboIndex(int num) {
        comboIndex[count] = num;
    }

    public static void setCus_num(String num) {
        cus_num[count] = num;
    }

    public static void setCus_name(String cus_name) {
        TabData.cus_name[count] = cus_name;
    }

    public static void setT1_id(String t1_id) {
        TabData.t1_id[count] = t1_id;
    }

    public static void setT1_itemName(String t1_itemName) {
        TabData.t1_itemName[count] = t1_itemName;
    }

    public static void setT1_sprice(String t1_sprice) {
        TabData.t1_sprice[count] = t1_sprice;
    }

    public static void setT1_exp(String t1_exp) {
        TabData.t1_exp[count] = t1_exp;
    }

    public static void setT1_onHand(String t1_onHand) {
        TabData.t1_onHand[count] = t1_onHand;
    }

    public static void setTxt_id(String txt_id) {
        TabData.txt_id[count] = txt_id;
    }

    public static void setTxt_discount(String txt_discount) {
        TabData.txt_discount[count] = txt_discount;
    }

    public static void setTxt_dprice(String txt_dprice) {
        TabData.txt_dprice[count] = txt_dprice;
    }

    public static void setTxt_qty(String txt_qty) {
        TabData.txt_qty[count] = txt_qty;
    }

    public static void setTxt_subtotal(String txt_subtotal) {
        TabData.txt_subtotal[count] = txt_subtotal;
    }

    public static void setTxt_warantyNum(String txt_warantyNum) {
        TabData.txt_warantyNum[count] = txt_warantyNum;
    }

    public static void setT2_count(Vector v) {
        TabData.t2_count[count] = v;
    }

    public static void setT2_id(Vector v) {
        TabData.t2_id[count] = v;
    }

    public static void setT2_ItemName(Vector v) {
        TabData.t2_ItemName[count] = v;
    }

    public static void setT2_uPrice(Vector v) {
        TabData.t2_uPrice[count] = v;
    }

    public static void setT2_dprice(Vector v) {
        TabData.t2_dprice[count] = v;
    }

    public static void setT2_qty(Vector v) {
        TabData.t2_qty[count] = v;
    }

    public static void setT2_tot(Vector v) {
        TabData.t2_tot[count] = v;
    }

    public static void setSubtot(String subtot) {
        TabData.subtot[count] = subtot;
    }

    public static void setDiscout(String Discout) {
        TabData.Discout[count] = Discout;
    }

    public static void setNettot(String nettot) {
        TabData.nettot[count] = nettot;
    }

    public static void setPayment(String payment) {
        TabData.payment[count] = payment;
    }

    public static void setBalance(String balance) {
        TabData.balance[count] = balance;
    }

    public static void setCount(int count) {
        TabData.count = count;
    }

    public static void deletetab(int selectedIndex) {
        int index = selectedIndex;
        while (index < 6) {
            cus_num[index] = cus_num[index + 1];
            cus_name[index] = cus_name[index + 1];
            t1_id[index] = t1_id[index + 1];
            t1_itemName[index] = t1_itemName[index + 1];
            t1_sprice[index] = t1_sprice[index + 1];
            t1_exp[index] = t1_exp[index + 1];
            t1_onHand[index] = t1_onHand[index + 1];
            txt_id[index] = txt_id[index + 1];
            txt_discount[index] = txt_discount[index + 1];
            txt_dprice[index] = txt_dprice[index + 1];
            txt_qty[index] = txt_qty[index + 1];
            txt_subtotal[index] = txt_subtotal[index + 1];
            txt_warantyNum[index] = txt_warantyNum[index + 1];
            t2_count[index] = t2_count[index + 1];
            t2_id[index] = t2_id[index + 1];
            t2_ItemName[index] = t2_ItemName[index + 1];
            t2_uPrice[index] = t2_uPrice[index + 1];
            t2_dprice[index] = t2_dprice[index + 1];
            t2_qty[index] = t2_qty[index + 1];
            t2_tot[index] = t2_tot[index + 1];
            subtot[index] = subtot[index + 1];
            Discout[index] = Discout[index + 1];
            nettot[index] = nettot[index + 1];
            payment[index] = payment[index + 1];
            balance[index] = balance[index + 1];
index++;
        }
    }

}

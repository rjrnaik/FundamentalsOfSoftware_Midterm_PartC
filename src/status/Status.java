/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/**
 * This class takes String input from user and calls method statusDetail to
 * print the status of User-Rejected,Pending,Processing and Approved. if the
 * input is not given in String, program will accept and produce wrong results.
 * change the code to use enums which avoids String input then print the status
 * details.
 *
 * @author srinivsi
 * @author Rajrishi Naik
 */
public class Status {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
//    Scanner in =new Scanner(System.in);
//    System.out.println("Enter the user status code (zero,one,two,three) in string");
//    String code = in.next();
//    StausUser t= new StausUser();
//    t.statusDetail(code); 
//        StausUser su = new StausUser(StausUser.Code, StausUser.CodeStatus.);
        StausUser[] statusArr = new StausUser[5];
       for(int i=0; i<5; i++){
           statusArr[i] = new StausUser(StausUser.Code.values()[i], StausUser.CodeStatus.values()[i]);
       }
        for(int j=0; j<5; j++){
            System.out.println("For Code: " + statusArr[j].getCode() +  " - Status is: " + statusArr[j].getCodeStatus());
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package episode1_variant_a;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author m1k1e
 */
public class ProgramMenu {
    public static void menuPrint(){
        System.out.println("[0] Exit program");
        System.out.println("[1] Hello, User!");
        System.out.println("[2] Args reverse.");
        System.out.println("[3] Print random numbers");
        System.out.println("[4] Equals two passwords");
        System.out.println("[5] Args sum and multiply");
        
    }
    private String[] args;
    private Date starttask;
    private String authorName;
    
    ProgramMenu(String [] args, Date start){
        this.args = args;
        this.starttask = start;
        authorName = "Mikhail Fedorenko";
    }
    
    public void menuChoise(int menuItem){
        switch(menuItem){
            case 1:
                HelloUser user = new HelloUser();
                user.setUserName();
                user.getUserName();
                break;
            case 2:
                ReverseArgs revers = new ReverseArgs();
                revers.reverseArguments(args);
                break;
            case 3:
                RandomNumbers randnum = new RandomNumbers();
                randnum.setCountNumbers();
                System.out.println("Println: ");
                randnum.printlnNumbers();
                System.out.println("Print: ");
                randnum.printNumbers();
                System.out.println(" ");
                break;
            case 4:
                PasswordStringEquals passequal = new PasswordStringEquals();
                passequal.setPassword();
                passequal.equalsPasswords();
                break;
            case 5:
                ArgsSumMultiply argssummult = new ArgsSumMultiply();
                argssummult.getArgsSumAndMultiply(args);
                System.out.println(" ");
                break;
            case 0:
                Date endtask = new Date();
                System.out.println(authorName);
                System.out.println("Task was startig at : " + starttask);
                System.out.println("Task is ending at: " + endtask);
                System.out.println(" ");
                System.exit(0);
                break;
        }
    }
    
}

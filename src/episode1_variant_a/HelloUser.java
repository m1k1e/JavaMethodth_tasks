/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package episode1_variant_a;

import java.util.Scanner;

/**
 *
 * @author m1k1e
 */
public class HelloUser {
    private String UserName;
    
    HelloUser(){
        UserName = "NoName";
    }
    
    public String setUserName(){
        System.out.println("Enter your name: ");
        try{
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            
            if(name.length() > 1){
                UserName = name;
            }else System.out.println("Your name very small!");
                }catch(Exception err){
                    err.printStackTrace();
                }
        
        return UserName;
    }
    
    public void getUserName(){
        System.out.println("Hello, " + UserName);
    }
    
}

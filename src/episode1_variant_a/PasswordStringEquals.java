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
public class PasswordStringEquals {
    private final String PASSWORD = "QWERTY654321";
    private String passwordIn;
    
    PasswordStringEquals(){
        passwordIn = "qwerty654321";
    }
    
    public String setPassword(){
        System.out.println("Enter your password: ");
        try{
            Scanner input = new Scanner(System.in);
            String temp_password = input.nextLine();
            
            if(temp_password.length() > 0){
                passwordIn = temp_password;
            }else System.out.println("Your password very small!");
                }catch(Exception err){
                    err.printStackTrace();
                }
        
        return passwordIn;
    }
    
    public void equalsPasswords(){
        if(PASSWORD.equalsIgnoreCase(passwordIn)){
            System.out.println("Passwords are equals!");
        }else System.out.println("Passwords don`t equals!");
            
    }
    
}

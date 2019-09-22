/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package episode1_variant_b;

import java.util.Scanner;

/**
 *
 * @author m1k1e
 */
public class MainApp {
    public static void main(String[] args) {
        ProgrammMenu menu = new ProgrammMenu();
        System.out.println("Enter length of array integer numbers [10 - 100] > ");
        try{
            Scanner input = new Scanner(System.in);
            if(input.hasNext() && input.hasNextInt()){
                menu.arrayInitialise(input.nextInt());
            }else{
                System.out.println("Incorrect input!");
                input.close();
                System.exit(0);
            }
        }catch(Exception error){
            error.printStackTrace();
        }
        
        
        menu.menuPrint();
        System.out.println("Choose the menu item > ");
        try{
            Scanner input = new Scanner(System.in);
            while(input.hasNext()){
                if(!input.hasNextInt()){
                    System.out.println("Incorrect input!");
                    input.close();
                    break;
                }else{
                    int item = Integer.parseInt(input.nextLine());
                    menu.menuChoise(item);
                    System.out.println(" ");
                    System.out.println("Next item ([0] for exit) >");
                }
            }
        }catch(Exception error){
            error.printStackTrace();
        }
    }
    
}

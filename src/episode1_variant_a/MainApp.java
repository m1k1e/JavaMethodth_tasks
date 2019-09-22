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
public class MainApp {
    public static void main(String[] args) {
        Date start = new Date();
        ProgramMenu menu = new ProgramMenu(args, start);
        ProgramMenu.menuPrint();
        System.out.println("Choose the item > ");
        
        try{
            Scanner input = new Scanner(System.in);
            while(input.hasNext()){
                if(!input.hasNextInt()){
                    System.out.println("Incorret input!");
                    input.close();
                    break;
                }else{
                    int item = Integer.parseInt(input.nextLine());
                    menu.menuChoise(item);
                    System.out.println("Next item ([0] for exit) >");
                }
            }
        }catch(Exception err){
            err.printStackTrace();
        }
    }
}

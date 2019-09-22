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
public class RandomNumbers {
    private int randomInt;
    private int countnumbers;
    
    RandomNumbers(){
        randomInt = 2;
        countnumbers = 2;
    }
    
    public int setCountNumbers(){
        System.out.println("Enter count of random numbers: ");
        try{
            Scanner input = new Scanner(System.in);
            int counters = Integer.parseInt(input.next());
            if(counters > 0){
                countnumbers = counters;
            }else System.out.println("You must type positive integer number!");
                }catch(Exception err){
                    err.printStackTrace();
                }
        
        return countnumbers;
    }

    
    public void printlnNumbers(){
        int count = 1;
        if(countnumbers < 2){
            System.out.println("You type very small number!");
        }else{
            while(count <= countnumbers){
                randomInt = (int) (Math.random()*100);
                System.out.println(count + " - " + randomInt);
                count++;
            }
        }
    }
    
    public void printNumbers(){
        int count = 1;
        if(countnumbers < 2){
            System.out.println("You type very small number!");
        }else{
            while(count <= countnumbers){
                randomInt = (int) (Math.random()*100);
                System.out.print(count + " - " + randomInt + " ");
                count++;
            }
        }
    }
}

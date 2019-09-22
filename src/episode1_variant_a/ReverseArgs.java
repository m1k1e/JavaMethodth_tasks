/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package episode1_variant_a;

/**
 *
 * @author m1k1e
 */
public class ReverseArgs {
    public void reverseArguments(String [] args){
        if(args.length < 2){
            System.out.println("No arguments!");
        }else {
            for(int item = args.length - 1; item >= 0; item--){
                System.out.print(args[item] + " ");
            }
        }
        
        System.out.println("");
    }
    
}

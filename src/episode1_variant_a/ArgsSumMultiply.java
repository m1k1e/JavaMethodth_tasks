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
public class ArgsSumMultiply {
    public void getArgsSumAndMultiply(String[] args){
        int sumargs = 0;
        int multiplyargs = 1;
        try{
            if(args.length <=1){
                System.out.println("Enter more numbers, please!");
            }else{
                for(String item : args){
                    int nextItem = Integer.parseInt(item);
                    sumargs += nextItem;
                    multiplyargs *= nextItem;
                }
                System.out.println("Args summa = " + sumargs);
                System.out.println("Args multiply = " + multiplyargs);
            }
        }catch(Exception err){
            err.printStackTrace();
        }
    }
}

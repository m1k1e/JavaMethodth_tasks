/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package episode1_variant_b;

/**
 *
 * @author m1k1e
 */
public class RandomizeArray {
    private int arrayLength;
    private int [] arrayInt;

    public RandomizeArray() {
        this.arrayLength = 10;
        this.arrayInt = new int[arrayLength];
    }

    public int getArrayLength() {
        return arrayLength;
    }

    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }
    
    public void setArray(){
        arrayInt = new int[arrayLength];
        for(int count = 0; count <= arrayInt.length - 1; count++){
            arrayInt[count] = 10 + (int) (Math.random()*1000);
        }
        
    }
    
    public int [] getArray(){
        return arrayInt;
    }
    
    public void showArray(){
        for(int item : arrayInt){
            System.out.print(item + " ");
        }
    }
    
}

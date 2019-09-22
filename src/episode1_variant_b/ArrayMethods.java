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
public class ArrayMethods {
    
    public void getEvenOddNumbers(int[] array){
        int countEven = 0;
        int countOdd = 0;
        int [] arrayEven;
        int [] arrayOdd;
        
        for(int item : array){
            if(item%2==0){
                countEven++;
            }else countOdd++;
        }
        
        arrayEven = new int[countEven];
        arrayOdd = new int[countOdd];
        int arrayItemEven = 0;
        int arrayItemOdd = 0;
        
        for(int item : array){
            if(item%2==0){
               
               arrayEven[arrayItemEven] = item;
               arrayItemEven++;
            }else{
                arrayOdd[arrayItemOdd] = item;
                arrayItemOdd++;
            }
        }
        
        System.out.print("Even numbers: ");
        for(int item : arrayEven){
            System.out.print(item + " ");
        }
        
        System.out.println(" ");
        System.out.print("Odd numbers: ");
        for(int item : arrayOdd){
            System.out.print(item + " ");
        }
    }
    
    public void getMinMaxArrayElement(int[] array){
        int minElement = array[0];
        int maxElement = array[0];
        
        for(int item : array){
            if(minElement > item){
                minElement = item;
            }
        }
        
        for(int item : array){
            if(maxElement < item){
                maxElement = item;
            }
        }
        
        System.out.println("Minimal array element = " + minElement);
        System.out.println(" ");
        System.out.println("Maximum array element = " + maxElement);
    }
    
    public void getTreeNineDevide(int[] array){
        int countArrayVolume = 0;
        
        for(int item : array){
            if(item%3==0 || item%9==0){
                countArrayVolume++;
            }
        }
        
        int[] newArray = new int[countArrayVolume];
        countArrayVolume = 0;
        for(int item : array){
            if(item%3==0 || item%9==0){
                newArray[countArrayVolume] = item;
                countArrayVolume++;
            }
        }
        
        System.out.println("Numbers which devided to 3 or 9 > ");
        for(int item : newArray){
            System.out.print(item + " ");        
        }
    }
    
    public void getFiveSevenDevide(int[] array){
        int countArrayVolume = 0;
        
        for(int item : array){
            if(item%5==0 && item%7==0){
                countArrayVolume++;
            }
        }
        
        int[] newArray = new int[countArrayVolume];
        countArrayVolume = 0;
        for(int item : array){
            if(item%5==0 && item%7==0){
                newArray[countArrayVolume] = item;
                countArrayVolume++;
            }
        }
        
        if(newArray.length==0){
            System.out.println("No anyone element in this array!");
        }else{
            
            System.out.println("Numbers which devided to 5 and 7 > ");
            for(int item : newArray){
                System.out.print(item + " ");        
            }
        }
        
        System.out.println(" ");
    }
    
    public void getSortBubbelArray(int[] array){
        int temp;
        for(int itemFirst = 1; itemFirst <= array.length -1 ; itemFirst++){
            for(int itemSecond = 0; itemSecond < array.length - 1; itemSecond++){
                if(array[itemFirst] < array[itemSecond]){
                    temp = array[itemSecond];
                    array[itemSecond] = array[itemFirst];
                    array[itemFirst] = temp;
                            
                }
            }
        }
        
        System.out.print("Sorting by bubbel method array: ");
        for(int item: array){
            System.out.print(item + " ");
        }
        
        System.out.println(" ");
        
    }
}

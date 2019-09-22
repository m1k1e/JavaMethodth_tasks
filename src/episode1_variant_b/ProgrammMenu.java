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
public class ProgrammMenu {
    private int menuItem;
    private int[] arrayInt;
    
    ProgrammMenu(){
        this.menuItem = 0;
    }
    
    public void menuPrint(){
        System.out.println("[0] Exit program.");
        System.out.println("[1] Even and odd numbers.");
        System.out.println("[2] Max and min numbers.");
        System.out.println("[3] Numbers are divided to 3 or 9.");
        System.out.println("[4] Numbers are divided to 5 and 7.");
        System.out.println("[5] Array sort bubble method.");
        
    }
    
    public int[] arrayInitialise(int arrayLength){
        RandomizeArray array = new RandomizeArray();
        array.setArrayLength(arrayLength);
        array.setArray();
        array.showArray();
        arrayInt = array.getArray();
        System.out.println(" ");
        
        return arrayInt;
    }
    
    public void menuChoise(int menuItem){
        ArrayMethods method = new ArrayMethods();
        //System.out.println("Choose menu item [0-5]");
        
        switch(menuItem){
            case 1:
                method.getEvenOddNumbers(arrayInt);
                break;
            case 2:
                method.getMinMaxArrayElement(arrayInt);
                break;
            case 3:
                method.getTreeNineDevide(arrayInt);
                break;
            case 4:
                method.getFiveSevenDevide(arrayInt);
                break;
            case 5:
                method.getSortBubbelArray(arrayInt);
                break;
            case 0:
                System.exit(0);
                break;
                
        }
    }
    
}

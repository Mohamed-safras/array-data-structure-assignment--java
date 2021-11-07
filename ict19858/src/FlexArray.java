 

 import java.util.*;

 class FlexArray858 {
   static int [] Array =new int[100];
  static int numberOfElements= 10;
    public static void main(String[] args)  {
        
        
        Array[0]=1;
        Array[1]=2;
        Array[2]=3;
        Array[3]=4;
        Array[4]=5;
        Array[5]=6;
        Array[6]=7;
        Array[7]=8;
        Array[8]=9;
        Array[9]=10;
        
        
        
         
        Array = Insert(numberOfElements,Array,14); 

        System.out.println("after insert new element"+" - "+Arrays.toString(Array));  
        
        System.out.println("after delete an existing element"+" - "+Arrays.toString(deleteByIndex(4)));  
       
       
    }


    // // insert new element into array
    public static int [] Insert (int numberOfElements, int [] array,int value) {

        array[numberOfElements] = value;
        numberOfElements++;    
                 
        int [] newArray = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++)
            newArray[i] = array[i];
        
        return newArray;
    }

    
    // deletByIndex
    public static int [] deleteByIndex (int index){
        int [] newArray = new int[numberOfElements];
        for (int i = index; i < numberOfElements; i++) 
            Array[i] = Array[i+1];

        for (int i = 0; i < newArray.length; i++)
            newArray[i] = Array[i];
          
        return newArray;
    }
}

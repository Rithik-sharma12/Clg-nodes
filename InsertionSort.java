package search;

public class InsertionSort {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {12,11,13,5,6};    

         
        for(int i:arr1){    
           
        }    
        System.out.println();    
            
        insertionSort(arr1);   
           
       
        for(int i:arr1){    
            System.out.println(i+" ");    
        }    
    }    
}

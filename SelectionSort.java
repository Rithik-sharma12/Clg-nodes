package search;

public class SelectionSort{  

    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j; 
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  

       
    public static void main(String a[]){  
        int[] arr1 = {64,25,12,22,11};  
         
        for(int i:arr1){  
           
        }  
        System.out.println();  
          
        selectionSort(arr1);  
         
        System.out.println("Sorted array");  
        for(int i:arr1){  
            System.out.println(i+" ");  

        }  
    }  
}

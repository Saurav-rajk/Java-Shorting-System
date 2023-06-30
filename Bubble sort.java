import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr1={7,8,3,1,2};
        // Bubble sort.
        for(int i=0;i<arr1.length-1;i++){  // This loop will run till n-1.
            for(int j=0;j<arr1.length-i-1;j++){
                if(arr1[j]>arr1[j+1]){
                     // Swap of number
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;

                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}


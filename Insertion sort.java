// Insertion sort.

public class Main{
    public static void main(String[] args){
        int[]arr1={4,2,6,1};
        // Insertion sort
        for(int i=0;i<arr1.length;i++){
            int current=arr1[i];  // sorted part
            int j=i-1;  //Unsorted part
            while(j>=0 && current<arr1[j]){
                arr1[j+1] = arr1[j];
                j--;
            }
            arr1[j+1] =current;
        }
        for(int i=0;i<arr1.length;i++){  // for print the array.
            System.out.print(arr1[i]+" ");
        }
    }
}

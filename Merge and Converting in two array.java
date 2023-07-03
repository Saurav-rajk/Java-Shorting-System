//Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order

import java.util.*;
public class Main{
    public static void main(String[] args){
        int[]arr1={5,6,8,9,16};
        int[]arr2={2,3,7};
        int p=arr1.length;
        int q=arr2.length;

        for(int i=0;i<p;i++){
            if(arr1[i]>arr2[0]){
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;

                int first_arr=arr2[0];
                int k;
                for(k=1;k<q&&arr2[k]<first_arr;k++){
                    arr2[k-1]=arr2[k];
                }
                arr2[k-1]=first_arr;
            }
        }
        System.out.println("arr1: "+Arrays.toString(arr1));
        System.out.println("arr2: "+Arrays.toString(arr2));




    }

}
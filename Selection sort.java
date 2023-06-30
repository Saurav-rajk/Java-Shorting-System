//

//public class Main{
//    public static void main(String[] args){
//        int[] arr1={4,6,2,8};
//        for(int i=0;i<arr1.length-1;i++){
//            int smallest=i;
//            for(int j=i+1;j<arr1.length;j++){
//                if(arr1[smallest]>arr1[j]){
//                    smallest=j;
//                }
//            }
//            int temp=arr1[smallest];
//            arr1[smallest]=arr1[i];
//            arr1[i]=temp;
//
//        }
//        for(int i=0;i<arr1.length;i++){
//            System.out.print(arr1[i]+" ");
//        }
//    }
//}

public class Main{
    public static void main(String[] args){
        int[]arr1={4,7,2,1};
        for(int i=0;i<arr1.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr1.length;j++){

                if(arr1[smallest]>arr1[j]){ // Condition for checking the number.
                    smallest=j;
                }
            }
            //swapping the element.
            int temp=arr1[smallest];
            arr1[smallest]=arr1[i];
            arr1[i]=temp;
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}

/**
 * InsertionSort
 */
public class InsertionSort {

      public static void main(String[] args) {
        int[] arr = {64 ,25 ,12, 22 ,11};


        // Selection sort 
        for(int i =0; i<=arr.length-2;i++){ // -2 because we wil not sort the last element 
           int min_idx=i;

            for(int j=i+1; j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx]= arr[i];
            arr[i]=temp;
        }

           for(int j=0; j<arr.length;j++){
               System.out.println(arr[j]);
           }
        
    }
}
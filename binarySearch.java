package Practice_Session;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

    //Mehod 2- Recursion
    public static void binary(int f, int l, int val, int[] arr){
        int mid  = (f+l)/2;
        if(arr[mid] != val){
            if(val < arr[mid])
                binary(f,mid-1,val,arr);
            else
                binary(mid+1,l,val,arr);
        }
        else
            System.out.println("Value is at position "+(mid+1));
    }

    public static void main(String[] args){
        System.out.println("Enter size of the array" );
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter values of array : ");
        for(int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter value to search (in the sorted array)");
        int val = s.nextInt();

        int f = 0;
        int l = size;

        //Method 1
//        int mid = size/2;
//        while (arr[mid] != val){
//           if(val < mid){
//               l = mid-1;
//           }
//           else{
//               f = mid+1;
//           }
//            mid = (f+l)/2;
//        }
//        System.out.println("Value "+val+" is at position "+(mid+1));

        binary(f,l,val,arr);
    }
}

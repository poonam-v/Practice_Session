package Practice_Session;

public class SegregateElements {

    //Dutch National Flag Problem
    public static void segregate(int[] arr){
        int low = 0, mid =0,hi = arr.length-1;
        while(mid <= hi){
             if(arr[mid] == 0){
                 int temp = arr[mid];
                 arr[mid] = arr[low];
                 arr[low] = temp;
                 mid ++;
                 low ++;
             }
             else if(arr[mid] == 1){
                 mid ++;
             }
             else if(arr[mid] == 2){
                 int temp = arr[mid];
                 arr[mid] = arr[hi];
                 arr[hi] = temp;
                 hi --;
             }
        }
    }
    public static void main(String[] args){
        int[] arr = {0,1,2,1,2,0,0};
        segregate(arr);
        for(int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }

    }
}

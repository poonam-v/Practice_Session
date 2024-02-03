package Practice_Session;

public class removeDuplicates {
    public static int removeDup(int[] arr, int l){
        int j = 0;
        for(int i = 0; i < l-1; i++){
            if(arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[l-1];
        return j;
    }

    public static void main(String[] args){
        int [] arr = {1,2,2,2,3,4,4,5,5,6,7,7};
        int l = arr.length;
        int j = removeDup(arr,l);

        for(int i = 0; i < j; i++){
            System.out.println(arr[i]);
        }
    }
}

package Practice_Session;
import java.util.Arrays;
public class prime {
    public static void main(String[] args) {
        //Method 1
        /*
        for(int i = 2; i < 1000; i = i + 1){
            int count = 0;
            for(int j = 1 ; j <= i/2 ; j++ ){
                if( i % j == 0){
                    count ++;
                }
            }
            if(count == 1){
                System.out.println(i);
            }
        }*/

        //Method 2
        int n = 1000;
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (arr[i]) {
                int j = i * i;
                while (j <= n) {
                    arr[j] = false;
                    j = j + i;
                }
            }
        }
        for(int k = 2; k <= n; k++ ){
            if(arr[k]){
                System.out.println(k);
            }
        }
    }
}



package Practice_Session;

public class fibonacci {

    //Method 2 - Recursion
    public static void fibo(int a, int b, int count){
        if(count > 0) {
            int sum = a + b;
            System.out.println(sum);
            fibo(b, sum, --count);
        }
    }
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int count = 20;
        fibo(a,b,count);

        //Method 1 - Simple way
//        while(count > 0){
//            int sum = a + b;
//            System.out.println(sum);
//            a = b;
//            b = sum;
//            count --;
//        }
    }
}

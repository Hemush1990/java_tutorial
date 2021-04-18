package exceptions;

public class FibonacciSum {

    int a1 = 0;
    int a2 = 1;

    public static void main(String[] args) {
        FibonacciSum fb = new FibonacciSum();
        fb.fib(6);
    }


    public  int fib(int n){
        int sum = 0;
        if(n <= 1) return n;

        while( n-- > 1){
           sum = a1+a2; //1
            a1 = a2;
            a2= sum;
            System.out.println(sum);

        }

        return sum;
    }
}

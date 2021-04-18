package Exercices;

public class Exercise56 {
    public static void main(String[] args) {
        System.out.println(divisibleNumber(5, 20, 3));
    }

    public static int divisibleNumber(int x, int y, int z){

        int sum =0;
        for (int i = x; i <y ; i++) {
            if (i%z==0){
                sum++;
            }

        }return sum;
    }
}

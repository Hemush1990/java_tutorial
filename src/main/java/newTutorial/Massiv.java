package newTutorial;

import java.util.Arrays;

public class Massiv {
    public static void main(String[] args) {
        int [] a = new int[10];

        for (int i = 0; i <a.length ; i++) {
            System.out.println(i);

        }
        int [] smallPrimes = {1, 3, 5, 7, 11};
        String [] authors = {"Pushkin", "Lermontov", "Bunin"};

        for(String element: authors){
            System.out.println(element);
        }

        int [] copySmallPrimes = Arrays.copyOf(smallPrimes, 7); //kopirovanie massiva v drugoy

        System.out.println(copySmallPrimes[1]);
        Arrays.sort(copySmallPrimes);  //sortirovka


        //mnogomernie massivi



        final double STARTRATE = 10;
        final int NRATE = 23;
        final int ENDRATE = 27;

        double [] interestrate = new double[NRATE];
        for (int i = 0; i < interestrate.length ; i++) {
            interestrate[i] = STARTRATE + i/100;
        }

        double [] [] rates = new double[NRATE][ENDRATE];


        final int NMAX = 5;
        int [][] odds = new int[NMAX+1][];
        for (int j = 0; j < NMAX; j++) {
            odds[j] = new int[j+1];   //matrix with triangle
        }

        for (int n = 0; n < odds.length ; n++) {
            for (int k = 0; k < odds[n].length; k++) {
                int lotteryOdds = 1;
                for (int i = 0; i < k; i++) {
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                    odds[n][k] = lotteryOdds;
                }
            }
                for (int []row: odds){
                 for(int odd: row) {
                     System.out.printf("%4$d", odd);
                     System.out.println();
                 }

            }
        }

    }

}

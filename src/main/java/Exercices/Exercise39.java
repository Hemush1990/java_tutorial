package Exercices;

public class Exercise39 {
    public static void main(String[] args) {
        int amount =0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                for (int k = 0; k <=4 ; k++) {
                 if(i!=j && i!=k && j!=k){
                     amount++;
                     System.out.println(i +" " + k +" "+ j);
                 }
                        

                    
                }
                
            }
            
        }
        System.out.println("The amount of threedigit numbers is " + amount);
    }
}

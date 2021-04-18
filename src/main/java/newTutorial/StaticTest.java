package newTutorial;

public class StaticTest {
    public static void main(String[] args) {
        Employe [] staff = new Employe[4];
        staff[1]= new Employe("John", 3400, 21);
        staff[0] = new Employe("Zara", 4500, 4);
        staff[2] = new Employe("Jake", 5600, 89);
        staff[3] = new Employe("Karen", 4300, 88);

        for(Employe e: staff){
            System.out.println(e.getName() + e.getSalary() + e.getId());
        }

    }
}
 class Employe{
    private static int  nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employe(String name, double salary, int id) {
         this.name = name;
         this.salary = salary;
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public double getSalary() {
         return salary;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     //modul test
     public static void main(String[] args) {
         Employe e = new Employe("Peter", 2450, 23);
         System.out.println(e.getName() + e.salary + e.getId());
     }

 }
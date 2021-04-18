package newTutorial;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Pavel Pavlovich", 5500, 1234,25);

        boss.setBonus(45);

        Employe [] staff = new Employe[3];
        staff[0] = new Employe("Garnik", 2500, 1111 );
        staff[1] = new Employe("Sevak", 2300, 1001);
        staff[2] = boss;

        for(Employe w: staff){
            System.out.println(w.getName() + w.getId() + w.getSalary());
        }
    }
}

package newTutorial;

public class ParamTest {
    public static void main(String[] args) {

        double percent = 10;

        System.out.println("Testing swap");
        Agent a = new Agent("Harry", 5000);
        Agent b = new Agent("Jake", 2500);

        a.raiseSalary(200);


    }
}

     class Agent {

        private String name;

        private int salary;


        public Agent(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public void raiseSalary(double percent) {
            double raise = salary * percent / 100;
            salary += raise;
        }



    }




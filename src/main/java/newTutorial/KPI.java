package newTutorial;

public class KPI {
    public static void main(String[] args) {
        Agents [] support = new Agents[5];
        support[0] = new Agents(001, "Satarov Sergey", 4.09);
        support[1]= new Agents(002, "Patrick", 4.045);
        support[2] = new Agents(003, "Anna", 5.0);
        support[3] = new Agents(004, "Peter", 4.7);
        support[4] = new Agents(005, "Steve", 4.89);

        for (Agents e: support){
            e.setKPI(6);
            System.out.println("Agent's name is " + e.getName() + ". " +
                    "Agent's id is " + e.getId()+ ". " +
                    "Agent's rate for 6 days is " + e.getRate() + ".");
        }
        System.out.println();
        for (Agents e: support){
            e.setKPI(10);
            System.out.println("Agent's name is " + e.getName() + ". " +
                    "Agent's id is " + e.getId()+ ". " +
                    "Agent's rate for 10 days is " + e.getRate() + ".");
        }

    }
}

class Agents{
    private int id;
    private String name;
    private double rate;

    public Agents(int id, String name, double rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public double setKPI(int days){
        double agentKPI = 31/days*rate;
        rate+=agentKPI;
        return rate;
    }

}

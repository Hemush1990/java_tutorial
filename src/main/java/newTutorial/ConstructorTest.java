package newTutorial;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        Emples [] staff = new Emples[2];
        staff[0] = new Emples("Harry", 4000);
        staff[1] = new Emples("James", 2000);

        for(Emples e: staff){
            System.out.println(e.getName() + e.getSalary());
            System.out.println(e.getId());
        }


    }
}


class Emples{

    private static int nextId;


    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    private int id;
    private String name;
    private double salary;

    static{
        Random generator = new Random();
        nextId = generator.nextInt(500);
    }

    {id = nextId;
    nextId++;
    };
    public Emples( String name, double salary) {

        this.name = name;
        this.salary = salary;
    }
}
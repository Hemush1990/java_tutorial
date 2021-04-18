package newTutorial;

public abstract class AbstractClass {


    public abstract String getDescription();


    private String name;


    public AbstractClass(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

package newTutorial;

public class Constants {
    public static final double CRR_INCH = 2.54;
    public static void main(String[] args) {
        double paperWidth = 3.4;
        double paperHeight = 4.5;


        double size = (paperHeight*CRR_INCH) + (paperWidth*CRR_INCH);
        double qwadrat = Math.sqrt(size);
        double paper = Math.pow(paperHeight, 2); //vozvedenie v stepen
        System.out.println("The correct size of this paper " + size);
        System.out.println(qwadrat);

        String name = "Hermine";
        String nameEmi = name.substring(0,4) + 'i';
        System.out.println(nameEmi);
        name.equals("Hermine");
        name.equalsIgnoreCase("hermine");


    }
}

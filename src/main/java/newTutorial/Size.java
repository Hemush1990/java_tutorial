package newTutorial;

public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("LG"), EXTRALARGE("EXL");



    private String abbreviation;
    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation() {
        return abbreviation;
    }

}

//Size s = Size.SMALL;
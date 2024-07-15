public abstract class Hogwarts {
    protected String name;
    protected int powerWitchcraft;
    protected int distanceTransgression;

    public Hogwarts(String name, int powerWitchcraft, int distanceTransgression) {
        this.name = name;
        this.powerWitchcraft = powerWitchcraft;
        this.distanceTransgression = distanceTransgression;
    }

    public String getName() {
        return name;
    }

    public int getPowerWitchcraft() {
        return powerWitchcraft;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public static void compareHogwartsStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.getPower() > student2.getPower()) {
            System.out.println(student1.toString() + " обладает большей мощностью магии, чем " + student2.toString());
        } else if (student1.getPower() < student2.getPower()) {
            System.out.println(student2.toString() + " обладает большей мощностью магии, чем " + student1.toString());
        } else {
            System.out.println(student1.toString() + " и " + student2.toString() + " равны");
        }
    }

    private int getPower(){
        return powerWitchcraft + distanceTransgression;
    }

    @Override
    public String toString() {
        return name;
    }
}

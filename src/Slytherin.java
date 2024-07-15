import javax.swing.*;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thisForPower;

    public Slytherin(String name, int powerWitchcraft, int distanceTransgression,
                     int cunning, int determination, int ambition, int resourcefulness, int thisForPower) {
        super(name, powerWitchcraft, distanceTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thisForPower = thisForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThisForPower() {
        return thisForPower;
    }

    public static void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        if (student1.getPower() > student2.getPower()) {
            System.out.println(student1.toString() + " лучший Слизеринец , чем " + student2.toString());
        } else if (student1.getPower() < student2.getPower()) {
            System.out.println(student2.toString() + " лучший Слизеринец, чем " + student1.toString());
        } else {
            System.out.println(student1.toString() + " и " + student2.toString() + " равны");
        }
    }

    private int getPower(){
        return cunning + determination + ambition + resourcefulness + thisForPower;
    }


    @Override
    public String toString() {
        return name;
    }
}

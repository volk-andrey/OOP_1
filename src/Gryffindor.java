public class Gryffindor extends Hogwarts {
    private int nobility; // Благородство
    private int honor; // Честь
    private int courage; // Храбрость

    public Gryffindor(String name, int powerWitchcraft, int distanceTransgression, int nobility, int honor, int courage){
    super(name, powerWitchcraft, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public static void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
        if (student1.getPower() > student2.getPower()) {
            System.out.println(student1.toString() + " лучший Гриффиндорец , чем " + student2.toString());
        } else if (student1.getPower() < student2.getPower()) {
            System.out.println(student2.toString() + " лучший Гриффиндорец, чем " + student1.toString());
        } else {
            System.out.println(student1.toString() + " и " + student2.toString() + " равны");
        }
    }

    private int getPower(){
        return nobility + honor + courage;
    }


    @Override
    public String toString() {
        return name;
    }
}

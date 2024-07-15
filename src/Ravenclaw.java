public class Ravenclaw extends Hogwarts {
    private int mind; // Ум
    private int wisdom; // Мудрость
    private int wit; // Остроумность
    private int creativity; // Креативность


    public Ravenclaw(String name, int powerWitchcraft, int distanceTransgression, int mind, int wisdom, int wit, int creativity) {
        super(name, powerWitchcraft, distanceTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public static void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
        if (student1.getPower() > student2.getPower()) {
            System.out.println(student1.toString() + " лучший Когтевранец , чем " + student2.toString());
        } else if (student1.getPower() < student2.getPower()) {
            System.out.println(student2.toString() + " лучший Когтевранец, чем " + student1.toString());
        } else {
            System.out.println(student1.toString() + " и " + student2.toString() + " равны");
        }
    }

    private int getPower(){
        return mind + wisdom + wit + creativity;
    }

    @Override
    public String toString() {
        return name;
    }
}

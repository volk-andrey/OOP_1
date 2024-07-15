// Класс для студентов Пуффендуя
public class Hufflepuff extends Hogwarts {
    private int diligence; // Трудолюбие
    private int loyalty; // Верность
    private int honesty; // Честность

    public Hufflepuff(String name, int powerWitchcraft, int distanceTransgression, int diligence, int loyalty, int honesty) {
        super(name, powerWitchcraft, distanceTransgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public static void compareHufflePuffStudents(Hufflepuff student1, Hufflepuff student2) {
        if (student1.getPower() > student2.getPower()) {
            System.out.println(student1.toString() + " лучший Пуффендуец, чем " + student2.toString());
        } else if (student1.getPower() < student2.getPower()) {
            System.out.println(student2.toString() + " лучший Пуффендуец, чем " + student1.toString());
        } else {
            System.out.println(student1.toString() + " и " + student2.toString() + " равны");
        }
    }

    private int getPower(){
        return diligence + loyalty + honesty;
    }

    @Override
    public String toString() {
        return name;
    }
}


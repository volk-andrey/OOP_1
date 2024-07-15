public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 30,40,10,20,30);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger",25,35,45,89,11);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley",30,40,10,20,30);

        Slytherin dracoMalfoy  = new Slytherin("Draco Malfoy", 30,40,10,
                20,30,25,15);
        Slytherin grahamMontague = new Slytherin("Graham Montague",25,35,45,
                89,11,58,78);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle",30,40,10,
                20,30,25,15);


        Hufflepuff zachariahSmith = new Hufflepuff("Zachariah Smith", 30,40,10,20,30);
        Hufflepuff sedricDiggory = new Hufflepuff("Sedric Diggory",25,35,45,89,11);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley",30,40,10,20,30);


        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 30,40,10,20,30,15);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil",25,35,45,89,11,15);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby",30,40,10,20,30,25);

        Hufflepuff.compareHufflePuffStudents(zachariahSmith, sedricDiggory); //Сравнение двух студентов факультета Пуффендуй
        Gryffindor.compareGryffindorStudents( harryPotter, hermioneGranger); //Сравнение двух студентов факультета Гриффиндор
        Slytherin.compareSlytherinStudents(dracoMalfoy, grahamMontague); //Сравнение двух студентов факультета Слизерин
        Ravenclaw.compareRavenclawStudents(zhouChang, padmaPatil); //Сравнение двух студентов факультета Когтевран


        Hogwarts.compareHogwartsStudents(zhouChang, grahamMontague); // Сравнение двух любых студентов
    }
}
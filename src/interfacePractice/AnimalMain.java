package interfacePractice;

public class AnimalMain {
    public static void main(String[] args) {
        Animals[] animals = new Animals[4];
        animals[0] = new Rat();
        animals[1] = new Rabbits();
        animals[2] = new Chicken();
        animals[3] = new Animals();

        for (var animal : animals) {
            animal.move();
            System.out.println(animal);
        }


        Animals rabbit = new Rabbits();
        rabbit.move();

        Chicken rabbit2 = new Chicken();
//        rabbit2.run();
//        Animals rabbit3 = rabbit;
//        rabbit3.move();
//        Rat rat = new Rat();
    }
}

package chapter10slide;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird() {
            @Override
            public void speak() {

            }

            @Override
            public void moves() {

            }

            @Override
            public void eat() {
                System.out.println("i eat well");
            }
        };
//        bird.eat();

//        Bird bird1 = new Pigeon();
//        bird1.speak();
//        Animal bird2 = bird;
//        bird2.eat();
//
//        Titus titus = new Titus();
//        titus.speak();

        Animal[] animals = new Animal[5];
        animals[0] = new Titus();
        animals[1] = new Fish() {
            @Override
            public void moves() {
                System.out.println("fish moves");
            }

            @Override
            public void eat() {
                System.out.println("make me eat");
            }

            @Override
            public void speak() {
                System.out.println("Fish talk");
            }
        };
        animals[2] = new Bird() {
            @Override
            public void moves() {
                System.out.println("Bird moves");
            }

            @Override
            public void eat() {
                System.out.println("Bird eats");
            }

            @Override
            public void speak() {
                System.out.println("Bird speaks");
            }
        };
        animals[3] = new StarFish();
        animals[4] = new Parrot() {
            @Override
            public void speak() {
                System.out.println("i talk to much");
            }

            @Override
            public void moves() {
                System.out.println("i fly");
            }

            @Override
            public void eat() {
                System.out.println("i eat less");
            }
        };
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }
}
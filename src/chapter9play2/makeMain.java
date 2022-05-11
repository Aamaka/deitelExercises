package chapter9play2;

public class makeMain {
    public static void main(String[] args) {
        Pray pray = new Pray2();
        Pray prayer = new Pray3();
        Run fast = new Run();
        Pray prayers = new Pray();
        Walk wake = new Walk2();
        Eat chop = new Eat();
        PapaAmaka make = new PapaAmaka(pray,wake,fast,chop);
        make.pray();
        make.eat();
        make.run();
        make.walk();
        chop.chop();
        fast.run();
        prayers.pray();
        pray.pray();
        prayer.pray();
        wake.walk();

    }
}

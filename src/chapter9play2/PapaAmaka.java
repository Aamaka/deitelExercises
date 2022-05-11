package chapter9play2;

public class PapaAmaka {
    private Pray crying;
    private Walk step;
    private Run running;
    private Eat fast;

    public PapaAmaka(Pray crying, Walk step, Run running, Eat fast){
        this.crying = crying;
        this.step = step;
        this.running = running;
        this.fast = fast;
    }
    public void pray(){
        System.out.println("i pray like a warrior");
    }

    public void run(){
        System.out.println("major run");
    }

    public void walk(){
        System.out.println("major walk");
    }

    public void eat(){
        System.out.println("eat like a snail");
    }
}

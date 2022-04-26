package chapter6;

public class Hypotenuse {
    double hypotenuse;

    public void myLength(double opp ,double adj) {
     double hypotenuseSquare = Math.pow(opp, 2) + Math.pow(adj,2);
       hypotenuse = Math.sqrt(hypotenuseSquare);

    }

    public double getHypotenuseSquare() {
        return hypotenuse;
    }
}

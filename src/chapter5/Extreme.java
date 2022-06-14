package chapter5;

public class Extreme {
   int largest;
   int smallest;
    public void collectNum(int i, int i1, int i2, int i3, int i4) {
        largest = Math.max(i,Math.max(i1,Math.max(i2,Math.max(i3,i4))));
        smallest = Math.min(i,Math.min(i1,Math.min(i2,Math.min(i3,i4))));
    }

    public int getLargest() {
        return largest;
    }

    public int getSmallest() {
        return smallest;
    }

    public int getSum() {
        return largest + smallest;
    }
}

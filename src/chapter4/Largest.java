package chapter4;

public class Largest {

    int largest;

    public void collectNumbers(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
  largest = Math.max(i,Math.max(i1,Math.max(i2,Math.max(i3,Math.max(i4,Math.max(i5,Math.max(i6,Math.max(i7,Math.max(i8,i9)))))))));
    }

    public int getLargest() {
        return largest;
    }
}

package turtle;

public class ArrayList {
        int numberOfThingsAdded;
        boolean isEmpty;

        int[] arr = new int[5];

    public boolean isEmpty() {
        isEmpty = numberOfThingsAdded != 1;

        return isEmpty;
    }


    public void add(int element) {
        if(element >= arr.length){
            arr = new int[2 * arr.length];
        }
        arr[numberOfThingsAdded] = element;
        numberOfThingsAdded++;

    }

    public int size() {
        return numberOfThingsAdded;
    }

    public void add(int index, int element){
        if(numberOfThingsAdded >= arr.length) {
            arr = new int[arr.length * 2];
        }
        arr[index] = element;
        numberOfThingsAdded++;
    }

    public void remove(int index) {
        arr[index] = numberOfThingsAdded --;

    }

    public void set(int index, int element) {
        arr[index] = element;
    }

    public int get(int index) {
        return arr[index];
    }

    public void clear() {
        numberOfThingsAdded = 0;
    }
}

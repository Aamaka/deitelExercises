package myTurtle;

public class NotePad {
    int[][] arr;
    public NotePad(int floorRow, int floorColumn) {
        arr = new int[floorRow][floorColumn];
    }

    public int[][] getArr() {
        return arr;
    }
    public String toString(){
        StringBuilder returned = new StringBuilder();
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if(arr[row][column] == 0) returned.append("  ");
                if(arr[row][column] == 1) returned.append("* ");
            }
            returned.append("\n");
        }
        return returned.toString();
    }
}

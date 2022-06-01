package turtle;

public class SketchPad {
    private static int[][] floor;

    public SketchPad(int floorRow, int columnRow) {
        floor = new int[floorRow][columnRow];
    }

    public static int[][] getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        String toBeReturned = "";
        for (var row : floor) {
            for (var column : row) {
                if (column == 0) toBeReturned += " ";
                if (column == 1) toBeReturned += "* ";

            }
            toBeReturned += "\n";
        }
        return toBeReturned;
    }
}

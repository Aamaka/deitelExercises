package myTurtle;

public class Positions {
    private int row;
    private  int column;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Positions(int row, int column) {
        this.row = row;
        this.column = column;
    }
    public String toString(){
       return "row = "+ row+"\n"+
               "column = "+ column;
    }

    public boolean equals(Object o){
        Positions compared = (Positions) o;
        return compared.row == row && compared.column == column;
    }
}

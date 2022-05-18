package personalFun;

public class Display {
    String[][] segment = new String[5][9];

    public void setSpace() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                segment[i][j] = "  ";
            }
        }
    }

    public void setA() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setB() {
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 4; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setC() {
        for (int i = 2; i < 5; i++) {
            for (int j = 3; j < 4; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setD() {
        for (int i = 4; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setE() {
        for (int i = 2; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setF() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setG() {
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setH() {
        for (int i = 0; i < 1; i++) {
            for (int j = 5; j < 9; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setI() {
        for (int i = 0; i < 3; i++) {
            for (int j = 8; j < 9; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setJ() {
        for (int i = 2; i < 5; i++) {
            for (int j = 8; j < 9; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setK() {
        for (int i = 4; i < 5; i++) {
            for (int j = 5; j < 9; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setL() {
        for (int i = 2; i < 5; i++) {
            for (int j = 5; j < 6; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setM() {
        for (int i = 0; i < 3; i++) {
            for (int j = 5; j < 6; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setN() {
        for (int i = 2; i < 3; i++) {
            for (int j = 5; j < 9; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setDisplay(String input) {
        setSpace();
        if (input.charAt(14) == '1') {
            if (input.charAt(0) == '1') {
                setA();
            }
            if (input.charAt(1) == '1') {
                setB();
            }
            if (input.charAt(2) == '1') {
                setC();
            }
            if (input.charAt(3) == '1') {
                setD();
            }
            if (input.charAt(4) == '1') {
                setE();
            }
            if (input.charAt(5) == '1') {
                setF();
            }
            if (input.charAt(6) == '1') {
                setG();
            }
            if (input.charAt(7) == '1') {
                setH();
            }
            if (input.charAt(8) == '1') {
                setI();
            }
            if (input.charAt(9) == '1') {
                setJ();
            }
            if (input.charAt(10) == '1') {
                setK();
            }
            if (input.charAt(11) == '1') {
                setL();
            }
            if (input.charAt(12) == '1') {
                setM();
            }
            if (input.charAt(13) == '1') {
                setN();
            }
        }
    }
    public void printSegment(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(segment[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

package personalFun;

public class DigitalDisplay {
    String[][] segment = new String[5][22];

    public void setSpace() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 22; j++) {
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

    public void setO() {
        for (int i = 0; i < 1; i++) {
            for (int j = 13; j < 17; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setP() {
        for (int i = 0; i < 3; i++) {
            for (int j = 16; j < 17; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setQ() {
        for (int i = 2; i < 5; i++) {
            for (int j = 16; j < 17; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setR() {
        for (int i = 4; i < 5; i++) {
            for (int j = 13; j < 17; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setS() {
        for (int i = 2; i < 5; i++) {
            for (int j = 13; j < 14; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setT() {
        for (int i = 0; i < 3; i++) {
            for (int j = 13; j < 14; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setU() {
        for (int i = 2; i < 3; i++) {
            for (int j = 13; j < 17; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setV() {
        for (int i = 0; i < 1; i++) {
            for (int j = 18; j < 22; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setW() {
        for (int i = 0; i < 3; i++) {
            for (int j = 21; j < 22; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setX() {
        for (int i = 2; i < 5; i++) {
            for (int j = 21; j < 22; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setY() {
        for (int i = 4; i < 5; i++) {
            for (int j = 18; j < 22; j++) {
                segment[i][j] = "* ";
            }
        }
    }


    public void setZ() {
        for (int i = 2; i < 5; i++) {
            for (int j = 18; j < 19; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setAB() {
        for (int i = 0; i < 3; i++) {
            for (int j = 18; j < 19; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setBC() {
        for (int i = 2; i < 3; i++) {
            for (int j = 18; j < 22; j++) {
                segment[i][j] = "* ";
            }
        }
    }

    public void setSegment(String input) {
        setSpace();
        printDot();
        printDotB();
        if (input.charAt(28) == '1') {
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
            if (input.charAt(14) == '1') {
                setO();
            }
            if (input.charAt(15) == '1') {
                setP();
            }
            if (input.charAt(16) == '1') {
                setQ();
            }
            if (input.charAt(17) == '1') {
                setR();
            }
            if (input.charAt(18) == '1') {
                setS();
            }
            if (input.charAt(19) == '1') {
                setT();
            }
            if (input.charAt(20) == '1') {
                setU();
            }
            if (input.charAt(21) == '1') {
                setV();
            }
            if (input.charAt(22) == '1') {
                setW();
            }
            if (input.charAt(23) == '1') {
                setX();
            }
            if (input.charAt(24) == '1') {
                setY();
            }
            if (input.charAt(25) == '1') {
                setZ();
            }
            if (input.charAt(26) == '1') {
                setAB();
            }
            if (input.charAt(27) == '1') {
                setBC();
            }
        }
    }

    public void printSegment() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 22; j++) {
                System.out.print(segment[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printDot() {
        for (int i = 0; i < 2; i++) {
            for (int j = 10; j < 12; j++) {
                segment[i][j] = ". ";
            }
        }
    }

    public void printDotB() {
        for (int i = 3; i < 5; i++) {
            for (int j = 10; j < 12; j++) {
                segment[i][j] = ". ";
            }
        }
    }

    public static void main(String[] args) {
        DigitalDisplay display = new DigitalDisplay();
        display.setSegment("11111111111111111111111111111");
        display.printSegment();
    }

}

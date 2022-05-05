package personalFun;

public class MotherBoard {
   private String chips;
   private int memory;

    public MotherBoard(String chips, int memory) {
        this.chips = chips;
        this.memory = memory;
    }

    public String getChips() {
        return chips;
    }

    public int getMemory() {
        return memory;
    }
}

package personalFun;

public class Amaka {
    private Phone phone;
    private Laptop pc;
    private Bag bags;
    private Shoe shoes;
    private Cloth clothes;

    public Amaka(Phone phone, Laptop pc, Bag bags, Shoe shoes, Cloth clothes) {
        this.phone = phone;
        this.pc = pc;
        this.bags = bags;
        this.shoes = shoes;
        this.clothes = clothes;
    }

    public Phone getPhone() {
        return phone;
    }

    public Laptop getPc() {
        return pc;
    }

    public Bag getBags() {
        return bags;
    }

    public Shoe getShoes() {
        return shoes;
    }

    public Cloth getClothes() {
        return clothes;
    }
}

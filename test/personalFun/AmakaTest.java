package personalFun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AmakaTest {

    @Test
    public void getPhone() {
        Cloth clothes = new Cloth(12,"lala","black",88,"gown");
        Shoe shoes = new Shoe(24,"purple","gucci","flat","zebra");
        Bag bags = new Bag(22,"blue","hand bag","bug","gucci");
        MotherBoard board = new MotherBoard("bla",33);
        KeyBoard keyBoard = new KeyBoard(false,false,33);
        Laptop pc = new Laptop("Dell",keyBoard,board,44,"touch");
        Screen screen = new Screen(22,"hd","touch");
        Phone phone = new Phone(screen,23,"blue","good");
        Amaka bae = new Amaka(phone,pc,bags,shoes,clothes);
        assertEquals(screen,bae.getPhone().getScreen());
        assertEquals(phone,bae.getPhone());

    }

    @Test
    public void getPc() {
        Cloth clothes = new Cloth(12,"lala","black",88,"gown");
        Shoe shoes = new Shoe(24,"purple","gucci","flat","zebra");
        Bag bags = new Bag(22,"blue","hand bag","bug","gucci");
        MotherBoard board = new MotherBoard("bla",33);
        KeyBoard keyBoard = new KeyBoard(false,false,33);
        Laptop pc = new Laptop("Dell",keyBoard,board,44,"touch");
        Screen screen = new Screen(22,"hd","touch");
        Phone phone = new Phone(screen,23,"blue","good");
        Amaka bae = new Amaka(phone,pc,bags,shoes,clothes);
        assertEquals(pc,bae.getPc());
    }

    @Test
    public void getBags() {
        Cloth clothes = new Cloth(12,"lala","black",88,"gown");
        Shoe shoes = new Shoe(24,"purple","gucci","flat","zebra");
        Bag bags = new Bag(22,"blue","hand bag","bug","gucci");
        MotherBoard board = new MotherBoard("bla",33);
        KeyBoard keyBoard = new KeyBoard(false,false,33);
        Laptop pc = new Laptop("Dell",keyBoard,board,44,"touch");
        Screen screen = new Screen(22,"hd","touch");
        Phone phone = new Phone(screen,23,"blue","good");
        Amaka bae = new Amaka(phone,pc,bags,shoes,clothes);
        assertEquals(bags,bae.getBags());
    }

    @Test
    void getShoes() {
        Cloth clothes = new Cloth(12,"lala","black",88,"gown");
        Shoe shoes = new Shoe(24,"purple","gucci","flat","zebra");
        Bag bags = new Bag(22,"blue","hand bag","bug","gucci");
        MotherBoard board = new MotherBoard("bla",33);
        KeyBoard keyBoard = new KeyBoard(false,false,33);
        Laptop pc = new Laptop("Dell",keyBoard,board,44,"touch");
        Screen screen = new Screen(22,"hd","touch");
        Phone phone = new Phone(screen,23,"blue","good");
        Amaka bae = new Amaka(phone,pc,bags,shoes,clothes);
        assertEquals(shoes,bae.getShoes());
    }

    @Test
    void getClothes() {
        Cloth clothes = new Cloth(12,"lala","black",88,"gown");
        Shoe shoes = new Shoe(24,"purple","gucci","flat","zebra");
        Bag bags = new Bag(22,"blue","hand bag","bug","gucci");
        MotherBoard board = new MotherBoard("bla",33);
        KeyBoard keyBoard = new KeyBoard(false,false,33);
        Laptop pc = new Laptop("Dell",keyBoard,board,44,"touch");
        Screen screen = new Screen(22,"hd","touch");
        Phone phone = new Phone(screen,23,"blue","good");
        Amaka bae = new Amaka(phone,pc,bags,shoes,clothes);
        assertEquals(clothes,bae.getClothes());
    }
}
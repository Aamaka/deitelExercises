package tddClass;


import javaAssignment.Ac;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NativeTest {

    Native semicolon ;

    @BeforeEach
    public void startWith() {
        semicolon = new Native();
    }


    @Test
public  void nativeName(){
    semicolon.setName("Bola");
    assertEquals("Bola",semicolon.getName());
}

@Test
    public void nativeAge(){
    semicolon.setAge(12);
    assertEquals(12,semicolon.getAge());
}

@Test
        public  void  nativeAcTest(){
      Native amaka = new Native();
      assertNull(amaka.getOurAc());
      Ac amakaAc = new Ac();
      amaka.setOurAc(amakaAc);
      assertNull(amaka.getOurAc());

}

}

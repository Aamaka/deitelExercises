package chapter9Tests;

import chapter9.LivingThings;
import chapter9.Plants;
import org.junit.jupiter.api.Test;

public class PlantsTest {
    @Test
    public  void createClass(){
        Plants plants = new Plants("move","digest","excrete","breath","eat","walk","babies","vomit","heaven","food","talk");
    }
}

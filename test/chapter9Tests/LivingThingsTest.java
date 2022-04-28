package chapter9Tests;

import chapter9.LivingThings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LivingThingsTest {
    @Test
    public void createClass(){
        LivingThings things = new LivingThings("move","digest","excrete","breath","eat","walk","babies","vomit","heaven","food","talk");
        assertEquals("move",things.getMovement());
        assertEquals("digest",things.getDigestion());
        assertEquals("excrete",things.getExcrete());
        assertEquals("breath",things.getRespiratory());
        assertEquals("eat",things.getNutrition());
        assertEquals("walk",things.getGrowth());
        assertEquals("babies",things.getReproduction());
        assertEquals("vomit",things.getIrritability());
        assertEquals("heaven",things.getDeath());
        assertEquals("food",things.getAddiction());
        assertEquals("talk",things.getCommunication());
    }
}

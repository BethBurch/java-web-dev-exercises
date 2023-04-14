package exercises.technology.tests;

import exercises.technology.Main.Computer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ComputerTest {
    @Test
    public void constructorSetsValuesTest() {
        Computer myComputer = new Computer ( 20000,27,"Macintosh");
        assertEquals(20000, myComputer.getPixels());
        assertEquals(27, myComputer.getScreenSize());
        assertEquals("Macintosh", myComputer.getMake());
    }
    @Test
    public void  Math() {
        Computer myComputer = new Computer ( 20000,27,"Macintosh");
        int computerResult = myComputer.canDoMath();
        assertEquals(20,computerResult);
    }

}

import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class AnimalTest {

    Animal animal;

    @Before
    public void setUp() {
        animal = new Animal();
    }

    @Test
    public void testGetFoodException() {
        Assert.assertThrows(Exception.class, () -> animal.getFood("Насекомое"));
    }

    @Test
    public void testGetFood() throws Exception {
        Assert.assertEquals(List.of("Трава", "Различные растения"), animal.getFood("Травоядное"));
    }

    @Test
    public void testGetFamily() {
        String actual = animal.getFamily();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actual);

    }

}

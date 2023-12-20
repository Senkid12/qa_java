import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void testEatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void testGetFamily() {
        String actual = feline.getFamily();
        Mockito.verify(feline).getFamily();
        Assert.assertEquals("Кошачьи", actual);
    }

    @Test
    public void testGetKittens() {
        int actual = feline.getKittens();
        Mockito.verify(feline).getKittens(1);
        Assert.assertEquals("Кол-во котят не соответсвует", 1, actual);
    }

    @Test
    public void testTestGetKittens() {
        int actual = feline.getKittens(12);
        Mockito.verify(feline).getKittens(Mockito.anyInt());
        Assert.assertEquals("Кол-во котят не соответсвует", 12, actual);
    }


}

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    private Lion lion;
    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        lion = new Lion("Самец", feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void testDoesHaveManeException() {
        Assert.assertThrows(Exception.class, () -> new Lion("неподдерживаемый пол", feline));
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }

    @Test
    public void testGetFood() throws Exception {
        lion = new Lion("Самка", feline);
        lion.getFood();
        Mockito.verify(feline).getFood(Mockito.anyString());


    }
}

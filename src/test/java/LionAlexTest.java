import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

public class LionAlexTest {
    @Mock
    private Feline feline;
    private LionAlex lionAlex;

    @Before
    public void setUp() throws Exception {
        lionAlex = new LionAlex(feline);
    }

    @Test
    public void testGetKittens() {
        int actual = lionAlex.getKittens();
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testGetFriends() {
        List<String> actual = lionAlex.getFriends();
        Assert.assertEquals(List.of("Мелмон", "Марти", "Глория"), actual);
    }

    @Test
    public void testGetPlaceOfResidence() {
        String actual = lionAlex.getPlaceOfResidence();
        Assert.assertEquals("Нью-Йоркский зоопарк", actual);
    }


}

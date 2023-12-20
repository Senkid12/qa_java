import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTestWithParameters {
    private static final String ANIMAL_KIND_PREDATOR = "Хищник";
    private static final String ANIMAL_KIND_HERBIVORE = "Травоядное";
    private static final List<String> FOODS_HERBIVORE = List.of("Трава", "Различные растения");
    private static final List<String> FOODS_PREDATOR = List.of("Животные", "Птицы", "Рыба");
    private String animalKind;
    private List<String> foods;
    private Animal animal;

    public AnimalTestWithParameters(String animalKind, List<String> foods) {
        this.animalKind = animalKind;
        this.foods = foods;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                {ANIMAL_KIND_HERBIVORE, FOODS_HERBIVORE},
                {ANIMAL_KIND_PREDATOR, FOODS_PREDATOR}
        };
    }

    @Before
    public void setUp() {
        animal = new Animal();
    }

    @Test
    public void testGetFoodWithParameters () throws Exception {
        List<String> actual = animal.getFood(animalKind);
        Assert.assertEquals(foods, actual);
    }
}

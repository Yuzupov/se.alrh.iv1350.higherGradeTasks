import java.util.Random;
public class RandomComposition {
    private final Random randomizer;
    public RandomComposition() {
        randomizer = new Random();
    }
    public void printRandom(){
        long l = randomizer.nextLong();
        System.out.println(l);
    }

}

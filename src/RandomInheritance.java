import java.util.Random;
public class RandomInheritance extends Random {
    public RandomInheritance(){
        super();
    }
    public void printOtherRandom(){
        long l = nextLong();
        System.out.println(l);
    }
}

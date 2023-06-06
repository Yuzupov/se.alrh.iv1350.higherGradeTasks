import java.util.Random;

public class Main {
    public static void main (String[] args){
        /**
         * this is the composition class call
         */
        RandomComposition randomComposition = new RandomComposition();
        randomComposition.printRandom();
        /**
         * this is the inheritance call
         */
        RandomInheritance randomInheritance = new RandomInheritance();
        randomInheritance.printOtherRandom();
    }
}

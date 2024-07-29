//6510450585 Prakasit Jaiharn
public class PoliteDuckCounter implements Quackable{
    private Quackable quackable;
    private static int numberOfPoliteQuacks = 0;

    public PoliteDuckCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfPoliteQuacks++;
    }

    public static int getNumberOfQuack() {
        return numberOfPoliteQuacks;
    }
}

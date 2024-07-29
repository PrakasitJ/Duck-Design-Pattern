//6510450585 Prakasit Jaiharn
public class QuackCounter implements Quackable{
    Quackable quackable;
    static int numberOfQuack = 0;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuack++;
    }

    public static int getNumberOfQuack() {
        return numberOfQuack;
    }
}

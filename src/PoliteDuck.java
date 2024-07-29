//6510450585 Prakasit Jaiharn
public class PoliteDuck implements Quackable{
    private Quackable quackable;

    public PoliteDuck(Quackable quackable){
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        System.out.println("ka");
    }
}

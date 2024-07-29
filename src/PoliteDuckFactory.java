//6510450585 Prakasit Jaiharn
public class PoliteDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new PoliteDuckCounter(new PoliteDuck(new MallardDuck()));
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new PoliteDuckCounter(new PoliteDuck(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new PoliteDuckCounter(new PoliteDuck(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new PoliteDuckCounter(new PoliteDuck(new RubberDuck()));
    }
}

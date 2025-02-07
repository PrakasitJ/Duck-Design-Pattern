//6510450585 Prakasit Jaiharn
public class CountingDuckFactory extends AbstractDuckFactory{

        @Override
        public Quackable createMallardDuck() {
            return new QuackCounter(new MallardDuck());
        }

        @Override
        public Quackable createRedHeadDuck() {
            return new QuackCounter(new RedheadDuck());
        }

        @Override
        public Quackable createDuckCall() {
            return new QuackCounter(new DuckCall());
        }

        @Override
        public Quackable createRubberDuck() {
            return new QuackCounter(new RubberDuck());
        }
}

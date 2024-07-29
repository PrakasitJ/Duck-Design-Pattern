//6510450585 Prakasit Jaiharn
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate(new PoliteDuckFactory());
    }
    private void simulate(AbstractDuckFactory DuckFactory){
        Quackable mallard = DuckFactory.createMallardDuck();
        Quackable redhead = DuckFactory.createRedHeadDuck();
        Quackable duckCall = DuckFactory.createDuckCall();
        Quackable rubber = DuckFactory.createRubberDuck();

        Quackable goose = new GooseAdaptor(new Goose());
        Quackable pigeon = new PigeonAdaptor(new Pigeon());

        System.out.println("\nDuck Simulator\n");

        Flock flock1 = new Flock();
        flock1.add(mallard);
        flock1.add(redhead);
        flock1.add(duckCall);
        flock1.add(rubber);
        flock1.add(goose);
        flock1.add(pigeon);

        flock1.quack();

        System.out.println(QuackCounter.getNumberOfQuack() + " quack were counted");
        System.out.println(PoliteDuckCounter.getNumberOfQuack() + " Polite quack were counted");
    }

    private void simulate(Quackable duck){
        duck.quack();
    }
}

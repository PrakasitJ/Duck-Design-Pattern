//6510450585 Prakasit Jaiharn
import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable{
    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        quackers.getFirst().quack();
        quackers.getFirst().quack();
        quackers.parallelStream().forEach(Quackable::quack);
    }
}

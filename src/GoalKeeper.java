import java.time.LocalDate;

public class GoalKeeper extends Sportsmen {
    public GoalKeeper(String name, String lastName, LocalDate dateOfBirth, double hight, double wight) {
        super(name, lastName, dateOfBirth, hight, wight);
    }

    public GoalKeeper() {
    }

    @Override
    public void name() {
        super.name();
    }

    @Override
    public void lastName() {
        super.lastName();
    }

    @Override
    public void age() {
        super.age();
    }

    @Override
    public void high() {
        super.high();
    }

    @Override
    public void waight() {
        super.waight();
    }
}

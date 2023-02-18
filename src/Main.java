import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GetInfoable atacker = new Attacker("Manas","Abdugani uulu", LocalDate.of(1995,8,26),169,58);
        GetInfoable atacker2 = new Attacker("Bakyt","Torobaev", LocalDate.of(1998,8,26),169,58);
        GetInfoable atacker1 = new Attacker("Musa","Alybaev", LocalDate.of(1999,8,26),178,58);
        GetInfoable defender = new Defender("Bek","Joroev",LocalDate.of(2001,6,4),175,70.5);
        GetInfoable defender1 = new Defender("Isa","Bakyshev",LocalDate.of(2004,6,4),175,70.5);
        GetInfoable defender2 = new Defender("Toro","Tilekov",LocalDate.of(2002,6,4),175,70.5);
        GetInfoable goalKeeper = new GoalKeeper("Juma","Temirov",LocalDate.of(2003,7,9),182,89.5);
        GetInfoable trener = new Traner("Kubanych","Muktarov");

        GetInfoable[] result = {atacker,defender,goalKeeper,trener,atacker1,atacker2};
        for (GetInfoable a:result) {
            a.lastName();
            System.out.println("---------------------");
            a.name();
            System.out.println("---------------------");
            a.waight();
            System.out.println("---------------------");
            a.age();
            System.out.println("---------------------");
            a.high();
        }
    }
}
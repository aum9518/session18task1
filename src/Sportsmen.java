import java.time.LocalDate;
import java.time.Period;

public abstract class Sportsmen implements GetInfoable{
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    private double hight;
    private double wight;

    public Sportsmen(String name, String lastName, LocalDate dateOfBirth, double hight, double wight) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.hight = hight;
        this.wight = wight;
    }

    public Sportsmen() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    @Override
    public void name() {
        System.out.println("Name: "+name);
    }

    @Override
    public void lastName() {
        System.out.println("Last name: "+lastName);
    }

    @Override
    public void age() {
        Period age = Period.between(dateOfBirth,LocalDate.now());
        System.out.println("Age: "+age);
    }

    @Override
    public void high() {
        System.out.println("High: "+hight);
    }

    @Override
    public void waight() {
        System.out.println("Waight: "+wight);
    }
}

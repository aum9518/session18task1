public class Traner implements GetInfoable {
    private String firstName;
    private String lastName;

    public Traner() {
    }

    public Traner(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void name() {
        System.out.println("First name: "+firstName);
    }

    @Override
    public void lastName() {
        System.out.println("Last name: "+lastName);
    }

    @Override
    public void age() {

    }

    @Override
    public void high() {

    }

    @Override
    public void waight() {

    }
}

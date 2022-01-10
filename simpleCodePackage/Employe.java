package simpleCodePackage;

public class Employe extends Personne {

    String function;
    Employe chief;

    public Employe(String lastName, String firstName) {
        super(lastName, firstName);
    }

    public Employe(String lastName, String firstName, String aFunction) {
        super(lastName, firstName);
        this.function = aFunction;
    }

    public Employe getChief() {
        return chief;
    }

    public void setChief(Employe chief) {
        this.chief = chief;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "function=' " + function + '\'' +
                ", chief= " + chief +
                ", lastName=' " + lastName + '\'' +
                ", firstName=' " + firstName + '\'' +
                '}';
    }
}

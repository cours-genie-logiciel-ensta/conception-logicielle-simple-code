package simpleCodePackage;

public class Client extends Personne {

    Account myAccount;

    public Client(String lastName, String firstName) {
        super(lastName, firstName);
    }

    public Client(String lastName, String firstName, int initValue ) {
        super(lastName, firstName);
        this.myAccount = new Account( initValue );

    }

    public void depotAccount ( int value ) {
            this.myAccount.addValue( value );
    }

    @Override
    public String toString() {
        return "Client{" +
                " lastName=' " + lastName + '\'' +
                ", firstName=' " + firstName + '\'' +
                "myAccount value= " + myAccount +
                '}';
    }

}

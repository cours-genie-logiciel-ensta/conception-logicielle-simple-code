package simpleCodePackage;

public class Account {
    int value;

    public Account(int aValue) {
        this.value = aValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addValue( int aValue ) {

        if (aValue > 0) {
            setValue( getValue() + aValue);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "value=" + value + "€ " +
                '}';
    }
}

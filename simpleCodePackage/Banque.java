package simpleCodePackage;


import java.util.ArrayList;
import java.util.LinkedList;

public class Banque {

    String name;
    LinkedList<Client> bankClient = new LinkedList<Client>();
    ArrayList bankEmploye = new ArrayList( 100 );


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Banque(String aName, Employe superChief ) {
        this.name = aName;
        superChief.setFunction( "Super Chief");
        getBankEmploye().add( superChief );

    }

    public LinkedList<Client> getBankClient() {
        return bankClient;
    }

    public ArrayList getBankEmploye() {
        return bankEmploye;
    }

    public void addEmploye( Employe anEmploye ) {

        getBankEmploye().add( anEmploye );

    }

    public void addClient( Client aClient ) {

        getBankClient().add( aClient );

    }

    @Override
    public String toString() {
        return "Banque{" + '\n'+
                "name : " + getName() + '\n'+
                ", bankEmploye=" + bankEmploye + '\n'+
                "bankClient=" + bankClient + '\n' +
                '}';
    }


    public static void main(String[] args ) {
        Employe superChief = new Employe( "Guerin" , "Sylvain" , "None");
        Banque creditMaritime = new Banque( "Credit Maritime ", superChief );
        Employe firstEmploye = new Employe( "Mazo" , "Raul" , "Tresorier");
        firstEmploye.setChief( superChief );


        creditMaritime.addEmploye( firstEmploye );
        creditMaritime.addClient( new Client( "Hnaini" , "Hiba" , 100000 ));

        System.out.println( creditMaritime );

    }

}

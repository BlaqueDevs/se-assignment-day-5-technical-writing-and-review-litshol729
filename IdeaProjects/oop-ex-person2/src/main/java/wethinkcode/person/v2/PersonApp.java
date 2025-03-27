package wethinkcode.person.v2;

import java.time.LocalDate;

public class PersonApp {
    public static void main (String[] cmdLineArgs){
        Person famousDirector = new Person("Ridley Scott", LocalDate.of( 1937, 11, 30 ));
        System.out.println( famousDirector.asFormattedString());

        famousDirector = new Person( "Stanley Kubrick", LocalDate.of( 1928, 7, 26 ));
        System.out.println( famousDirector.asFormattedString());
    }
}



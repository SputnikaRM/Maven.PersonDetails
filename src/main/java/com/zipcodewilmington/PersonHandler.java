package com.zipcodewilmington;
import java.lang.StringBuilder;
/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;
        StringBuilder currentPerson = new StringBuilder();
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop
        while(counter < personArray.length){

             currentPerson.append(personArray[counter].toString())  ;

            counter++;

        }
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
    result = currentPerson.toString();
            // end loop
        return result;
    }

    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        int counter =0;
        String inital = "";
        String terminal = "";
        StringBuilder currentPerson = new StringBuilder();

        for (counter=0; counter<personArray.length; counter++){
            currentPerson.append(personArray[counter].toString());

        }
        result = currentPerson.toString();


        return result;
    }



    public String forEachLoop() {
        String result = "";
        StringBuilder currentPerson = new StringBuilder();
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        int x = 0;
        for (x=0; x<personArray.length;x++){
            currentPerson.append(personArray[x].toString());
        }
        result = currentPerson.toString();
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}

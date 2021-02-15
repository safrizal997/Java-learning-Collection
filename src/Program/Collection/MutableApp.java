package Program.Collection;

import Program.Collection.Data.Person;

import java.util.Collection;
import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Rizal");

        person.addHobby("game");
        person.addHobby("coding");
        //doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()){
            System.out.println(hobby);
        }



    }
    /*Method ini tidak bisa digunakan karena field hobbies sudah immutable

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Bukan Hobi");
    }
    */
}

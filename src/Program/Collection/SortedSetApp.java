package Program.Collection;

import Program.Collection.Data.Person;
import Program.Collection.Data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {

    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("Rizal"));
        people.add(new Person("Ijal"));
        people.add(new Person("Safrizal"));

        for (var person : people){
            System.out.println(person.getName());
        }

        //immutable SortedSet
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        //sortedSet.add(new Person("Salah"));



    }
}

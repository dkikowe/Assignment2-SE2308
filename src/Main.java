import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args){
        ArrayList<Person> personArrayList = new ArrayList<>();

        Student didar = new Student("Didar" ,"Kabylbek" , 2.99 );
        Student aba = new Student("Abylay", "Nurtaev" , 2.66);
        Employee teacher = new Employee("Nura" , "Akbergen" , "teacher" ,180000);
        Employee saya = new Employee("Sayazhan" , "Boranbaeva" ,"teacher of English" , 250000);

        personArrayList.add(didar);
        personArrayList.add(teacher);
        personArrayList.add(aba);
        personArrayList.add(saya);

        Collections.sort(personArrayList);
        printData(personArrayList);
    }
    public static void printData(Iterable<Person> people){
        for (Person person : people){
            System.out.println(person.toString()+" earns " + person.getPaymentAmount());
        }
    }
}


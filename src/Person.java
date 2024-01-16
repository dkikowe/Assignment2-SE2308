public class Person implements Comparable<Person>{
    private int id;
    private static int counterId=1;
    private  String name;
    private String surname;
    private String position;
    public int getId() {
        return id;
    }

    public Person(){
    }
    public Person(String name , String surname){
        this.id=counterId++;
        this.name = name;
        this.surname = surname;

    }
    public String getPosition(){
        return "Student";
    }
    @Override
    public String toString() {
        return id + "." + name + " " + surname;
    }


    public double getPaymentAmount(){
        return 0.0;
    }
    public int compareTo(Person person) {
        return Double.compare(getPaymentAmount(), person.getPaymentAmount());
    }
}

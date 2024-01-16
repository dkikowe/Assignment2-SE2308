public class Employee extends Person {

    private String position;
    private double salary;
    public Employee(){
    }



    public Employee(String name , String surname , String position , double salary){
        super(name,surname);
        this.salary = salary;
        this.position = position;
    }



    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() ;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}

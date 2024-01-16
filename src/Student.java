public class Student extends Person{
    private double stipend = 36600;
    private double gpa;

    public Student(){
    }
    public  Student(String name , String surname , double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }
    public double getPaymentAmount(){
        if(gpa<2.67){
            return stipend=0;
        }
        else{
            return stipend;
        }
    }
    public String toString(){
        return "Student: " + super.toString();
    }

}



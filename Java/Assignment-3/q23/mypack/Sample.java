package q23.mypack;
import q23.mypack.MyPackage.Student;

public class Sample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRoll(1);
        s1.setfirst("Naksh");   
        s1.setMiddle("Rajesh");
        s1.setLast("Patel");
        s1.setAdd("Ahmedabad");
        s1.setAge(19);

        System.out.println("Roll no = " + s1.getRoll());
        System.out.println("First name = " + s1.getFirst());
        System.out.println("Middle name = " + s1.getMiddle());
        System.out.println("Last name = " + s1.getLast());
        System.out.println("Address = " + s1.getAdd());
        System.out.println("Age = " + s1.getAge());
         
    }
}

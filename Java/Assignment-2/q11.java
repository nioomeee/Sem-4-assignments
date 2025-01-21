// Create a class Admin with Id, enrollnment no and name. Create two methods named
// input()
// and display(). Create 5 objects of that class and print all the values of it.
// Note: use Array of Object concept
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter the number of objects: ");
        len = sc.nextInt();
        Admin[] obj = new Admin[len];

        for(int i = 0; i < len; i++){
            obj[i] = new Admin();
            System.out.println("For object "+(i+1)+" :");
            obj[i].input(sc);
        }

        System.out.println("Displaying the details of the objects");

        for(int i = 0; i < len; i++){
            System.out.println("Details of object"+(i+1)+" :");
            obj[i].print();
        }

        sc.close();

    }
}

class Admin{
    public
    int Id;
    int Enrollment;
    String name;
    void input(Scanner sc){
        System.out.print("Enter Id: ");
        Id = sc.nextInt();

        System.out.print("Enter Enrollment number: ");
        Enrollment = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter name: ");
        name = sc.nextLine();
    }
    void print(){
        System.out.println("The Id = "+Id);
        System.out.println("The Name = "+name);
        System.out.println("The Enrollment = "+Enrollment);
    }
}

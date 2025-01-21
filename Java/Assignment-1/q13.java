// Write a program to display the grade according to the marks entered by the
// user using else-if ladder.
import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float marks;
        System.out.print("Enter your total marks: ");
        marks = sc.nextFloat();
        String grade = Grade(marks);
        System.out.println("The grade for "+marks+" = "+grade);
        sc.close();
    }

    static String Grade(float marks){
        if(marks > 90){
            return "A";
        }else if(marks < 90 && marks > 75){
            return "B";
        }else if(marks < 75 && marks > 60){
            return "C";
        }else if(marks < 60 && marks > 33){
            return "Pass";
        }else{
            return "Fail";
        }
    }
}

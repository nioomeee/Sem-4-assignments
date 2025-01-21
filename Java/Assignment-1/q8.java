// Write a Java Program that will ask the user to input one number and check
// whether its prime number or not using Constructor.
import java.util.Scanner;
public class q8 {
    q8(int num){
        int count = 0;
        for(int i = 2; i < num; i ++){
            if(num % i == 0){
                count++;
            }
        }
        if(count > 0){
            System.out.println("the number is not prime");
        }else{
            System.out.println("the number is prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        q8 obj = new q8(num);
        sc.close();
    }
}

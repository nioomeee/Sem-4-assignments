// 19. Create a object of string buffer class,which stores a string from the user. Perform the
// following operations.
//Reverse the string and print it.
//Take another string from the user and append it with existing string.
//Print the capacity of the modified string.
import java.util.Scanner;
public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);

        System.out.print("Reversed string = " + sb.reverse());
        sb.reverse();

        System.out.print("\nEnter another string: ");
        String str2 = sc.nextLine();

        sb.append(str2);
        System.out.println("After appending, the string = " + sb);

        System.out.println("The capacity of the modified string = " + sb.capacity());

        sc.close();
    }

}

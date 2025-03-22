// Write a java program which contains the two string from user and perform the following
// string.
//  Find out whether two strings are equal.
//  Find out whether two strings equal when case is ignored.
//  Compare two strings.
import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter 1st string: ");
        String str1 = sc.nextLine();

        System.out.print("\n Enter 2nd string: ");
        String str2 = sc.nextLine();

        // finding whether 2 strings are equal
        System.out.println("If 2 strings equal = " + str1.equals(str2));

        // finding out if equal with case ignored
        System.out.println("If strings are equal with case ignored = " + str1.equalsIgnoreCase(str2));

        // comparing 2 strings
        int res = str1.compareTo(str2);

        if (res == 0) {
            System.out.println("both strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }

        System.out.println();
        sc.close();
    }
}
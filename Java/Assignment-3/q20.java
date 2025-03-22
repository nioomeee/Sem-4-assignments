// Consider string s='FCAIT GLS University', modify the string s as
// Convert the string into uppercase and lowercase
// Find out the character at position 5.
// Find out the sub string as GLS University.
public class q20 {
    public static void main(String[] args) {
        String str = "FCAIT GLS University";

        System.out.println("Uppercase = " + str.toUpperCase());
        System.out.println("the character at index 5 = " + str.charAt(5));
        System.out.println("Sub string = " + str.indexOf("GLS University"));
    }
}

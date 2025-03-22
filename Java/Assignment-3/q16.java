// Write a java program which shows String class methods. 

public class q16 {
    public static void main(String[] args) {
        String str = "Hello World!";

        // 1. length of string
        System.out.println("Length = " + str.length());

        //2. charAt(indx)
        System.out.println("Character at index 3 = " + str.charAt(3));

        // 3. substring(start indx, end indx)
        System.out.println("Substring (0, 5) = " + str.substring(0, 5));

        // 4. toUpperCase()
        System.out.println("Upper Case = " + str.toUpperCase());

        // 5. toLowerCase() 
        System.out.println("Lower case = " + str.toLowerCase());

        // 6. indexOf(substring)
        System.out.println("Index of 'World = " + str.indexOf("World"));

        // 7. equals(another String)
        String str2 = "Hello World!";
        System.out.println("str equals str2 = " + str.equals(str2));

        // 8. equalsIgnoreCase(another String)
        String str3 = "hello WoRld!";
        System.out.println("str equalsIgnoreCase str3 = " + str.equalsIgnoreCase(str3));

        // 9. replace(oldChar, newChar)
        System.out.println("Replace 'o' with 'x' = " + str.replace('o', 'x'));

        // 10. contains(substring)
        System.out.println("Contains 'World' = " + str.contains("World"));

        // 11. startsWith(prefix)
        System.out.println("Starts with 'Hello' = " + str.startsWith("Hello"));

        // 12. endsWith(suffix)
        System.out.println("Ends with '!' = " + str.endsWith("!"));

        // 13. trim()
        String str4 = "     trim me     ";
        System.out.println("Trimmed = " + str4.trim());

        // 14. split(regex)
        String str5 = "apples,bananas,oranges";
        String[] parts = str5.split(",");

        for(String part : parts) {
            System.out.print(part + " ");
        }
        System.out.println();
    }
}

// Write a java program using StringBuffer Class and its methods. 
public class q17 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append(String str)
        sb.append(", World");
        System.out.println("Append = " + sb);

        // 2. reverse()
        System.out.println("Reversed string = " + sb.reverse());

        // 3. length()
        System.out.println("Length of string = " + sb.length());

        // 4. capacity()
        System.out.println("Capacity of String = " + sb.capacity());

        // 5. charAt(index)
        System.out.println("Char at (5) = " + sb.charAt(5));

        // 6. substring(start) & substring(stat, end)
        System.out.println("Substring (4) = " + sb.substring(4));
        System.out.println("Susbtring (0, 6) = " + sb.substring(0, 3));

        // 7. replace(start, end, String)
        sb.replace(0, 5, "Hi");
        System.out.println("Replace = " + sb);

        // 8. insert(offset, String)
        sb.insert(3, "Java");
        System.out.println("Insert = " + sb);

        // 9. delete(start, end)
        sb.delete(2, 7);
        System.out.println("Delete = " + sb);
    }

}

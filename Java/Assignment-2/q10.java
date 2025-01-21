// Write a Java Program to create add function to sum all the elements.
// Note: use Variable length argument concept
public class q10{
    public static void main(String[] args) {
        System.out.println("Sum of 5, 10, 15: "+Sum(5,10, 15));
        System.out.println("Sum of 1, 2, 3, 4: "+Sum(1, 2, 3, 4));
        System.out.println("Sum of 100, 200, 300: "+Sum(100, 200, 300));
        System.out.println("Sum of no numbers: "+Sum());
    }
    static int Sum(int ...arr){
        int sum = 0;
        for(int el: arr){
            sum+= el;
        }

        return sum;
    }
}
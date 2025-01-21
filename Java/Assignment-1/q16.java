// Write a Java program to display all even numbers from 1 to 100 using forloop.
public class q16 {
    public static void main(String[] args) {
        System.out.println("The even numbers from 1 to 100 are: ");
        Display();
    }

    static void Display(){
        for(int i = 2; i <= 100; i+= 2){
            System.out.print(i+" ");
        }
    }
}

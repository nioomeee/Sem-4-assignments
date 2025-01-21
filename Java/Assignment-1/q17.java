// Write a Java Program to display all prime odd numbers from 50 to 100.
public class q17 {
    public static void main(String[] args) {
        System.out.println("The odd prime numbers from 50 to 100 are: ");
        for(int i = 51; i <= 100; i += 2){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isPrime(int num){
        for(int i = 2; i < num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}

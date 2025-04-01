import java.util.Scanner;
class leghtmatch extends Exception{
    public leghtmatch(String len){
        super(len);
    }

}
public class q2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string:");
        String str= sc.nextLine();
        System.out.print("enter length:");
        int legth= sc.nextInt();

        try{
            if(str.length()!=legth){
                throw new leghtmatch("doesn't match");
            } else {
                System.out.println("Match");
            }
        }
        catch(leghtmatch e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
        

    }
}
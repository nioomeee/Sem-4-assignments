// 18. Write a java program using Wrapper class. 
public class q18 {
    public static void main(String[] args) {
        int primInt = 25;

        // Boxing
        Integer myWrapperInteger = Integer.valueOf(primInt); //explicit boxing
        Integer myInt = primInt; //Autoboxing

        System.out.println("Wrapper integer = " + myWrapperInteger);

        // Unboxing
        int unboxedInt = myWrapperInteger.intValue();//explicit unboxing
        int myAutoUnboxedInt = myWrapperInteger;

        System.out.println("Unoxed int = " + unboxedInt);

        // Integer to String
        String intString = myWrapperInteger.toString();
        System.out.println("Integer to String = " + intString);

        // String to integer
        int parsedInt = Integer.parseInt("150");
        System.out.println("Paresed int = " + parsedInt);

    }
}

public class B5_E5 {
    
    public static void main(String[] args){

        int x = 10; int y = 2;

        int num1 = ++x*y; System.out.println("++x*y = " +num1);
        int num2 = (++x)*y; System.out.println("(++x)*y = " + num2);
        // int num3 = ++(x*y); // ERROR
        int num3 = x*y +1; System.out.println("x*y+1 = " + num3);

    }

}

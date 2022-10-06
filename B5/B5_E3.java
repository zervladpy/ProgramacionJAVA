public class B5_E3 {
    
    public static void main(String[] args){

        // Refactor this code:
        int x=3;
        int y;
        y=x++*2;
        System.out.println("x: "+ x+ " y:"+y);


        x = 3;
        y = x*2;
        x += 1;
        System.out.println("x: " + x + " y: " + y);

    }

}

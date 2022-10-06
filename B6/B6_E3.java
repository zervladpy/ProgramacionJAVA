public class B6_E3 {
    
    public static void main(String[] args){

        int x = 101;
        if (x>100) x += 1; System.out.println(x);

        String aBC = x>100 ? "x = " + (x+1) : ".";

        if(aBC != ".")System.out.println(aBC);
    }

}

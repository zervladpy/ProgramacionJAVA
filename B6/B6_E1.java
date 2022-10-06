public class B6_E1{

    public static void main(String[] args){

        int x = 35;
        if (x%2==0) System.out.println("el numero :" + x + " es par");
        else System.out.println("El numero " + x + " es impar");

        String resultado = x%2==0 ? x + " x: " + x + "es par" : x + "x: " + x + " no es par";
        System.out.println(resultado);

    }

}
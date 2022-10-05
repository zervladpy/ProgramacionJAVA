public class B3_E5 {

    public static void main(String[] args){

        short sx = 32767;
        short sy = 1;
        short sz = (short)(sx + sy);
        System.out.println(" sz vale " + sz );
        System.out.println("Valor minimo de short: " + Short.MIN_VALUE + " valor maximo: " + Short.MAX_VALUE);

        // El resultado sz sin ser convertido a short daria 32768 lo cual esta fuera del rango de un numero short, por lo tanto al convertirlo a short habria perdida de información

    }
    
}

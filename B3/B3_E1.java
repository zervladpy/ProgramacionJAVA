public class B3_E1 {
    public static void main(String[] args){
        // Pasar un "char" a diferentes tipos de variable
        // char -> boolean;
        char x = 'a';
        // boolean Bool = (boolean)x  -> Error: No se puede pasar un char, int ... a boolean
        System.out.println("No se puede hacer cast a boolean");
        byte by = (byte)x;
        System.out.println("El caracter" + x + "se peude pasar a byte:" + by);
        short sh = (short)x;
        System.out.println("El caracter" + x + "se peude pasar a short:" + sh);
        int in = x;
        System.out.println("El caracter" + x + "se peude pasar a int:" + in);
        long ln = x;
        System.out.println("El caracter" + x + "se peude pasar a long:" + ln);
        float fl = x;
        System.out.println("El caracter" + x + "se peude pasar a float:" + fl);
        double dl = x;
        System.out.println("El caracter" + x + "se peude pasar a double:" + dl);
    }
}

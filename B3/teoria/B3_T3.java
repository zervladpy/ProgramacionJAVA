public class B3_T3 {
    public static void main(String[] args){

        byte bx = -128;
        byte by = 1;
        System.out.println("bx-by sin hacer cast a byte es un entero: " + (bx-by));
        byte bz = (byte)(bx-by);
        System.out.println("pasando bx y by a byte: " + bz);

    }
}

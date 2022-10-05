public class B3_T2 {
    public static void main(String[] args){

        // Para cambiar el tipo de variable numerica a una de menor tamaño, tenemos que forzar el cambio (tipo_unidad)nuestra_variable
        // Seguramente haya perdida de informacion como en el ejemplo

        int entero1 = 10;
        int entero2 = 300;
        System.out.println((byte)entero1);
        System.out.println((byte)entero2);
    }
}

public class B3_T1{

    public static void main(String[] args){

        // Podemos cambiar el tipo de una variable siempre que sea de la unidad pequeña a la de mayor tamaño de esta manera:

        int i = 99;
        long l;
        l = i;
        double d = 20.3434;
        d = l;
        System.out.println("i: "+ i + " , l: " + l + ", d: " + d);
    }
}
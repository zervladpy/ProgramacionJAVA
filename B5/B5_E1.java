public class B5_E1{

    public static void main(String[] args){

        double peso = 70.5; double altura = 1.60;

        double IMC = peso/(altura*altura);

        System.out.println("Peso: " + peso + " KG");
        System.out.println("Altura: " + altura + " M");
        System.out.println("IMC : " + IMC);
        System.out.println("");
        System.out.println("TABLA IMC");
        System.out.println("Delgado:        < 18.5");
        System.out.println("Normal:         entre 18.5 y 24.9");
        System.out.println("Sobrepeso:      entre 25 y 29.9");
        System.out.println("Obeso:          > 30");

    }

}
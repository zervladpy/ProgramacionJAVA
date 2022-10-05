public class B3_E4 {

    public static void main(String[] args){

        int n1 = 127; int n2 = 128; int n3 = 129; int n4 = 130;

        System.out.println("int " + n1 + " se pasa a byte y es " + (byte)n1); // int 127 se pasa a byte y es 127
        System.out.println("int " + n2 + " se pasa a byte y es " + (byte)n2); // int 128 se pasa a byte y es -128
        System.out.println("int " + n3 + " se pasa a byte y es " + (byte)n3); // int 129 se pasa a byte y es -127
        System.out.println("int " + n4 + " se pasa a byte y es " + (byte)n4); // int 127 se pasa a byte y es -126

        // Al intentar convertir un integro menor que -128 y mayor que 127 habrá una perdida de informacion ya que un byte no puede almacenar esa información
        
    }
    
}

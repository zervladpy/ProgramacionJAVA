public class EJ1{

    public static void main(String[] args){
        // solucion float
        // float ua = 1.0F;
        float dSTkmF = 149597870F; // Distancia SOL-TIERRA en kilometros equivalente a 1 ua
        float dSPuaF = 39.44F;   // Disatnacia SOL-PLUTOM en ua
        
        float dSPkmF = dSTkmF*dSPuaF;
        System.out.println("distancia SOL-PLUTON en km = " + dSPkmF + " (float)");

        // solucion double
        // double ua = 1.0D;
        double dSTkmD = 149597870D;
        double dSPuaD = 39.44D;

        double dSPkmD = dSTkmD*dSPuaD;
        System.out.println("distancia SOL-PLUTON en km = " + dSPkmD + " (douoble)");

    }

}
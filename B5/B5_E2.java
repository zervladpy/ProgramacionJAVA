public class B5_E2 {
    
    public static void main(String[] args){

        int segundos_iniciales = 500000; int segundos; int minutos; int horas; int dias;

        segundos = segundos_iniciales%60;
        minutos = (segundos_iniciales/60)%60;
        horas = ((segundos_iniciales/60)/60)%60;
        dias = (((segundos_iniciales/60)/60)/24)%24;

        System.out.println("Segundos iniciales: " + segundos_iniciales + " : " + dias + " dias, " + horas + " horas, " + minutos + " min, "+ segundos + " sec");

    }

}

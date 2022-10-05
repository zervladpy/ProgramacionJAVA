package B1;
class B1_E4 {
    
    public static void main(String[] args){

        int segundos_iniciales = 500000;
        int segundos = segundos_iniciales%60;
        int minutos = (segundos_iniciales/60)%60;
        int horas = ((segundos_iniciales/60)/60)%60;
        int dias = (((segundos_iniciales/60)/60/60))%24;

        System.out.println("Segundos iniciales: " +segundos_iniciales+ ", " + dias + "dias, " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");

    }

}

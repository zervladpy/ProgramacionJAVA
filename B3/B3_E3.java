public class B3_E3 {
    
public static void main(String[] args){

    System.out.println("Código entero del caracter 'A': "+ (int)'A');
    System.out.println("Código entero del caracter 'B': "+ (int)'B');
    System.out.println("Código entero del caracter 'B': "+ ('A'+1));
    System.out.println("Código entero del caracter 'B': "+ (char)('A'+1));

    // 1) La instrucción 2º y 3º hacen lo mismo, imprimen el código entero asociado al carácter ‘B’ ¿Porque la 2ª necesita (int) y la 3ª no?.
    // RESPUESTA: Por que la maquina virtual inteta sumar un caracter con un integro, para ahcerlo pasa el carater a integro y suma los dos numeros

    // 2) ¿Por qué la última instrucción imprime el carácter ‘B’?
    // RESPUESTA: Porque despues de obtener el valor integro del caracter (A+1)=B realiza la conversion a caracter, dando por resultado B
}

}

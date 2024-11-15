import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);

        int i;
        String cadena;
        String invertida="";

        System.out.println("Introduzca una cadena");
        cadena=entrada.nextLine();

        for (i = cadena.length()-1; i>=0;i--) {
            invertida+=cadena.charAt(i);
        }
        System.out.println(" Su frase invertida es: "+invertida);
        
    entrada.close();
    }
    
    
}

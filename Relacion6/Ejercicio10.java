import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        String cadena="", cadena_invertida="";
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduzca la frase que desea saber si es un palindromo");
        cadena=entrada.nextLine();
        
        for (int i = cadena.length()-1; i>=0; i--) {
            cadena_invertida+=cadena.charAt(i);
          
        }

        if (cadena_invertida.equals(cadena)){
            System.out.println(cadena +" Es un palindromo");
        }else{
            System.out.println(cadena +" No es un palindromo");
        }

       

        entrada.close();
    }
    
}
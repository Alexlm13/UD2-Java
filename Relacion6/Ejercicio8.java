import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);

    String frase="", frase_final="";

    System.out.println("Introduzca una frase");
    frase=entrada.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            char letra=frase.charAt(i);

            if (Character.isUpperCase(letra)) {
                frase_final+=Character.toLowerCase(letra);
             } else {
                frase_final+=Character.toUpperCase(letra);
                
            }
        }
        System.out.println("Tu frase es " + frase_final);
        }
    }
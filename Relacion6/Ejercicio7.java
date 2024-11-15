import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        String frase;
        char letra1;
        char letra2;
        String fraseFin="";

        System.out.println("Escriba una cadena");
        frase=entrada.nextLine();

        System.out.println("Escriba la letra a sustituir");
        letra1=entrada.nextLine().charAt(0);

        System.out.println("Escriba la letra sustituta");
        letra2=entrada.nextLine().charAt(0);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==letra1){
                fraseFin+=letra2;
            }
            else{fraseFin+=frase.charAt(i);
            }
        }
        System.out.println("La frase cambiada es: "+fraseFin);
        entrada.close();
    }
}

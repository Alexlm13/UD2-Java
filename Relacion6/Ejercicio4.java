import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        

        String frase;
        int contador=0;

        System.out.println("Introduzca una frase");
        frase=entrada.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)==' '){
                contador++;
            }
            
        }
            System.out.println("Tu frase tiene "+contador+" espacios");
            entrada.close();
    }
    
}

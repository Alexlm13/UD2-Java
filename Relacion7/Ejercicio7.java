/*Define tres arrays de 20 números enteros cada uno, con nombres numero, cuadrado y cubo. Carga el
array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los
cuadrados de los valores que hay en el array numero. En el array cubo se deben almacenar los cubos
de los valores que hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
en tres columnas*/


package Relacion7;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        int[] numero=new int[20];
        int[] cuadrado=new int[20];
        int[] cubo=new int[20];

        System.out.println("Los números generados aleatoriamente son: ");
            for (int i = 0; i < numero.length; i++) {
                numero[i]=(int)Math.round(Math.random()*100);
                System.out.print(numero[i]+" ");
            }
        System.out.println();
        System.out.println("Dichos números elevados al cuadrado: ");
            for (int i = 0; i < cuadrado.length; i++) {
                cuadrado[i]=(int)Math.pow(numero[i], 2);
                System.out.print(cuadrado[i]+" ");
            }
        System.out.println();
        System.out.println("Dichos números elevados al cubo: ");
            for (int i = 0; i < cubo.length; i++) {
                cubo[i]=(int)Math.pow(numero[i], 3);
                System.out.print(cubo[i]+" ");
            }
    } 
}

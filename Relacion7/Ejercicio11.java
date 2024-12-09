/*Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores
según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma
de tabla como se muestra en la figura.*/

package Relacion7;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        String[][] array={
            {"0","30","2"," "," ","5"},
            {"75"," "," "," ","0"," "},
            {" "," ","-2","9"," ","11"}
        };

        for(String[]tabla:array){
            System.out.println();
            for(String i:tabla){
                System.out.print(i+" ");
            }
        }
    }
}

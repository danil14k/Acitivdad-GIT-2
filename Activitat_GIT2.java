import java.util.Random;
import java.util.Scanner;

public class Activitat_GIT2 {
    public static void main(String[] args) {
        
        Scanner scan_numeros = new Scanner(System.in);
        Scanner scan_letras = new Scanner(System.in);
 
        //matriz-inicial

        int[][] array = new int[5][5];


        for (int vueltas = 0; vueltas < array.length; vueltas++) {
            for (int vueltas2 = 0; vueltas2 < array[vueltas].length; vueltas2++) {
            
                
                Random rand = new Random(); 
                
                int aleatorio = rand.nextInt(101); 
                
                array[vueltas][vueltas2] = aleatorio;
                
                
            }
        }

        for (int vueltas = 0; vueltas < array.length; vueltas++) {
            for (int vueltas2 = 0; vueltas2 < array[vueltas].length; vueltas2++) {
                System.out.print(array[vueltas][vueltas2]);
                System.out.print(" , ");
            }
            System.out.println();
        }

        //busqueda-numero
        
        int igual = 0;
        System.out.println("Que numero quieres comprobar");
        int numero = scan_numeros.nextInt();
        for (int vueltas = 0; vueltas < array.length; vueltas++) {
            for (int vueltas2 = 0; vueltas2 < array[vueltas].length; vueltas2++) {
                if (numero == array[vueltas][vueltas2]){
                    igual = 1;
                    break;
                } 
                                                
            }
            
        }
        
        if (igual == 1) {
            System.out.println("El numero coincide");
        }
        else{
            System.out.println("El numero no coincide");
        }

    }
}

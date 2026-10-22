/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class EjerciciosExtras {
    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

  
    public static void main(String[] args) {
        //SWITCH EXTRA
        /*Scanner s = new Scanner(System.in);
        System.out.println("Introduce una opción:");
        System.out.println("1. Passar de metres a peus ");
        System.out.println("2. Passar de peus a metres ");
        System.out.println("3. Passar de metres a polzades");
        System.out.println("4. Passar de polzades a metres");
        System.out.println("5. Sortir");
        int opcio = s.nextInt();
        s.nextLine();
        
        switch (opcio) {
            case 1 -> {
                System.out.println("Dime un dato en metros:");
                double metros = s.nextDouble();
                s.nextLine();
                
                double pies = metros/0.3048;
                System.out.println("El resultado es: "+pies+" ft");
                  
            }
            case 2 ->{
                System.out.println("Dime un dato en pies:");
                double pies = s.nextDouble();
                s.nextLine();
                
                double metros = pies*0.3048;
                System.out.println("El resultado es: "+metros+" m");
                  
                
            }
            case 3-> {
                System.out.println("Dime un dato en metros:");
                double metros = s.nextDouble();
                s.nextLine();
                
                double pulgadas = metros/0.0254;
                System.out.println("El resultado es: "+pulgadas+" in");
            }
            case 4 -> {
                System.out.println("Dime un dato en pulgadas:");
                double pulgadas = s.nextDouble();
                s.nextLine();
                
                double metros = pulgadas*0.0254;
                System.out.println("El resultado es: "+metros+" m");
            }
            case 5-> {
                System.out.println("Saliendo del sistema...");
            }
                
           
            default->{
                System.out.println("Opción no contemplada.");
                
            }
                
        }
*/
        //WHILE EXTRA
       /* Scanner sc = new Scanner(System.in);
        double numUsuari = -1;
        int  contador = 0;
        while (numUsuari!=0){
         System.out.println("Dime un número real: (0 para terminar)");  
         numUsuari = sc.nextDouble();
            if (numUsuari!=0) {
                double numMitad = numUsuari/2;
          System.out.println("La mitad de " + numUsuari + " es " + numMitad);
          contador++;
                
            }
        }System.out.println("Has introducido " + contador + " números diferentes de cero." );
*/
       
       
    }
    
}

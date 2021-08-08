 //Rogelio Benavides - 574161
 //11 de Abril del 2021
 //Programa que calcula la suma de factoriales generados por los n números solicitados.
 //Entrada: número de factoriales, factorial a calcular
 //Resultado: El factorial del número y la suma de los factoriales
 //Proceso: 4*3*2*1 - Se guarda en un acumulador, este acumulador se acumula en otro para la suma total
 // Necesito ciclo for
 import java.io.*;
 import java.util.*;
 class ProcFact {
   public static void main(String [] args){
      Scanner in = new Scanner(System.in);
      System.out.print("Introduce la cantidad de factoriales a calcular: ");
      int veces = in.nextInt();
      int suma = 0;
      for (int x = 0; x < veces; x++){
         int acum = 1;
         System.out.println("Introduce un número entero");
         int num = in.nextInt();
         for (int i = num; i > 1; i--)
            acum *= i;
         System.out.println("El factorial del número " + num + " es: " + acum);
         suma += acum;
      }
      System.out.print("La suma total de todos los factoriales es de: " + suma);
   }
 }

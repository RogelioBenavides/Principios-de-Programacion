//Rogelio Eduardo Benavides De La Rosa
//Programa realizado el 26 de Abril del 2021
//Práctica de uso de métodos
//Programa que calcula el promedio de n números

import java.io.*;
import java.util.*;
import java.text.*;
class ClaseSalon{
   public static void main(String args[]){
      int n = ClaseSalon.leerN();
      double c[] = new double[n+1];
      c = ClaseSalon.leerSumar(n, c);
      double prom = ClaseSalon.calcularProm(c[n], n);
      ClaseSalon.imprimir(prom, c, n);
   }
   public static int leerN(){
      Scanner s = new Scanner(System.in);
      System.out.println("Ingresa la cantidad de números a sumar");
      return s.nextInt();
   }
   public static double [] leerSumar(int n, double[] c){
      Scanner s = new Scanner(System.in);
      for (byte i = 0; i<n; i++){
         System.out.println("Ingrese la calificación " + (i+1) + ":");
         c[i] = s.nextDouble();
         c[n] += c[i];
      }
      return c;
   }
   public static double calcularProm(double acum, int n){
      return acum/n;
   }
   public static void imprimir(double prom, double c[], int n){
      DecimalFormat d = new DecimalFormat("0.00");
      for (byte i= 0; i<n; i++)
         System.out.println(d.format(c[i]));
      System.out.println("El promedio es: " + d.format(prom));
   }
}
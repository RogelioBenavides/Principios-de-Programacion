import java.io.*;
import java.util.*;
import java.text.*;
class Potencias{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      for(byte i = 1; i<=5; i++){
         System.out.println("La primera potencia de " + i + " es: " + Math.pow(i,1));
         System.out.println("La segunda potencia de " + i + " es: " + Math.pow(i,2));
         System.out.println("La tercera potencia de " + i + " es: " + Math.pow(i,3));
      }
   }
}
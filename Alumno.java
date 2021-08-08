import java.io.*;
import java.util.*;
class Alumno {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double acum = 0;
      for (int i = 1; i<=50; i++){
         byte c = input.nextByte();
         acum += c;
      }
      System.out.println("El promedio de las calificaciones es de: " + (acum/50.0));
   }
}
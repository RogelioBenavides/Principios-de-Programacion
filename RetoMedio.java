import java.io.*;
import java.util.*;

class RetoMedio{
   public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      char [][] arreglo = new char [4][4];
      int posicionX;
      int posicionY;
      char respuesta;
      do {
         System.out.print("Ingresa la cordenada x: ");
         posicionX = s.nextByte() - 1;
         System.out.print("Ingresa la cordenada y: ");
         posicionY = s.nextByte() - 1;
         System.out.print("Ingresa el caracter a ingresar: ");
         arreglo[posicionX][posicionY] = s.next().charAt(0);
         System.out.print("¿Quieres ingresar otro caracter?: ");
         respuesta = s.next().charAt(0);
      } while(respuesta == 's');
      for (byte i = 0; i < 4; i++){
         for (byte j = 0; j < 4; j++)
            System.out.print(arreglo[i][j] + " ");
         System.out.print("\n");
      }
   }
}
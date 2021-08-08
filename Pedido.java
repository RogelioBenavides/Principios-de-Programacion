import java.io.*;
import java.util.*;
import java.text.*;
class Pedido {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      DecimalFormat dos = new DecimalFormat("0.00");
      System.out.println("Número de producto\t\t\tPrecio Unitario");
      System.out.println("\t\t10\t\t\t\t\t\t\t\t$24.30");
      System.out.println("\t\t20\t\t\t\t\t\t\t\t$105.00");
      System.out.println("\t\t30\t\t\t\t\t\t\t\t$10.35");
      System.out.println("\t\t40\t\t\t\t\t\t\t\t$200.00\n");
      System.out.print("Ingresa el número de producto que se desea: ");
      byte producto = input.nextByte();
      float precio = 0f;
      short cantidad = 0;
      if (producto == 10 || producto == 20 || producto == 30 || producto == 40){
         System.out.print("Ingresa la cantidad que se desea: ");
         cantidad = input.nextShort();
      }
      switch (producto){
         case 10:
            precio = 24.30f;
            break;
         case 20:
            precio = 105.00f;
            break;
         case 30:
            precio = 10.35f;
            break;
         case 40:
            precio = 200.00f;
            break;
         default:
            System.out.println("Se ingresó un número de producto inválido.");
      }
      float total = precio * cantidad;
      if(total >= 1000)
         total *= 0.98;
      else if (total >= 800)
         total *= 0.99;
      if (precio>0)
         System.out.println("El total de tu pedido es de: $" + dos.format(total) + " pesos.");
   }
}
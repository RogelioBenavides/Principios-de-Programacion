import java.io.*;
import java.util.*;
import java.text.*;
class Factura {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      DecimalFormat dos = new DecimalFormat("0.00");
      System.out.println("Ingrese los metros cúbicos del mes anterior");
      short m1 = input.nextShort();
      System.out.println("Ingrese los metros cúbicos del mes actual");
      short m2 = input.nextShort();
      int consumo = m2-m1;
      double pagar = 0;
      if (consumo<=60)
         pagar = 15.00;
      else
         if (consumo<=160)
            pagar = (consumo-60)*0.5+15;
      else
         if (consumo<=260)
            pagar = (consumo-160)*0.025+65;
      else
         pagar = (consumo-260)*0.015+66.5;
      System.out.println("El importe de la factura por " + consumo + " metros cúbicos es de: $" + dos.format(pagar) +" pesos." );
   }
}
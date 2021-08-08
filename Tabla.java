import java.io.*;
import java.util.*;
import java.text.*;
class Tabla{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      DecimalFormat twoDigit = new DecimalFormat("0.00");
      System.out.print("Ingresa un número: ");
      short num = in.nextShort();
      for (byte i = 1; i<=10; i++){
         System.out.println(num + " x " + i + " = " + num*i);
      }
   }
}
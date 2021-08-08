//Realizado por Rogelio Eduardo Benavides De La Rosa - 574161
//Realizado el 8 de Marzo del 2021
//Programa que calcula el número de billetes y monedas que dará una determinada cantidad de dinero
import java.io.*;
class Billetes {
   public static void main(String[] args){
      int cantidad=1576;
      int billetesQuinientos=cantidad/500;
      int restante=cantidad-billetesQuinientos*500;
      int billetesDoscientos=restante/200;
      int restante2=restante-billetesDoscientos*200;
      int billetesCien=restante2/100;
      int restante3=restante2-billetesCien*100;
      int billetesCincuenta=restante3/50;
      int restante4=restante3-billetesCincuenta*50;
      int billetesVeinte=restante4/20;
      int restante5=restante4-billetesVeinte*20;
      int monedasDiez=restante5/10;
      int restante6=restante5-monedasDiez*10;
      int monedasCinco=restante6/5;
      int restante7=restante6-monedasCinco*5;
      int monedasDos=restante7/2;
      int restante8=restante7-monedasDos*2;
      int monedasUno=restante8;
      System.out.println("La cantidad es: "+cantidad);
      System.out.println("La cantidad de billetes de 500 es: "+ billetesQuinientos);
      System.out.println("La cantidad de billetes de 200 es: "+ billetesDoscientos);
      System.out.println("La cantidad de billetes de 100 es: "+ billetesCien);
      System.out.println("La cantidad de billetes de 50 es: "+ billetesCincuenta);
      System.out.println("La cantidad de billetes de 20 es: "+ billetesVeinte);
      System.out.println("La cantidad de monedas de 10 es: "+ monedasDiez);
      System.out.println("La cantidad de monedas de 5 es: "+ monedasCinco);
      System.out.println("La cantidad de monedas de 2 es: "+ monedasDos);
      System.out.println("La cantidad de monedas de 1 es: "+ monedasUno);
      }
   }
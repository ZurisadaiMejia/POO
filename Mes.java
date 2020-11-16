import java.util.Scanner;
public class Mes{

public static void main(String args[]){
Scanner x = new Scanner(System.in);

System.out.println("Este programa le dira cuantos dias tienen los meses segun el numero de mes que usted ingrese");
System.out.println("Ingrese el numero del mes (1 al 12)");
int mes = x.nextInt();
String dias;

switch (mes) {
  case 1: case 3: case 5: case 7: case 8: case 10: case 12:
    dias = "El mes tiene 31 días";
    break;
  case 4: case 6: case 9: case 11:
    dias = "El mes tiene 30 días";
    break;
  case 2:			
    dias = "El mes tiene 28 días (o 29 días si es año bisiesto)";
    break;			
  default:
    dias = "Mes incorrecto";
}

 }
}
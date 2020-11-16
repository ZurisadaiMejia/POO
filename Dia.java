import  java.util.Scanner;
public class Dia{
public static void main (String args []){
Scanner x = new Scanner(System.in);
 
System.out.println("El programa le dira que dia de la semana es, segun el número que usted ingrese");
System.out.println("Ingrese un numero del 1 al 7");
char dia = x.nextLine().charAt(0);

	if (dia == '1'){
	System.out.println("Hoy es dia Lunes");
	}

	if (dia == '2'){
	System.out.println("Hoy es dia Martes");
	}

	if (dia == '3'){
	System.out.println("Hoy es dia Miercoles");
	}

	if (dia == '4'){
	System.out.println("Hoy es dia Jueves");
	}

	if (dia == '5'){
	System.out.println("Hoy es dia Viernes");
	}

	if (dia == '6'){
	System.out.println("Hoy es dia Sabado");
	}

	if (dia == '7'){
	System.out.println("Hoy es dia Domingo");
	}

	

 }
}
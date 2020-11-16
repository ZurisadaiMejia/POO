import java.util.Scanner;

public class Multiplos{

public static void main (String args []){

Scanner x = new Scanner (System.in);

int num1=0, num2=0, num3=0, num4=0, num5=0;

		
		System.out.println("Ingrese un numero multiplo de 2");
		num1 = x.nextInt();

		if ( num1 %2==0){

		System.out.println("Ingrese un numero multiplo de 3");
		num2 = x.nextInt();

		}


		if ( num2 % 3 == 0){

		System.out.println("Ingrese un numero multiplo de 5");
		num3 = x.nextInt();
		}



		if ( num3 %5 == 0){
		System.out.println("Ingrese un numero multiplo de 7");
		num4 = x.nextInt();

		}



		if ( num4 %7 == 0){
		System.out.println("Ingrese un numero multiplo de 11");
		num5 = x.nextInt();
		}

		else {
		System.out.println("Adios");
		}


 }
}










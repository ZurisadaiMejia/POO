import java.util.Scanner;

public class Nmenor{

public static void main (String args[]){

Scanner x = new Scanner (System.in);

System.out.println("El programa le dira cual es el numero mas pequeño");
System.out.println("Ingrese el primer numero");
int num1 = x.nextInt();
System.out.println("Ingrese el segundo numero");
int num2 = x.nextInt();
System.out.println("Ingrese el tercer numero");
int num3 = x.nextInt();



	if ((num1<num2) && (num1<num3)){
	System.out.println("El numero menor es " +num1);
	}
		

	else if ((num2<num1 && num2<num3)){
	System.out.println("El numero menor es " +num2);
	}


	else if ((num3<num1) && (num3<num2)){
	System.out.println("El numero menor es " +num3);
	}
	
	
		
}


}
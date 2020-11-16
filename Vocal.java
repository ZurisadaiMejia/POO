import java.util.Scanner;


public class Vocal{
public static void main (String args[]){
Scanner x = new Scanner(System.in);
 
 char a,e,i,o,u;

System.out.println("Reconocimiento de Vocales");
System.out.println("Ingrese un caracter : ");
char caracter = x.nextLine().charAt(0);


	if ((caracter =='a') || (caracter =='e') || (caracter =='i') || (caracter =='o') || (caracter =='u'))
	{

	System.out.println("Su caracter es una vocal");
	}
	
	else{
	System.out.println("Su caracter NO es vocal");	
	}
}
}
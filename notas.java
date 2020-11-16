
import java.util.Scanner;



public class notas

{

	public static void main (String[] args);
	{
	
	Scanner leer = new Scanner(System.in);

	System.out.println("Promedio de nota de un alumno ");
	
	int n1= 0, n2 = 0, total = 0;


	System.out.println("Ingrese nota acumulativa : ");
	int n1 = leer.nextInt();



	if (n1>=71)

	{
	texto = r.nextLine();
	}	
		else
		{
		System.out.println("Ingrese un valor menor de 70");
		}


	System.out.println("Ingrese nota de examen : ");
	int n2 = leer.nextInt();


	if (n2>=31)
	{
	texto = r.nextLine();
	}	
		else
		{
		System.out.println("Ingrese un valor menor de 30");
		}


	System.out.println("Su nota final es: " + n1 + "+" + n2 + "=" +total);


	if (n1+n2>=70)
{
	System.out.println("Felicidades, aprobo su clase");
}
	else
	{
	System.out.println("lo siento, reprobo su clase");
	}
	


	}
}
	


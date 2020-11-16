import java.util.Scanner;

public class tienda
{
	public static void main (String[] args)
	{
		Scanner r = new Scanner (System.in);
		
		System.out.println("Cuantos productos va llevar?");
		int prod = r.nextInt();

			
		if(prod < 0){
		System.out.println("Error, no puede ingresar una cantidad de productos negativa");
		}
			else
			{
				if(prod >= 5){
				System.out.println("Felicidades, tiene un 15% de descuento :)");
				}
					else
					{
					System.out.println("No tiene descuento :(");
					}

			}

	}
}

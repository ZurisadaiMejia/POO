import java.util.Scanner;

public class descuento
{
	
	public static void main (String[] args);

	{
	Scanner x = new Scanner(System.in);
	
	System.out.println("Cuantos productos comprara?");
	int cantidadproducto = x.nextInt();

	if (cantidadproducto >= 5)
	{
	System.out.println("Tiene un 15% de descuento en su compra");
	}
		else
		{
		System.out.println("No tiene descuento");
		}
	}
}
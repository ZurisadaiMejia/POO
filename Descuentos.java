/* Zurisadai Mejia Santos 202010060473

*/
import java.util.Scanner;

public class Descuentos
{
	
	public static void main (String[] args){


	Scanner x = new Scanner(System.in);
	
	System.out.println("Cuantos productos comprara?");
	int cantidadproducto = x.nextInt();

	if (cantidadproducto < 5)
	{
	System.out.println("Tiene un 0% de descuento en su compra");
	}
	
	

	if ((cantidadproducto > 2) && (cantidadproducto < 5));
	{
	System.out.println("Tiene un 5% de descuento en su compra");
	}
	


	if (cantidadproducto > 5) 
	{
	System.out.println("¿Cual es el Subtotal de sus productos");
	int Subtotal = x.nextInt();
	
		if ((Subtotal > 300) && (Subtotal < 1000)); {
		System.out.println("Tiene un 10% de descuento en su compra");
		}

		if (Subtotal > 1000){
		System.out.println("Tiene un 20% de descuento en su compra");
		}

	}

	
 }
}

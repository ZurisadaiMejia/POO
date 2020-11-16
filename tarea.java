public class operaciones
{
	public static void main (String[] args)
	{
		double n1, n2, suma, resta, multiplicacion, division;
		n1=100.5; n2=199.5;

		suma=n1+n2;
		resta=n1-n2;
		multiplicacion=n1*n2;
		division=n1/n2;
		System.out.print("La suma de: ");
		System.out.println(n1 + " + " + n2 + " = " + suma);

		System.out.print("La resta de: ");
		System.out.println(n1 + " - " + n2 + " = " + resta);

		System.out.print("La multiplicacion de: ");
		System.out.println(n1 + " * " + n2 + " = " + multiplicacion);

		System.out.print("La division de: ");
		System.out.println(n1 + " / " + n2 + " = " + division);
	}
}

import java.util.Scanner;

public class goles
{
	public static void main (String[] args)

	{

	Scanner leer = new Scanner (System.in);
	
	System.out.println("Ingrese el numero de goles del Equipo #1");
	int equipo1 = leer.nextInt();
	
	System.out.println("Ingrese el numero de goles del Equipo #2");
	int equipo2 = leer.nextInt();

	if (equipo1 > equipo2)
	{
	System.out.println("Equipo #1 es el ganador");
	}
	else if (equipo2 > equipo1)
	{
	System.out.println("Equipo #2 es el ganador");
	}
	else if (equipo1 == equipo2)
	{
	System.out.println("Empate");
	}
	}

}
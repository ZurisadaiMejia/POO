import java.util.Scanner;
public class Palabras{

 public static void main(String args []){
 Scanner x = new Scanner(System.in);
 char a,e,i,o,u;
		
System.out.println("El Programa le mostrara tres palabras que inicien con la vocal que usted ingrese");
System.out.println("Ingrese una vocal (a, e, i, o, u)");
char vocal = x.nextLine().charAt(0);
	
	if(vocal == 'a') {
	System.out.println("Aire, Aguacate, Avion");
	}
	
	if(vocal == 'e') {
	System.out.println("Elefante, Espejo, Escalera");
	}

	if(vocal == 'i') {
	System.out.println("Idioma, Idea, Impresora");
	}

	if(vocal == 'o') {
	System.out.println("Oso, Oreja, ocho");
	}

	if(vocal == 'u'	) {
	System.out.println("Unicornio, Uniforme, Unidad");
	}
	


 }

}
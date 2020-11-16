public class resultados
{
	public static void main (String arg [])
{
	/*Inizializar variables para suma, resta, multiplicacion, residuo y division*/
	
	int s,r,m,d,p;
	int vs1=2;
	int vs2=4;

	int vr1=5;
	int vr2=1;

	int vm1=3;
	int vm2=8;

	int vd1=9;
	int vd2=3;

	int vp1=7;
	int vp2=123;

	s=vs1+vs2;
	r=vr1-vr2;
	m=vm1*vm2;
	d=vd1/vd2;
	p=vp1%vp2;

	System.out.println("La suma es igual a: "+s); 
	System.out.println("La resta es igual a: "+r); 
	System.out.println("La multiplicacion es igual a: "+m); 
	System.out.println("La division es igual a: "+d);
	System.out.println("El producto es igual a: "+p);  
	

}

}
package uebung_3_5;

public class Kreissegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double alpha =20;
		double r=10;
		double alphabogenmass=Math.toRadians(alpha);
		double A= (alpha/360)*r*r*Math.PI-(0.5*r*r*Math.sin(alphabogenmass));
		double h = r-(r*Math.cos(alphabogenmass/2));
		double b=r*Math.PI*(alphabogenmass/180);
		double s= 2*Math.sqrt(r*r-(r-h)*(r-h));
	System.out.println("Der Fl�cheninhalt des Kreissegments betr�gt "+A);
	System.out.println("Der Bogenl�nge des Kreissegments betr�gt "+b);
	System.out.println("Die H�he des Kreissegments betr�gt "+h);
	System.out.println("Die Kantenl�nge des Kreissegments betr�gt "+s);



	}

}

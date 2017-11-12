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
	System.out.println("Der Flächeninhalt des Kreissegments beträgt "+A);
	System.out.println("Der Bogenlänge des Kreissegments beträgt "+b);
	System.out.println("Die Höhe des Kreissegments beträgt "+h);
	System.out.println("Die Kantenlänge des Kreissegments beträgt "+s);



	}

}

package uebung_3_5;

public class Kreissegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double r = 10;
		double alpha = 180.0; 
		double A;
		double h;
		double b;
		double s;
		double pi = Math.PI;
		double bogenmass = Math.toRadians(alpha);
		A = ( (alpha / 360) * (r*r) * pi ) - ( 0.5 * (r*r) * Math.sin(bogenmass) );
		h = ( r ) - ( r * (Math.cos((bogenmass/2))) );
		b = ( r * pi * (alpha/ 180) );
		s = 2 * Math.sqrt((r*r)-((r-h)*(r-h)));
		System.out.println(pi);
		System.out.println("A = " + A);
		System.out.println("h = " + h);
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		
	}

}

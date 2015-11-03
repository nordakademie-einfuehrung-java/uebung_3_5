package uebung_3_5;

public class Kreissegment {

	public static void main(String[] args) {

		double r = 1;
		double winkel = 360;
		double pi = 3.14159265358979;
		
		double a; //Fläche
		double h; //Höhe
		double b; //Kreisbogen
		double s; //Kreissehne
		
		a = ((winkel / 360) * (r*r) * pi) - (0.5 * (r * r) * Math.sin(winkel * pi / 180));
		System.out.println("a = " + a);
		
		h = r - (r * Math.cos((winkel / 2) * pi / 180));
		System.out.println("h = " + h);
		
		b = r * pi * (winkel / 180);
		System.out.println("b = " + b);
		
		s = 2 * Math.sqrt((r * r) - ((r - h) * (r - h)));
		System.out.println("s = " + s);
		
	}

}

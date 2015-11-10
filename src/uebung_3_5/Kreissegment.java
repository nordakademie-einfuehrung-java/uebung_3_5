package uebung_3_5;

public class Kreissegment {

	public static void main(String[] args) {
		double r = 2;
		double a = 45;
		double pi = Math.PI;
		double sina = Math.sin(Math.toRadians(a));
		double cosa2 = Math.cos(Math.toRadians(a/2));
					
		double inhalt = ((a/360)*r*r*pi)-(0.5*r*r*sina);
		double hoehe = r - (r*cosa2);
		double bogenmas = r * pi * a/180;
		double breite = 2 * Math.sqrt((r*r)-((r-hoehe)*(r-hoehe)));
		
		System.out.println("Der Fl�cheninhalt betr�gt " + inhalt + " cm^2.");
		System.out.println("Die H�he betr�gt " + hoehe + " cm.");
		System.out.println("Das Bogenma� betr�gt " + bogenmas + " cm.");
		System.out.println("Die Breite betr�gt " + breite + " cm.");
		
	}

}

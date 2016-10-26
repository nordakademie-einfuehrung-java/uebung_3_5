package uebung_3_5;

public class KreissegementRechner {

	public static void main(String[] args) {
		
		//Variablen
		double radius = 30, alpha = 20;
		
		//L�sungen
		double area, hoehe, bogenmass, seite;
		
		//Berechnung Fl�che
		area = (alpha / 360) * Math.pow(radius, 2) * Math.PI - 0.5 * Math.pow(radius, 2) * Math.sin(alpha);
		System.out.println("Das Kreissegment hat eine Fl�che von: " + area + " qm");
		
		//Berechnung H�he
		hoehe = radius - (radius * Math.cos(alpha/2));
		System.out.println("Das Kreissegment hat eine H�he von: " + hoehe + " m");
		
		//Berechnung Bogenma�
		bogenmass = radius * Math.PI * (alpha / 180);
		System.out.println("Das Kreissegment hat ein Bogenma� von: " + bogenmass);
		
		//Berechnung Seite
		seite = 2 * Math.sqrt(Math.pow(radius, 2)-Math.pow((radius-hoehe), 2));
		System.out.println("Die Seite des Kreissegmentes hat eine L�nge von: " + seite + " m");
		
		
		

	}

}

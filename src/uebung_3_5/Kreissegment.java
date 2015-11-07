package uebung_3_5;

import java.text.DecimalFormat;

public class Kreissegment {

	public static void main(String[] args) {
		double radius = 8;
		double alpha = 45;
		double alphahalbe = alpha/2;
		double pi = Math.PI;
		double radiant = Math.toRadians(alpha);
		double radianthalbe = Math.toRadians(alphahalbe);
		
		DecimalFormat f = new DecimalFormat("#0.000");
		
		double umfang = radius * pi * (alpha/360);
		double flaeche = ((alpha/360) * radius * radius * pi) - 0.5 * radius * radius * Math.sin(radiant);
		double hoehe = radius - (radius * Math.cos(radianthalbe));
		double breite = 2 * Math.sqrt((radius * radius) - ((radius-hoehe)*(radius-hoehe)));
		
		System.out.println("Ein Kreissegment mit dem Radius r = " + radius + "cm und dem Winkel alpha = " + alpha + "° hat folgende Maße:");
		System.out.println("Umfang = " + f.format(umfang) + "cm");
		System.out.println("Fläche = " + f.format(flaeche) + "cm^2");
		System.out.println("Höhe = " + f.format(hoehe) + "cm");
		System.out.println("Breite = " + f.format(breite) + "cm");
	}

}

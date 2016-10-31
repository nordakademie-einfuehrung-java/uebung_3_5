
public class Kreisradius {

	public static void main(String[] args) {

		double radius = 1;
		double mittelpunktwinkel = Math.PI;//in radiant
		double flaecheninhalt = 0;
		double hoehe = 0;
		double breite = 0;
		double kreisbogen = 0;

		flaecheninhalt = mittelpunktwinkel /(2*Math.PI)  * radius * radius * Math.PI
				- 0.5 * radius * radius * Math.sin(mittelpunktwinkel);

		hoehe = radius - (radius * Math.cos(0.5 * mittelpunktwinkel));

		breite = radius * Math.PI * mittelpunktwinkel / Math.PI;

		kreisbogen = 2 * Math.sqrt(radius * radius - ((radius - hoehe) * (radius - hoehe)));

		System.out.println("F�r einen Radius von " + radius + " und einen Mittelpunktwinkel von " + mittelpunktwinkel
				+ " ergeben sich folgende Werte:");
		System.out.println("Der Flaecheninhalt A betr�gt " + flaecheninhalt);
		System.out.println("Die Hoehe h betr�gt " + hoehe);
		System.out.println("Die Breite b betr�gt " + breite);
		System.out.println("Der Kreisbogen s betr�gt " + kreisbogen);
	}
}
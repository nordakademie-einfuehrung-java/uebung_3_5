package uebung_3_5;

public class uebung_3_5 {

	public static void main(String[] args) {
		
		double r = 1;
		double alpha = 35;
		
		double A = (alpha/360) * (r*r) * Math.PI - 0.5 * (r*r) * Math.sin(alpha);
		
		double h = r - (r*Math.cos(alpha/2));
		
		double b = r * Math.PI * (alpha/180);
		
		double s = 2 * Math.sqrt( (r*r) - (r-h) * (r-h) );
		
		System.out.println("r = " + r);
		System.out.println("alpha = " + alpha);
		System.out.println("Die Segmentfläche A ist " + A + " groß.");
		System.out.println("Die Segmenthöhe h ist " + h + " hoch.");
		System.out.println("Der Kreisbogen b ist " + b + " lang.");
		System.out.println("Die Kreissehne s ist " + s + " lang.");
		
		
	}

}

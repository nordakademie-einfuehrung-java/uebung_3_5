
public class Kreissegment {

	public static void main(String[] args) {
	
		double r = 2.5;
		double alpha = 30;
				
		double A = (alpha/ 360) * (r*r) * Math.PI - 0.5 * (r*r) * Math.sin(alpha);
		
		double h = r - (r * Math.cos(alpha/2));
		
		double b = r* Math.PI * (alpha/180);
		
		double s = 2* Math.sqrt((r*r) -(r-h)*(r-h));
		
		System.out.println("Die Segmentfläche betraegt " + A + " FE.");
		
		System.out.println("Die Segmenthöhe ist " + h + " hoch.");
		
		System.out.println("Der Kreisbogen ist " + b + " lang.");
		
		System.out.println("Die Kreissehne betraegt " + s + " LE.");
		

	}

}

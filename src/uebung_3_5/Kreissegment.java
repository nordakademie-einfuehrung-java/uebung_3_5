package uebung_3_5;

public class Kreissegment {
	
	public static void main(String[] args) {

			double r = 100; // in mm
			double a = 45; // a = der Winkel alpha in °
		  
		double A = ((a/360)*r*r*Math.PI)-((1/2)*r*r*Math.sin(a));			 
		 	double x = a/2;
		 	double y = r*Math.cos(x);
		 double h = r-y; 						 
		 double b = (r*Math.PI*(a/180));						
		 	double uW = r*r-((r-h)*(r-h));
		 double s = 2 * Math.sqrt(uW);
		 
		 System.out.println("Flaeche A = " + A + "mm²");
		 System.out.println("Hoehe h = " + h + "mm");
		 System.out.println("Kreisbogen b = " + b + "mm");
		 System.out.println("Sekantenstrecke s = " + s + "mm");
		
	}

}

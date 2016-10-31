package uebung_3_5;

public class Kreissegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double r = 2;
double alpha = 90;
double radiant = Math.toRadians(alpha);
double A = ((radiant / 360 )* (r*r )* Math.PI - ( 0.5 * r * r * Math.sin( radiant)));
	System.out.println( "A = " + A);
double h = radiant - ( r * Math.cos( radiant / 2));
	System.out.println( "h = " + h);	
double b = r * Math.PI * (radiant/2);
	System.out.println( "b = " + b);	
double s = 2*Math.sqrt(r*r-((r-h)*(r-h)));
	System.out.println( "s = " + s);	}

}

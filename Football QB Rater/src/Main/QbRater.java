package Main;
import java.util.Scanner;
import java.lang.Math;
public class QbRater {
	public static void main(String[] args){
		double avalue;
		double bvalue;
		double cvalue;
		double dvalue;
		double PasserRating;
		Scanner input = new Scanner(System.in);
		System.out.println("This program will take various stats and compute the quarterback rating.");
		System.out.println("Please enter the number of passing attempts: ");
		double att = input.nextDouble();
		
		System.out.println("Please enter the number of completions: ");
		double comp = input.nextDouble();
		
		System.out.println("Please enter the number of passing yards :");
		double passingYards = input.nextDouble();
		
		System.out.println("Please enter the number of touchdown passes: ");
		double tdPasses = input.nextDouble();
		
		System.out.println("Please enter the number of interceptions: ");
		double interceptions = input.nextDouble();
		
		PasserRating(avalue(comp, att), bvalue( passingYards, att), cvalue(tdPasses, att), dvalue(interceptions, att));
				
	}
	public static void PasserRating(double a, double b, double c, double d){
		double rating = (((Math.max(0, Math.min(a, 2.375))) + (Math.max(0, Math.min(b, 2.375))) + Math.max(0, Math.min(c, 2.375)) + (Math.max(0, Math.min(d, 2.375))))/6) * 100;
		System.out.printf("Your QB passer rating is: %.2f", rating);
	}
	
	public static double avalue(double comp, double att){
		double a = ((comp / att) -.3) * 5;
		return a;
	}
	public static double bvalue(double passingYards, double att){
		double b = ((passingYards / att)-3) * .25;
		return b;
	} 
	
	public static double cvalue(double tdPasses, double att){
		double c = ((tdPasses / att) *20);
		return c;
	}
	public static double dvalue(double interceptions, double att){
		double d = ((2.375)-((interceptions/att)*25));
		return d;
	}
	
	
		
		
		
	}


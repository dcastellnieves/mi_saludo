package es.ull.app;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
	
 double fahrenheit(double c)
	{	
	return  ((9*c)/5)+32;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
                for(int i = 0; i <= 12; i++)
        {
            System.out.print("12 * "+ i + " = " + 12 * i + "\n");
        }
        System.out.println( "Parece que Rula...!" );
    }
    
    double a,c;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter  Fahrenheit temperature");
                   a=sc.nextDouble(); 
	    System.out.println("Celsius temperature is = "+celsius(a));		  	  	     
	} 
	static double celsius(double f)
	{	
	return  (f-32)*5/9;
	}
    
}

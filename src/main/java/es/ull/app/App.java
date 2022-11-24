package es.ull.app;

/**
 * Hello world!
 *
 */
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
}

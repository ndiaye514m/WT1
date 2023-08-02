package ma.enset.myapp;
import ma.enset.myapp.service.MyService;

public class MyApp{

public static void main(String[] args)
{
	System.out.println("BISMILAHI RAHMANI RAHIM");
	if(args.length!=2)
	{
		System.out.println("Vous devez fournir deux arguments");
		System.exit(0);
	}
	
	MyService service=new MyService();
	/*double a=6;
	double b=8;*/
	double a=Double.parseDouble(args[0]);
	double b=Double.parseDouble(args[1]);

	double result=service.compute(a,b);
	System.out.println("La somme de "+a+" et "+b+" est "+result);
	System.out.println(String.format("La somme de %s et %s est: %s",a,b,result));
}

}

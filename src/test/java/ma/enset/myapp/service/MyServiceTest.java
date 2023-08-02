package ma.enset.myapp.service;
//package ma.enset.myapp.service;
import org.junit.Test;
import ma.enset.myapp.service.MyService;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyServiceTest {
    @Test
    public void testCompute()
    {
        MyService service= new MyService(); 
        double a=12;
	    double b=8;
        //double expected=21;
        double expected=20;
        double result=service.compute(a, b);
       // assertEquals(result,expected,0.00000001);
       assertTrue(Math.abs(result-expected)<0.00000001);
    }

}


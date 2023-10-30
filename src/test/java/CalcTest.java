import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {
    private Main calculator;

    @Before
    public void setUP(){ calculator = new Main();}

    @Test
    public void test_add(){
        double a=1.0;
        double b=2.0;
        double expres=3.0;
        double c1=calculator.add(a,b);
        double ans = (c1-expres > 0) ? c1-expres : expres-c1;
        boolean k=ans < 1e-6;
        Assert.assertEquals(true,k);
    }

    @Test
    public void test_sub(){
        double a=2.0;
        double b=1.0;
        double expres=1.0;
        double c1=calculator.sub(a,b);
        double ans = (c1-expres > 0) ? c1-expres : expres-c1;
        boolean k=ans < 1e-6;
        Assert.assertEquals(true,k);
    }

    @Test
    public void test_mul(){
        double a=1.0;
        double b=2.0;
        double expres=2.0;
        double c1=calculator.mul(a,b);
        double ans = (c1-expres > 0) ? c1-expres : expres-c1;
        boolean k=ans < 1e-6;
        Assert.assertEquals(true,k);
    }

    @Test
    public void test_div(){
        double a=1.0;
        double b=2.0;
        double expres=0.5;
        double c1=calculator.div(a,b);
        double ans = (c1-expres > 0) ? c1-expres : expres-c1;
        boolean k=ans < 1e-6;
        Assert.assertEquals(true,k);
    }

    @Test
    public void test_div_zero(){
        double a=0.0;
        double b=0.0;
        double expres=1.0;
        double c1=calculator.div(a,b);
        double ans = (c1-expres > 0) ? c1-expres : expres-c1;
        boolean k=ans < 1e-6;
        Assert.assertEquals(false,k);
    }

}

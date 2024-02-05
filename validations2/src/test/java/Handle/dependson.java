package testng;

import org.testng.annotations.Test;

public class dependson {
	@Test
public void method1()
{
	System.out.println("method1");
}
	@Test(groups= {"sanity2"})
public void method2()
{
	System.out.println("method2");
}
	@Test(groups= {"sanity"})
public void method3()
{
	System.out.println("method3");
}

}
